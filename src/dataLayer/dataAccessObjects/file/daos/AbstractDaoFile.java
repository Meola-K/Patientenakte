package dataLayer.dataAccessObjects.file.daos;

import java.nio.file.Path;
import java.util.List;

public class AbstractDaoFile<T, ID> implements IFilepersistenceServer {
    private IFilePersistenceService filePersistenceService;
    private Class<T> objectType;
    private Path filepath;
    protected List<T> catchedObjects;

    public AbstractDaoFile(IFilePersistenceService filePersistenceService, Class<T> objectType, Path filePath){};
    public T create(T object){};
    public T read(ID id){};
    public List<T> read(){};
    public void update(T objectToUpdate){};
    public void delete(ID id){};

    protected ID getIdFromObject(T object){};
    protected void setIdToObjectToInsert(T objectToInsert){};

    private boolean hasMatchingId(T Object, ID id){};
    private List<T> loadObjectList(){};
    private void safeObjectList(List<T> ObjectList){};


}
