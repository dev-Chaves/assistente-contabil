package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class InformacoesAdicionais {
    @JacksonXmlProperty(localName = "infAdFisco")
    private String infAdFisco;

    public InformacoesAdicionais() {
    }

    public String getInfAdFisco() {
        return infAdFisco;
    }

    public void setInfAdFisco(String infAdFisco) {
        this.infAdFisco = infAdFisco;
    }
}


