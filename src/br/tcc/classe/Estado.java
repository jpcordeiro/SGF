package br.tcc.classe;

import java.sql.ResultSet;
import java.util.Objects;

/**
 *
 * @author JOÃO PAULO
 */
public class Estado {
    
    private Integer IDUF;
    private String DSUF;
    private String DSSIGLA;
    private ResultSet retorno;
    private static int[] vet = new int[100];

    public Integer getIDUF() {
        return IDUF;
    }

    public void setIDUF(Integer IDUF) {
        this.IDUF = IDUF;
    }
    public String getDSUF() {
        return DSUF;
    }

    public void setDSUF(String DSUF) {
        this.DSUF = DSUF;
    }

    public String getDSSIGLA() {
        return DSSIGLA;
    }

    public void setDSSIGLA(String DSSIGLA) {
        this.DSSIGLA = DSSIGLA;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.DSUF);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.DSUF, other.DSUF)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estado{" + "DSUF=" + DSUF + ", DSSIGLA=" + DSSIGLA + ", NRICMS="  + '}';
    }

    public static int[] getVet() {
        return vet;
    }

    public static void setVet(int[] vet) {
        Estado.vet = vet;
    }
    
    
    
}
