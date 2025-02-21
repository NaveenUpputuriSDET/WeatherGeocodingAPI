package com.fetch.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = Configuration.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new RuntimeException("Unable to find config.properties in resources folder");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file", e);
        }
    }

    public static final String BASE_URL = properties.getProperty("base.url");
    public static final String API_KEY = properties.getProperty("api.key");
}
