package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class Endereco {
    private Integer IDPESSOA;
    private String TPENDERECO;
    private String DSLOGRADOURO;
    private String DSNUMERO;
    private String DSBAIRRO;
    private String NRCEP;
    private String DSCOMPLEMENTO;
    private Integer IDCIDADE;
 
    
     private ResultSet retorno;
     
    public Integer getIDPESSOA() {
        return IDPESSOA;
    }

    public void setIDPESSOA(Integer IDPESSOA) {
        this.IDPESSOA = IDPESSOA;
    }

    public String getTPENDERECO() {
        return TPENDERECO;
    }

    public void setTPENDERECO(String TPENDERECO) {
        this.TPENDERECO = TPENDERECO;
    }

    public String getDSLOGRADOURO() {
        return DSLOGRADOURO;
    }

    public void setDSLOGRADOURO(String DSLOGRADOURO) {
        this.DSLOGRADOURO = DSLOGRADOURO;
    }

    public String getDSNUMERO() {
        return DSNUMERO;
    }

    public void setDSNUMERO(String DSNUMERO) {
        this.DSNUMERO = DSNUMERO;
    }

    public String getDSBAIRRO() {
        return DSBAIRRO;
    }

    public void setDSBAIRRO(String DSBAIRRO) {
        this.DSBAIRRO = DSBAIRRO;
    }

    public String getNRCEP() {
        return NRCEP;
    }

    public void setNRCEP(String NRCEP) {
        this.NRCEP = NRCEP;
    }

    public String getDSCOMPLEMENTO() {
        return DSCOMPLEMENTO;
    }

    public void setDSCOMPLEMENTO(String DSCOMPLEMENTO) {
        this.DSCOMPLEMENTO = DSCOMPLEMENTO;
    }

    public Integer getIDCIDADE() {
        return IDCIDADE;
    }

    public void setIDCIDADE(Integer IDCIDADE) {
        this.IDCIDADE = IDCIDADE;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }    
}
