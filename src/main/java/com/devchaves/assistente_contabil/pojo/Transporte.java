package com.devchaves.assistente_contabil.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import java.util.List;

@Data
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
}

@Data
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
}

@Data
class VeiculoTransporte {
    @JacksonXmlProperty(localName = "placa")
    private String placa;

    @JacksonXmlProperty(localName = "UF")
    private String uf;

    @JacksonXmlProperty(localName = "RNTC")
    private String rntc;
}

@Data
class Reboque {
    @JacksonXmlProperty(localName = "placa")
    private String placa;

    @JacksonXmlProperty(localName = "UF")
    private String uf;

    @JacksonXmlProperty(localName = "RNTC")
    private String rntc;
}

@Data
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
}

@Data
class Lacres {
    @JacksonXmlProperty(localName = "nLacre")
    private String nLacre;
}
