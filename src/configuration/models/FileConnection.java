package configuration.models;

import java.util.List;
import java.util.Map;

public class FileConnection {
    ModelType model;
    List<File> fileList;

    public ModelType getModel() {
        return model;
    }

    public void setModel(ModelType model) {
        this.model = model;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public Map<FileType,File> createFileMap() {
        return null;
    }
}
