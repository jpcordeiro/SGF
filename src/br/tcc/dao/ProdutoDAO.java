package br.tcc.dao;

import br.tcc.classe.Composicao;
import br.tcc.classe.Produto;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JOÃO PAULO
 */
public class ProdutoDAO {

    ConexaoOracle conn;

    public ProdutoDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir(Produto produto) {
        String sql = " INSERT INTO PRODUTO VALUES("
                + produto.getIDPRODUTO() + ","
                + produto.getIDFAMILIA() + ",'"
                + produto.getDSPRODUTO() + "','"
                + produto.getDTCOMRPA() + "','"
                + produto.getTPMATERIA() + "')";
        conn.incluirSQL(sql);
    }

    public void alterar(Produto produto) {
        String sql = "UPDATE PRODUTO SET"
                + " IDPRODUTO = " + produto.getIDPRODUTO() + ","
                + " IDFAMILIA = " + produto.getIDFAMILIA() + ","
                + " DSPRODUTO = '" + produto.getDSPRODUTO() + "',"
                + " DTCOMRPA = " + produto.getDTCOMRPA() + ","
                + " TPMATERIA = " + produto.getTPMATERIA() + "'"
                + " WHERE IDPRODUTO = " + produto.getIDPRODUTO();
        conn.incluirSQL(sql);
    }

    public void excluir(Produto produto) {
        String sql = "DELETE FROM PRODUTO WHERE IDPRODUTO = " + produto.getIDPRODUTO();
        conn.executeSQL(sql);
    }

    public void consulta(Produto produto) {
        String sql = "SELECT IDPRODUTO, DSPRODUTO, TPMATERIA FROM PRODUTO ORDER BY IDPRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
    }

    public void consultaSimple(Produto produto) {
        String sql = "SELECT IDPRODUTO, DSPRODUTO, TPMATERIA FROM PRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
    }
    
    public void consultaCompVend(Produto produto) {
        String sql = "SELECT P.IDPRODUTO, P.DSPRODUTO, PV.VLVENDA FROM PRODUTO P JOIN PRECOVENDA PV ON P.IDPRODUTO = PV.IDPRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
    }
    public void consultaComp(Produto produto) {
        String sql = "SELECT P.IDPRODUTO, P.DSPRODUTO FROM PRODUTO P";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
    }

    public void consultadescricao(Produto produto) {
         String sql = "SELECT IDPRODUTO, DSPRODUTO FROM PRODUTO WHERE DSPRODUTO LIKE '%"
                + produto.getDSPRODUTO() + "%' ORDER BY DSPRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
        
//        String sql = "SELECT P.IDPRODUTO, P.DSPRODUTO, I.VLPRODUTO FROM PRODUTO P JOIN ITENSCOMPRA I"
//                + " ON P.IDPRODUTO = I.IDPRODUTO WHERE DSPRDOUTO LIKE '%"
//                + produto.getDSPRODUTO() + "%' ORDER BY DSPRODUTO";
//        conn.executeSQL(sql);
//        produto.setRetorno(conn.resultset);
    }
    
    public void consultadescricaoCompVend(Produto produto) {
        String sql = "SELECT P.IDPRODUTO, P.DSPRODUTO, PV.VLVENDA FROM PRODUTO P JOIN PRECOVENDA PV ON P.IDPRODUTO = PV.IDPRODUTO"
                + " WHERE DSPRDOUTO LIKE '%" + produto.getDSPRODUTO() + "%' ORDER BY DSPRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
    }

    public void consultadescricaoSimples(Produto produto) {
        String sql = "SELECT IDPRODUTO, DSPRODUTO FROM PRODUTO WHERE DSPRODUTO LIKE '%"
                + produto.getDSPRODUTO() + "%' ORDER BY DSPRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
    }

    public Integer retornaUltimoId(Integer idP) throws SQLException {

        String sql = "SELECT IDPRODUTO FROM PRODUTO";
        conn.executeSQL(sql);
        
        
         if (conn.resultset.last()) {
            idP = conn.resultset.getInt("IDPRODUTO");
        }
        return (idP);

    }

    public void retonarDsProduto(Produto prod) {

        String sql = "SELECT DSPRODUTO FROM PRODUTO WHERE IDPRODUTO = " + prod.getIDPRODUTO();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            prod.setDSPRODUTO(conn.resultset.getString("DSPRODUTO"));
        } catch (SQLException ex) {

        }
    }
    
    
     public void consultaPreco(Produto produto) {
        String sql = "SELECT P.IDPRODUTO, P.DSPRODUTO, IC.VLPRODUTO FROM PRODUTO P JOIN ITENSCOMPRA IC ON P.IDPRODUTO = IC.IDPRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
    }
     
      public void consultadescricaoPreco(Produto produto) {
        String sql = "SELECT P.IDPRODUTO, P.DSPRODUTO, IC.VLPRODUTO FROM PRODUTO P JOIN ITENSCOMPRA IC ON P.IDPRODUTO = IC.IDPRODUTO"
                + " WHERE DSPRDOUTO LIKE '%" + produto.getDSPRODUTO() + "%' ORDER BY DSPRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
    }
}
