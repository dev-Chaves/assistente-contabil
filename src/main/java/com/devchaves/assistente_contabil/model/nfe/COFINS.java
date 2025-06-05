package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class COFINS {
    @JacksonXmlProperty(localName = "COFINSAliq")
    private COFINSAliq cofinsAliq;

    public COFINS() {
    }

    public COFINSAliq getCofinsAliq() {
        return cofinsAliq;
    }

    public void setCofinsAliq(COFINSAliq cofinsAliq) {
        this.cofinsAliq = cofinsAliq;
    }
}

class COFINSAliq {
    @JacksonXmlProperty(localName = "CST")
    private String cst;

    @JacksonXmlProperty(localName = "vBC")
    private String vBC;

    @JacksonXmlProperty(localName = "pCOFINS")
    private String pCOFINS;

    @JacksonXmlProperty(localName = "vCOFINS")
    private String vCOFINS;

    public COFINSAliq() {
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

    public String getpCOFINS() {
        return pCOFINS;
    }

    public void setpCOFINS(String pCOFINS) {
        this.pCOFINS = pCOFINS;
    }

    public String getvCOFINS() {
        return vCOFINS;
    }

    public void setvCOFINS(String vCOFINS) {
        this.vCOFINS = vCOFINS;
    }
}
