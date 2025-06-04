package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JacksonXmlRootElement(namespace = "http://www.portalfiscal.inf.br/nfe")
@Document(collection = "nfe")
public class NFe {

    @Id
    private String id;

    @JacksonXmlProperty(localName = "infNFe")
    private InfNFe infNFe;

    @JacksonXmlProperty(localName = "Signature")
    private Signature signature;

    public NFe() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InfNFe getInfNFe() {
        return infNFe;
    }

    public void setInfNFe(InfNFe infNFe) {
        this.infNFe = infNFe;
        if (infNFe != null && infNFe.getId() != null) {
            this.id = infNFe.getId();
        } else {
            this.id = null;
        }
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "NFe{" +
                "infNFe=" + infNFe +
                ", signature=" + signature +
                '}';
    }
}
