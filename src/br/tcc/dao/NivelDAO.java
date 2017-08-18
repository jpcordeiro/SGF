package br.tcc.dao;

import Seguranca.Nivel;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class NivelDAO {
    
    ConexaoOracle conn;

    public NivelDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir(Nivel nivel) {
        String sql = " INSERT INTO NIVEL VALUES("
                + nivel.getIDNIVEL() + ",'"
                + nivel.getDSNIVEL() + "')";
        conn.incluirSQL(sql);
    }

    public void alterar(Nivel nivel) {
        String sql = "UPDATE NIVEL SET"
                + " IDNIVEL = " + nivel.getIDNIVEL() + ","
                + " DSNIVEL = '" + nivel.getDSNIVEL() + "'"
                + " WHERE IDNIVEL = " + nivel.getIDNIVEL();
        conn.incluirSQL(sql);
    }

    public void excluir(Nivel nivel) {
        String sql = "DELETE FROM nivel WHERE IDnivel = " + nivel.getIDNIVEL();
        conn.executeSQL(sql);
    }

    public void consulta(Nivel nivel) {
        String sql = "SELECT * FROM NIVEL ORDER BY IDNIVEL";
        conn.executeSQL(sql);
        nivel.setRetorno(conn.resultset);
    }
    
     public void consultadescricao(Nivel nivel) {
        String sql = "SELECT * FROM NIVEL WHERE DSNIVEL LIKE '%"
                + nivel.getDSNIVEL() + "%' ORDER BY DSNIVEL";
        conn.executeSQL(sql);
        nivel.setRetorno(conn.resultset);
    }
     
    public void retornadados(Nivel nivel) {
        String sql = "SELECT * FROM UF WHERE IDUF = " + nivel.getIDNIVEL();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            nivel.setIDNIVEL(conn.resultset.getInt("IDNIVEL"));
            nivel.setDSNIVEL(conn.resultset.getString("DSNIVEL"));
        } catch (SQLException ex) {

        }
    }
}
