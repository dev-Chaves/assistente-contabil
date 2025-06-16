package com.devchaves.assistente_contabil.services;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.stereotype.Service;

@Service
public class NFeEmbeddingService {

    private final EmbeddingModel embeddingModel;
    private final NFeProcessorService nfeProcessorService;

    public NFeEmbeddingService(EmbeddingModel embeddingModel, NFeProcessorService nfeProcessorService) {
        this.embeddingModel = embeddingModel;
        this.nfeProcessorService = nfeProcessorService;
    }

}
