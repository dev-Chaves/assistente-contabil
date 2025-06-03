package com.devchaves.assistente_contabil;

import com.devchaves.assistente_contabil.nfe.model.NFe;
import com.devchaves.assistente_contabil.services.NFeProcessorService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NFeProcessorServiceTest {

    private NFeProcessorService nFeProcessorService;

    @BeforeEach
    void setUp(){
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        nFeProcessorService = new NFeProcessorService(xmlMapper, new ObjectMapper(), null);
    }

    @Test
    void deveLerXml() throws IOException {

        Path path = Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "nfe", "nfe_exemplo_v4.xml");

        if (!Files.exists(path)) {
            throw new IOException("Arquivo XML não encontrado: " + path.toString());
        }
        String xml = Files.readString(path);

        System.out.println("XML: " + xml);

        NFe nFe = nFeProcessorService.deserialiseXml(xml, NFe.class);

        System.out.println("XML Object: " + nFe);

        assertNotNull(nFe);
        assertNotNull(nFe.getInfNFe());
    }

    @Test
    void deveProcessarNFeXml() {
        Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "nfe", "nfe_exemplo_v4.xml");

        var filePath = Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "nfe", "nfe_exemplo_v4.xml").toString();

        nFeProcessorService.processarNfeXmlFile(filePath);
    }

    @Test
    void deveConverterObjetoParaJson() throws IOException {
        Path path = Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "nfe", "nfe_exemplo_v4.xml");
        String xml = Files.readString(path);
        NFe nFe = nFeProcessorService.deserialiseXml(xml, NFe.class);
        String json = nFeProcessorService.processarObjetoParaJson(nFe);
        System.out.println("JSON: " + json);
    }


}
