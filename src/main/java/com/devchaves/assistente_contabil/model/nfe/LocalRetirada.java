package com.devchaves.assistente_contabil.model.nfe;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class LocalRetirada {
    @JacksonXmlProperty(localName = "CNPJ")
    private String cnpj;

    @JacksonXmlProperty(localName = "xLgr")
    private String xLgr;

    @JacksonXmlProperty(localName = "nro")
    private String nro;

    @JacksonXmlProperty(localName = "xCpl")
    private String xCpl;

    @JacksonXmlProperty(localName = "xBairro")
    private String xBairro;

    @JacksonXmlProperty(localName = "cMun")
    private String cMun;

    @JacksonXmlProperty(localName = "xMun")
    private String xMun;

    @JacksonXmlProperty(localName = "UF")
    private String uf;

    public LocalRetirada() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getxLgr() {
        return xLgr;
    }

    public void setxLgr(String xLgr) {
        this.xLgr = xLgr;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getxCpl() {
        return xCpl;
    }

    public void setxCpl(String xCpl) {
        this.xCpl = xCpl;
    }

    public String getxBairro() {
        return xBairro;
    }

    public void setxBairro(String xBairro) {
        this.xBairro = xBairro;
    }

    public String getcMun() {
        return cMun;
    }

    public void setcMun(String cMun) {
        this.cMun = cMun;
    }

    public String getxMun() {
        return xMun;
    }

    public void setxMun(String xMun) {
        this.xMun = xMun;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
