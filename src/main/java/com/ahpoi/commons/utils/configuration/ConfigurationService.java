package com.ahpoi.commons.utils.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

public class ConfigurationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationService.class);

    private final Properties properties;

    public ConfigurationService(Properties properties) {
        this.properties = properties;
    }

    public ConfigurationService withEnv(String env) {
        LOGGER.info("Setting env to: {}", env);
        final String fileName = "application" + "-" + env.toLowerCase().trim() + ".properties";
        try (InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(fileName)) {
            LOGGER.info("Loading file: {}", fileName);
            this.properties.load(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException("Exception occurred while loading env properties", e);
        }
        return this;
    }

    public String getRequiredProperty(String key) {
        return Optional.ofNullable(properties.getProperty(key))
                .orElseThrow(() -> new RuntimeException(String.format("Required property missing: %s", key)));
    }

    public Optional<String> getOptionalProperty(String key) {
        return Optional.ofNullable(properties.getProperty(key));
    }

}
