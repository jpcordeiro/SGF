package br.tcc.dao;

import br.tcc.classe.PessoaJuridica;
import br.tcc.conexao.ConexaoOracle;

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
        String sql = "UPDATE PESSOAFISICA SET" 
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
    
}
