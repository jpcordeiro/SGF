/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tcc.dao;

import br.tcc.Interface.InterfaceTelefone;
import br.tcc.classe.Pessoa;
import br.tcc.classe.Telefone;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class TelefoneDAO {

    ConexaoOracle conn;
    InterfaceTelefone intfone;

    public TelefoneDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir(Telefone fone) {
        String sql = " INSERT INTO TELEFONE VALUES("
                + fone.getIDPESSOA() + ",'"
                + fone.getTPFONE() + "','"
                + fone.getNRFONE() + "')";
        conn.incluirSQL(sql);
    }

    public void alterar(Telefone fone) {
        String sql = "UPDATE TELEFONE SET "
                + " IDPESSOA = " + fone.getIDPESSOA() + ","
                + " TPFONE = '" + fone.getTPFONE() + "',"
                + " NRFONE = '" + fone.getNRFONE() + "'"
                + " WHERE TPFONE = 'Pincipal'";;
        conn.incluirSQL(sql);
    }

    public void excluir(Telefone fone) {
        String sql = "DELETE FROM TELEFONE WHERE IDPESSOA = " + fone.getIDPESSOA();
        conn.executeSQL(sql);
    }

    public void consulta(int idPes, Telefone fone) {
        String sql = "SELECT TPFONE, NRFONE FROM TELEFONE WHERE IDPESSOA = " + idPes;
        conn.executeSQL(sql);
        fone.setRetorno(conn.resultset);
    }

    public void retornadados(Telefone fone) {

        String sql = "SELECT NRFONE FROM Telefone WHERE TPFONE = 'Comercial' AND IDPESSOA = " + fone.getIDPESSOA();
        conn.executeSQL(sql);
        try {
            conn.resultset.first();
            fone.setNRFONE(conn.resultset.getString("NRFONE"));
        } catch (SQLException ex) {
        }
    }

    public void consultaFone(Telefone fone) {

        String sql = "SELECT NRFONE FROM Telefone WHERE TPFONE = 'Recado' AND IDPESSOA = " + fone.getIDPESSOA();
        conn.executeSQL(sql);
        try {
            conn.resultset.first();
            fone.setNRFONE(conn.resultset.getString("NRFONE"));
        } catch (SQLException ex) {
        }
    }

}
