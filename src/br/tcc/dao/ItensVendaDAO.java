package br.tcc.dao;

import br.tcc.classe.ItensVenda;
import br.tcc.conexao.ConexaoOracle;

/**
 *
 * @author JOÃO PAULO
 */
public class ItensVendaDAO {
    
    ConexaoOracle conn;

    public ItensVendaDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir(ItensVenda itensVenda) {
        String sql = " INSERT INTO ITENSVENDA VALUES("
                + itensVenda.getIDITENSVENDA() + ","
                + itensVenda.getIDVENDA() + ","
                + itensVenda.getIDPRODUTO() + ","
                + itensVenda.getQTDPRODUTO() + ","
                + itensVenda.getVLPRODUTO() + ")";
        conn.incluirSQL(sql);
    }

    public void alterar(ItensVenda itensVenda) {
        String sql = "UPDATE ITENSVENDA SET"
                + " IDITENSVENDA = " + itensVenda.getIDITENSVENDA() + ","
                + " IDVENDA = " + itensVenda.getIDVENDA()+ ","
                + " IDPRODUTO = " + itensVenda.getIDPRODUTO() + "," 
                + " QTDPRODUTO = " + itensVenda.getQTDPRODUTO() + ","
                + " VLPRODUTO = " + itensVenda.getVLPRODUTO()
                + " WHERE IDITENSVENDA = " + itensVenda.getIDITENSVENDA();
        conn.incluirSQL(sql);
    }

    public void excluir(ItensVenda itensVenda) {
        String sql = "DELETE FROM ITENSVENDA WHERE IDITENSVENDA = " + itensVenda.getIDITENSVENDA();
        conn.executeSQL(sql);
    }
    
    
}
