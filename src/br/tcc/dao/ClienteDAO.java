package br.tcc.dao;

import br.tcc.classe.Cliente;
import br.tcc.classe.Pessoa;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author João Paulo
 */
public class ClienteDAO {
    ConexaoOracle conn;
      
     public ClienteDAO() {
        conn = new ConexaoOracle();
    }

   

    public void incluir(Cliente cliente) {
      
        String sql = " INSERT INTO CLIENTE VALUES("
                + cliente.getIDPESSOA() + ",'"
                + cliente.getDTCADASTRO() + "','"
                + cliente.getTPCLIENTE() + "','"
                + cliente.getTPSITUACAO() + "')";
        conn.incluirSQL(sql);
    }
    
    
     public void alterar(Cliente cliente) {
         String sql = "UPDATE CLIENTE SET"
                + " IDPESSOA = " + cliente.getIDPESSOA()+ ","
                + " DTCADASTRO = '" + cliente.getDTCADASTRO()+ "',"
                + " TPCLIENTE = '" +  cliente.getTPCLIENTE() + "',"
                + " TPSITUACAO = '" + cliente.getTPSITUACAO() +"'" 
                +" WHERE IDPESSOA = " + cliente.getIDPESSOA();
        conn.incluirSQL(sql);
    }
    
     
    public void excluir( Cliente cliente) {
        String sql = "DELETE FROM CLIENTE WHERE IDPESSOA = " + cliente.getIDPESSOA();
        conn.executeSQL(sql);
    }

     public void consulta(Cliente cliente) {
         String sql = 
                "SELECT  C.IDPESSOA, P.DSPESSOA, C.DTCADASTRO,"
              + "(SELECT NRFONE FROM TELEFONE T  WHERE C.IDPESSOA = T.IDPESSOA AND TPFONE = 'Recado')"
              + "FROM CLIENTE C JOIN PESSOA P ON C.IDPESSOA = P.IDPESSOA";
        conn.executeSQL(sql);
        cliente.setRetorno(conn.resultset);
    }

    public void consultadescricao(Pessoa pessoa, Cliente cliente) {
         String sql = 
                "SELECT  C.IDPESSOA, P.DSPESSOA, C.DTCADASTRO,"
              + "(SELECT NRFONE FROM TELEFONE T  WHERE C.IDPESSOA = T.IDPESSOA AND TPFONE = 'Recado')"
              + "FROM CLIENTE C JOIN PESSOA P ON C.IDPESSOA = P.IDPESSOA"
              + "WHERE P.DSPESSOA  LIKE '%"+ pessoa.getDSPESSOA() +"%' ORDER BY P.DSPESSOA";
        conn.executeSQL(sql);
        cliente.setRetorno(conn.resultset);
    }

    public void retornadados(Cliente cliente) {
    
         String sql = "SELECT * FROM CLIENTE WHERE IDPESSOA = " + cliente.getIDPESSOA();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            cliente.setIDPESSOA(conn.resultset.getInt("IDPESSOA"));
            cliente.setDTCADASTRO(conn.resultset.getString("DTCADASTRO"));
            cliente.setTPSITUACAO(conn.resultset.getInt("TPSITUACAO"));
            cliente.setTPCLIENTE(conn.resultset.getString("TPCLIENTE"));
            
            } catch (SQLException ex) {

        }
    }

    public void consultasimples(Cliente cliente) {
    
         String sql = "SELECT  C.IDPESSOA, P.DSPESSOA FROM CLIENTE C JOIN PESSOA P ON C.IDPESSOA = P.IDPESSOA";
        conn.executeSQL(sql);
        cliente.setRetorno(conn.resultset);
    }

    public void consultaDescSimples(String DsCliente, Cliente cliente) {
    
         String sql = "SELECT  C.IDPESSOA, P.DSPESSOA FROM CLIENTE C JOIN PESSOA P ON C.IDPESSOA = P.IDPESSOA"
              + " WHERE P.DSPESSOA  LIKE '%"+ DsCliente +"%' ORDER BY P.DSPESSOA";
        conn.executeSQL(sql);
        cliente.setRetorno(conn.resultset);    
    }
}
