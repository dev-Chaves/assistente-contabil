package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
public class InfNFe {
    @JacksonXmlProperty(localName = "Id", isAttribute = true)
    private String id;

    @JacksonXmlProperty(localName = "versao", isAttribute = true)
    private String versao;

    @JacksonXmlProperty(localName = "ide")
    private Identificacao ide;

    @JacksonXmlProperty(localName = "emit")
    private Emitente emit;

    @JacksonXmlProperty(localName = "dest")
    private Destinatario dest;

    @JacksonXmlProperty(localName = "retirada")
    private LocalRetirada retirada;

    @JacksonXmlProperty(localName = "entrega")
    private LocalEntrega entrega;

    @JacksonXmlProperty(localName = "det")
    private List<Detalhe> det;

    @JacksonXmlProperty(localName = "total")
    private Total total;

    @JacksonXmlProperty(localName = "transp")
    private Transporte transp;

    @JacksonXmlProperty(localName = "infAdic")
    private InformacoesAdicionais infAdic;
}
