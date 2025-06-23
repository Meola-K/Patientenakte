package dataLayer.dataAccessObjects.file.services;

import java.nio.file.Path;
import java.util.List;

public interface IFilePersistenceService<T> {
    public List<T> readFile(Class<T> classType, Path filePath);
    public void writeFile(Class<T> classtype, List<T> listToPersist, Path filePath);
}
