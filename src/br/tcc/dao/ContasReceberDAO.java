package br.tcc.dao;

import br.tcc.classe.ContasReceber;
import br.tcc.conexao.ConexaoOracle;

/**
 *
 * @author JOÃO PAULO
 */
public class ContasReceberDAO {
    
    ConexaoOracle conn;
    
    public ContasReceberDAO() {
        conn = new ConexaoOracle();
    }
    
    public void incluir(ContasReceber contasReceber) {
        String sql = " INSERT INTO CONTASRECEBER VALUES("
                + contasReceber.getIDCONTASRECEBER() + ","
                + contasReceber.getIDVENDA() + ",'"
                + contasReceber.getDTRECEBER() + "',"
                + contasReceber.getVLRECEBER() + ","
                + contasReceber.getIDPARCELA() + ")";
        conn.incluirSQL(sql);
    }
    
    public void alterar(ContasReceber contasReceber) {
        String sql = "UPDATE CONTASRECEBER SET"
                + " IDCONTASPAGAR = " + contasReceber.getIDCONTASRECEBER() + ","
                + " IDCOMRPA = " + contasReceber.getIDVENDA() + ","
                + " DTPAGAR = '" + contasReceber.getDTRECEBER() + "',"
                + " VLPAGAR = " + contasReceber.getVLRECEBER() + ","
                + " IDPARCELA = " + contasReceber.getIDPARCELA()
                + " WHERE IDCONTASPAGAR = " + contasReceber.getIDCONTASRECEBER();
        conn.incluirSQL(sql);
    }

    public void excluir(ContasReceber contasReceber) {
        String sql = "DELETE FROM CONTASRECEBER WHERE IDCONTASPAGAR = " + contasReceber.getIDCONTASRECEBER();
        conn.executeSQL(sql);
    }
    
}
