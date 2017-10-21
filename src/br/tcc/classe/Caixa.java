package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO CORDEIRO
 */
public class Caixa {
    
    private Integer IDCAIXA;
    private String DTPAGO;
    private String INENTRADA;
    private Integer IDRECEBIMENTO;
    private Integer IDPAGAMENTO;
    
    
    private ResultSet retorno;

    public Integer getIDCAIXA() {
        return IDCAIXA;
    }

    public void setIDCAIXA(Integer IDCAIXA) {
        this.IDCAIXA = IDCAIXA;
    }

    public String getDTPAGO() {
        return DTPAGO;
    }

    public void setDTPAGO(String DTPAGO) {
        this.DTPAGO = DTPAGO;
    }

    public String getINENTRADA() {
        return INENTRADA;
    }

    public void setINENTRADA(String INENTRADA) {
        this.INENTRADA = INENTRADA;
    }

    public Integer getIDRECEBIMENTO() {
        return IDRECEBIMENTO;
    }

    public void setIDRECEBIMENTO(Integer IDRECEBIMENTO) {
        this.IDRECEBIMENTO = IDRECEBIMENTO;
    }

    public Integer getIDPAGAMENTO() {
        return IDPAGAMENTO;
    }

    public void setIDPAGAMENTO(Integer IDPAGAMENTO) {
        this.IDPAGAMENTO = IDPAGAMENTO;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    
    
}
