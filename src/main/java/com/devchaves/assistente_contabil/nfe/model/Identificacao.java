package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
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
}
