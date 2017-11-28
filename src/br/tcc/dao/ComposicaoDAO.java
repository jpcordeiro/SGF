package br.tcc.dao;

import br.tcc.classe.Composicao;
import br.tcc.conexao.ConexaoOracle;

/**
 *
 * @author JOÃO PAULO
 */
public class ComposicaoDAO {
    
    ConexaoOracle conn;
    
    public ComposicaoDAO(){
        conn = new ConexaoOracle();
    }
    
    public void incluir(Composicao composicao) {
        String sql = " INSERT INTO COMPOSICAO VALUES("
                + composicao.getIDPRODUTO() + ","
                + composicao.getIDPROD() +  ","
                + composicao.getQTDPRODUTO() + ")";
         conn.incluirSQL(sql);
    }
     
      public void alterar(Composicao composicao) {
        String sql = "UPDATE COMPOSICAO SET" 
                + " IDPRODUTO = " + composicao.getIDPRODUTO() + ","
                + " IDPROD = " + composicao.getIDPROD() + ","
                + "QTDPRODUTO = " + composicao.getQTDPRODUTO()
                + " WHERE IDPRODUTO = " + composicao.getIDPRODUTO();
        conn.incluirSQL(sql);
    }
     
      public void excluir(Composicao composicao) {
        String sql = "DELETE FROM COMPOSICAO WHERE IDPRODUTO = " + composicao.getIDPRODUTO();
        conn.executeSQL(sql);
        
        
      }
     public void consulta(Composicao composicao) {
        String sql = "SELECT * FROM COMPOSICAO ORDER BY IDPRODUTO";
        conn.executeSQL(sql);
        composicao.setRetorno(conn.resultset);
     }    

    public void consultaComposicao(Composicao composicao, Integer idproduto) {
   

    }
    
}
