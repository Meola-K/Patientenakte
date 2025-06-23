package dataLayer.dataAccessObjects.db.daos;
import models.Patient;

public class PatientDaoSqlite extends AbstractDaoSqlite<Patient, Long>{
    public PatientDaoSqlite(String url) {
        super(url);
    }
}
