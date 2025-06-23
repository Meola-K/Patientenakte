package dataLayer.dataAccessObjects; 
 
import java.util.List; 
 
public interface IDao <T, ID> { 
    public T create(); 
    public T create(T objectToInsert); 
    public T read(ID id); 
    public List<T> read(); 
    public void update(T objectToUpdate); 
    public void delete(ID id); 
} 
