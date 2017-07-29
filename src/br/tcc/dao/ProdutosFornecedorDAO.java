/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tcc.dao;

import br.tcc.classe.ProdutosFornecedor;
import br.tcc.conexao.ConexaoOracle;

/**
 *
 * @author Usuário
 */
public class ProdutosFornecedorDAO {
    
     ConexaoOracle conn;

    public ProdutosFornecedorDAO() {
        conn = new ConexaoOracle();
    }
    
    public void incluir(ProdutosFornecedor prodForn) {
        String sql = " INSERT INTO PRODUTOSFORNECEDOR VALUES("
                + prodForn.getIDPRODUTO() + ","
                + prodForn.getIDFORNECEDOR() + ")";
        conn.incluirSQL(sql);
    }
    
     public void excluir(ProdutosFornecedor prodForn) {
        String sql = "DELETE FROM PRODUTOSFORNECEDOR WHERE IDFORNECEDOR = " + prodForn.getIDFORNECEDOR();
        conn.executeSQL(sql);
    }
}
