package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
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
}
