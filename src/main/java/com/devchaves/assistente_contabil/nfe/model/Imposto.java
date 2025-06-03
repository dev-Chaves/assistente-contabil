package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Imposto {
    @JacksonXmlProperty(localName = "ICMS")
    private ICMS icms;

    @JacksonXmlProperty(localName = "PIS")
    private PIS pis;

    @JacksonXmlProperty(localName = "COFINS")
    private COFINS cofins;
}
