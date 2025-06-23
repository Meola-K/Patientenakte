package dataLayer.services;

import dataLayer.dataAccessObjects.IDao;
import models.Leistung;
import models.Patient;
import models.Pflegekraft;

public interface IDataLayer {
    IDao<Leistung,String> getDaoLeistung();
    IDao<Patient,Long> getDaoPatient();
    IDao<Pflegekraft,Long> getDaoPflegekraft();
}
