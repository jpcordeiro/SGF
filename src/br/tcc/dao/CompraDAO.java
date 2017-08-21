package br.tcc.dao;

import br.tcc.classe.Compra;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class CompraDAO {
    
    ConexaoOracle conn;

    public CompraDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir(Compra compra) {
        String sql = " INSERT INTO COMPRA VALUES("
                + compra.getIDCOMPRA() + ",'"
                + compra.getDTVENDA() + "',"
                + compra.getIDFORNECEDOR() + ","
                + compra.getIDFORMAPGTO() + ")";
        conn.incluirSQL(sql);
    }
    
    public void alterar(Compra compra) {
        String sql = "UPDATE COMPRA SET"
                + " IDCOMPRA = " + compra.getIDCOMPRA() + ","
                + " DTVENDA = '" + compra.getDTVENDA() + "',"
                + " IDFORNECEDOR = " + compra.getIDFORNECEDOR() + ","
                + " IDFORMAPGTO = " + compra.getIDFORMAPGTO()
                + " WHERE IDCOMPRA = " + compra.getIDCOMPRA();
        conn.incluirSQL(sql);
    }

    public void excluir(Compra compra) {
        String sql = "DELETE FROM COMPRA WHERE IDCOMPRA = " + compra.getIDCOMPRA();
        conn.executeSQL(sql);
    }

    public Integer retornaUltimoId(Integer idV) throws SQLException {
    
         String sql = "SELECT IDCOMPRA FROM COMPRA";
        conn.executeSQL(sql);

        if (conn.resultset.last()) {
            idV = conn.resultset.getInt("IDCOMPRA");
        }
        return (idV);

    }
}
