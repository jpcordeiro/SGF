
package br.tcc.classe;

import java.sql.ResultSet;
import javax.xml.crypto.Data;

/**
 *
 * @author JOÃO PAULO
 */
public class Pessoa {
    
    private Integer IDPESSOA;
    private String DSPESSOA;
    private String DTNASC;   
    
    private ResultSet retorno;

    public Integer getIDPESSOA() {
        return IDPESSOA;
    }

    public void setIDPESSOA(Integer IDPESSOA) {
        this.IDPESSOA = IDPESSOA;
    }

    public String getDSPESSOA() {
        return DSPESSOA;
    }

    public void setDSPESSOA(String DSPESSOA) {
        this.DSPESSOA = DSPESSOA;
    }

    public String getDTNASC() {
        return DTNASC;
    }

    public void setDTNASC(String DTNASC) {
        this.DTNASC = DTNASC;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    
    
    
}
