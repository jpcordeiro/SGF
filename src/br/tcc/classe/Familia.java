package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class Familia {
    private Integer IDFAMILIA;
    private String DSFAMILIA;
    private ResultSet retorno;
    private static int[] vet = new int[100];

    public Integer getIDFAMILIA() {
        return IDFAMILIA;
    }

    public void setIDFAMILIA(Integer IDFAMILIA) {
        this.IDFAMILIA = IDFAMILIA;
    }

    public String getDSFAMILIA() {
        return DSFAMILIA;
    }

    public void setDSFAMILIA(String DSFAMILIA) {
        this.DSFAMILIA = DSFAMILIA;
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
        Familia.vet = vet;
    }
    
    
    
}
