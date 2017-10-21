package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO CORDEIRO
 */
public class Recebimento {
    
     private Integer IDRECEBIMENTO;
     private Integer IDCONTASRECEBER;
     private Double VLPAGO;
     private Double PERDESCONTO;
     private Double PERJUROS;
    
     private ResultSet retorno;

    public Integer getIDRECEBIMENTO() {
        return IDRECEBIMENTO;
    }

    public void setIDRECEBIMENTO(Integer IDRECEBIMENTO) {
        this.IDRECEBIMENTO = IDRECEBIMENTO;
    }

    public Integer getIDCONTASRECEBER() {
        return IDCONTASRECEBER;
    }

    public void setIDCONTASRECEBER(Integer IDCONTASRECEBER) {
        this.IDCONTASRECEBER = IDCONTASRECEBER;
    }

    public Double getVLPAGO() {
        return VLPAGO;
    }

    public void setVLPAGO(Double VLPAGO) {
        this.VLPAGO = VLPAGO;
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

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
     
     
}
