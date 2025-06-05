package com.devchaves.assistente_contabil.model.nfe;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Transforms {
    @JacksonXmlProperty(localName = "Transform")
    private Method transform;

    public Transforms() {
    }

    public Method getTransform() {
        return transform;
    }

    public void setTransform(Method transform) {
        this.transform = transform;
    }
}
