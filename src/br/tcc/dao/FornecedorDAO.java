package br.tcc.dao;

import br.tcc.classe.Fornecedor;
import br.tcc.classe.Pessoa;
import br.tcc.conexao.ConexaoOracle;

/**
 *
 * @author JOÃO PAULO
 */
public class FornecedorDAO {
    
      ConexaoOracle conn;
      
     public FornecedorDAO() {
        conn = new ConexaoOracle();
    }
    
    public void incluir(Fornecedor fornecedor) {
        String sql = " INSERT INTO FORNECEDOR VALUES("
                + fornecedor.getIDPESSOA() + ",'"
                + fornecedor.getDTCADASTRO() + "','"
                + fornecedor.getTPSITUACAO() + "',"
                + fornecedor.getVLLIMITE() + ",'"
                + fornecedor.getTPPESSOA() + "','"
                + fornecedor.getDSEMAIL() + "')";
        conn.incluirSQL(sql);
    }
    
    public void alterar(Fornecedor fornecedor) {
        String sql = "UPDATE FORNECEDOR SET"
                + " IDPESSOA = " + fornecedor.getIDPESSOA()+ ","
                + " DTCADASTRO = '" + fornecedor.getDTCADASTRO()+ "',"
                + " TPSITUACAO = '" + fornecedor.getTPSITUACAO() +"',"
                + " VLLIMITE = " + fornecedor.getVLLIMITE() + ","
                + " TPPESSOA = '" + fornecedor.getTPPESSOA() + "',"
                + " DSEMAIL = '" + fornecedor.getDSEMAIL() + "'" 
                +" WHERE IDPESSOA = " + fornecedor.getIDPESSOA();
        conn.incluirSQL(sql);
    } 
    
    public void excluir(Fornecedor fornecedor) {
        String sql = "DELETE FROM FORNECEDOR WHERE IDPESSOA = " + fornecedor.getIDPESSOA();
        conn.executeSQL(sql);
    }

    public void retornadados(Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void consulta(Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void consultadescricao(Pessoa pessoa, Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
