package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class Venda {
    
    private Integer IDVENDA;
    private String DTVENDA;
    private Integer IDCLIENTE;
    private Integer IDFORMAPGTO;
    private Integer IDMOVTOPRODUTO;  
    
    private ResultSet retorno;

    public Integer getIDVENDA() {
        return IDVENDA;
    }

    public void setIDVENDA(Integer IDVENDA) {
        this.IDVENDA = IDVENDA;
    }

    public String getDTVENDA() {
        return DTVENDA;
    }

    public void setDTVENDA(String DTVENDA) {
        this.DTVENDA = DTVENDA;
    }

    public Integer getIDCLIENTE() {
        return IDCLIENTE;
    }

    public void setIDCLIENTE(Integer IDCLIENTE) {
        this.IDCLIENTE = IDCLIENTE;
    }

    public Integer getIDFORMAPGTO() {
        return IDFORMAPGTO;
    }

    public void setIDFORMAPGTO(Integer IDFORMAPGTO) {
        this.IDFORMAPGTO = IDFORMAPGTO;
    }

    public Integer getIDMOVTOPRODUTO() {
        return IDMOVTOPRODUTO;
    }

    public void setIDMOVTOPRODUTO(Integer IDMOVTOPRODUTO) {
        this.IDMOVTOPRODUTO = IDMOVTOPRODUTO;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    

    
}
