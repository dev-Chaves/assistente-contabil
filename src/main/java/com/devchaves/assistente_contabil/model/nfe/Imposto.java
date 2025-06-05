package com.devchaves.assistente_contabil.model.nfe;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Imposto {
    @JacksonXmlProperty(localName = "ICMS")
    private ICMS icms;

    @JacksonXmlProperty(localName = "PIS")
    private PIS pis;

    @JacksonXmlProperty(localName = "COFINS")
    private COFINS cofins;

    public Imposto() {
    }

    public ICMS getIcms() {
        return icms;
    }

    public void setIcms(ICMS icms) {
        this.icms = icms;
    }

    public PIS getPis() {
        return pis;
    }

    public void setPis(PIS pis) {
        this.pis = pis;
    }

    public COFINS getCofins() {
        return cofins;
    }

    public void setCofins(COFINS cofins) {
        this.cofins = cofins;
    }
}
