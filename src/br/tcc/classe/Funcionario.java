
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
    private Data DTCADASTRO;
    private Data DTDEMISSAO;
    private Integer TPSITUACAO;
    private Double VLSALARIO;
    private Integer SENHA;
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

    public Data getDTCADASTRO() {
        return DTCADASTRO;
    }

    public void setDTCADASTRO(Data DTCADASTRO) {
        this.DTCADASTRO = DTCADASTRO;
    }

    public Data getDTDEMISSAO() {
        return DTDEMISSAO;
    }

    public void setDTDEMISSAO(Data DTDEMISSAO) {
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

    public Integer getSENHA() {
        return SENHA;
    }

    public void setSENHA(Integer SENHA) {
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
