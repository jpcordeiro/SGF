
package br.tcc.dao;

import br.tcc.classe.Cidade;
import br.tcc.classe.Estado;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author JOÃO PAULO
 */
public class CidadeDAO {
    
    ConexaoOracle conn;
    
    public CidadeDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(Cidade cidade) {
        String sql = " INSERT INTO CIDADE VALUES("
                + cidade.getIDCIDADE() + ","
                + cidade.getIdUf() + ",'"
                + cidade.getDscidade() + "')";
         conn.incluirSQL(sql);
    }
     
      public void alterar(Cidade cidade) {
        String sql = "UPDATE CIDADE SET" 
                + " IDCIDADE = " + cidade.getIDCIDADE() + ","
                + " IDUF = " + cidade.getIdUf()+ ","
                + " DSCIDADE = '" + cidade.getDscidade() + "'"
                + " WHERE IDCIDADE = " + cidade.getIDCIDADE();
        conn.incluirSQL(sql);
    }
     
      public void excluir(Cidade cidade) {
        String sql = "DELETE FROM CIDADE WHERE IDCIDADE = " + cidade.getIDCIDADE();
        conn.executeSQL(sql);
      }
     public void consulta(Cidade cidade) {
        String sql = "SELECT C.IDCIDADE, U.DSUF, C.DSCIDADE FROM CIDADE C JOIN UF U ON C.IDUF = U.IDUF ORDER BY C.IDCIDADE";
        conn.executeSQL(sql);
        cidade.setRetorno(conn.resultset);
    }
     
     public void consultadescricao(Cidade cidade){
        String sql = "SELECT C.IDCIDADE, U.DSUF, C.DSCIDADE FROM CIDADE C JOIN UF U ON C.IDUF = U.IDUF WHERE C.DSCIDADE LIKE '%"
                + cidade.getDscidade() +"%' ORDER BY C.DSCIDADE";
        conn.executeSQL(sql);
        cidade.setRetorno(conn.resultset);
    }
     
     
    
    
    public void retornadados(Cidade cidade) {
        String sql = "SELECT * FROM CIDADE WHERE IDCIDADE = " + cidade.getIDCIDADE();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            cidade.setIDCIDADE(conn.resultset.getInt("IDCIDADE"));
            
            cidade.setDscidade(conn.resultset.getString("DSCIDADE"));
            } catch (SQLException ex) {

        }
    }
    
     @SuppressWarnings("empty-statement")
    public void preenchercidade(JComboBox jCBCidade, Cidade cidade) {

        String sql = "SELECT IDCIDADE, DSCIDADE FROM CIDADE ORDER BY DSCIDADE";
        conn.executeSQL(sql);
        jCBCidade.removeAllItems();
        int conta = 0;
        int[] vet = new int[100];
        try {
            while (conn.resultset.next()) {
                jCBCidade.addItem(conn.resultset.getString("DSCIDADE"));
                vet[conta] = ConexaoOracle.resultset.getInt("IDCIDADE");
                conta++;
            }
            cidade.setVet(vet);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não encontrados\n" + ex);
        }
    }

    public Integer ConsultaIdcidade(Integer idCidade, String cidadeId) throws SQLException {
  
         String sql = "SELECT * FROM CIDADE WHERE DSCIDADE = '" + cidadeId + "'";
        conn.executeSQL(sql);
                
        if (conn.resultset.first()){
            idCidade = conn.resultset.getInt("IDCIDADE");                   
        }
         return (idCidade);
    }

    public void retornacidade(Cidade cidade) {
         String sql = "SELECT DSCIDADE FROM CIDADE WHERE IDCIDADE = " + cidade.getIDCIDADE();
        conn.executeSQL(sql);

        try {
            conn.resultset.first();
            cidade.setDscidade(conn.resultset.getString("DSCIDADE"));
            
            } catch (SQLException ex) {

        }
    }
    
}
