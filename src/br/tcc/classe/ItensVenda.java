package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class ItensVenda {
    
    private Integer IDITENSVENDA;
    private Integer IDVENDA;
    private Integer IDPRODUTO;
    private Integer QTDPRODUTO;
    private Double VLPRODUTO;
    
    private ResultSet retorno;

    public Integer getIDITENSVENDA() {
        return IDITENSVENDA;
    }

    public void setIDITENSVENDA(Integer IDITENSVENDA) {
        this.IDITENSVENDA = IDITENSVENDA;
    }

    public Integer getIDVENDA() {
        return IDVENDA;
    }

    public void setIDVENDA(Integer IDVENDA) {
        this.IDVENDA = IDVENDA;
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
