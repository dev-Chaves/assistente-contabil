package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Emitente {
    @JacksonXmlProperty(localName = "CNPJ")
    private String cnpj;

    @JacksonXmlProperty(localName = "xNome")
    private String xNome;

    @JacksonXmlProperty(localName = "xFant")
    private String xFant;

    @JacksonXmlProperty(localName = "enderEmit")
    private Endereco enderEmit;

    @JacksonXmlProperty(localName = "IE")
    private String ie;

    public Emitente() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getxNome() {
        return xNome;
    }

    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public String getxFant() {
        return xFant;
    }

    public void setxFant(String xFant) {
        this.xFant = xFant;
    }

    public Endereco getEnderEmit() {
        return enderEmit;
    }

    public void setEnderEmit(Endereco enderEmit) {
        this.enderEmit = enderEmit;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
}
