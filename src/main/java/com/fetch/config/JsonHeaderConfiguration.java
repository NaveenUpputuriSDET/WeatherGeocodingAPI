package com.fetch.config;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class JsonHeaderConfiguration implements HeaderConfiguration{

    private String fileName;

    public JsonHeaderConfiguration(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public Map<String, String> getHeaders() {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IOException("File " + fileName + " not found in classpath");
            }
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(inputStream, Map.class);
        } catch (IOException e) {
            e.printStackTrace();
            return getDefaultHeaders();
        }
    }

    private static Map<String, String> getDefaultHeaders() {
        // Return default headers in case of error
        return Map.of("Content-Type", "application/json");
    }
}
