package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
public class Signature {
    @JacksonXmlProperty(localName = "SignedInfo")
    private SignedInfo signedInfo;

    @JacksonXmlProperty(localName = "SignatureValue")
    private String signatureValue;

    @JacksonXmlProperty(localName = "KeyInfo")
    private KeyInfo keyInfo;
}

@Data
class SignedInfo {
    @JacksonXmlProperty(localName = "CanonicalizationMethod")
    private Method canonicalizationMethod;

    @JacksonXmlProperty(localName = "SignatureMethod")
    private Method signatureMethod;

    @JacksonXmlProperty(localName = "Reference")
    private Reference reference;
}

@Data
class Method {
    @JacksonXmlProperty(localName = "Algorithm", isAttribute = true)
    private String algorithm;
}

@Data
class Reference {
    @JacksonXmlProperty(localName = "URI", isAttribute = true)
    private String uri;

    @JacksonXmlProperty(localName = "Transforms")
    private Transforms transforms;

    @JacksonXmlProperty(localName = "DigestMethod")
    private Method digestMethod;

    @JacksonXmlProperty(localName = "DigestValue")
    private String digestValue;
}

@Data
class Transforms {
    @JacksonXmlProperty(localName = "Transform")
    private Method[] transform;
}

@Data
class KeyInfo {
    @JacksonXmlProperty(localName = "X509Data")
    private X509Data x509Data;
}

@Data
class X509Data {
    @JacksonXmlProperty(localName = "X509Certificate")
    private String x509Certificate;
}
