package configuration.models;

import java.util.List;
import java.util.Map;

public class DbConnections {
    private List<DbConnection> dbConnectionList;

    public List<DbConnection> getConnections() {
        return dbConnectionList;
    }

    public Map<DbConnectionType,DbConnection> createDbConnectionMap() {
        return null;
    }

}
