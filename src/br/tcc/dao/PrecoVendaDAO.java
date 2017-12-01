package br.tcc.dao;

import br.tcc.classe.PrecoVenda;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JOÂO PAULO
 */
public class PrecoVendaDAO {
    
    ConexaoOracle conn;
    
    public PrecoVendaDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(PrecoVenda pVenda) {
        String sql = "INSERT INTO PRECOVENDA VALUES("
                + pVenda.getIDPRECOVENDA() + ","
                + pVenda.getIDPRODUTO() + ","
                + pVenda.getVLVENDA() + ",'"
                + pVenda.getDTALTERACAO() + "')";
         conn.incluirSQL(sql);
    }
     
      public void alterar(PrecoVenda pVenda) {
        String sql = "UPDATE PRECOVENDA SET" 
                + " IDPRECOVENDA = " + pVenda.getIDPRODUTO() + ","
                + " IDPRODUTO = " + pVenda.getIDPRODUTO()+ ","
                + " VLVENDA = " + pVenda.getVLVENDA() + ","
                + " DTALTERECAO = '" + pVenda.getDTALTERACAO() +"'"
                + " WHERE IDPRECOVENDA = " + pVenda.getIDPRECOVENDA();
        conn.incluirSQL(sql);
    }
     
      public void excluir(PrecoVenda pVenda) {
        String sql = "DELETE FROM PRECOVENDA WHERE IDPRECOVENDA = " + pVenda.getIDPRECOVENDA();
        conn.executeSQL(sql);
      }

    public void consulta(PrecoVenda pvenda) {
   
        String sql = "SELECT * FROM PRECOVENDA ORDER BY IDPRECOVENDA";
        conn.executeSQL(sql);
        pvenda.setRetorno(conn.resultset);
   
    }

    public void consultaproduto(PrecoVenda pvenda, String produto) {
        String sql = "SELECT * FROM PRECOVENDA WHERE IDPRODUTO = "
                + "(SELECT IDPRODUTO FROM PRODUTO WHERE DSPRODUTO LIKE '%"
                + produto +"%')";
        conn.executeSQL(sql);
        pvenda.setRetorno(conn.resultset);
    }

    public void retornadados(PrecoVenda pvenda) {
  
         String sql = "SELECT * FROM PRECOVENDA WHERE IDPRECOVENDA = " + pvenda.getIDPRECOVENDA();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            pvenda.setIDPRODUTO(conn.resultset.getInt("IDPRODUTO"));
            pvenda.setVLVENDA(conn.resultset.getDouble("VLVENDA"));
            pvenda.setDTALTERACAO(conn.resultset.getString("DTALTERACAO"));
        } catch (SQLException ex) {

        }
    }      
 }