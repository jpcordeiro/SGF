package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author João Paulo
 */
public class Cliente {
    
    private Integer IDPESSOA;
    private String DTCADASTRO;
    private String TPCLIENTE;
    private Integer TPSITUACAO;
    
    
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

    public String getTPCLIENTE() {
        return TPCLIENTE;
    }

    public void setTPCLIENTE(String TPCLIENTE) {
        this.TPCLIENTE = TPCLIENTE;
    }

    public Integer getTPSITUACAO() {
        return TPSITUACAO;
    }

    public void setTPSITUACAO(Integer TPSITUACAO) {
        this.TPSITUACAO = TPSITUACAO;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    

}
