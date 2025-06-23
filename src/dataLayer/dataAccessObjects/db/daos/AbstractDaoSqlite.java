package dataLayer.dataAccessObjects.db.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

abstract class AbstractDaoSqlite <T, ID>{
    private ConnectionManager connectionManager;

    public AbstractDaoSqlite(String url) {}
    public T create();
    public T create(T objectToInsert);
    public T read(ID id);
    public List<T> read();
    public void update(T objectToUpdate);
    public void delete(ID id);

    protected String getTableName(){};
    protected String getPrimaryKeyColoumn(){};
    protected String getSqlCreateTableIfNotExists(){};
    protected String getSqlInsert(){};
    protected String getSqlUpdate(){};
    protected T mapResultSetToObject(ResultSet resultSet){};
    protected void setInsertStatement(PreparedStatement preparedStatement, T objectToInsert){};
    protected void setGeneratedIdToObject(PreparedStatement preparedStatement, T objectToInsert){};
    protected void setUpdateStatement(PreparedStatement preparedStatement, T objectToInsert){};

    private void createTabelIfNotExists(){};
    private String getSqlReadId(){};
    private String getSqlReadAll(){};
    private String getSqlDelete(){};



}
