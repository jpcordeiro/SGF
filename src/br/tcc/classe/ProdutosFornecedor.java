package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class ProdutosFornecedor {
    
    private Integer IDPRODUTO;
    private Integer IDFORNECEDOR;
    
    
    private ResultSet retorno;

    public Integer getIDPRODUTO() {
        return IDPRODUTO;
    }

    public void setIDPRODUTO(Integer IDPRODUTO) {
        this.IDPRODUTO = IDPRODUTO;
    }

    public Integer getIDFORNECEDOR() {
        return IDFORNECEDOR;
    }

    public void setIDFORNECEDOR(Integer IDFORNECEDOR) {
        this.IDFORNECEDOR = IDFORNECEDOR;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }

    
    
    
}
