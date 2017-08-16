package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class PrecoVenda {
    
    private Integer IDPRECOVENDA;
    private Integer IDPRODUTO;
    private Double VLVENDA;
    private String DTALTERACAO;
    
    private ResultSet retorno;

    public Integer getIDPRECOVENDA() {
        return IDPRECOVENDA;
    }

    public void setIDPRECOVENDA(Integer IDPRECOVENDA) {
        this.IDPRECOVENDA = IDPRECOVENDA;
    }

    public Integer getIDPRODUTO() {
        return IDPRODUTO;
    }

    public void setIDPRODUTO(Integer IDPRODUTO) {
        this.IDPRODUTO = IDPRODUTO;
    }

    public Double getVLVENDA() {
        return VLVENDA;
    }

    public void setVLVENDA(Double VLVENDA) {
        this.VLVENDA = VLVENDA;
    }

    public String getDTALTERACAO() {
        return DTALTERACAO;
    }

    public void setDTALTERACAO(String DTALTERACAO) {
        this.DTALTERACAO = DTALTERACAO;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    
    
    
}
