package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Total {
    @JacksonXmlProperty(localName = "ICMSTot")
    private ICMSTot icmsTot;
}

@Data
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
}
