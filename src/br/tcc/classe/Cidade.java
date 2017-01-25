package br.tcc.classe;

import java.sql.ResultSet;
import java.util.Objects;

/**
 *
 * @author JOÃO PAULO
 */
public class Cidade {

    private Integer IDCIDADE;
    private Estado estado;
    private Integer idUf;
    private String dscidade;
    private Double NRISSQN;
    private ResultSet retorno;

    public Integer getIDCIDADE() {
        return IDCIDADE;
    }

    public void setIDCIDADE(Integer IDCIDADE) {
        this.IDCIDADE = IDCIDADE;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getIdUf() {
        return idUf;
    }

    public void setIdUf(Integer idUf) {
        this.idUf = idUf;
    }  

    public String getDscidade() {
        return dscidade;
    }

    public void setDscidade(String dscidade) {
        this.dscidade = dscidade;
    }

    public Double getNRISSQN() {
        return NRISSQN;
    }

    public void setNRISSQN(Double NRISSQN) {
        this.NRISSQN = NRISSQN;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.IDCIDADE);
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
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.IDCIDADE, other.IDCIDADE)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
