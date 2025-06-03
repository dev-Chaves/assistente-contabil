package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Emitente {
    @JacksonXmlProperty(localName = "CNPJ")
    private String cnpj;

    @JacksonXmlProperty(localName = "xNome")
    private String xNome;

    @JacksonXmlProperty(localName = "xFant")
    private String xFant;

    @JacksonXmlProperty(localName = "enderEmit")
    private Endereco enderEmit;

    @JacksonXmlProperty(localName = "IE")
    private String ie;
}
