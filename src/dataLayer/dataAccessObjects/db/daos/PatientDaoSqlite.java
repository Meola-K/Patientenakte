package dataLayer.dataAccessObjects.db.daos;
import models.Patient;

public class PatientDaoSqlite<Patient, Long> extends AbstractDaoSqlite<Patient, Long>{
    public PatientDaoSqlite(String url) {
        super(url);
    }
}
