package dataLayer.dataAccessObjects.db.services;

abstract class ConnectionManager {
    private String className;
    private String connectionString;
    private Connection existingConnection;

    public ConnectionManager(String className, String connectionString) {}
    public String getClassName() {};
    public String getConnectionString(){};
    public Connection getExistingConnection() {};
    public Connection getNewConnection() {};

}
