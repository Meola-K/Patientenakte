package configuration.services;

import java.lang.module.Configuration;

public class ConfigurationPersistenceService {
    private static ConfigurationPersistenceService instance;
    private String path;
    private Configuration configuration;

    private ConfigurationPersistenceService() {}
    public static ConfigurationPersistenceService getInstance() {
        if (instance == null) {
            instance = new ConfigurationPersistenceService();
        }
        return instance;
    }
    public Configuration getConfiguration() {
        return configuration;
    }
    private Configuration readFile() {
        return configuration;
    }
    private void writeFile (Configuration configuration) {}
}
