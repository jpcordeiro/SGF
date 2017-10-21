package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class Compra {
    
    private Integer IDCOMPRA;
    private String DTVENDA;
    private Integer IDFORNECEDOR;
    private Integer IDFORMAPGTO;

    
    private ResultSet retorno;

    public Integer getIDCOMPRA() {
        return IDCOMPRA;
    }

    public void setIDCOMPRA(Integer IDCOMPRA) {
        this.IDCOMPRA = IDCOMPRA;
    }

    public String getDTVENDA() {
        return DTVENDA;
    }

    public void setDTVENDA(String DTVENDA) {
        this.DTVENDA = DTVENDA;
    }

    public Integer getIDFORNECEDOR() {
        return IDFORNECEDOR;
    }

    public void setIDFORNECEDOR(Integer IDFORNECEDOR) {
        this.IDFORNECEDOR = IDFORNECEDOR;
    }

    public Integer getIDFORMAPGTO() {
        return IDFORMAPGTO;
    }

    public void setIDFORMAPGTO(Integer IDFORMAPGTO) {
        this.IDFORMAPGTO = IDFORMAPGTO;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }

  
    
    

    
}
