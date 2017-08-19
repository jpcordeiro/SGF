package br.tcc.dao;

import br.tcc.classe.ContasPagar;
import br.tcc.conexao.ConexaoOracle;

/**
 *
 * @author JOÃO PAULO
 */
public class ContasPagarDAO {
    
    ConexaoOracle conn;
    
    public ContasPagarDAO() {
        conn = new ConexaoOracle();
    }
    
    public void incluir(ContasPagar contasPagar) {
        String sql = " INSERT INTO CONTASPAGAR VALUES("
                + contasPagar.getIDCONTASPAGAR() + ","
                + contasPagar.getIDCOMRPA() + ",'"
                + contasPagar.getDTPAGAR() + "',"
                + contasPagar.getVLPAGAR() + ")";
        conn.incluirSQL(sql);
    }
    
    public void alterar(ContasPagar contasPagar) {
        String sql = "UPDATE CONTASPAGAR SET"
                + " IDCONTASPAGAR = " + contasPagar.getIDCONTASPAGAR() + ","
                + " IDCOMRPA = " + contasPagar.getIDCOMRPA() + ","
                + " DTPAGAR = '" + contasPagar.getDTPAGAR() + "',"
                + " VLPAGAR = " + contasPagar.getVLPAGAR()
                + " WHERE IDCONTASPAGAR = " + contasPagar.getIDCONTASPAGAR();
        conn.incluirSQL(sql);
    }

    public void excluir(ContasPagar contasPagar) {
        String sql = "DELETE FROM CONTASPAGAR WHERE contasPagar = " + contasPagar.getIDCONTASPAGAR();
        conn.executeSQL(sql);
    }
    
}
