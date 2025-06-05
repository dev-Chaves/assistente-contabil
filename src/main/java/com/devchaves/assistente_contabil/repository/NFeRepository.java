package com.devchaves.assistente_contabil.repository;

import com.devchaves.assistente_contabil.model.nfe.NFe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NFeRepository extends MongoRepository<NFe, String> {
}
