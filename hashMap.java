import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
/**
 * 
 * @author Jos� Rodrigo Barrera Garc�a y �scar Fernando Lopez
 * Carnets: 20807 y 20679
 * Universidad del Valle de Guatemala
 * 
 * Dicho codigo fue tomado de uno de los ejemplos que vienen en libro, como tambien algunos que fueron brindados en clase	
 * @param <K>
 * @param <O>
 */
public class hashMap<K,O> extends HashMap<K, O> implements MapGeneral<K,O> {

    @Override
    public void Put(K key, O object) {
        put(key,object);
    }

    @Override
    public void Remove(K key) {
        remove(key);
    }

    @Override
    public Set<K> KeySet() {
        return keySet();
    }

    @Override
    public boolean ContainsValue(O o) {
        return containsValue(o);
    }

    @Override
    public O Get(K key) {
        return get(key);
    }

    @Override
    public boolean IsEmpty() {
        return isEmpty();
    }

    @Override
    public void Replace(K key, O object) {
        replace(key,object);
    }

    @Override
    public int Size() {
        return size();
    }

    @Override
    public boolean ContainsKey(K key) {
        return containsKey(key);
    }

    @Override
    public Collection<O> Values() {
        return values();
    }
}
