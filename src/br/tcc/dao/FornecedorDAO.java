package br.tcc.dao;

import br.tcc.classe.Fornecedor;
import br.tcc.classe.Pessoa;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
        String sql = "SELECT * FROM FORNECEDOR WHERE IDPESSOA = " + fornecedor.getIDPESSOA();
        conn.executeSQL(sql);

        try {

            conn.resultset.first();
            fornecedor.setIDPESSOA(conn.resultset.getInt("IDPESSOA"));
            fornecedor.setDTCADASTRO(conn.resultset.getString("DTCADASTRO"));
            fornecedor.setTPSITUACAO(conn.resultset.getInt("TPSITUACAO"));
            fornecedor.setVLLIMITE(conn.resultset.getDouble("VLLIMITE"));
            fornecedor.setTPPESSOA(conn.resultset.getString("TPPESSOA"));
            fornecedor.setDSEMAIL(conn.resultset.getString("DSEMAIL"));
            
            } catch (SQLException ex) {

        }
     }

    public void consulta(Fornecedor fornecedor) {
        
        String sql = 
                "SELECT  F.IDPESSOA, P.DSPESSOA, F.DTCADASTRO,  F.VLLIMITE,"
              + "(SELECT NRFONE FROM TELEFONE T  WHERE F.IDPESSOA = T.IDPESSOA AND TPFONE = 'Comercial')"
              + "FROM FORNECEDOR F JOIN PESSOA P ON F.IDPESSOA = P.IDPESSOA";
        conn.executeSQL(sql);
        fornecedor.setRetorno(conn.resultset);
        
     }

    public void consultadescricao(Pessoa pessoa, Fornecedor fornecedor) {
        
        String sql = 
                "SELECT F.IDPESSOA, P.DSPESSOA, F.DTCADASTRO, F.VLLIMITE,"
                + "(SELECT NRFONE FROM TELEFONE T  WHERE F.IDPESSOA = T.IDPESSOA AND TPFONE = 'Comercial')"
                + " FROM FORNECEDOR F JOIN PESSOA P ON F.IDPESSOA = P.IDPESSOA "
                + "WHERE P.DSPESSOA  LIKE '%"+ pessoa.getDSPESSOA() +"%' ORDER BY P.DSPESSOA";
        
        conn.executeSQL(sql);
        fornecedor.setRetorno(conn.resultset);
    }

    public void consultasimples(Fornecedor fornecedor) {
  
        String sql = "SELECT F.IDPESSOA, P.DSPESSOA FROM FORNECEDOR F JOIN PESSOA P ON F.IDPESSOA = P.IDPESSOA";
        conn.executeSQL(sql);
        fornecedor.setRetorno(conn.resultset);
    }

    public void consultaDescSimples(String DsCliente, Fornecedor fornecedor) {
  
    
        String sql = "SELECT F.IDPESSOA, P.DSPESSOA FROM FORNECEDOR F JOIN PESSOA P ON F.IDPESSOA = P.IDPESSOA LIKE '%"
                + DsCliente + "%' ORDER BY DSPRODUTO";
        conn.executeSQL(sql);
        fornecedor.setRetorno(conn.resultset);
    }
    
}
