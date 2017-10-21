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
                + contasPagar.getVLPAGAR() + ","
                + contasPagar.getIDPARCELA() + ",'"
                + contasPagar.getPAGO() + "')";
        conn.incluirSQL(sql);
    }

    public void alterar(ContasPagar contasPagar) {
        String sql = "UPDATE CONTASPAGAR SET"
                + " IDCONTASPAGAR = " + contasPagar.getIDCONTASPAGAR() + ","
                + " IDCOMPRA = " + contasPagar.getIDCOMRPA() + ","
                + " DTPAGAR = '" + contasPagar.getDTPAGAR() + "',"
                + " VLPAGAR = " + contasPagar.getVLPAGAR() + ","
                + " IDPARCELA = " + contasPagar.getIDPARCELA() + ","
                + "PAGO = '" + contasPagar.getPAGO()+ "'"
                + " WHERE IDCONTASPAGAR = " + contasPagar.getIDCONTASPAGAR();
        conn.incluirSQL(sql);
    }

    public void excluir(ContasPagar contasPagar) {
        String sql = "DELETE FROM CONTASPAGAR WHERE contasPagar = " + contasPagar.getIDCONTASPAGAR();
        conn.executeSQL(sql);
    }

    public void consulta(ContasPagar contasPagar, Integer idCompra) {

        String sql = " SELECT DISTINCT CP.IDCONTASPAGAR,CP.IDPARCELA, CP.DTPAGAR, CP.VLPAGAR"
                + " FROM CONTASPAGAR CP JOIN COMPRA C ON CP.IDCOMPRA = C.IDCOMPRA"
                + " WHERE C.IDCOMPRA = " + idCompra;
        conn.executeSQL(sql);
        contasPagar.setRetorno(conn.resultset);
    }

    public void consultageral(ContasPagar contasPagar, Integer idfornecedor) {
 
        String sql = "SELECT DISTINCT CP.IDCONTASPAGAR,CP.IDCOMPRA, CP.IDPARCELA, CP.DTPAGAR, CP.VLPAGAR"
                + " FROM CONTASPAGAR CP JOIN COMPRA C ON CP.IDCOMPRA = C.IDCOMPRA"
                + " WHERE C.IDFORNECEDOR = " + idfornecedor + " AND CP.PAGO = 'N' ORDER BY CP.IDCONTASPAGAR";
        conn.executeSQL(sql);
        contasPagar.setRetorno(conn.resultset);
    }

}
