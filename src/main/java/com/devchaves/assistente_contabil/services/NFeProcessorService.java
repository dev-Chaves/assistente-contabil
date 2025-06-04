package com.devchaves.assistente_contabil.services;

import com.devchaves.assistente_contabil.nfe.model.NFe;
import com.devchaves.assistente_contabil.repository.NFeRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service

public class NFeProcessorService {

    private final XmlMapper xmlMapper;
    private final ObjectMapper objectMapper;
    private final NFeRepository nfeRepository;

    Path path = Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "nfe", "nfe_exemplo_v4.xml");

    public NFeProcessorService(XmlMapper xmlMapper, ObjectMapper objectMapper, NFeRepository nfeRepository) {
        this.xmlMapper = xmlMapper;
        this.objectMapper = objectMapper;
        this.nfeRepository = nfeRepository;
    }

    public  <T> T deserialiseXml(String xml, Class<T> classType){
        try {

            if (xml == null || xml.isEmpty()) {
                throw new IllegalArgumentException("O XML fornecido está vazio ou nulo.");
            }

            if (classType == null) {
                throw new IllegalArgumentException("O tipo de classe fornecido é nulo.");
            }

            return xmlMapper.readValue(xml , classType);
        }catch (Exception e){
            throw new RuntimeException("Error ao ler o XML: " + e.getMessage(), e);
        }
    }

    public String processarObjetoParaJson (Object nfe) {
        try{
            String nfeJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(nfe);

            System.out.println("Objeto convertido para JSON: " + nfeJson);

            return nfeJson;
        }catch (IOException e){
            throw new RuntimeException("Error ao converter objeto para JSON: " + e.getMessage(), e);
        }
    }

    public void processarNfeXmlFile (String filePath) {
        try {
            String xmlContent = Files.readString(Paths.get(filePath));
            NFe nfe = deserialiseXml(xmlContent, NFe.class);
            System.out.println("NFe processada: " + nfe);
        } catch (IOException e) {
            throw new RuntimeException("Error ao ler o arquivo: " + e.getMessage(), e);
        } catch (Exception e){
            throw new RuntimeException("Error ao processar a NFe: " + e.getMessage(), e);
        }
    }


}
