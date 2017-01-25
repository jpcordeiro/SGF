
package br.tcc.dao;

import br.tcc.classe.Cidade;
import br.tcc.classe.Estado;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;
import javax.swing.JComboBox;

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
                + cidade.getDscidade() + "',"
                + cidade.getNRISSQN() + ")";
         conn.incluirSQL(sql);
    }
     
      public void alterar(Cidade cidade) {
        String sql = "UPDATE CIDADE SET" 
                + " IDCIDADE = " + cidade.getIDCIDADE() + ","
                + " IDUF = " + cidade.getEstado().getIDUF()+ ","
                + " DSCIDADE = '" + cidade.getDscidade() + "',"
                + " NRISSQN = " + cidade.getNRISSQN()
                + " WHERE IDUF = " + cidade.getIDCIDADE();
        conn.incluirSQL(sql);
    }
     
      public void excluir(Cidade cidade) {
        String sql = "DELETE FROM CIDADE WHERE IDCIDADE = " + cidade.getIDCIDADE();
        conn.executeSQL(sql);
      }
     public void consulta(Cidade cidade) {
        String sql = "SELECT * FROM CIDADE ORDER BY IDCIDADE";
        conn.executeSQL(sql);
        cidade.setRetorno(conn.resultset);
    }
     
     public void consultadescricao(Cidade cidade){
        String sql = "SELECT * FROM CIDADE WHERE DSCIDADE LIKE '%"
                + cidade.getDscidade() +"%' ORDER BY DSCIDADE";
        conn.executeSQL(sql);
        cidade.setRetorno(conn.resultset);
    }
     
     
    
    
    public void retornadados(Cidade cidade) {
        String sql = "SELECT * FROM CIDADE WHERE IDCIDADE = " + cidade.getIDCIDADE();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            cidade.setIDCIDADE(conn.resultset.getInt("IDCIDADE"));
            cidade.setEstado((Estado) conn.resultset.getObject("IDUF"));
            cidade.setDscidade(conn.resultset.getString("DSCIDADE"));
            cidade.setNRISSQN(conn.resultset.getDouble("NRISSQN"));
            } catch (SQLException ex) {

        }
    }
    
}
