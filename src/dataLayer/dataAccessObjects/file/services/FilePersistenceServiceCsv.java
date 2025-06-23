package dataLayer.dataAccessObjects.file.services;

public class FilePersistenceServiceCsv<T> {
    private char separator = ',';

    public FilePersistenceServiceCsv(char separator) {};
    private String getCsvColoumnNames(Class<T> classType) {};
}
