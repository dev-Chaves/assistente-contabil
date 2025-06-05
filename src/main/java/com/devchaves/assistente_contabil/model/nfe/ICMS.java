package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ICMS {
    @JacksonXmlProperty(localName = "ICMS00")
    private ICMS00 icms00;

    public ICMS() {
    }

    public ICMS00 getIcms00() {
        return icms00;
    }

    public void setIcms00(ICMS00 icms00) {
        this.icms00 = icms00;
    }
}

class ICMS00 {
    @JacksonXmlProperty(localName = "orig")
    private String orig;

    @JacksonXmlProperty(localName = "CST")
    private String cst;

    @JacksonXmlProperty(localName = "modBC")
    private String modBC;

    @JacksonXmlProperty(localName = "vBC")
    private String vBC;

    @JacksonXmlProperty(localName = "pICMS")
    private String pICMS;

    @JacksonXmlProperty(localName = "vICMS")
    private String vICMS;

    public ICMS00() {
    }

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getModBC() {
        return modBC;
    }

    public void setModBC(String modBC) {
        this.modBC = modBC;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getpICMS() {
        return pICMS;
    }

    public void setpICMS(String pICMS) {
        this.pICMS = pICMS;
    }

    public String getvICMS() {
        return vICMS;
    }

    public void setvICMS(String vICMS) {
        this.vICMS = vICMS;
    }
}
