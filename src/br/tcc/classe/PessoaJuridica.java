package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class PessoaJuridica {
    private Integer IDPESSOA;
    private String NRCNPJ;
    private String RZSOCIAL;
    private String INSCESTADUAL;
    
     private ResultSet retorno;

    public Integer getIDPESSOA() {
        return IDPESSOA;
    }

    public void setIDPESSOA(Integer IDPESSOA) {
        this.IDPESSOA = IDPESSOA;
    }

    public String getNRCNPJ() {
        return NRCNPJ;
    }

    public void setNRCNPJ(String NRCNPJ) {
        this.NRCNPJ = NRCNPJ;
    }

    public String getRZSOCIAL() {
        return RZSOCIAL;
    }

    public void setRZSOCIAL(String RZSOCIAL) {
        this.RZSOCIAL = RZSOCIAL;
    }

    public String getINSCESTADUAL() {
        return INSCESTADUAL;
    }

    public void setINSCESTADUAL(String INSCESTADUAL) {
        this.INSCESTADUAL = INSCESTADUAL;
    }

    

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
     
     
     
    
}
