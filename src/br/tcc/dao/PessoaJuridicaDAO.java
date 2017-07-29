package br.tcc.dao;

import br.tcc.classe.PessoaJuridica;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class PessoaJuridicaDAO {
      ConexaoOracle conn;
    
    public PessoaJuridicaDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(PessoaJuridica pj) {
        String sql = " INSERT INTO PESSOAJURIDICA VALUES("
                + pj.getIDPESSOA()+ ",'"
                + pj.getNRCNPJ() + "','"
                + pj.getRZSOCIAL()+ "','"
                + pj.getINSCESTADUAL() + "')";
         conn.incluirSQL(sql);
    }
     
      public void alterar(PessoaJuridica pj) {
        String sql = "UPDATE PESSOAFISICA SET " 
                + " IDPESSOA = " + pj.getIDPESSOA() + ","
                + " NRCNPJ = '" + pj.getNRCNPJ()+ "',"
                + " RZSOCIAL = '" + pj.getRZSOCIAL() + "',"
                + " INSCESTADUAL = '" + pj.getINSCESTADUAL()
                + "' WHERE IDPESSOA = " + pj.getIDPESSOA();
        conn.incluirSQL(sql);
    }
     
      public void excluir(PessoaJuridica pj) {
        String sql = "DELETE FROM PESSOAFISICA WHERE IDPESSOA = " + pj.getIDPESSOA();
        conn.executeSQL(sql);
      }

    public void retornadados(PessoaJuridica pjuridica) {
         String sql = "SELECT * FROM PESSOAJ WHERE IDPESSOA = " + pjuridica.getIDPESSOA();
        conn.executeSQL(sql);

        try {
            conn.resultset.first();
            pjuridica.setNRCNPJ(conn.resultset.getString("NRCNPJ"));
            pjuridica.setRZSOCIAL(conn.resultset.getString("RZSOCIAL"));
          
            } catch (SQLException ex) {

        }
   }
    
}
