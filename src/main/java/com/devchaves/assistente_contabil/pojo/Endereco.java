package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Endereco {
    @JacksonXmlProperty(localName = "xLgr")
    private String xLgr;

    @JacksonXmlProperty(localName = "nro")
    private String nro;

    @JacksonXmlProperty(localName = "xCpl")
    private String xCpl;

    @JacksonXmlProperty(localName = "xBairro")
    private String xBairro;

    @JacksonXmlProperty(localName = "cMun")
    private String cMun;

    @JacksonXmlProperty(localName = "xMun")
    private String xMun;

    @JacksonXmlProperty(localName = "UF")
    private String uf;

    @JacksonXmlProperty(localName = "CEP")
    private String cep;

    @JacksonXmlProperty(localName = "cPais")
    private String cPais;

    @JacksonXmlProperty(localName = "xPais")
    private String xPais;

    @JacksonXmlProperty(localName = "fone")
    private String fone;
}
