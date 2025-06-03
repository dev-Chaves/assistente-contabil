package com.devchaves.assistente_contabil.services;

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

    Path path = Path.of("C:\\Users\\ORC\\IdeaProjects\\assistente-contabil\\src\\main\\resources\\nfe\\nfe_exemplo_v4.xml");

    public NFeProcessorService(XmlMapper xmlMapper, ObjectMapper objectMapper) {
        this.xmlMapper = xmlMapper;
        this.objectMapper = objectMapper;
    }

    public  <T> T readXml(String xml, Class<T> classType){
        try {
            return xmlMapper.readValue(xml , classType);
        }catch (Exception e){
            throw new RuntimeException("Error reading XML: " + e.getMessage(), e);
        }
    }

    public void printXml(String xml) {
        try {
            String lines = Files.readString(path);
            System.out.println("XML Content: " + lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
