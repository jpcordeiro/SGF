package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class ContasReceber {
    
    private Integer IDCONTASRECEBER;
    private Integer IDVENDA;
    private String DTRECEBER;
    private Double VLRECEBER;
    private Integer IDPARCELA;
    
    private ResultSet retorno;

    public Integer getIDCONTASRECEBER() {
        return IDCONTASRECEBER;
    }

    public void setIDCONTASRECEBER(Integer IDCONTASRECEBER) {
        this.IDCONTASRECEBER = IDCONTASRECEBER;
    }

    public Integer getIDVENDA() {
        return IDVENDA;
    }

    public void setIDVENDA(Integer IDVENDA) {
        this.IDVENDA = IDVENDA;
    }

    public String getDTRECEBER() {
        return DTRECEBER;
    }

    public void setDTRECEBER(String DTRECEBER) {
        this.DTRECEBER = DTRECEBER;
    }

    public Double getVLRECEBER() {
        return VLRECEBER;
    }

    public void setVLRECEBER(Double VLRECEBER) {
        this.VLRECEBER = VLRECEBER;
    }

    public Integer getIDPARCELA() {
        return IDPARCELA;
    }

    public void setIDPARCELA(Integer IDPARCELA) {
        this.IDPARCELA = IDPARCELA;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    
}
