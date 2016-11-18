package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

abstract class mmb<K, V> extends AbstractMap<K, V> {
    private transient Set<Entry<K, V>> f27770a;
    private transient Set<K> f27771b;
    private transient Collection<V> f27772c;

    abstract Set<Entry<K, V>> mo3787a();

    mmb() {
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f27770a;
        if (set != null) {
            return set;
        }
        set = mo3787a();
        this.f27770a = set;
        return set;
    }

    public Set<K> keySet() {
        Set<K> set = this.f27771b;
        if (set != null) {
            return set;
        }
        set = mo3797b();
        this.f27771b = set;
        return set;
    }

    Set<K> mo3797b() {
        return new mlz(this);
    }

    public Collection<V> values() {
        Collection<V> collection = this.f27772c;
        if (collection != null) {
            return collection;
        }
        collection = m32191c();
        this.f27772c = collection;
        return collection;
    }

    Collection<V> m32191c() {
        return new mma(this);
    }
}
