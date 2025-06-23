package dataLayer.dataAccessObjects.db.daos;
import models.Leistung;

public class LeistungDaoSqlite<Leistung, String> extends AbstractDaoSqlite<Leistung, String> {
    public LeistungDaoSqlite(java.lang.String url) {
        super(url);
    }
}
