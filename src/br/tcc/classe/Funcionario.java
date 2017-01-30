
package br.tcc.classe;

import java.sql.ResultSet;
import javax.xml.crypto.Data;

/**
 *
 * @author JOÃO PAULO
 */
public class Funcionario {
    private Integer IDPESSOA;
    private String NRREGISTRO;
    private String DTCADASTRO;
    private String DTDEMISSAO;
    private Integer TPSITUACAO;
    private Double VLSALARIO;
    private String SENHA;
    private String LOGIN;
    private Integer IDNIVEL;
    
    
    private ResultSet retorno;

    public Integer getIDPESSOA() {
        return IDPESSOA;
    }

    public void setIDPESSOA(Integer IDPESSOA) {
        this.IDPESSOA = IDPESSOA;
    }

    public String getNRREGISTRO() {
        return NRREGISTRO;
    }

    public void setNRREGISTRO(String NRREGISTRO) {
        this.NRREGISTRO = NRREGISTRO;
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

    public String getSENHA() {
        return SENHA;
    }

    public void setSENHA(String SENHA) {
        this.SENHA = SENHA;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(String LOGIN) {
        this.LOGIN = LOGIN;
    }

    public Integer getIDNIVEL() {
        return IDNIVEL;
    }

    public void setIDNIVEL(Integer IDNIVEL) {
        this.IDNIVEL = IDNIVEL;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    
    
}
