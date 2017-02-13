package br.tcc.dao;

import br.tcc.classe.FormaPgto;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class FormaPgtoDAO {
 
        ConexaoOracle conn;

    public FormaPgtoDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir(FormaPgto formaPgto) {
        String sql = " INSERT INTO FORMAPGTO VALUES("
                + formaPgto.getIDFORMAPGTO() + ",'"
                + formaPgto.getDSFORMAPGTO() + "',"
                + formaPgto.getTPSITUACAO() + ","
                + formaPgto.getNRINTERVALO() + ")";
        conn.incluirSQL(sql);
    }

    public void alterar(FormaPgto formaPgto) {
        String sql = "UPDATE FORMAPGTO SET"
                + " IDFORMAPGTO = " + formaPgto.getIDFORMAPGTO() + ","
                + " DSFORMAPGTO = '" + formaPgto.getDSFORMAPGTO() + "',"
                + " TPSITUACAO = " + formaPgto.getTPSITUACAO() + "," 
                + "NRINTERVALO = " + formaPgto.getNRINTERVALO() 
                + " WHERE IDFORMAPGTO = " + formaPgto.getIDFORMAPGTO();
        conn.incluirSQL(sql);
    }

    public void excluir(FormaPgto formaPgto) {
        String sql = "DELETE FROM FORMAPGTO WHERE IDFORMAPGTO = " + formaPgto.getIDFORMAPGTO();
        conn.executeSQL(sql);
    }
    
    public void consulta(FormaPgto formaPgto) {
        String sql = "SELECT * FROM FORMAPGTO ORDER BY IDFORMAPGTO";
        conn.executeSQL(sql);
        formaPgto.setRetorno(conn.resultset);
    }

    public void consultadescricao(FormaPgto formaPgto) {
        String sql = "SELECT * FROM FORMAPGTO WHERE DSFORMAPGTO LIKE '%"
                + formaPgto.getDSFORMAPGTO() + "%' ORDER BY DSFORMAPGTO";
        conn.executeSQL(sql);
        formaPgto.setRetorno(conn.resultset);
    }
    
    public void retornadados(FormaPgto formaPgto) {
        String sql = "SELECT * FROM FORMAPGTO WHERE IDFORMAPGTO = " + formaPgto.getIDFORMAPGTO();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            formaPgto.setIDFORMAPGTO(conn.resultset.getInt("IDFORMAPGTO"));
            formaPgto.setDSFORMAPGTO(conn.resultset.getString("DSFORMAPGTO"));
            formaPgto.setTPSITUACAO(conn.resultset.getInt("TPSITUACAO"));
            formaPgto.setNRINTERVALO(conn.resultset.getInt("NRINTERVALO"));
          } catch (SQLException ex) {

        }
    }
}
