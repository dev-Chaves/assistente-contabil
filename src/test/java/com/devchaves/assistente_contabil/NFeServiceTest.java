package com.devchaves.assistente_contabil;


import com.devchaves.assistente_contabil.model.nfe.NFe;
import com.devchaves.assistente_contabil.repository.NFeRepository;
import com.devchaves.assistente_contabil.services.NFeProcessorService;
import com.devchaves.assistente_contabil.services.NFeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class NFeServiceTest {

    private NFeService nfeService;
    private NFeProcessorService nFeProcessorService;
    private NFeRepository nfeRepository;

    @BeforeEach
    void setUp() {
        nFeProcessorService = mock(NFeProcessorService.class);
        nfeRepository = mock(NFeRepository.class);
        nfeService = new NFeService(nFeProcessorService, nfeRepository);
    }

    @Test
    void deveSalvarNFe() throws IOException {

        Path path = Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "nfe", "nfe_exemplo_v4.xml");

        String xml = Files.readString(path);

        System.out.println("XML: " + xml);

        NFe nfeMock = new NFe();
        when(nFeProcessorService.deserialiseXml(anyString(), eq(NFe.class))).thenReturn(nfeMock);

        NFe result = nfeService.salvarNFe(xml);

        System.out.println(result);

        assertNotNull(result);
        verify(nFeProcessorService).deserialiseXml(anyString(), eq(NFe.class));
        verify(nfeRepository).save(ArgumentMatchers.any(NFe.class));
    }

}
