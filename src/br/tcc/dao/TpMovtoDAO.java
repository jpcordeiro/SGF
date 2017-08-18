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
        String sql = " INSERT INTO TIPOMVTO VALUES("
                + tipoMovto.getIDTPMOVTO() + ",'"
                + tipoMovto.getMOVESTOQUE() + "','"
                + tipoMovto.getMOVFINANCEIRO() + "',"
                + tipoMovto.getTPMOVTO()+ ")";
        conn.incluirSQL(sql);
    }

    public void alterar(TipoMovto tipoMovto) {
        String sql = "UPDATE TIPOMVTO SET"
                + " IDTPMOVTO = " + tipoMovto.getIDTPMOVTO() + ","
                + " MOVESTOQUE = '" + tipoMovto.getMOVESTOQUE() + "',"
                + " MOVFINANCEIRO = '" + tipoMovto.getMOVFINANCEIRO() + "',"
                + " TPMOVTO = " + tipoMovto.getTPMOVTO()
                + " WHERE IDTPMOVTO = " + tipoMovto.getIDTPMOVTO();
        conn.incluirSQL(sql);
    }

    public void excluir(TipoMovto tipoMovto) {
        String sql = "DELETE FROM TIPOMVTO WHERE IDTPMOVTO = " + tipoMovto.getIDTPMOVTO();
        conn.executeSQL(sql);
    }

    public void consulta(TipoMovto tipoMovto) {
        String sql = "SELECT * FROM TIPOMVTO ORDER BY IDTPMOVTO";
        conn.executeSQL(sql);
        tipoMovto.setRetorno(conn.resultset);
    }
    
     
    public void retornadados(TipoMovto tipoMovto) {
        String sql = "SELECT * FROM TIPOMVTO WHERE IDTPMOVTO = " + tipoMovto.getIDTPMOVTO();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            tipoMovto.setIDTPMOVTO(conn.resultset.getInt("IDTPMOVTO"));
            tipoMovto.setMOVESTOQUE(conn.resultset.getString("MOVESTOQUE"));
            tipoMovto.setMOVFINANCEIRO(conn.resultset.getString("MOVFINANCEIRO"));
            tipoMovto.setTPMOVTO(conn.resultset.getInt("TPMOVTO"));
        } catch (SQLException ex) {

        }
    }

    public void preencherTpmovimento(JComboBox jCBTpMovto, TipoMovto tpMovto) {
    
         String sql = "SELECT IDTPMOVTO FROM TIPOMVTO ORDER BY TPMOVTO";
        conn.executeSQL(sql);
        jCBTpMovto.removeAllItems();
        int conta = 0;
        int[] vet = new int[100];
        try {
            while (conn.resultset.next()) {
                jCBTpMovto.addItem(conn.resultset.getString("IDTPMOVTO"));
                conta++;
            }
            tpMovto.setVet(vet);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não encontrados\n" + ex);
        }
    }
    
}
