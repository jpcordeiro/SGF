package Seguranca;

import java.sql.ResultSet;

/**
 *
 * @author Usuário
 */
public class Login {
    
     private Integer IDUSUARIO;
     private String DSUSUARIO;
     private String DSSENHA;
     private Integer IDNIVEL;
     private ResultSet retorno;
     private static int[] vet = new int[100];

    public Integer getIDUSUARIO() {
        return IDUSUARIO;
    }

    public void setIDUSUARIO(Integer IDUSUARIO) {
        this.IDUSUARIO = IDUSUARIO;
    }

    public String getDSUSUARIO() {
        return DSUSUARIO;
    }

    public void setDSUSUARIO(String DSUSUARIO) {
        this.DSUSUARIO = DSUSUARIO;
    }

    public String getDSSENHA() {
        return DSSENHA;
    }

    public void setDSSENHA(String DSSENHA) {
        this.DSSENHA = DSSENHA;
    }

    public Integer getIDNIVEL() {
        return IDNIVEL;
    }

    public void setIDNIVEL(Integer IDNIVEL) {
        this.IDNIVEL = IDNIVEL;
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
        Login.vet = vet;
    }
     
     
     
    
}
