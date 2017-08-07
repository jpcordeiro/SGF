package br.tcc.dao;

import br.tcc.classe.Cliente;
import br.tcc.conexao.ConexaoOracle;

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
                + cliente.getTPSITUACAO() + "'";
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
}
