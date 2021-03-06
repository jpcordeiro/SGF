package br.tcc.dao;

import br.tcc.classe.Estado;
import br.tcc.conexao.ConexaoOracle;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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
        String sql = " INSERT INTO ESTADO VALUES("
                + estado.getIDUF() + ",'"
                + estado.getDSUF() + "','"
                + estado.getDSSIGLA() + "')";
        conn.incluirSQL(sql);
    }

    public void alterar(Estado estado) {
        String sql = "UPDATE ESTADO SET"
                + " IDUF = " + estado.getIDUF() + ","
                + " DSUF = '" + estado.getDSUF() + "',"
                + " DSSIGLA = '" + estado.getDSSIGLA() + "'"
                + " WHERE IDUF = " + estado.getIDUF();
        conn.incluirSQL(sql);
    }

    public void excluir(Estado estado) {
        String sql = "DELETE FROM ESTADO WHERE IDUF = " + estado.getIDUF();
        conn.executeSQL(sql);
    }

    public void consulta(Estado estado) {
        String sql = "SELECT * FROM ESTADO ORDER BY IDUF";
        conn.executeSQL(sql);
        estado.setRetorno(conn.resultset);
    }

    public void consultadescricao(Estado estado) {
        String sql = "SELECT * FROM ESTADO WHERE DSUF LIKE '%"
                + estado.getDSUF() + "%' ORDER BY DSUF";
        conn.executeSQL(sql);
        estado.setRetorno(conn.resultset);
    }

    public void consultasigla(Estado estado) {
        String sql = "SELECT * FROM ESTADO WHERE DSSIGLA LIKE '%"
                + estado.getDSSIGLA() + "%' ORDER BY IDUF";
        conn.executeSQL(sql);
        estado.setRetorno(conn.resultset);
    }

    public void retornadados(Estado estado) {
        String sql = "SELECT * FROM ESTADO WHERE IDUF = " + estado.getIDUF();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            estado.setIDUF(conn.resultset.getInt("IDUF"));
            estado.setDSUF(conn.resultset.getString("DSUF"));
            estado.setDSSIGLA(conn.resultset.getString("DSSIGLA"));
        } catch (SQLException ex) {

        }
    }

    @SuppressWarnings("empty-statement")
    public void preencherestado(JComboBox jCbUF, Estado estado) {

        String sql = "SELECT IDUF, DSSIGLA FROM ESTADO ORDER BY DSSIGLA";
        conn.executeSQL(sql);
        jCbUF.removeAllItems();
        int conta = 0;
        int[] vet = new int[100];
        try {
            while (conn.resultset.next()) {
                jCbUF.addItem(conn.resultset.getString("DSSIGLA"));
                vet[conta] = ConexaoOracle.resultset.getInt("IDUF");
                conta++;
            }
            estado.setVet(vet);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não encontrados\n" + ex);
        }
    }
    
     public Integer ConsultaIdUf(Integer idUf, String uf) throws SQLException{
        String sql = "SELECT * FROM ESTADO WHERE DSSIGLA = '" + uf + "'";
        conn.executeSQL(sql);
                
        if (conn.resultset.first()){
            idUf = conn.resultset.getInt("IDUF");                   
        }
         return (idUf);
     }

    public void retornadados(Integer idestado, Estado estado) {
        
        String sql = "SELECT * FROM ESTADO WHERE IDUF = " + idestado;
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            estado.setDSUF(conn.resultset.getString("DSUF"));
            } catch (SQLException ex) {
        }
         }
}
