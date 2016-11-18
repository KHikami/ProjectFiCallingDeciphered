package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

abstract class mmb<K, V> extends AbstractMap<K, V> {
    private transient Set<Entry<K, V>> a;
    private transient Set<K> b;
    private transient Collection<V> c;

    abstract Set<Entry<K, V>> a();

    mmb() {
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.a;
        if (set != null) {
            return set;
        }
        set = a();
        this.a = set;
        return set;
    }

    public Set<K> keySet() {
        Set<K> set = this.b;
        if (set != null) {
            return set;
        }
        set = b();
        this.b = set;
        return set;
    }

    Set<K> b() {
        return new mlz(this);
    }

    public Collection<V> values() {
        Collection<V> collection = this.c;
        if (collection != null) {
            return collection;
        }
        collection = c();
        this.c = collection;
        return collection;
    }

    Collection<V> c() {
        return new mma(this);
    }
}
