package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class mic<K, V> extends mis<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    transient Map<K, Collection<V>> f27768a;
    transient int f27769b;

    abstract Collection<V> mo3785c();

    protected mic(Map<K, Collection<V>> map) {
        bm.m6137a(map.isEmpty());
        this.f27768a = map;
    }

    final void m32172a(Map<K, Collection<V>> map) {
        this.f27768a = map;
        this.f27769b = 0;
        for (Collection collection : map.values()) {
            boolean z;
            if (collection.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            bm.m6137a(z);
            this.f27769b = collection.size() + this.f27769b;
        }
    }

    Collection<V> m32177d() {
        return mo3785c();
    }

    Map<K, Collection<V>> m32178e() {
        return this.f27768a;
    }

    public int mo3782f() {
        return this.f27769b;
    }

    public boolean mo3781c(Object obj) {
        return this.f27768a.containsKey(obj);
    }

    public boolean mo3776a(K k, V v) {
        Collection collection = (Collection) this.f27768a.get(k);
        if (collection == null) {
            collection = m32177d();
            if (collection.add(v)) {
                this.f27769b++;
                this.f27768a.put(k, collection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f27769b++;
            return true;
        }
    }

    public void mo3831g() {
        for (Collection clear : this.f27768a.values()) {
            clear.clear();
        }
        this.f27768a.clear();
        this.f27769b = 0;
    }

    public Collection<V> mo3780b(K k) {
        Collection collection = (Collection) this.f27768a.get(k);
        if (collection == null) {
            collection = m32177d();
        }
        return m32170a((Object) k, collection);
    }

    Collection<V> m32170a(K k, Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return new miq(this, k, (SortedSet) collection, null);
        }
        if (collection instanceof Set) {
            return new mip(this, k, (Set) collection);
        }
        if (collection instanceof List) {
            return m32171a(k, (List) collection, null);
        }
        return new mil(this, k, collection, null);
    }

    List<V> m32171a(K k, List<V> list, mil mil) {
        if (list instanceof RandomAccess) {
            return new mii(this, k, list, mil);
        }
        return new min(this, k, list, mil);
    }

    Set<K> mo3783h() {
        if (this.f27768a instanceof SortedMap) {
            return new mik(this, (SortedMap) this.f27768a);
        }
        return new mig(this, this.f27768a);
    }

    Map<K, Collection<V>> mo3784i() {
        if (this.f27768a instanceof SortedMap) {
            return new mij(this, (SortedMap) this.f27768a);
        }
        return new mid(this, this.f27768a);
    }
}
