package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(namespace = "http://www.portalfiscal.inf.br/nfe")
public class NFe {
    @JacksonXmlProperty(localName = "infNFe")
    private InfNFe infNFe;

    @JacksonXmlProperty(localName = "Signature")
    private Signature signature;
}
