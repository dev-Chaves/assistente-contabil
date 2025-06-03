package com.devchaves.assistente_contabil.nfe.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Transporte {
    @JacksonXmlProperty(localName = "modFrete")
    private String modFrete;

    @JacksonXmlProperty(localName = "transporta")
    private Transportadora transporta;

    @JacksonXmlProperty(localName = "veicTransp")
    private VeiculoTransporte veicTransp;

    @JacksonXmlProperty(localName = "reboque")
    private Reboque reboque;

    @JacksonXmlProperty(localName = "vol")
    private Volume vol;

    public Transporte() {
    }

    public String getModFrete() {
        return modFrete;
    }

    public void setModFrete(String modFrete) {
        this.modFrete = modFrete;
    }

    public Transportadora getTransporta() {
        return transporta;
    }

    public void setTransporta(Transportadora transporta) {
        this.transporta = transporta;
    }

    public VeiculoTransporte getVeicTransp() {
        return veicTransp;
    }

    public void setVeicTransp(VeiculoTransporte veicTransp) {
        this.veicTransp = veicTransp;
    }

    public Reboque getReboque() {
        return reboque;
    }

    public void setReboque(Reboque reboque) {
        this.reboque = reboque;
    }

    public Volume getVol() {
        return vol;
    }

    public void setVol(Volume vol) {
        this.vol = vol;
    }
}

class Transportadora {
    @JacksonXmlProperty(localName = "CNPJ")
    private String cnpj;

    @JacksonXmlProperty(localName = "xNome")
    private String xNome;

    @JacksonXmlProperty(localName = "IE")
    private String ie;

    @JacksonXmlProperty(localName = "xEnder")
    private String xEnder;

    @JacksonXmlProperty(localName = "xMun")
    private String xMun;

    @JacksonXmlProperty(localName = "UF")
    private String uf;

    public Transportadora() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getxNome() {
        return xNome;
    }

    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getxEnder() {
        return xEnder;
    }

    public void setxEnder(String xEnder) {
        this.xEnder = xEnder;
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

class VeiculoTransporte {
    @JacksonXmlProperty(localName = "placa")
    private String placa;

    @JacksonXmlProperty(localName = "UF")
    private String uf;

    public VeiculoTransporte() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}

class Reboque {
    @JacksonXmlProperty(localName = "placa")
    private String placa;

    @JacksonXmlProperty(localName = "UF")
    private String uf;

    @JacksonXmlProperty(localName = "RNTC")
    private String rntc;

    public Reboque() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRntc() {
        return rntc;
    }

    public void setRntc(String rntc) {
        this.rntc = rntc;
    }
}

class Volume {
    @JacksonXmlProperty(localName = "qVol")
    private String qVol;

    @JacksonXmlProperty(localName = "esp")
    private String esp;

    @JacksonXmlProperty(localName = "marca")
    private String marca;

    @JacksonXmlProperty(localName = "nVol")
    private String nVol;

    @JacksonXmlProperty(localName = "pesoL")
    private String pesoL;

    @JacksonXmlProperty(localName = "pesoB")
    private String pesoB;

    @JacksonXmlProperty(localName = "lacres")
    private Lacres lacres;

    public Volume() {
    }

    public String getqVol() {
        return qVol;
    }

    public void setqVol(String qVol) {
        this.qVol = qVol;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getnVol() {
        return nVol;
    }

    public void setnVol(String nVol) {
        this.nVol = nVol;
    }

    public String getPesoL() {
        return pesoL;
    }

    public void setPesoL(String pesoL) {
        this.pesoL = pesoL;
    }

    public String getPesoB() {
        return pesoB;
    }

    public void setPesoB(String pesoB) {
        this.pesoB = pesoB;
    }

    public Lacres getLacres() {
        return lacres;
    }

    public void setLacres(Lacres lacres) {
        this.lacres = lacres;
    }
}

class Lacres {
    @JacksonXmlProperty(localName = "nLacre")
    private String nLacre;

    public Lacres() {
    }

    public String getnLacre() {
        return nLacre;
    }

    public void setnLacre(String nLacre) {
        this.nLacre = nLacre;
    }
}
