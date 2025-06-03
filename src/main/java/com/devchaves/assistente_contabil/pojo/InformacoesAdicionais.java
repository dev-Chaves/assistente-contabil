package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class InformacoesAdicionais {
    @JacksonXmlProperty(localName = "infAdFisco")
    private String infAdFisco;
}
