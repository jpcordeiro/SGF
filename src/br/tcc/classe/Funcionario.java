package br.tcc.classe;

import java.sql.ResultSet;
import javax.xml.crypto.Data;

/**
 *
 * @author JOÃO PAULO
 */
public class Funcionario {
    private Integer IDPESSOA;
    private String DTCADASTRO;
    private String DTDEMISSAO;
    private Integer TPSITUACAO;
    private Double VLSALARIO;
    private String LOGIN;   
    
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

    public String getDTDEMISSAO() {
        return DTDEMISSAO;
    }

    public void setDTDEMISSAO(String DTDEMISSAO) {
        this.DTDEMISSAO = DTDEMISSAO;
    }

    public Integer getTPSITUACAO() {
        return TPSITUACAO;
    }

    public void setTPSITUACAO(Integer TPSITUACAO) {
        this.TPSITUACAO = TPSITUACAO;
    }

    public Double getVLSALARIO() {
        return VLSALARIO;
    }

    public void setVLSALARIO(Double VLSALARIO) {
        this.VLSALARIO = VLSALARIO;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(String LOGIN) {
        this.LOGIN = LOGIN;
    }
    
    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    
    
}
