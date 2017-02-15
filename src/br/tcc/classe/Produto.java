package br.tcc.classe;

import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author JOÃO PAULO
 */
public class Produto {
    
    private Integer IDPRODUTO;
    private Integer IDFAMILIA;
    private String DSPRODUTO;
    private String DTCOMRPA;
    private char TPMATERIA;
    private ResultSet retorno;
    private static int[] vet = new int[100];

    public Integer getIDPRODUTO() {
        return IDPRODUTO;
    }

    public void setIDPRODUTO(Integer IDPRODUTO) {
        this.IDPRODUTO = IDPRODUTO;
    }

    public Integer getIDFAMILIA() {
        return IDFAMILIA;
    }

    public void setIDFAMILIA(Integer IDFAMILIA) {
        this.IDFAMILIA = IDFAMILIA;
    }

    public String getDSPRODUTO() {
        return DSPRODUTO;
    }

    public void setDSPRODUTO(String DSPRODUTO) {
        this.DSPRODUTO = DSPRODUTO;
    }

    public String getDTCOMRPA() {
        return DTCOMRPA;
    }

    public void setDTCOMRPA(String DTCOMRPA) {
        this.DTCOMRPA = DTCOMRPA;
    }

    public char getTPMATERIA() {
        return TPMATERIA;
    }

    public void setTPMATERIA(char TPMATERIA) {
        this.TPMATERIA = TPMATERIA;
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
        Produto.vet = vet;
    }
    
    
    
    
}
