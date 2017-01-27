/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tcc.dao;

import br.tcc.classe.Telefone;
import br.tcc.conexao.ConexaoOracle;

/**
 *
 * @author JOÃO PAULO
 */
public class TelefoneDAO {
    
    ConexaoOracle conn;
    
    public TelefoneDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(Telefone fone) {
        String sql = " INSERT INTO TELEFONE VALUES("
                + fone.getIDPESSOA() + ","
                + fone.getTPFONE() + ",'"
                + fone.getNRFONE() + "')";
         conn.incluirSQL(sql);
    }
     
      public void alterar(Telefone fone) {
        String sql = "UPDATE TELEFONE SET" 
                + " IDPESSOA = " + fone.getIDPESSOA() + ","
                + " TPFONE = " + fone.getTPFONE() + ","
                + " NRFONE = '" + fone.getNRFONE() + "'";
        conn.incluirSQL(sql);
    }
     
      public void excluir(Telefone fone) {
        String sql = "DELETE FROM TELEFONE WHERE IDPESSOA = " + fone.getIDPESSOA()+ "AND TPFONE = " + fone.getTPFONE();
        conn.executeSQL(sql);
      }
     public void consulta(Telefone fone) {
        String sql = "SELECT TPFONE, NRFONE FROM TELEFONE WHERE IDPESSOA = " + fone.getIDPESSOA();
        conn.executeSQL(sql);
        fone.setRetorno(conn.resultset);
    }
     
    
}
