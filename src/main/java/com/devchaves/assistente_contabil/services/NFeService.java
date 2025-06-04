package com.devchaves.assistente_contabil.services;

import com.devchaves.assistente_contabil.nfe.model.NFe;
import com.devchaves.assistente_contabil.repository.NFeRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class NFeService {

    private final NFeProcessorService nFeProcessorService;
    private final NFeRepository nfeRepository;

    public NFeService(NFeProcessorService nFeProcessorService, NFeRepository nFeRepository) {
        this.nFeProcessorService = nFeProcessorService;
        this.nfeRepository = nFeRepository;
    }

    public NFe salvarNFe(String xml){
        try{
            if(xml == null){
                throw new IllegalArgumentException("O XML fornencido é nulo.");
            }

            NFe nfe = nFeProcessorService.deserialiseXml(xml, NFe.class);

            nfeRepository.save(nfe);

            return nfe;
        }catch (DataAccessException e){
            throw new RuntimeException("Erro ao salvar NFe: " + e.getMessage(), e);
        }
    }

}
