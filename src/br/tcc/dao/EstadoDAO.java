/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tcc.dao;

import br.tcc.classe.Estado;
import br.tcc.conexao.ConexaoOracle;

/**
 *
 * @author JOÃO PAULO
 */
public class EstadoDAO {
    
    ConexaoOracle conn;
    
    public EstadoDAO() {
        conn = new ConexaoOracle();
    }
    
     public void incluir(Estado estado) {
        String sql = " insert into UF values("
                + estado.getIDUF() + ",'"
                + estado.getDSUF() + "','"
                + estado.getDSSIGLA() + "',"
                + estado.getNRICMS() + ")";
         conn.incluirSQL(sql);
    }
    
}
