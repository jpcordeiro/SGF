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
    private Double PERDESCONTO;
    private Double PERJUROS;
    
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

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }

    public Double getPERDESCONTO() {
        return PERDESCONTO;
    }

    public void setPERDESCONTO(Double PERDESCONTO) {
        this.PERDESCONTO = PERDESCONTO;
    }

    public Double getPERJUROS() {
        return PERJUROS;
    }

    public void setPERJUROS(Double PERJUROS) {
        this.PERJUROS = PERJUROS;
    }
      
    
      
}
