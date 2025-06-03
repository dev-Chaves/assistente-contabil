package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Identificacao {
    @JacksonXmlProperty(localName = "cUF")
    private String cUF;

    @JacksonXmlProperty(localName = "cNF")
    private String cNF;

    @JacksonXmlProperty(localName = "natOp")
    private String natOp;

    @JacksonXmlProperty(localName = "indPag")
    private String indPag;

    @JacksonXmlProperty(localName = "mod")
    private String mod;

    @JacksonXmlProperty(localName = "serie")
    private String serie;

    @JacksonXmlProperty(localName = "nNF")
    private String nNF;

    @JacksonXmlProperty(localName = "dEmi")
    private String dEmi;

    @JacksonXmlProperty(localName = "dhEmi")
    private String dhEmi;

    @JacksonXmlProperty(localName = "dSaiEnt")
    private String dSaiEnt;

    @JacksonXmlProperty(localName = "tpNF")
    private String tpNF;

    @JacksonXmlProperty(localName = "cMunFG")
    private String cMunFG;

    @JacksonXmlProperty(localName = "tpImp")
    private String tpImp;

    @JacksonXmlProperty(localName = "tpEmis")
    private String tpEmis;

    @JacksonXmlProperty(localName = "cDV")
    private String cDV;

    @JacksonXmlProperty(localName = "tpAmb")
    private String tpAmb;

    @JacksonXmlProperty(localName = "finNFe")
    private String finNFe;

    @JacksonXmlProperty(localName = "procEmi")
    private String procEmi;

    @JacksonXmlProperty(localName = "verProc")
    private String verProc;

    @JacksonXmlProperty(localName = "idDest")
    private String idDest;

    @JacksonXmlProperty(localName = "indFinal")
    private String indFinal;

    @JacksonXmlProperty(localName = "indPres")
    private String indPres;

    public Identificacao() {
    }

    public String getcUF() {
        return cUF;
    }

    public void setcUF(String cUF) {
        this.cUF = cUF;
    }

    public String getcNF() {
        return cNF;
    }

    public void setcNF(String cNF) {
        this.cNF = cNF;
    }

    public String getNatOp() {
        return natOp;
    }

    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    public String getIndPag() {
        return indPag;
    }

    public void setIndPag(String indPag) {
        this.indPag = indPag;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getnNF() {
        return nNF;
    }

    public void setnNF(String nNF) {
        this.nNF = nNF;
    }

    public String getdEmi() {
        return dEmi;
    }

    public void setdEmi(String dEmi) {
        this.dEmi = dEmi;
    }

    public String getdSaiEnt() {
        return dSaiEnt;
    }

    public void setdSaiEnt(String dSaiEnt) {
        this.dSaiEnt = dSaiEnt;
    }

    public String getTpNF() {
        return tpNF;
    }

    public void setTpNF(String tpNF) {
        this.tpNF = tpNF;
    }

    public String getcMunFG() {
        return cMunFG;
    }

    public void setcMunFG(String cMunFG) {
        this.cMunFG = cMunFG;
    }

    public String getTpImp() {
        return tpImp;
    }

    public void setTpImp(String tpImp) {
        this.tpImp = tpImp;
    }

    public String getTpEmis() {
        return tpEmis;
    }

    public void setTpEmis(String tpEmis) {
        this.tpEmis = tpEmis;
    }

    public String getcDV() {
        return cDV;
    }

    public void setcDV(String cDV) {
        this.cDV = cDV;
    }

    public String getTpAmb() {
        return tpAmb;
    }

    public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
    }

    public String getFinNFe() {
        return finNFe;
    }

    public void setFinNFe(String finNFe) {
        this.finNFe = finNFe;
    }

    public String getProcEmi() {
        return procEmi;
    }

    public void setProcEmi(String procEmi) {
        this.procEmi = procEmi;
    }

    public String getVerProc() {
        return verProc;
    }

    public void setVerProc(String verProc) {
        this.verProc = verProc;
    }

    public String getIdDest() {
        return idDest;
    }

    public void setIdDest(String idDest) {
        this.idDest = idDest;
    }

    public String getIndFinal() {
        return indFinal;
    }

    public void setIndFinal(String indFinal) {
        this.indFinal = indFinal;
    }

    public String getIndPres() {
        return indPres;
    }

    public void setIndPres(String indPres) {
        this.indPres = indPres;
    }
}
