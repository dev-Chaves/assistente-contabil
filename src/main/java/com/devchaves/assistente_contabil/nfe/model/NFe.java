package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(namespace = "http://www.portalfiscal.inf.br/nfe")
public class NFe {
    @JacksonXmlProperty(localName = "infNFe")
    private InfNFe infNFe;

    @JacksonXmlProperty(localName = "Signature")
    private Signature signature;

    public NFe() {
    }

    public InfNFe getInfNFe() {
        return infNFe;
    }

    public void setInfNFe(InfNFe infNFe) {
        this.infNFe = infNFe;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }
}
