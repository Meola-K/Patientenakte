package dataLayer.dataAccessObjects.db.daos;
import models.Pflegekraft;

public class PflegekraftDaoSqlite extends AbstractDaoSqlite<Pflegekraft, Long>{
    public PflegekraftDaoSqlite(String url) {
        super(url);
    }
}
