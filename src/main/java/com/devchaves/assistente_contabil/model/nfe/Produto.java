package com.devchaves.assistente_contabil.model.nfe;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Produto {
    @JacksonXmlProperty(localName = "cProd")
    private String cProd;

    @JacksonXmlProperty(localName = "cEAN")
    private String cEAN;

    @JacksonXmlProperty(localName = "xProd")
    private String xProd;

    @JacksonXmlProperty(localName = "CFOP")
    private String cfop;

    @JacksonXmlProperty(localName = "uCom")
    private String uCom;

    @JacksonXmlProperty(localName = "qCom")
    private String qCom;

    @JacksonXmlProperty(localName = "vUnCom")
    private String vUnCom;

    @JacksonXmlProperty(localName = "vProd")
    private String vProd;

    @JacksonXmlProperty(localName = "cEANTrib")
    private String cEANTrib;

    @JacksonXmlProperty(localName = "uTrib")
    private String uTrib;

    @JacksonXmlProperty(localName = "qTrib")
    private String qTrib;

    @JacksonXmlProperty(localName = "vUnTrib")
    private String vUnTrib;

    public Produto() {
    }

    public String getcProd() {
        return cProd;
    }

    public void setcProd(String cProd) {
        this.cProd = cProd;
    }

    public String getcEAN() {
        return cEAN;
    }

    public void setcEAN(String cEAN) {
        this.cEAN = cEAN;
    }

    public String getxProd() {
        return xProd;
    }

    public void setxProd(String xProd) {
        this.xProd = xProd;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getuCom() {
        return uCom;
    }

    public void setuCom(String uCom) {
        this.uCom = uCom;
    }

    public String getqCom() {
        return qCom;
    }

    public void setqCom(String qCom) {
        this.qCom = qCom;
    }

    public String getvUnCom() {
        return vUnCom;
    }

    public void setvUnCom(String vUnCom) {
        this.vUnCom = vUnCom;
    }

    public String getvProd() {
        return vProd;
    }

    public void setvProd(String vProd) {
        this.vProd = vProd;
    }

    public String getcEANTrib() {
        return cEANTrib;
    }

    public void setcEANTrib(String cEANTrib) {
        this.cEANTrib = cEANTrib;
    }

    public String getuTrib() {
        return uTrib;
    }

    public void setuTrib(String uTrib) {
        this.uTrib = uTrib;
    }

    public String getqTrib() {
        return qTrib;
    }

    public void setqTrib(String qTrib) {
        this.qTrib = qTrib;
    }

    public String getvUnTrib() {
        return vUnTrib;
    }

    public void setvUnTrib(String vUnTrib) {
        this.vUnTrib = vUnTrib;
    }
}
