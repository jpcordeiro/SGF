package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class Fornecedor {
    
    private Integer IDPESSOA;
    private String DTCADASTRO;
    private Integer TPSITUACAO;
    private Double VLLIMITE;
    private String TPPESSOA;
    private String DSEMAIL;
    
    private ResultSet retorno;

    public Integer getIDPESSOA() {
        return IDPESSOA;
    }

    public void setIDPESSOA(Integer IDPESSOA) {
        this.IDPESSOA = IDPESSOA;
    }

    public String getDTCADASTRO() {
        return DTCADASTRO;
    }

    public void setDTCADASTRO(String DTCADASTRO) {
        this.DTCADASTRO = DTCADASTRO;
    }

    public Integer getTPSITUACAO() {
        return TPSITUACAO;
    }

    public void setTPSITUACAO(Integer TPSITUACAO) {
        this.TPSITUACAO = TPSITUACAO;
    }

    public Double getVLLIMITE() {
        return VLLIMITE;
    }

    public void setVLLIMITE(Double VLLIMITE) {
        this.VLLIMITE = VLLIMITE;
    }

    public String getTPPESSOA() {
        return TPPESSOA;
    }

    public void setTPPESSOA(String TPPESSOA) {
        this.TPPESSOA = TPPESSOA;
    }

    public String getDSEMAIL() {
        return DSEMAIL;
    }

    public void setDSEMAIL(String DSEMAIL) {
        this.DSEMAIL = DSEMAIL;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    
    
}
