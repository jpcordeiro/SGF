/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class Telefone {
    
    private Integer IDPESSOA;
    private Integer TPFONE;
    private String NRFONE;
    private ResultSet retorno;

    public Integer getIDPESSOA() {
        return IDPESSOA;
    }

    public void setIDPESSOA(Integer IDPESSOA) {
        this.IDPESSOA = IDPESSOA;
    }

    public Integer getTPFONE() {
        return TPFONE;
    }

    public void setTPFONE(Integer TPFONE) {
        this.TPFONE = TPFONE;
    }

    public String getNRFONE() {
        return NRFONE;
    }

    public void setNRFONE(String NRFONE) {
        this.NRFONE = NRFONE;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    
    
    
}
