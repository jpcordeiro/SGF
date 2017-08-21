package br.tcc.dao;

import br.tcc.classe.Pagamento;
import br.tcc.conexao.ConexaoOracle;

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
                + pagamento.getVLPAGO() + "',"
                + pagamento.getTPPAGO() + "')";
         conn.incluirSQL(sql);
    }
     
      public void alterar(Pagamento pagamento) {
        String sql = "UPDATE PAGAMENTO SET" 
                + " IDPAGAMENTO = " + pagamento.getIDPAGAMENTO() + ","
                + " IDCONTASPAGAR = " + pagamento.getIDCONTASPAGAR() + ","
                + " VLPAGO = " + pagamento.getVLPAGO() + ","
                + " TPPAGO = '" + pagamento.getTPPAGO() + "'"
                + " WHERE IDCIDADE = " + pagamento.getIDPAGAMENTO();
        conn.incluirSQL(sql);
    }
     
      public void excluir(Pagamento pagamento) {
        String sql = "DELETE FROM PAGAMENTO WHERE IDPAGAMENTO = " + pagamento.getIDPAGAMENTO();
        conn.executeSQL(sql);
      }
}
