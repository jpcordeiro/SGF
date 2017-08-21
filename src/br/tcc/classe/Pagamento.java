package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class Pagamento {
    
    private Integer IDPAGAMENTO;
    private Integer IDCONTASPAGAR;
    private Double VLPAGO;
    private String TPPAGO;
    
      private ResultSet retorno;

    public Integer getIDPAGAMENTO() {
        return IDPAGAMENTO;
    }

    public void setIDPAGAMENTO(Integer IDPAGAMENTO) {
        this.IDPAGAMENTO = IDPAGAMENTO;
    }

    public Integer getIDCONTASPAGAR() {
        return IDCONTASPAGAR;
    }

    public void setIDCONTASPAGAR(Integer IDCONTASPAGAR) {
        this.IDCONTASPAGAR = IDCONTASPAGAR;
    }

    public Double getVLPAGO() {
        return VLPAGO;
    }

    public void setVLPAGO(Double VLPAGO) {
        this.VLPAGO = VLPAGO;
    }

    public String getTPPAGO() {
        return TPPAGO;
    }

    public void setTPPAGO(String TPPAGO) {
        this.TPPAGO = TPPAGO;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
      
      
}
