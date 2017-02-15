package br.tcc.dao;

import br.tcc.classe.Composicao;
import br.tcc.classe.Produto;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class ProdutoDAO {
    
    ConexaoOracle conn;
    
    public ProdutoDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(Produto produto) {
        String sql = " INSERT INTO PRODUTO VALUES("
                + produto.getIDPRODUTO() + ","
                + produto.getIDFAMILIA()+ ",'"
                + produto.getDSPRODUTO() + "','"
                + produto.getDTCOMRPA() + "','"
                + produto.getTPMATERIA() + "')";
         conn.incluirSQL(sql);
    }
     
      public void alterar(Produto produto) {
        String sql = "UPDATE PRODUTO SET" 
                + " IDPRODUTO = " + produto.getIDPRODUTO() + ","
                + " IDFAMILIA = " + produto.getIDFAMILIA()+ ","
                + " DSPRODUTO = '" + produto.getDSPRODUTO() + "',"
                + " DTCOMRPA = " + produto.getDTCOMRPA() + ","
                + " TPMATERIA = " + produto.getTPMATERIA() + "'"
                + " WHERE IDPRODUTO = " + produto.getIDPRODUTO();
        conn.incluirSQL(sql);
    }
     
      public void excluir(Produto produto) {
        String sql = "DELETE FROM PRODUTO WHERE IDPRODUTO = " + produto.getIDPRODUTO();
        conn.executeSQL(sql);
      }
     public void consulta(Produto produto) {
        String sql = "SELECT * FROM PRODUTO ORDER BY IDPRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
    }
     
     public void consultaSimple(Produto produto){
          String sql = "SELECT IDPRODUTO, DSPRODUTO FROM PRODUTO ORDER BY IDPRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
     }
     
     public void consultadescricao(Produto produto){
        String sql = "SELECT * FROM PRODUTO WHERE DSPRDOUTO LIKE '%"
                + produto.getDSPRODUTO() +"%' ORDER BY DSPRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
    }
     
      public void consultadescricaoSimples(Produto produto){
        String sql = "SELECT IDPRODUTO, DSPRODUTO FROM PRODUTO WHERE DSPRDOUTO LIKE '%"
                + produto.getDSPRODUTO() +"%' ORDER BY DSPRODUTO";
        conn.executeSQL(sql);
        produto.setRetorno(conn.resultset);
    }
     
    public Integer retornaUltimoId(Integer id) throws SQLException {
       
        String sql = "SELECT IDPRODUTO FROM PRODUTO";
        conn.executeSQL(sql);
                
        if (conn.resultset.last()){
            id = conn.resultset.getInt("IDPRODUTO");                   
        }
         return (id);
    
       }
    }
    

