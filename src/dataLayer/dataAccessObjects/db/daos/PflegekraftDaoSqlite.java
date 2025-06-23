package dataLayer.dataAccessObjects.db.daos;
import models.Pflegekraft;

public class PflegekraftDaoSqlite<Pflegekraft, Long> extends AbstractDaoSqlite<Pflegekraft, Long>{
    public PflegekraftDaoSqlite(String url) {
        super(url);
    }
}
