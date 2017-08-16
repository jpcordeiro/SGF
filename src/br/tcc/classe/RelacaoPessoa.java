package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author Joao Paulo
 */
public class RelacaoPessoa {
    
    private Integer IDPESSOA;
    private String TPRELACAO;
    private String DTCOMEMORACAO;
    private String TPCOMEMORACAO;
    private Integer IDSEQUENCIA;
    private String DSNOME;
    
    private ResultSet retorno;

    public Integer getIDPESSOA() {
        return IDPESSOA;
    }

    public void setIDPESSOA(Integer IDPESSOA) {
        this.IDPESSOA = IDPESSOA;
    }

    public String getTPRELACAO() {
        return TPRELACAO;
    }

    public void setTPRELACAO(String TPRELACAO) {
        this.TPRELACAO = TPRELACAO;
    }

    public String getDTCOMEMORACAO() {
        return DTCOMEMORACAO;
    }

    public void setDTCOMEMORACAO(String DTCOMEMORACAO) {
        this.DTCOMEMORACAO = DTCOMEMORACAO;
    }

    public String getTPCOMEMORACAO() {
        return TPCOMEMORACAO;
    }

    public void setTPCOMEMORACAO(String TPCOMEMORACAO) {
        this.TPCOMEMORACAO = TPCOMEMORACAO;
    }

    public Integer getIDSEQUENCIA() {
        return IDSEQUENCIA;
    }

    public void setIDSEQUENCIA(Integer IDSEQUENCIA) {
        this.IDSEQUENCIA = IDSEQUENCIA;
    }

    public String getDSNOME() {
        return DSNOME;
    }

    public void setDSNOME(String DSNOME) {
        this.DSNOME = DSNOME;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    
    
}
