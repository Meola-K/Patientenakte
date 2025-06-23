package dataLayer.dataAccessObjects.db.daos;
import models.Leistung;

public class LeistungDaoSqlite extends AbstractDaoSqlite<Leistung, String> {
    public LeistungDaoSqlite(String url) {
        super(url);
    }
}
