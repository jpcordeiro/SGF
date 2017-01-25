
package br.tcc.dao;

import br.tcc.classe.Endereco;
import br.tcc.conexao.ConexaoOracle;

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
                +endereco.getIDENDERECO() + ","
                +endereco.getIDSEQUENCIAL() + ","
                +endereco.getIDCIDADE() + ",'"
                +endereco.getTPENDERECO() + "','"
                +endereco.getDSLOGRADOURO() + "','"
                +endereco.getDSNUMERO() + "','"
                +endereco.getDSBAIRRO() + "','"
                +endereco.getNRCEP() + "','"
                +endereco.getDSCOMPLEMENTO() + "')";
         conn.incluirSQL(sql);
    }
     
      public void alterar(Endereco endereco) {
        String sql = "UPDATE ENDERECO SET" 
                +"IDENDERECO = " + endereco.getIDENDERECO() + ","
                +"IDSEQUENCIAL = " + endereco.getIDSEQUENCIAL() + ","
                + " IDCIDADE = " + endereco.getIDCIDADE() + ",'"
                + "TPENDERECO = " + endereco.getTPENDERECO() + "','"
                + "DSLOGRADOURO = " + endereco.getDSLOGRADOURO() + "','"
                + "DSNUMERO = " + endereco.getDSNUMERO() + "','"
                + "DSBAIRRO = " + endereco.getDSBAIRRO() + "','"
                + "NRCEP = " + endereco.getNRCEP() + "',"
                + "DSCOMPLEMENTO = " + endereco.getDSCOMPLEMENTO() 
                + " WHERE IDPESSOA = " + endereco.getIDPESSOA();;
        conn.incluirSQL(sql);
    }
     
      public void excluir(Endereco endereco) {
        String sql = "DELETE FROM ENDERECO WHERE IDENDERECO = " + endereco.getIDENDERECO() 
                    +" and IDSEQUENCIAL = " + endereco.getIDSEQUENCIAL();
        conn.executeSQL(sql);
      }
    
}
