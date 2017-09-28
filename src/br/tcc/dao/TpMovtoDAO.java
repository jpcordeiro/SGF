/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.tcc.dao;

import br.tcc.classe.TipoMovto;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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
        String sql = " INSERT INTO TIPOMOVTO VALUES("
                + tipoMovto.getIDTPMOVTO() + ",'"
                + tipoMovto.getMOVESTOQUE() + "','"
                + tipoMovto.getMOVFINANCEIRO() + "','"
                + tipoMovto.getTPMOVTO()+ "','"
                + tipoMovto.getDSMVTO() + "')";
        conn.incluirSQL(sql);
    }

    public void alterar(TipoMovto tipoMovto) {
        String sql = "UPDATE TIPOMOVTO SET"
                + " IDTPMOVTO = " + tipoMovto.getIDTPMOVTO() + ","
                + " MOVESTOQUE = '" + tipoMovto.getMOVESTOQUE() + "',"
                + " MOVFINANCEIRO = '" + tipoMovto.getMOVFINANCEIRO() + "',"
                + " TPMOVTO = '" + tipoMovto.getTPMOVTO() + "',"
                + " DSMVTO = '" + tipoMovto.getDSMVTO()
                + " WHERE IDTPMOVTO = " + tipoMovto.getIDTPMOVTO();
        conn.incluirSQL(sql);
    }

    public void excluir(TipoMovto tipoMovto) {
        String sql = "DELETE FROM TIPOMOVTO WHERE IDTPMOVTO = " + tipoMovto.getIDTPMOVTO();
        conn.executeSQL(sql);
    }

    public void consulta(TipoMovto tipoMovto) {
        String sql = "SELECT * FROM TIPOMOVTO ORDER BY IDTPMOVTO";
        conn.executeSQL(sql);
        tipoMovto.setRetorno(conn.resultset);
    }
    
     
    public void retornadados(TipoMovto tipoMovto) {
        String sql = "SELECT * FROM TIPOMOVTO WHERE IDTPMOVTO = " + tipoMovto.getIDTPMOVTO();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            tipoMovto.setIDTPMOVTO(conn.resultset.getInt("IDTPMOVTO"));
            tipoMovto.setMOVESTOQUE(conn.resultset.getString("MOVESTOQUE"));
            tipoMovto.setMOVFINANCEIRO(conn.resultset.getString("MOVFINANCEIRO"));
            tipoMovto.setTPMOVTO(conn.resultset.getString("TPMOVTO"));
            tipoMovto.setDSMVTO(conn.resultset.getString("DSMVTO"));
        } catch (SQLException ex) {

        }
    }

    public void preencherTpmovimento(JComboBox jCBTpMovto, TipoMovto tpMovto) {
    
         String sql = "SELECT IDTPMOVTO, DSMVTO FROM TIPOMOVTO ORDER BY IDTPMOVTO";
        conn.executeSQL(sql);
        jCBTpMovto.removeAllItems();
        int conta = 0;
        int[] vet = new int[100];
        try {
            while (conn.resultset.next()) {
                   jCBTpMovto.addItem(conn.resultset.getString("DSMVTO"));
                conta++;
            }
            tpMovto.setVet(vet);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não encontrados\n" + ex);
        }
    }

    public void VerificarOperacao(TipoMovto tpMovto) {
    
        String sql = "SELECT IDTPMOVTO, MOVESTOQUE, MOVFINANCEIRO, TPMOVTO FROM TIPOMOVTO WHERE IDTPMOVTO = " + tpMovto.getIDTPMOVTO();
        conn.executeSQL(sql);
        try {

            conn.resultset.first();
           
             tpMovto.setIDTPMOVTO(conn.resultset.getInt("IDTPMOVTO"));
             tpMovto.setMOVESTOQUE(conn.resultset.getString("MOVESTOQUE"));
             tpMovto.setMOVFINANCEIRO(conn.resultset.getString("MOVFINANCEIRO"));
             tpMovto.setTPMOVTO(conn.resultset.getString("TPMOVTO"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não encontrados\n" + ex);
        }
    }

    public void consultasimples(TipoMovto tipoMovto) {
    
        String sql = "SELECT IDTPMOVTO, DSMVTO FROM TIPOMOVTO ORDER BY IDTPMOVTO";
        conn.executeSQL(sql);
        tipoMovto.setRetorno(conn.resultset);
    }

    public void consultaDescSimples(TipoMovto tipoMovto) {
    
         String sql = "SELECT IDTPMOVTO, DSMVTO FROM TIPOMOVTO WHERE DSMOVTO LIKE '%"
                + tipoMovto.getDSMVTO() + "%' ORDER BY DSMVTO";
        conn.executeSQL(sql);
        tipoMovto.setRetorno(conn.resultset);
    }
    
}
