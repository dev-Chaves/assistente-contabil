package com.devchaves.assistente_contabil.model.nfe;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Total {
    @JacksonXmlProperty(localName = "ICMSTot")
    private ICMSTot icmsTot;

    public Total() {
    }

    public ICMSTot getIcmsTot() {
        return icmsTot;
    }

    public void setIcmsTot(ICMSTot icmsTot) {
        this.icmsTot = icmsTot;
    }
}


class ICMSTot {
    @JacksonXmlProperty(localName = "vBC")
    private String vBC;

    @JacksonXmlProperty(localName = "vICMS")
    private String vICMS;

    @JacksonXmlProperty(localName = "vBCST")
    private String vBCST;

    @JacksonXmlProperty(localName = "vST")
    private String vST;

    @JacksonXmlProperty(localName = "vProd")
    private String vProd;

    @JacksonXmlProperty(localName = "vFrete")
    private String vFrete;

    @JacksonXmlProperty(localName = "vSeg")
    private String vSeg;

    @JacksonXmlProperty(localName = "vDesc")
    private String vDesc;

    @JacksonXmlProperty(localName = "vII")
    private String vII;

    @JacksonXmlProperty(localName = "vIPI")
    private String vIPI;

    @JacksonXmlProperty(localName = "vPIS")
    private String vPIS;

    @JacksonXmlProperty(localName = "vCOFINS")
    private String vCOFINS;

    @JacksonXmlProperty(localName = "vOutro")
    private String vOutro;

    @JacksonXmlProperty(localName = "vNF")
    private String vNF;

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getvICMS() {
        return vICMS;
    }

    public void setvICMS(String vICMS) {
        this.vICMS = vICMS;
    }

    public String getvBCST() {
        return vBCST;
    }

    public void setvBCST(String vBCST) {
        this.vBCST = vBCST;
    }

    public String getvST() {
        return vST;
    }

    public void setvST(String vST) {
        this.vST = vST;
    }

    public String getvProd() {
        return vProd;
    }

    public void setvProd(String vProd) {
        this.vProd = vProd;
    }

    public String getvFrete() {
        return vFrete;
    }

    public void setvFrete(String vFrete) {
        this.vFrete = vFrete;
    }

    public String getvSeg() {
        return vSeg;
    }

    public void setvSeg(String vSeg) {
        this.vSeg = vSeg;
    }

    public String getvDesc() {
        return vDesc;
    }

    public void setvDesc(String vDesc) {
        this.vDesc = vDesc;
    }

    public String getvII() {
        return vII;
    }

    public void setvII(String vII) {
        this.vII = vII;
    }

    public String getvIPI() {
        return vIPI;
    }

    public void setvIPI(String vIPI) {
        this.vIPI = vIPI;
    }

    public String getvPIS() {
        return vPIS;
    }

    public void setvPIS(String vPIS) {
        this.vPIS = vPIS;
    }

    public String getvCOFINS() {
        return vCOFINS;
    }

    public void setvCOFINS(String vCOFINS) {
        this.vCOFINS = vCOFINS;
    }

    public String getvOutro() {
        return vOutro;
    }

    public void setvOutro(String vOutro) {
        this.vOutro = vOutro;
    }

    public String getvNF() {
        return vNF;
    }

    public void setvNF(String vNF) {
        this.vNF = vNF;
    }
}

