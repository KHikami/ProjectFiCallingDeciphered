import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class mis<K, V> implements mmc<K, V> {
    private transient Set<K> a;
    private transient Map<K, Collection<V>> b;

    abstract Map<K, Collection<V>> i();

    mis() {
    }

    public boolean j() {
        return f() == 0;
    }

    public boolean a(K k, V v) {
        return b(k).add(v);
    }

    public boolean a(K k, Iterable<? extends V> iterable) {
        bm.a((Object) iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !b(k).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext() && mlj.a(b(k), it)) {
            return true;
        }
        return false;
    }

    public Set<K> k() {
        Set<K> set = this.a;
        if (set != null) {
            return set;
        }
        set = h();
        this.a = set;
        return set;
    }

    Set<K> h() {
        return new mlz(b());
    }

    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.b;
        if (map != null) {
            return map;
        }
        map = i();
        this.b = map;
        return map;
    }

    public boolean equals(Object obj) {
        return gwb.a((mmc) this, obj);
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString();
    }
}
