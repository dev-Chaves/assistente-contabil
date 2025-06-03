package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

public class PIS {
    @JacksonXmlProperty(localName = "PISAliq")
    private PISAliq pisAliq;

    public PIS() {
    }

    public PISAliq getPisAliq() {
        return pisAliq;
    }

    public void setPisAliq(PISAliq pisAliq) {
        this.pisAliq = pisAliq;
    }
}

class PISAliq {
    @JacksonXmlProperty(localName = "CST")
    private String cst;

    @JacksonXmlProperty(localName = "vBC")
    private String vBC;

    @JacksonXmlProperty(localName = "pPIS")
    private String pPIS;

    @JacksonXmlProperty(localName = "vPIS")
    private String vPIS;

    public PISAliq() {
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getpPIS() {
        return pPIS;
    }

    public void setpPIS(String pPIS) {
        this.pPIS = pPIS;
    }

    public String getvPIS() {
        return vPIS;
    }

    public void setvPIS(String vPIS) {
        this.vPIS = vPIS;
    }
}

