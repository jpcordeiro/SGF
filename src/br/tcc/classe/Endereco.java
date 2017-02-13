package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class Endereco {
    private Integer IDENDERECO;
    private Integer IDSEQUENCIAL;
    private Integer IDPESSOA;
    private String TPENDERECO;
    private String DSLOGRADOURO;
    private String DSNUMERO;
    private String DSBAIRRO;
    private String NRCEP;
    private String DSCOMPLEMENTO;
    private Integer IDCIDADE;
    private Estado IDESTADO;
    
     private ResultSet retorno;

    public Integer getIDENDERECO() {
        return IDENDERECO;
    }

    public void setIDENDERECO(Integer IDENDERECO) {
        this.IDENDERECO = IDENDERECO;
    }

    public Integer getIDSEQUENCIAL() {
        return IDSEQUENCIAL;
    }

    public void setIDSEQUENCIAL(Integer IDSEQUENCIAL) {
        this.IDSEQUENCIAL = IDSEQUENCIAL;
    }

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

    public Estado getIDESTADO() {
        return IDESTADO;
    }

    public void setIDESTADO(Estado IDESTADO) {
        this.IDESTADO = IDESTADO;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }    
}
