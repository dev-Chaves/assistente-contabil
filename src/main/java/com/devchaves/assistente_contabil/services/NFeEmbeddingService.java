package com.devchaves.assistente_contabil.services;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NFeEmbeddingService {

    private final EmbeddingModel embeddingModel;
    private final NFeProcessorService nfeProcessorService;

    public NFeEmbeddingService(EmbeddingModel embeddingModel, NFeProcessorService nfeProcessorService) {
        this.embeddingModel = embeddingModel;
        this.nfeProcessorService = nfeProcessorService;
    }

    public Map embedNFe(String nfeJson) {
        if(nfeJson == null || nfeJson.isEmpty()) {
            throw new IllegalArgumentException("O JSON da NFe fornecido está vazio ou nulo.");
        }

        try{

            nfeProcessorService.processarNfeXmlFile(nfeJson);


            Map emebedding = embeddingModel.embedForResponse(List.of(nfeJson));

        }catch (Exception e) {
            throw new RuntimeException("Erro ao gerar embedding para o JSON da NFe: " + e.getMessage(), e);
        }

    }
}
