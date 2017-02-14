/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.tcc.dao;

import br.tcc.classe.TipoMovto;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class TpMovtoDAO {
    
    ConexaoOracle conn;

    public TpMovtoDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir(TipoMovto tipoMovto) {
        String sql = " INSERT INTO TIPOMVTO VALUES("
                + tipoMovto.getIDTPMOVTO() + ",'"
                + tipoMovto.getMOVESTOQUE() + "','"
                + tipoMovto.getMOVFINANCEIRO() + "',"
                + tipoMovto.getTPMOVTO()+ ")";
        conn.incluirSQL(sql);
    }

    public void alterar(TipoMovto tipoMovto) {
        String sql = "UPDATE TIPOMVTO SET"
                + " IDTPMVTO = " + tipoMovto.getIDTPMOVTO() + ","
                + " MOVESTOQUE = '" + tipoMovto.getMOVESTOQUE() + "',"
                + "MOVFINANCEIRO = '" + tipoMovto.getMOVFINANCEIRO() + "',"
                + "TPOPERACAO = " + tipoMovto.getTPMOVTO() 
                + " WHERE IDTPMVTO = " + tipoMovto.getIDTPMOVTO();
        conn.incluirSQL(sql);
    }

    public void excluir(TipoMovto tipoMovto) {
        String sql = "DELETE FROM TIPOMVTO WHERE IDTPMVTO = " + tipoMovto.getIDTPMOVTO();
        conn.executeSQL(sql);
    }

    public void consulta(TipoMovto tipoMovto) {
        String sql = "SELECT * FROM TIPOMVTO ORDER BY IDTPMVTO";
        conn.executeSQL(sql);
        tipoMovto.setRetorno(conn.resultset);
    }
    
     
    public void retornadados(TipoMovto tipoMovto) {
        String sql = "SELECT * FROM TIPOMVTO WHERE IDTPMVTO = " + tipoMovto.getIDTPMOVTO();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            tipoMovto.setIDTPMOVTO(conn.resultset.getInt("IDTPMVTO"));
            tipoMovto.setMOVESTOQUE(conn.resultset.getString("MOVESTOQUE"));
            tipoMovto.setMOVFINANCEIRO(conn.resultset.getString("MOVFINANCEIRO"));
            tipoMovto.setTPMOVTO(conn.resultset.getInt("TPMOVTO"));
        } catch (SQLException ex) {

        }
    }
    
}
