package dataLayer.dataAccessObjects.file.daos;

import java.nio.file.Path;

public class LeistungDaoFile<Leistung, String> extends AbstractDaoFile<Leistung, String> {
    public LeistungDaoFile(IFilePersistenceService filePersistenceService, Class<Leistung> objectType, Path filePath) {
        super(filePersistenceService, objectType, filePath);
    }
}
