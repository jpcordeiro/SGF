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
                +pessoa.getDSPESSOA() +"','"
                +pessoa.getDTNASC() +"')";
         conn.incluirSQL(sql);
    }
     
      public void alterar(Pessoa pessoa) {
        String sql = "UPDATE PESSOA SET" 
                + " IDPESSOA = " + pessoa.getIDPESSOA() + ","
                + "DSPESSOA = '" + pessoa.getDSPESSOA() + "',"
                + "DTNASC = '" + pessoa.getDTNASC() + "'"
                + " WHERE IDPESSOA = " + pessoa.getIDPESSOA();
        conn.incluirSQL(sql);
    }
     
      public void excluir(Pessoa pessoa) {
        String sql = "DELETE FROM PESSOA WHERE IDPESSOA = " + pessoa.getIDPESSOA();
        conn.executeSQL(sql);
      }

    public String consultarPEssoa(Integer IdPessoa, String DsPessoa) throws SQLException {
         String sql = "SELECT DSPESSOA FROM PESSOA WHERE IDPESSOA = " + IdPessoa;
        conn.executeSQL(sql);
          if(conn.resultset.first()){      
        DsPessoa = conn.resultset.getString("DSNOME");                   
          }
         return (DsPessoa);
     }

   public void consulta(Pessoa pessoa) {
        String sql = "SELECT * FROM PESSOA ORDER BY IDPESSOA";
        conn.executeSQL(sql);
        pessoa.setRetorno(conn.resultset);
    }

    public void consultadescricao(Pessoa pessoa) {
        String sql = "SELECT * FROM PESSOA WHERE DSNOME LIKE '%"
                + pessoa.getDSPESSOA() + "%' ORDER BY DSNOME";
        conn.executeSQL(sql);
        pessoa.setRetorno(conn.resultset);
    }

    public void retornadados(Pessoa pessoa) {
        
        String sql = "SELECT * FROM Pessoa WHERE IDPESSOA = " + pessoa.getIDPESSOA();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            pessoa.setIDPESSOA(conn.resultset.getInt("IDPESSOA"));
            pessoa.setDSPESSOA(conn.resultset.getString("DSPESSOA"));
            pessoa.setDTNASC(conn.resultset.getString("DTNASC"));           
            } catch (SQLException ex) {

        }
    }
    
    public void retornaNome(Pessoa pessoa){
        String sql = "SELECT * FROM PESSOA WHERE IDPESSOA = " + pessoa.getIDPESSOA();
        conn.executeSQL(sql);
        try {
            conn.resultset.first();
            pessoa.setDSPESSOA(conn.resultset.getString("DSPESSOA"));
            pessoa.setDTNASC(conn.resultset.getString("DTNASC"));
        } catch (Exception e) {
        }
    }

    public void consultarId(Pessoa pessoa) {
   
        String sql = "SELECT DSPESSOA FROM Pessoa WHERE IDPESSOA = " + pessoa.getIDPESSOA();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            pessoa.setDSPESSOA(conn.resultset.getString("DSPESSOA"));          
            } catch (SQLException ex) {

        }
    }

}


     
                
      
