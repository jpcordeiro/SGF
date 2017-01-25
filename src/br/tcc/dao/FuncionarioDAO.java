package br.tcc.dao;

import br.tcc.classe.Funcionario;
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
                +func.getNRREGISTRO() +"',"
                +func.getDTCADASTRO() +","
                +func.getDTDEMISSAO() +","
                +func.getTPSITUACAO() +","
                +func.getVLSALARIO() +",'"
                +func.getLOGIN() +"','"
                +func.getSENHA() + "')";
        
         conn.incluirSQL(sql);
    }
     
      public void alterar(Funcionario func) {
        String sql = "UPDATE FUNCIONARIO SET" 
                + " IDPESSOA = " + func.getIDPESSOA() + ",'"
                + "NRREGISTRO = " + func.getNRREGISTRO() + "'," 
                + "DTCADASTRO = " + func.getDTCADASTRO() + ","
                + "DTDEMISSAO = " + func.getDTDEMISSAO() + ","
                + "TPSITUACAO = " + func.getTPSITUACAO() + ","
                + "VLSALARIO = " + func.getVLSALARIO() + ",'"
                + "LOGIN = " + func.getLOGIN() + "',"
                + "SENHA = " + func.getSENHA() + "')";
               
                conn.incluirSQL(sql);
    }
     
      public void excluir(Funcionario func) {
        String sql = "DELETE FROM FUNCIONARIO WHERE IDPESSOA = " + func.getIDPESSOA();
        conn.executeSQL(sql);
      }
    
    
}
