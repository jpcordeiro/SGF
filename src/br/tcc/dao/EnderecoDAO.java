
package br.tcc.dao;

import br.tcc.classe.Endereco;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class EnderecoDAO {
     ConexaoOracle conn;
    
    public EnderecoDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(Endereco endereco) {
        String sql = " INSERT INTO ENDERECO VALUES("
                +endereco.getIDPESSOA() + ",'"
                +endereco.getTPENDERECO() + "','"
                +endereco.getDSLOGRADOURO() + "','"
                +endereco.getDSNUMERO() + "','"
                +endereco.getDSBAIRRO() + "','"
                +endereco.getNRCEP() + "','"
                +endereco.getDSCOMPLEMENTO() +"',"
                +endereco.getIDCIDADE() + ")";
         conn.incluirSQL(sql);
    }
     
      public void alterar(Endereco endereco) {
        String sql = "UPDATE ENDERECO SET" 
                + " IDPESSOA = " + endereco.getIDPESSOA() + ","
                + " TPENDERECO = '" + endereco.getTPENDERECO() + "',"
                + " DSLOGRADOURO = '" + endereco.getDSLOGRADOURO() + "',"
                + " DSNUMERO = '" + endereco.getDSNUMERO() + "',"
                + " DSBAIRRO = '" + endereco.getDSBAIRRO() + "',"
                + " NRCEP = '" + endereco.getNRCEP() + "',"
                + " DSCOMPLEMENTO = '" + endereco.getDSCOMPLEMENTO() + "',"
                + " IDCIDADE = " + endereco.getIDCIDADE()
                + " WHERE IDPESSOA = " + endereco.getIDPESSOA();
        conn.incluirSQL(sql);
    }
     
      public void excluir(Endereco endereco) {
        String sql = "DELETE FROM ENDERECO WHERE IDPESSOA = " + endereco.getIDPESSOA();
        conn.executeSQL(sql);
      }

    public void retornadados(Endereco endereco) {
         String sql = "SELECT * FROM ENDERECO WHERE IDPESSOA = " + endereco.getIDPESSOA();
        conn.executeSQL(sql);

        try {
            conn.resultset.first();
            endereco.setDSLOGRADOURO(conn.resultset.getString("DSLOGRADOURO"));
            endereco.setDSNUMERO(conn.resultset.getString("DSNUMERO"));
            endereco.setDSCOMPLEMENTO(conn.resultset.getString("DSCOMPLEMENTO"));
            endereco.setDSBAIRRO(conn.resultset.getString("DSBAIRRO"));
            endereco.setNRCEP(conn.resultset.getString("NRCEP"));
            endereco.setIDCIDADE(conn.resultset.getInt("IDCIDADE"));
            
         } catch (SQLException ex) {

        }
    }
    
}
