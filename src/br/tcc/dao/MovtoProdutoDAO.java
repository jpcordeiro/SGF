package br.tcc.dao;

import br.tcc.classe.MovtoProduto;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class MovtoProdutoDAO {
    
     ConexaoOracle conn;

    public MovtoProdutoDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir(MovtoProduto mProduto) {
        String sql = " INSERT INTO MOVTOPRODUTO VALUES("
                + mProduto.getIDMOVTOPRODUTO() + ","
                + mProduto.getIDCOMPRA() + ","
                + mProduto.getIDITENCOMPRA() + ",'"
                + mProduto.getDTATUALIZA() + "','"
                + mProduto.getINENTRADA() + "',"
                + mProduto.getQTDPRODUTO() + ")";
        conn.incluirSQL(sql);
    }
    
    public void alterar(MovtoProduto mProduto) {
        String sql = "UPDATE MOVTOPRODUTO SET"
                + " IDMOVTOPRODUTO = " + mProduto.getIDMOVTOPRODUTO() + ","
                + " IDCOMPRA = " + mProduto.getIDCOMPRA() + ","
                + " IDITENCOMPRA = " + mProduto.getIDITENCOMPRA() + ","
                + " DTATUALIZA = '" + mProduto.getDTATUALIZA() + "',"
                + " INENTRADA = '" + mProduto.getINENTRADA() + "',"
                + " QTDPRODUTO = " + mProduto.getQTDPRODUTO() 
                +" WHERE IDMOVTOPRODUTO = " + mProduto.getIDMOVTOPRODUTO();
        conn.incluirSQL(sql);
    } 
    
    public void excluir(MovtoProduto mProduto) {
        String sql = "DELETE FROM MOVTOPRODUTO WHERE IDMOVTOPRODUTO = " + mProduto.getIDMOVTOPRODUTO();
        conn.executeSQL(sql);
    }

    public void JaExiste(MovtoProduto mProduto) {
   
        String sql = "SELECT IDITENCOMPRA FROM MOVTOPRODUTO WHERE IDITENCOMPRA "+ mProduto.getIDITENCOMPRA();
        conn.executeSQL(sql);
        
       try {

            conn.resultset.first();
            mProduto.setIDITENCOMPRA(conn.resultset.getInt("IDITENCOMPRA"));
            mProduto.setQTDPRODUTO(conn.resultset.getInt("QTDPRODUTO"));
            } catch (SQLException ex) {

        }

    }
    
}
