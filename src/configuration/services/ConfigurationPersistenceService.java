package configuration.services;

import java.lang.module.Configuration;

public class ConfigurationPersistenceService {
    private static ConfigurationPersistenceService instance;
    private String path;
    private Configuration configuration;

    private ConfigurationPersistenceService() {}
    public static ConfigurationPersistenceService getInstance() {}
    public Configuration getConfiguration() {
        return configuration;
    }
    private Configuration getPath() {
        return configuration;
    }
    private void writeFile (Configuration configuration) {}
}
