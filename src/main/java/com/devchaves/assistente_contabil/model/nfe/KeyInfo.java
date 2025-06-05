package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class KeyInfo {
    @JacksonXmlProperty(localName = "X509Data")
    private X509Data x509Data;

    public KeyInfo() {
    }

    public X509Data getX509Data() {
        return x509Data;
    }

    public void setX509Data(X509Data x509Data) {
        this.x509Data = x509Data;
    }
}
