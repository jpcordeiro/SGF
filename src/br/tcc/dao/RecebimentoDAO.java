package br.tcc.dao;

import br.tcc.classe.Recebimento;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO CORDEIRO
 */
public class RecebimentoDAO {
    
    ConexaoOracle conn;

    public RecebimentoDAO() {
        conn = new ConexaoOracle();
    }
    
     public void incluir(Recebimento recebimento) {
        String sql = " INSERT INTO RECEBIMENTO VALUES("
                + recebimento.getIDRECEBIMENTO() + ","
                + recebimento.getIDCONTASRECEBER() + ","
                + recebimento.getVLPAGO() + ","
                + recebimento.getPERDESCONTO() + ","
                + recebimento.getPERJUROS() + ")";
        conn.incluirSQL(sql);
    }
     
     public Integer retornaUltimoId(Integer id) throws SQLException {

        String sql = "SELECT IDRECEBIMENTO FROM RECEBIMENTO";
        conn.executeSQL(sql);

        if (conn.resultset.last()) {
            id = conn.resultset.getInt("IDRECEBIMENTO");
        }
        return (id);

    }

}
