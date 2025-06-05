package com.devchaves.assistente_contabil.util;

import com.devchaves.assistente_contabil.repository.NFeRepository;
import com.devchaves.assistente_contabil.services.NFeProcessorService;
import com.devchaves.assistente_contabil.services.NFeService;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.InputStream;

@Component
public class DataInitializer implements CommandLineRunner {

    private final NFeService nfeService;
    private final NFeProcessorService nFeProcessorService;
    private final NFeRepository nfeRepository;
    private final Client client;

    public DataInitializer(NFeService nfeService, NFeProcessorService nFeProcessorService, NFeRepository nfeRepository, Client client) {
        this.nfeService = nfeService;
        this.nFeProcessorService = nFeProcessorService;
        this.nfeRepository = nfeRepository;
        this.client = client;
    }

    @Override
    public void run(String... args) throws Exception {
        try{
            if (nfeRepository.count() == 0) {
                System.out.println("Inicializando dados...");
                try (InputStream is = new ClassPathResource("nfe/nfe_exemplo_v4.xml").getInputStream()) {
                    String xml = new String(is.readAllBytes(), java.nio.charset.StandardCharsets.UTF_8);

                    System.out.println("XML: " + xml);

                    nfeService.salvarNFe(xml);

                    System.out.println("Dados inicializados com sucesso.");
                }
            }else {
                System.out.println("Dados já inicializados.");
            }
        }catch (Exception e) {
            System.err.println("Erro ao inicializar os dados: " + e.getMessage());
        }

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.0-flash",
                        "Me conte uma piada sobre java.",
                        null
                );

        System.out.println(response.text());

    }
}
