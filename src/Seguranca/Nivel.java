/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguranca;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class Nivel {
    private Integer IDNIVEL;
    private String DSNIVEL;
    private Integer IdNivel;
    
    private ResultSet retorno;
    private static int[] vet = new int[100];

    public Integer getIDNIVEL() {
        return IDNIVEL;
    }

    public void setIDNIVEL(Integer IDNIVEL) {
        this.IDNIVEL = IDNIVEL;
    }

    public String getDSNIVEL() {
        return DSNIVEL;
    }

    public void setDSNIVEL(String DSNIVEL) {
        this.DSNIVEL = DSNIVEL;
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
        Nivel.vet = vet;
    }

    public Integer getIdNivel() {
        return IdNivel;
    }

    public void setIdNivel(Integer IdNivel) {
        this.IdNivel = IdNivel;
    }
    
    
    
}
