package br.tcc.dao;

import br.tcc.classe.ItensCompra;
import br.tcc.conexao.ConexaoOracle;

/**
 *
 * @author JOÃO PAULO
 */
public class ItensCompraDAO {

    ConexaoOracle conn;

    public ItensCompraDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir(ItensCompra itensCompra) {
        String sql = " INSERT INTO ITENSCOMPRA VALUES("
                + itensCompra.getIDITENSCOMRPA() + ","
                + itensCompra.getIDCOMPRA() + ","
                + itensCompra.getIDPRODUTO() + ","
                + itensCompra.getQTDPRODUTO() + ","
                + itensCompra.getVLPRODUTO() + ")";
        conn.incluirSQL(sql);
    }

    public void alterar(ItensCompra itensCompra) {
        String sql = "UPDATE FORMAPGTO SET"
                + " IDITENSCOMRPA = " + itensCompra.getIDITENSCOMRPA() + ","
                + " IDCOMPRA = " + itensCompra.getIDCOMPRA() + ","
                + " IDPRODUTO = " + itensCompra.getIDPRODUTO() + ","
                + " QTDPRODUTO = " + itensCompra.getQTDPRODUTO() + ","
                + " VLPRODUTO = " + itensCompra.getVLPRODUTO()
                + " WHERE IDITENSCOMRPA = " + itensCompra.getIDITENSCOMRPA();
        conn.incluirSQL(sql);
    }

    public void excluir(ItensCompra itensCompra) {
        String sql = "DELETE FROM FORMAPGTO WHERE IDFORMAPGTO = " + itensCompra.getIDITENSCOMRPA();
        conn.executeSQL(sql);
    }

    public void consulta(ItensCompra itensCompra, Integer idCompra) {
        String sql = " SELECT DISTINCT IT.IDCOMPRA, P.DSPRODUTO,IT.QTDPRODUTO, IT.VLPRODUTO"
                + " FROM ITENSCOMPRA IT JOIN PRODUTO P ON IT.IDPRODUTO = P.IDPRODUTO"
                + " WHERE IT.IDCOMPRA = " + idCompra;
        conn.executeSQL(sql);
        itensCompra.setRetorno(conn.resultset);

    }

}
