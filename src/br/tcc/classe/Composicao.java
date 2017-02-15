package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class Composicao {
    private Integer IDPRODUTO;
    private Integer IDPROD;
    private Double QTDPRODUTO;
    private ResultSet retorno;
    private static int[] vet = new int[100];

    public Integer getIDPRODUTO() {
        return IDPRODUTO;
    }

    public void setIDPRODUTO(Integer IDPRODUTO) {
        this.IDPRODUTO = IDPRODUTO;
    }

    public Integer getIDPROD() {
        return IDPROD;
    }

    public void setIDPROD(Integer IDPROD) {
        this.IDPROD = IDPROD;
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
        Composicao.vet = vet;
    }

    public Double getQTDPRODUTO() {
        return QTDPRODUTO;
    }

    public void setQTDPRODUTO(Double QTDPRODUTO) {
        this.QTDPRODUTO = QTDPRODUTO;
    }
    
    
}
