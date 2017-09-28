package br.tcc.dao;

import br.tcc.classe.PessoaFisica;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class PessoaFisicaDAO {
    ConexaoOracle conn;
    
    public PessoaFisicaDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(PessoaFisica pf) {
        String sql = " INSERT INTO PESSOAFISICA VALUES("
                + pf.getIDPESSOA()+ ",'"
                + pf.getNRCPF()+ "','"
                + pf.getNRRG()+ "','"
                + pf.getTPSEXO() + "')";
         conn.incluirSQL(sql);
    }
     
      public void alterar(PessoaFisica pf) {
        String sql = "UPDATE PESSOAFISICA  SET " 
                + " IDPESSOA = " + pf.getIDPESSOA() + ","
                + " NRCPF = '" + pf.getNRCPF() + "',"
                + " NRRG = '" + pf.getNRRG() + "',"
                + " TPSEXO = '" + pf.getTPSEXO() 
                + "' WHERE IDPESSOA = " + pf.getIDPESSOA();
        conn.incluirSQL(sql);
    }
     
      public void excluir(PessoaFisica pf) {
        String sql = "DELETE FROM PESSOAFISICA  WHERE IDPESSOA = " + pf.getIDPESSOA();
        conn.executeSQL(sql);
      }

    public void retornadados(PessoaFisica pfisica) {
         String sql = "SELECT * FROM PESSOAFISICA  WHERE IDPESSOA = " + pfisica.getIDPESSOA();
        conn.executeSQL(sql);

        try {
            conn.resultset.first();
            pfisica.setNRCPF(conn.resultset.getString("NRCPF"));
            pfisica.setNRRG(conn.resultset.getString("NRRG"));
            pfisica.setTPSEXO(conn.resultset.getString("TPSEXO"));
            
            } catch (SQLException ex) {

        }
        
   }
    
}
