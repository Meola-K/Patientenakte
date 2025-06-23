package dataLayer.dataAccessObjects.file.daos;

import java.nio.file.Path;

public class PflegekraftDaoFile<Pflegekraft, Long> extends AbstractDaoFile<Pflegekraft, Long> {
    public PflegekraftDaoFile(IFilePersistenceService filePersistenceService, Class<Pflegekraft> objectType, Path filePath) {
        super(filePersistenceService, objectType, filePath);
    }
}
