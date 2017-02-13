package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class CadastroTela {
    
    private Integer IDTELA;
    private String DSTELA;
    
    private ResultSet retorno;
    private static int[] vet = new int[100];

    public Integer getIDTELA() {
        return IDTELA;
    }

    public void setIDTELA(Integer IDTELA) {
        this.IDTELA = IDTELA;
    }

    public String getDSTELA() {
        return DSTELA;
    }

    public void setDSTELA(String DSTELA) {
        this.DSTELA = DSTELA;
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
        CadastroTela.vet = vet;
    }
    
    
}
