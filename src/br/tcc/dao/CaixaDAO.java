package br.tcc.dao;

import br.tcc.classe.Caixa;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO CORDEIRO
 */
public class CaixaDAO {
    
      
    ConexaoOracle conn;

    public CaixaDAO() {
        conn = new ConexaoOracle();
    }
    
     public void incluir(Caixa caixa) {
        String sql = " INSERT INTO CAIXA VALUES("
                + caixa.getIDCAIXA() + ",'"
                + caixa.getDTPAGO() + "','"
                + caixa.getINENTRADA() + "',"
                + caixa.getIDRECEBIMENTO() + ","
                + caixa.getIDPAGAMENTO()+ ")";
        conn.incluirSQL(sql);
    }

    public void consMov(Caixa caixa, String data) {
    
        String sql = "SELECT C.IDCAIXA, C.DTPAGO, R.VLPAGO FROM CAIXA C JOIN RECEBIMENTO R " +
                      "ON C.IDRECEBIMENTO = R.IDRECEBIMENTO WHERE C.DTPAGO = '"+ data+"'";
        conn.executeSQL(sql);
        caixa.setRetorno(conn.resultset);
    }

    public void consMovS(Caixa caixa, String data) {
    
        String sql = "SELECT C.IDCAIXA, C.DTPAGO, P.VLPAGO FROM CAIXA C JOIN PAGAMENTO P " +
                      "ON C.IDPAGAMENTO = P.IDPAGAMENTO WHERE C.DTPAGO = '"+ data+"'";

        conn.executeSQL(sql);
        caixa.setRetorno(conn.resultset);
    }
     
      

    
}
