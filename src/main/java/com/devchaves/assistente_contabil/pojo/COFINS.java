package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class COFINS {
    @JacksonXmlProperty(localName = "COFINSAliq")
    private COFINSAliq cofinsAliq;
}

@Data
class
COFINSAliq {
    @JacksonXmlProperty(localName = "CST")
    private String cst;

    @JacksonXmlProperty(localName = "vBC")
    private String vBC;

    @JacksonXmlProperty(localName = "pCOFINS")
    private String pCOFINS;

    @JacksonXmlProperty(localName = "vCOFINS")
    private String vCOFINS;
}

