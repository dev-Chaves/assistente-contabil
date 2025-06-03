package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Detalhe {
    @JacksonXmlProperty(localName = "nItem", isAttribute = true)
    private String nItem;

    @JacksonXmlProperty(localName = "prod")
    private Produto prod;

    @JacksonXmlProperty(localName = "imposto")
    private Imposto imposto;
}
