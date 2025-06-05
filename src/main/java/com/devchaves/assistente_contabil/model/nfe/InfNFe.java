package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.List;

public class InfNFe {
    @JacksonXmlProperty(localName = "Id", isAttribute = true)
    private String id;

    @JacksonXmlProperty(localName = "versao", isAttribute = true)
    private String versao;

    @JacksonXmlProperty(localName = "ide")
    private Identificacao ide;

    @JacksonXmlProperty(localName = "emit")
    private Emitente emit;

    @JacksonXmlProperty(localName = "dest")
    private Destinatario dest;

    @JacksonXmlProperty(localName = "retirada")
    private LocalRetirada retirada;

    @JacksonXmlProperty(localName = "entrega")
    private LocalEntrega entrega;

    @JacksonXmlProperty(localName = "det")
    private List<Detalhe> det;

    @JacksonXmlProperty(localName = "total")
    private Total total;

    @JacksonXmlProperty(localName = "transp")
    private Transporte transp;

    @JacksonXmlProperty(localName = "infAdic")
    private InformacoesAdicionais infAdic;

    @JacksonXmlProperty(localName = "infRespTec")
    private InformacoesResponsavelTecnico infRespTec;

    public InfNFe() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Identificacao getIde() {
        return ide;
    }

    public void setIde(Identificacao ide) {
        this.ide = ide;
    }

    public Emitente getEmit() {
        return emit;
    }

    public void setEmit(Emitente emit) {
        this.emit = emit;
    }

    public Destinatario getDest() {
        return dest;
    }

    public void setDest(Destinatario dest) {
        this.dest = dest;
    }

    public LocalRetirada getRetirada() {
        return retirada;
    }

    public void setRetirada(LocalRetirada retirada) {
        this.retirada = retirada;
    }

    public LocalEntrega getEntrega() {
        return entrega;
    }

    public void setEntrega(LocalEntrega entrega) {
        this.entrega = entrega;
    }

    public List<Detalhe> getDet() {
        return det;
    }

    public void setDet(List<Detalhe> det) {
        this.det = det;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public Transporte getTransp() {
        return transp;
    }

    public void setTransp(Transporte transp) {
        this.transp = transp;
    }

    public InformacoesAdicionais getInfAdic() {
        return infAdic;
    }

    public void setInfAdic(InformacoesAdicionais infAdic) {
        this.infAdic = infAdic;
    }

    public InformacoesResponsavelTecnico getInfRespTec() {
        return infRespTec;
    }

    public void setInfRespTec(InformacoesResponsavelTecnico infRespTec) {
        this.infRespTec = infRespTec;
    }
}
