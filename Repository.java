package lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Repository<T> {
    private final List<T> items; 
    
    
    public Repository() {
        this.items = new ArrayList<>(); 
    }
        
        
        
    public boolean add(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null"); 
        }
        return items.add(item);
    }

  
    public boolean remove(T item) {
        return items.remove(item);
    }

  
    public List<T> find(Predicate<T> predicate) {
        if (predicate == null) {
            throw new IllegalArgumentException("Predicate cannot be null"); 
        }
        return items.stream().filter(predicate).collect(Collectors.toList()); 
    }

   
    public List<T> getAll() {
        return Collections.unmodifiableList(items); 
    }

 
    public int count() {
        return items.size(); 
    }

    
    public boolean contains(T item) {
        return items.contains(item); 
    }
}
