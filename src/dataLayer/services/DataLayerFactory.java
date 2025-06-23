package dataLayer.services;

import configuration.models.*;
import dataLayer.dataAccessObjects.IDao;

public class DataLayerFactory {
    private Configuration config;
    public IDataLayer createDataLayer(Configuration config) {
        return null;
    }
    private IDao createDao(ModelType modelType) {
        return null;
    }
    private IDao createDbDao(ModelType modelType, DataSource dataSource) {
        return null;
    }
    private IDao createFileDao(ModelType modelType, DataSource dataSource) {
        return null;
    }
    private DataSource getDataSource(ModelType modelType) {
        return null;
    }
    private DbConnection getDbConnection(String dbConnection) {
        return null;
    }
    private FileConnection getFileConnection(ModelType modelType) {
        return null;
    }
}
