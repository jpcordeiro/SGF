package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class ItensCompra {
    
    private Integer IDITENSCOMRPA;
    private Integer IDCOMPRA;
    private Integer IDPRODUTO;
    private Integer QTDPRODUTO;
    private Double VLPRODUTO;
    
    private ResultSet retorno;

    public Integer getIDITENSCOMRPA() {
        return IDITENSCOMRPA;
    }

    public void setIDITENSCOMRPA(Integer IDITENSCOMRPA) {
        this.IDITENSCOMRPA = IDITENSCOMRPA;
    }

    public Integer getIDCOMPRA() {
        return IDCOMPRA;
    }

    public void setIDCOMPRA(Integer IDCOMPRA) {
        this.IDCOMPRA = IDCOMPRA;
    }

    public Integer getIDPRODUTO() {
        return IDPRODUTO;
    }

    public void setIDPRODUTO(Integer IDPRODUTO) {
        this.IDPRODUTO = IDPRODUTO;
    }

    public Integer getQTDPRODUTO() {
        return QTDPRODUTO;
    }

    public void setQTDPRODUTO(Integer QTDPRODUTO) {
        this.QTDPRODUTO = QTDPRODUTO;
    }

    public Double getVLPRODUTO() {
        return VLPRODUTO;
    }

    public void setVLPRODUTO(Double VLPRODUTO) {
        this.VLPRODUTO = VLPRODUTO;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    
    
}
