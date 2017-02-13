package br.tcc.dao;

import br.tcc.classe.Familia;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class FamiliaDAO {
    
    ConexaoOracle conn;

    public FamiliaDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir(Familia familia) {
        String sql = " INSERT INTO FAMILIA VALUES("
                + familia.getIDFAMILIA() + ",'"
                + familia.getDSFAMILIA() + "')";
        conn.incluirSQL(sql);
    }
    
    public void alterar(Familia familia) {
        String sql = "UPDATE FAMILIA SET"
                + " IDFAMILIA = " + familia.getIDFAMILIA()+ ","
                + " DSFAMILIA = '" + familia.getDSFAMILIA()+ "'"
                +" WHERE IDFAMILIA = " + familia.getIDFAMILIA();
        conn.incluirSQL(sql);
    } 
    
    public void excluir(Familia familia) {
        String sql = "DELETE FROM FAMILIA WHERE IDFAMILIA = " + familia.getIDFAMILIA();
        conn.executeSQL(sql);
    }
    
    public void consulta(Familia familia) {
        String sql = "SELECT * FROM FAMILIA ORDER BY IDFAMILIA";
        conn.executeSQL(sql);
        familia.setRetorno(conn.resultset);
    }

    public void consultadescricao(Familia familia) {
        String sql = "SELECT * FROM FAMILIA WHERE DSFAMILIA LIKE '%"
                + familia.getDSFAMILIA()+ "%' ORDER BY DSFAMILIA";
        conn.executeSQL(sql);
        familia.setRetorno(conn.resultset);
    }
    
    public void retornadados(Familia familia) {
        String sql = "SELECT * FROM FAMILIA WHERE IDFAMILIA = " + familia.getIDFAMILIA();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            familia.setIDFAMILIA(conn.resultset.getInt("IDFAMILIA"));
            familia.setDSFAMILIA(conn.resultset.getString("DSFAMILIA"));
          } catch (SQLException ex) {

        }
    }
}
