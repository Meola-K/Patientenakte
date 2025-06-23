package dataLayer.dataAccessObjects.file.daos;

import java.nio.file.Path;

public class PatientDaoFile<Patient, Long> extends AbstractDaoFile<Patient, Long> {
    public PatientDaoFile(IFilePersistenceService filePersistenceService, Class<Patient> objectType, Path filePath) {
        super(filePersistenceService, objectType, filePath);
    }
}
