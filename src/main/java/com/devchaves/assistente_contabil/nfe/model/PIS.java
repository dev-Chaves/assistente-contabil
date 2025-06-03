package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class PIS {
    @JacksonXmlProperty(localName = "PISAliq")
    private PISAliq pisAliq;
}

@Data
class PISAliq {
    @JacksonXmlProperty(localName = "CST")
    private String cst;

    @JacksonXmlProperty(localName = "vBC")
    private String vBC;

    @JacksonXmlProperty(localName = "pPIS")
    private String pPIS;

    @JacksonXmlProperty(localName = "vPIS")
    private String vPIS;
}
