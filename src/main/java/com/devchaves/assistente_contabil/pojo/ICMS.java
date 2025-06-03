package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ICMS {
    @JacksonXmlProperty(localName = "ICMS00")
    private ICMS00 icms00;
}

@Data
class ICMS00 {
    @JacksonXmlProperty(localName = "orig")
    private String orig;

    @JacksonXmlProperty(localName = "CST")
    private String cst;

    @JacksonXmlProperty(localName = "modBC")
    private String modBC;

    @JacksonXmlProperty(localName = "vBC")
    private String vBC;

    @JacksonXmlProperty(localName = "pICMS")
    private String pICMS;

    @JacksonXmlProperty(localName = "vICMS")
    private String vICMS;
}
