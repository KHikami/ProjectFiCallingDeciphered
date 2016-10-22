import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface mmc<K, V> {
    boolean a(K k, Iterable<? extends V> iterable);

    boolean a(K k, V v);

    Collection<V> b(K k);

    Map<K, Collection<V>> b();

    boolean c(Object obj);

    int f();

    boolean j();

    Set<K> k();
}
