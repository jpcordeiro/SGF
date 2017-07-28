package br.tcc.dao;

import br.tcc.classe.Funcionario;
import br.tcc.classe.Pessoa;
import br.tcc.conexao.ConexaoOracle;

/**
 *
 * @author JOÃO PAULO
 */
public class FuncionarioDAO {
    ConexaoOracle conn;
    
    public FuncionarioDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(Funcionario func) {
        String sql = " INSERT INTO FUNCIONARIO VALUES("
                +func.getIDPESSOA() +",'"
                +func.getDTCADASTRO() +"','"
                +func.getDTDEMISSAO() +"',"
                +func.getTPSITUACAO() +","
                +func.getVLSALARIO() +",'"
                +func.getLOGIN() + "')";
        
         conn.incluirSQL(sql);
    }
     
      public void alterar(Funcionario func) {
        String sql = "UPDATE FUNCIONARIO SET" 
                + " IDPESSOA = " + func.getIDPESSOA() + ","
                + "DTCADASTRO = " + func.getDTCADASTRO() + ","
                + "DTDEMISSAO = " + func.getDTDEMISSAO() + ","
                + "TPSITUACAO = " + func.getTPSITUACAO() + ","
                + "VLSALARIO = " + func.getVLSALARIO() + ",'"
                + "LOGIN = " + func.getLOGIN() + "',"
                + " WHERE IDPESSOA = " + func.getIDPESSOA()+ "')";
               
                conn.incluirSQL(sql);
    }
     
      public void excluir(Funcionario func) {
        String sql = "DELETE FROM FUNCIONARIO WHERE IDPESSOA = " + func.getIDPESSOA();
        conn.executeSQL(sql);
      }
    
     public void consulta(Funcionario func) {
        String sql = 
                "SELECT F.IDPESSOA, P.DSPESSOA, P.DTNASC, F.DTCADASTRO, F.DTDEMISSAO, F.VLSALARIO,"
                + "(SELECT NRFONE FROM TELEFONE T  WHERE F.IDPESSOA = T.IDPESSOA AND TPFONE = 'Principal'),"
                + " F.IDUSUARIO FROM FUNCIONARIO F JOIN PESSOA P ON F.IDPESSOA = P.IDPESSOA";
        conn.executeSQL(sql);
        func.setRetorno(conn.resultset);
    }

    public void consultadescricao(Pessoa pessoa, Funcionario func) {
        String sql = 
                "SELECT F.IDPESSOA, P.DSPESSOA, P.DTNASC, F.DTCADASTRO, F.DTDEMISSAO, F.VLSALARIO,"
                + "(SELECT NRFONE FROM TELEFONE T  WHERE F.IDPESSOA = T.IDPESSOA AND TPFONE = 'Principal'),"
                + " F.IDUSUARIO FROM FUNCIONARIO F JOIN PESSOA P ON F.IDPESSOA = P.IDPESSOA "
                + "WHERE P.DSPESSOA  LIKE '%"+ pessoa.getDSPESSOA() +"%' ORDER BY P.DSPESSOA";
        conn.executeSQL(sql);
        func.setRetorno(conn.resultset);
    }
}

