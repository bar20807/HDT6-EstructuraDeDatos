import java.util.Collection;
import java.util.Set;

/**
 * 
 * @author José Rodrigo Barrera García y Oscar Fernando Lopez Barrios
 * Carnets: 20807 y 20679
 * Universidad del Valle de Guatemala
 *
 *Codigo tomado de los ejemplos de clase y del libro JavaStructures
 *
 * @param <K> parametro
 * @param <O> parametro
 */

public interface MapGeneral<K,O> {

    public void Put(K key, O object);
    public void Remove(K key);
    public Set<K> KeySet();
    public boolean ContainsValue(O o);
    public O Get(K key);
    public boolean IsEmpty();
    public void Replace(K key, O object);
    public int Size();
    public boolean ContainsKey(K key);
    public Collection<O> Values();

}
