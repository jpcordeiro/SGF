package br.tcc.dao;

import Seguranca.CadastroTela;
import br.tcc.classe.Familia;
import br.tcc.conexao.ConexaoOracle;

/**
 *
 * @author JOÃO PAULO
 */
public class CadastroTelaDAO {
    
    ConexaoOracle conn;

    public CadastroTelaDAO() {
        conn = new ConexaoOracle();
    }
    
    public void consulta(CadastroTela cadastroTela) {
        String sql = "SELECT * FROM CADASTROTELA ORDER BY IDTELA";
        conn.executeSQL(sql);
        cadastroTela.setRetorno(conn.resultset);
    }

    public void consultadescricao(CadastroTela cadastroTela) {
        String sql = "SELECT * FROM CADASTROTELA WHERE DSTELA LIKE '%"
                + cadastroTela.getDSTELA() + "%' ORDER BY DSTELA";
        conn.executeSQL(sql);
        cadastroTela.setRetorno(conn.resultset);
    }
}
