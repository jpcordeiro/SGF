package br.tcc.classe;

import java.sql.ResultSet;

/**
 *
 * @author JOÃO PAULO
 */
public class MovtoProduto {
    
    private Integer IDMOVTOPRODUTO;
    private Integer IDCOMPRA;
    private Integer IDITENCOMPRA;
    private String DTATUALIZA;
    private String INENTRADA;
    private Integer QTDPRODUTO;
    
    private ResultSet retorno;

    public Integer getIDMOVTOPRODUTO() {
        return IDMOVTOPRODUTO;
    }

    public void setIDMOVTOPRODUTO(Integer IDMOVTOPRODUTO) {
        this.IDMOVTOPRODUTO = IDMOVTOPRODUTO;
    }

    public Integer getIDCOMPRA() {
        return IDCOMPRA;
    }

    public void setIDCOMPRA(Integer IDCOMPRA) {
        this.IDCOMPRA = IDCOMPRA;
    }

    public Integer getIDITENCOMPRA() {
        return IDITENCOMPRA;
    }

    public void setIDITENCOMPRA(Integer IDITENCOMPRA) {
        this.IDITENCOMPRA = IDITENCOMPRA;
    }

    public String getDTATUALIZA() {
        return DTATUALIZA;
    }

    public void setDTATUALIZA(String DTATUALIZA) {
        this.DTATUALIZA = DTATUALIZA;
    }

    public String getINENTRADA() {
        return INENTRADA;
    }

    public void setINENTRADA(String INENTRADA) {
        this.INENTRADA = INENTRADA;
    }

    public Integer getQTDPRODUTO() {
        return QTDPRODUTO;
    }

    public void setQTDPRODUTO(Integer QTDPRODUTO) {
        this.QTDPRODUTO = QTDPRODUTO;
    }

    public ResultSet getRetorno() {
        return retorno;
    }

    public void setRetorno(ResultSet retorno) {
        this.retorno = retorno;
    }
    
    
    
}
