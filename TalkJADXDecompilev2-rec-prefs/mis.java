package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class mis<K, V> implements mmc<K, V> {
    private transient Set<K> f27766a;
    private transient Map<K, Collection<V>> f27767b;

    abstract Map<K, Collection<V>> mo3784i();

    mis() {
    }

    public boolean mo3778j() {
        return mo3782f() == 0;
    }

    public boolean mo3776a(K k, V v) {
        return mo3780b(k).add(v);
    }

    public boolean mo3775a(K k, Iterable<? extends V> iterable) {
        bm.m6122a((Object) iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !mo3780b(k).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext() && mlj.m32462a(mo3780b(k), it)) {
            return true;
        }
        return false;
    }

    public Set<K> mo3779k() {
        Set<K> set = this.f27766a;
        if (set != null) {
            return set;
        }
        set = mo3783h();
        this.f27766a = set;
        return set;
    }

    Set<K> mo3783h() {
        return new mlz(mo3777b());
    }

    public Map<K, Collection<V>> mo3777b() {
        Map<K, Collection<V>> map = this.f27767b;
        if (map != null) {
            return map;
        }
        map = mo3784i();
        this.f27767b = map;
        return map;
    }

    public boolean equals(Object obj) {
        return gwb.m1945a((mmc) this, obj);
    }

    public int hashCode() {
        return mo3777b().hashCode();
    }

    public String toString() {
        return mo3777b().toString();
    }
}
