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

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NFeProcessorServiceTest {

    private NFeProcessorService nFeProcessorService;

    @BeforeEach
    void setUp(){
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        nFeProcessorService = new NFeProcessorService(xmlMapper, new ObjectMapper());
    }

    @Test
    void deveLerXml() throws IOException {

        Path path = Path.of("C:\\Users\\ORC\\IdeaProjects\\assistente-contabil\\src\\main\\resources\\nfe\\nfe_exemplo_v4.xml");

        String xml = Files.readString(path);

        System.out.println("XML: " + xml);

        NFe nFe = nFeProcessorService.readXml(xml, NFe.class);

        assertNotNull(nFe);
        assertNotNull(nFe.getInfNFe());

    }


}
