package com.devchaves.assistente_contabil.model.nfe;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Endereco {
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

    @JacksonXmlProperty(localName = "CEP")
    private String cep;

    @JacksonXmlProperty(localName = "cPais")
    private String cPais;

    @JacksonXmlProperty(localName = "xPais")
    private String xPais;

    @JacksonXmlProperty(localName = "fone")
    private String fone;

    public Endereco() {
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getcPais() {
        return cPais;
    }

    public void setcPais(String cPais) {
        this.cPais = cPais;
    }

    public String getxPais() {
        return xPais;
    }

    public void setxPais(String xPais) {
        this.xPais = xPais;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
