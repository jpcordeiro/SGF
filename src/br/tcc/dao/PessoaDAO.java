package br.tcc.dao;

import br.tcc.classe.Pessoa;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class PessoaDAO {
    ConexaoOracle conn;
    
    public PessoaDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(Pessoa pessoa) {
        String sql = " INSERT INTO PESSOA VALUES("
                +pessoa.getIDPESSOA() +",'"
                +pessoa.getDSPESSOA() +"',"
                +pessoa.getDTNASC() +")";
         conn.incluirSQL(sql);
    }
     
      public void alterar(Pessoa pessoa) {
        String sql = "UPDATE PESSOA SET" 
                + " IDPESSOA = " + pessoa.getIDPESSOA() + ",'"
                + "DSPESSOA = " + pessoa.getDSPESSOA() + "',"
                + "DTNASC = " + pessoa.getDTNASC() 
                + " WHERE IDPESSOA = " + pessoa.getIDPESSOA();
        conn.incluirSQL(sql);
    }
     
      public void excluir(Pessoa pessoa) {
        String sql = "DELETE FROM PESSOA WHERE IDPESSOA = " + pessoa.getIDPESSOA();
        conn.executeSQL(sql);
      }

    public String consultarPEssoa(Integer IdPessoa, String DsPessoa) throws SQLException {
         String sql = "SELECT DSNOME FROM PESSOA WHERE IDPESSOA = " + IdPessoa;
        conn.executeSQL(sql);
          if(conn.resultset.first()){      
        DsPessoa = conn.resultset.getString("DSNOME");                   
          }
         return (DsPessoa);
     }
}


     
                
      
