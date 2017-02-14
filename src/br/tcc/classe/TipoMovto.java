package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class TipoMovto {
    
    private Integer IDTPMOVTO;
    private String MOVESTOQUE;
    private String MOVFINANCEIRO;
    private Integer TPMOVTO;
    
    private ResultSet retorno;
    private static int[] vet = new int[100];

    public Integer getIDTPMOVTO() {
        return IDTPMOVTO;
    }

    public void setIDTPMOVTO(Integer IDTPMOVTO) {
        this.IDTPMOVTO = IDTPMOVTO;
    }

    public String getMOVESTOQUE() {
        return MOVESTOQUE;
    }

    public void setMOVESTOQUE(String MOVESTOQUE) {
        this.MOVESTOQUE = MOVESTOQUE;
    }

    public String getMOVFINANCEIRO() {
        return MOVFINANCEIRO;
    }

    public void setMOVFINANCEIRO(String MOVFINANCEIRO) {
        this.MOVFINANCEIRO = MOVFINANCEIRO;
    }

    public Integer getTPMOVTO() {
        return TPMOVTO;
    }

    public void setTPMOVTO(Integer TPMOVTO) {
        this.TPMOVTO = TPMOVTO;
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
        TipoMovto.vet = vet;
    }
    
    
    
    
}
