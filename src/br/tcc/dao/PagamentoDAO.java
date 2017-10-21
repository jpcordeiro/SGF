package br.tcc.dao;

import br.tcc.classe.Pagamento;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class PagamentoDAO {
    
    ConexaoOracle conn;
    
    public PagamentoDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(Pagamento pagamento) {
        String sql = " INSERT INTO PAGAMENTO VALUES("
                + pagamento.getIDPAGAMENTO() + ","
                + pagamento.getIDCONTASPAGAR() + ","
                + pagamento.getVLPAGO() + ","
                + pagamento.getPERDESCONTO() + ","
                + pagamento.getPERJUROS() + ")";
         conn.incluirSQL(sql);
    }
     
      public void excluir(Pagamento pagamento) {
        String sql = "DELETE FROM PAGAMENTO WHERE IDPAGAMENTO = " + pagamento.getIDPAGAMENTO();
        conn.executeSQL(sql);
      }

    public Integer retornaUltimoId(Integer idR) throws SQLException {
     String sql = "SELECT IDPAGAMENTO FROM PAGAMENTO";
        conn.executeSQL(sql);

        if (conn.resultset.last()) {
            idR = conn.resultset.getInt("IDPAGAMENTO");
        }
        return (idR);
    }
}
