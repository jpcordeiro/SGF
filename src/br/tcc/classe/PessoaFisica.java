
package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class PessoaFisica {
    private Integer IDPESSOA;
    private String NRCPF;
    private String NRRG;
    private String TPSEXO;
    
    private ResultSet retorno;

    public Integer getIDPESSOA() {
        return IDPESSOA;
    }

    public void setIDPESSOA(Integer IDPESSOA) {
        this.IDPESSOA = IDPESSOA;
    }

    public String getNRCPF() {
        return NRCPF;
    }

    public void setNRCPF(String NRCPF) {
        this.NRCPF = NRCPF;
    }

    public String getNRRG() {
        return NRRG;
    }

    public void setNRRG(String NRRG) {
        this.NRRG = NRRG;
    }

    public String getTPSEXO() {
        return TPSEXO;
    }

    public void setTPSEXO(String TPSEXO) {
        this.TPSEXO = TPSEXO;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
   }
