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
     
      

    
}
