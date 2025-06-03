package com.devchaves.assistente_contabil;

import com.devchaves.assistente_contabil.nfe.model.NFe;
import com.devchaves.assistente_contabil.services.NFeProcessorService;
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
        nFeProcessorService = new NFeProcessorService(new XmlMapper(), new ObjectMapper());
    }

    @Test
    void deveLerXml() throws IOException {

        Path path = Path.of("C:\\Users\\ORC\\IdeaProjects\\assistente-contabil\\src\\main\\resources\\nfe\\nfe_exemplo_v4.xml");

        String xml = Files.readString(path);

        NFe nFe = nFeProcessorService.readXml(xml, NFe.class);

        assertNotNull(nFe);
        assertNotNull(nFeProcessorService.getInfNFe());

    }


}
