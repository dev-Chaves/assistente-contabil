package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
public class Signature {
    @JacksonXmlProperty(localName = "SignedInfo")
    private SignedInfo signedInfo;

    @JacksonXmlProperty(localName = "SignatureValue")
    private String signatureValue;

    @JacksonXmlProperty(localName = "KeyInfo")
    private KeyInfo keyInfo;

    public Signature() {
    }

    public SignedInfo getSignedInfo() {
        return signedInfo;
    }

    public void setSignedInfo(SignedInfo signedInfo) {
        this.signedInfo = signedInfo;
    }

    public String getSignatureValue() {
        return signatureValue;
    }

    public void setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
    }

    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(KeyInfo keyInfo) {
        this.keyInfo = keyInfo;
    }
}

class SignedInfo {
    @JacksonXmlProperty(localName = "CanonicalizationMethod")
    private Method canonicalizationMethod;

    @JacksonXmlProperty(localName = "SignatureMethod")
    private Method signatureMethod;

    @JacksonXmlProperty(localName = "Reference")
    private Reference reference;

    public SignedInfo() {
    }

    public Method getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    public void setCanonicalizationMethod(Method canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    public Method getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(Method signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}

class Method {
    @JacksonXmlProperty(localName = "Algorithm", isAttribute = true)
    private String algorithm;

    public Method() {
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}

class Reference {
    @JacksonXmlProperty(localName = "URI", isAttribute = true)
    private String uri;

    @JacksonXmlProperty(localName = "Transforms")
    private Transforms transforms;

    @JacksonXmlProperty(localName = "DigestMethod")
    private Method digestMethod;

    @JacksonXmlProperty(localName = "DigestValue")
    private String digestValue;

    public Reference() {
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Transforms getTransforms() {
        return transforms;
    }

    public void setTransforms(Transforms transforms) {
        this.transforms = transforms;
    }

    public Method getDigestMethod() {
        return digestMethod;
    }

    public void setDigestMethod(Method digestMethod) {
        this.digestMethod = digestMethod;
    }

    public String getDigestValue() {
        return digestValue;
    }

    public void setDigestValue(String digestValue) {
        this.digestValue = digestValue;
    }
}

