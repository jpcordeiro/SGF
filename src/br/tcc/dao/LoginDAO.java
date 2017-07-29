/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tcc.dao;

import br.tcc.classe.Cidade;
import br.tcc.classe.Login;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class LoginDAO {
    
   ConexaoOracle conn;
    
    public LoginDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(Login login) {
        String sql = " INSERT INTO USUARIO VALUES("
                + login.getIDUSUARIO() + ",'"
                + login.getDSUSUARIO() + "','"
                + login.getDSSENHA() + "',"
                + login.getIDNIVEL() + ")";
         conn.incluirSQL(sql);
    }
     
      public void alterar(Login login) {
        String sql = "UPDATE USUARIO SET" 
                + " IDUSUARIO = " + login.getIDUSUARIO() + ",'"
                + " DSUSUARIO = " + login.getDSUSUARIO() + "','"
                + " DSSENHA = '" + login.getDSSENHA() + "'"
                + "IDNIVEL = " + login.getIDNIVEL() + ","
                + " WHERE IDUSUARIO = " + login.getIDUSUARIO();
        conn.incluirSQL(sql);
    }
     
      public void excluir(Login login) {
        String sql = "DELETE FROM USUARIO WHERE DSUSUARIO ='" + login.getDSUSUARIO()+"'";
        conn.executeSQL(sql);
      }
    
    public void retornadados(Login login, String usuario, String senha) {
        String sql = "SELECT * FROM USUARIO WHERE DSUSUARIO = '" + usuario + "' AND DSSENHA = '" + senha + "'";
        conn.executeSQL(sql);
        login.setRetorno(conn.resultset);
    }
}
