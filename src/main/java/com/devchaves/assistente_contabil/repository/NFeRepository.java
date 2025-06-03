package com.devchaves.assistente_contabil.repository;

import com.devchaves.assistente_contabil.nfe.model.NFe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NFeRepository extends MongoRepository<NFe, String> {
}
