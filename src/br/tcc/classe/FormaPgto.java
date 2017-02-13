package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class FormaPgto {
    
    private Integer IDFORMAPGTO;
    private String DSFORMAPGTO;
    private Integer TPSITUACAO;
    private Integer NRINTERVALO;
    
    private ResultSet retorno;
    private static int[] vet = new int[100];

    public Integer getIDFORMAPGTO() {
        return IDFORMAPGTO;
    }

    public void setIDFORMAPGTO(Integer IDFORMAPGTO) {
        this.IDFORMAPGTO = IDFORMAPGTO;
    }

    public String getDSFORMAPGTO() {
        return DSFORMAPGTO;
    }

    public void setDSFORMAPGTO(String DSFORMAPGTO) {
        this.DSFORMAPGTO = DSFORMAPGTO;
    }

    public Integer getTPSITUACAO() {
        return TPSITUACAO;
    }

    public void setTPSITUACAO(Integer TPSITUACAO) {
        this.TPSITUACAO = TPSITUACAO;
    }

    public Integer getNRINTERVALO() {
        return NRINTERVALO;
    }

    public void setNRINTERVALO(Integer NRINTERVALO) {
        this.NRINTERVALO = NRINTERVALO;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }

    public static int[] getVet() {
        return vet;
    }

    public static void setVet(int[] vet) {
        FormaPgto.vet = vet;
    }
    
    
    
}
