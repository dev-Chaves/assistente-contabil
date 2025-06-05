package com.devchaves.assistente_contabil.model.nfe;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Destinatario {
    @JacksonXmlProperty(localName = "CNPJ")
    private String cnpj;

    @JacksonXmlProperty(localName = "xNome")
    private String xNome;

    @JacksonXmlProperty(localName = "enderDest")
    private Endereco enderDest;

    @JacksonXmlProperty(localName = "IE")
    private String ie;

    public Destinatario() {
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

    public Endereco getEnderDest() {
        return enderDest;
    }

    public void setEnderDest(Endereco enderDest) {
        this.enderDest = enderDest;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
}
