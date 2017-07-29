package br.tcc.dao;

import br.tcc.classe.Usuario;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class UsuarioDAO {
    
    ConexaoOracle conn;
    
    public UsuarioDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(Usuario usuario) {
        String sql = " INSERT INTO USUARIO VALUES('"
                + usuario.getDSUSUARIO() + "','"
                + usuario.getDSSENHA() +"',"
                + usuario.getIDNIVEL() + ")";
                conn.incluirSQL(sql);
    }
     
      public void alterar(Usuario usuario) {
        String sql = "UPDATE USUARIO SET " 
                + " DSUSUARIO = '" + usuario.getDSUSUARIO()+ "',"
                + " DSSENHA = '" + usuario.getDSSENHA() + "',"
                + " IDNIVEL = " + usuario.getIDNIVEL() 
                + " WHERE DSUSUARIO = '" + usuario.getDSUSUARIO() + "'";
        conn.incluirSQL(sql);
    }
     
      public void excluir(Usuario usuario) {
        String sql = "DELETE FROM USUARIO WHERE DSUSUARIO = '" + usuario.getDSUSUARIO() + "'";
        conn.executeSQL(sql);
      }
     public void consulta(Usuario usuario) {
        String sql = "SELECT * FROM USUARIO ORDER BY DSUSUARIO";
        conn.executeSQL(sql);
        usuario.setRetorno(conn.resultset);
    }

    public void retornanivel(Usuario usuario) {
        String sql = "SELECT IDNIVEL FROM USUARIO WHERE DSUSUARIO = '" + usuario.getDSUSUARIO() + "'";
        conn.executeSQL(sql);

        try {
            conn.resultset.first();
            usuario.setIDNIVEL(conn.resultset.getInt("IDNIVEL"));
            } catch (SQLException ex) {

        }
   }
    
}
