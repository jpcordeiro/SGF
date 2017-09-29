/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tcc.dao;

import br.tcc.classe.Venda;
import br.tcc.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author JOÃO PAULO
 */
public class VendaDAO {
    
    ConexaoOracle conn;

    public VendaDAO() {
        conn = new ConexaoOracle();
    }

    public void incluir (Venda venda) {
        String sql = " INSERT INTO VENDA VALUES("
                + venda.getIDVENDA() + ",'"
                + venda.getDTVENDA() + "',"
                + venda.getIDCLIENTE() + ","
                + venda.getIDFORMAPGTO() + ","
                + venda.getIDMOVTOPRODUTO() + ")";
        conn.incluirSQL(sql);
    }
    
    public void alterar(Venda venda) {
        String sql = "UPDATE VENDA SET"
                + " IDVENDA = " + venda.getIDVENDA() + ","
                + " DTVENDA = '" + venda.getDTVENDA() + "'"
                + " IDCLIENTE = " + venda.getIDCLIENTE() + ","
                + " IDFORMAPGTO = " + venda.getIDFORMAPGTO() + ","
                + " IDMOVTOPRODUTO = " + venda.getIDMOVTOPRODUTO() + ","
                + " WHERE IDVENDA = " + venda.getIDVENDA();
        conn.incluirSQL(sql);
    }

    public void excluir(Venda venda) {
        String sql = "DELETE FROM VENDA WHERE IDCOMPRA = " + venda.getIDVENDA();
        conn.executeSQL(sql);
    }

    public Integer retornaUltimoId(Integer idV) throws SQLException {
    
         String sql = "SELECT IDVENDA FROM VENDA";
        conn.executeSQL(sql);

        if (conn.resultset.last()) {
            idV = conn.resultset.getInt("IDVENDA");
        }
        return (idV);

    }

    public void consulta(Venda venda) {
  
         String sql = "SELECT  V.IDVENDA, V.DTVENDA, P.DSPESSOA"
                + " FROM VENDA V JOIN CLIENTE C ON V.IDCLIENTE = C.IDPESSOA,"
                + " CLIENTE CO JOIN PESSOA P ON CO.IDPESSOA = P.IDPESSOA";

        conn.executeSQL(sql);
        venda.setRetorno(conn.resultset);
    }

    public void consultacliente(Venda venda, String cliente) {
   
        String sql = "SELECT  V.IDVENDA, V.DTVENDA, P.DSPESSOA "
                + " FROM VENDA V JOIN CLIENTE C ON V.IDCLIENTE = C.IDPESSOA,"
                + " CLIENTE CO JOIN PESSOA P ON CO.IDPESSOA = P.IDPESSOA"
                + " WHERE  P.DSPESSOA LIKE'%" +cliente+ "%'";

        conn.executeSQL(sql);
        venda.setRetorno(conn.resultset);
    }
    
}
