package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class ContasPagar {
    
    private Integer IDCONTASPAGAR;
    private Integer IDCOMRPA;
    private String DTPAGAR;
    private Double VLPAGAR;
    private Integer IDPARCELA;
    
    private ResultSet retorno;

    public Integer getIDCONTASPAGAR() {
        return IDCONTASPAGAR;
    }

    public void setIDCONTASPAGAR(Integer IDCONTASPAGAR) {
        this.IDCONTASPAGAR = IDCONTASPAGAR;
    }

    public Integer getIDCOMRPA() {
        return IDCOMRPA;
    }

    public void setIDCOMRPA(Integer IDCOMRPA) {
        this.IDCOMRPA = IDCOMRPA;
    }

    public String getDTPAGAR() {
        return DTPAGAR;
    }

    public void setDTPAGAR(String DTPAGAR) {
        this.DTPAGAR = DTPAGAR;
    }

    public Double getVLPAGAR() {
        return VLPAGAR;
    }

    public void setVLPAGAR(Double VLPAGAR) {
        this.VLPAGAR = VLPAGAR;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }

    public Integer getIDPARCELA() {
        return IDPARCELA;
    }

    public void setIDPARCELA(Integer IDPARCELA) {
        this.IDPARCELA = IDPARCELA;
    }
    
    
    
}
