package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Detalhe {
    @JacksonXmlProperty(localName = "nItem", isAttribute = true)
    private String nItem;

    @JacksonXmlProperty(localName = "prod")
    private Produto prod;

    @JacksonXmlProperty(localName = "imposto")
    private Imposto imposto;

    public Detalhe() {
    }

    public String getnItem() {
        return nItem;
    }

    public void setnItem(String nItem) {
        this.nItem = nItem;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }
}
