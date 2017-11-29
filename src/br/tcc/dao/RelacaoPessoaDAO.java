package br.tcc.dao;

import br.tcc.classe.RelacaoPessoa;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author João Paulo
 */
public class RelacaoPessoaDAO {

    ConexaoOracle conn;

    public RelacaoPessoaDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir(RelacaoPessoa rPessoa) {
        String sql = "INSERT INTO RELACAOPESSOA VALUES("
                + rPessoa.getIDPESSOA() + ",'"
                + rPessoa.getTPRELACAO() + "','"
                + rPessoa.getDTCOMEMORACAO() + "','"
                + rPessoa.getTPCOMEMORACAO() + "',"
                + rPessoa.getIDSEQUENCIA() + ",'"
                + rPessoa.getDSNOME() + "')";
        conn.incluirSQL(sql);
    }

    public void alterar(RelacaoPessoa rPessoa) {

        String sql = "UPDATE RELACAOPESSOA SET"
                + " IDPESSOA = " + rPessoa.getIDPESSOA() + ","
                + " TPRELACAO = '" + rPessoa.getTPRELACAO() + "',"
                + " DTCOMEMORACAO = '" + rPessoa.getDTCOMEMORACAO() + "',"
                + " TPCOMEMORACAO = '" + rPessoa.getTPCOMEMORACAO() + "',"
                + " IDSEQUENCIA = " + rPessoa.getIDSEQUENCIA() + ","
                + " DSNOME = '" + rPessoa.getDSNOME() + "'"
                + " WHERE IDPESSOA = " + rPessoa.getIDPESSOA() + "AND IDSEQUENCIA = " + rPessoa.getIDSEQUENCIA();
        conn.incluirSQL(sql);
    }

    public void excluir(RelacaoPessoa rPessoa) {
        String sql = "DELETE FROM RELACAOPESSOA WHERE IDPESSOA = " + rPessoa.getIDPESSOA();
        JOptionPane.showMessageDialog(null, rPessoa.getIDPESSOA());
        conn.executeSQL(sql);
    }

    public void retornaUtlSeq(RelacaoPessoa rPessoa) {
        String sql = "SELECT MAX(IDSEQUENCIA) FROM RELACAOPESSOA WHERE IDPESSOA = " + rPessoa.getIDPESSOA();
        conn.executeSQL(sql);
        rPessoa.setRetorno(conn.resultset);

    }

    public void retorna2(RelacaoPessoa rpessoa) {
        String sql = "SELECT MAX(IDSEQUENCIA) FROM RELACAOPESSOA WHERE IDPESSOA = " + rpessoa.getIDPESSOA();
        conn.executeSQL(sql);

        try {
            rpessoa.setIDSEQUENCIA(conn.resultset.getInt("IDSEQUENCIA"));
            JOptionPane.showMessageDialog(null, rpessoa.getIDPESSOA() + "=" + rpessoa.getIDSEQUENCIA());
        } catch (SQLException ex) {

        }
    }

    public void consultadescricao(RelacaoPessoa rPessoa) {
        String sql = "SELECT * FROM RELACAOPESSOA WHERE IDPESSOA = "
                + "(SELECT IDPESSOA FROM PESSOA WHERE DSPESSOA LIKE '%"
                + rPessoa.getDSNOME() + "%')";
        conn.executeSQL(sql);
        rPessoa.setRetorno(conn.resultset);
    }

    public void retornadados(RelacaoPessoa rPessoa) {
        String sql = "SELECT * FROM RELACAOPESSOA WHERE IDPESSOA = " + rPessoa.getIDPESSOA() + " AND IDSEQUENCIA = " + rPessoa.getIDSEQUENCIA();
        conn.executeSQL(sql);

    }

    public void excluir1(String ID, String IDS) {
        String sql = "DELETE FROM RELACAOPESSOA WHERE IDPESSOA = " + ID + " AND IDSEQUENCIA = " + IDS;
        conn.executeSQL(sql);
    }

    public void consultar(RelacaoPessoa relPessoa) {
        String sql = "SELECT DSNOME, TPRELACAO, TPCOMEMORACAO, DTCOMEMORACAO, IDPESSOA "
                + "FROM RELACAOPESSOA ORDER BY IDPESSOA";
        conn.executeSQL(sql);
         relPessoa.setRetorno(conn.resultset);
    }

    public void consultaData(RelacaoPessoa relPessoa) {
    
         String sql = "SELECT DSNOME, TPRELACAO, TPCOMEMORACAO, DTCOMEMORACAO, IDPESSOA "
                 + "FROM RELACAOPESSOA WHERE DTCOMEMORACAO = '" + relPessoa.getDTCOMEMORACAO() + "'";
        conn.executeSQL(sql);
        relPessoa.setRetorno(conn.resultset);
    }

}
