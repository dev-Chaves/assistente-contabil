package com.devchaves.assistente_contabil.model.nfe;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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


    public InformacoesResponsavelTecnico() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIdCSRT() {
        return idCSRT;
    }

    public void setIdCSRT(String idCSRT) {
        this.idCSRT = idCSRT;
    }

    public String getHashCSRT() {
        return hashCSRT;
    }

    public void setHashCSRT(String hashCSRT) {
        this.hashCSRT = hashCSRT;
    }
}

