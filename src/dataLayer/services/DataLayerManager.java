package dataLayer.services;

public class DataLayerManager {
    static DataLayerManager instance;
    private IDataLayer dataLayer;
    private DataLayerManager() {}
    public static DataLayerManager getInstance() {
        if (instance == null) {
            instance = new DataLayerManager();
        }
        return instance;
    }
    public IDataLayer getDataLayer() {
        return dataLayer;
    }
}
