package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class InformacoesResponsavelTecnico {

    @JacksonXmlProperty(localName = "CNPJ")
    private String cnpj;

    @JacksonXmlProperty(localName = "xContato")
    private String contato;

    @JacksonXmlProperty(localName = "email")
    private String email;

    @JacksonXmlProperty(localName = "fone")
    private String telefone;

    @JacksonXmlProperty(localName = "idCSRT")
    private String idCSRT;

    @JacksonXmlProperty(localName = "hashCSRT")
    private String hashCSRT;
}
