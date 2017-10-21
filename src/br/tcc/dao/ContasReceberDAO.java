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
                + contasReceber.getIDPARCELA() + ",'"
                + contasReceber.getPAGO() + "')";
        conn.incluirSQL(sql);
    }

    public void alterar(ContasReceber contasReceber) {
        String sql = "UPDATE CONTASRECEBER SET"
                + " IDCONTASRECEBER = " + contasReceber.getIDCONTASRECEBER() + ","
                + " IDVENDA = " + contasReceber.getIDVENDA() + ","
                + " DTRECEBER = '" + contasReceber.getDTRECEBER() + "',"
                + " VLRECEBER = " + contasReceber.getVLRECEBER() + ","
                + " IDPARCELA = " + contasReceber.getIDPARCELA() + ","
                + " PAGO = '" + contasReceber.getPAGO() + "'"
                + " WHERE IDCONTASRECEBER = " + contasReceber.getIDCONTASRECEBER();
        conn.incluirSQL(sql);
    }

    public void excluir(ContasReceber contasReceber) {
        String sql = "DELETE FROM CONTASRECEBER WHERE IDCONTASPAGAR = " + contasReceber.getIDCONTASRECEBER();
        conn.executeSQL(sql);
    }

    public void consulta(ContasReceber contasReceber, Integer idVENDA) {

        String sql = "SELECT DISTINCT CR.IDCONTASRECEBER, CR.IDPARCELA, CR.DTRECEBER, CR.VLRECEBER"
                + " FROM CONTASRECEBER CR JOIN VENDA V ON CR.IDVENDA = V.IDVENDA"
                + " WHERE V.IDVENDA = " + idVENDA;
        conn.executeSQL(sql);
        contasReceber.setRetorno(conn.resultset);
    }

    public void consultageral(ContasReceber contasReceber, Integer idCliente) {
    
       String sql = "SELECT DISTINCT CR.IDCONTASRECEBER,CR.IDVENDA, CR.IDPARCELA, CR.DTRECEBER, CR.VLRECEBER"
                + " FROM CONTASRECEBER CR JOIN VENDA V ON CR.IDVENDA = V.IDVENDA"
                + " WHERE V.IDCLIENTE = " + idCliente + " ORDER BY CR.IDCONTASRECEBER";
        conn.executeSQL(sql);
        contasReceber.setRetorno(conn.resultset);
    }

}
