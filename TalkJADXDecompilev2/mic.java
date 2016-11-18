package defpackage;

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
    transient Map<K, Collection<V>> a;
    transient int b;

    abstract Collection<V> c();

    protected mic(Map<K, Collection<V>> map) {
        bm.a(map.isEmpty());
        this.a = map;
    }

    final void a(Map<K, Collection<V>> map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            boolean z;
            if (collection.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            bm.a(z);
            this.b = collection.size() + this.b;
        }
    }

    Collection<V> d() {
        return c();
    }

    Map<K, Collection<V>> e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public boolean c(Object obj) {
        return this.a.containsKey(obj);
    }

    public boolean a(K k, V v) {
        Collection collection = (Collection) this.a.get(k);
        if (collection == null) {
            collection = d();
            if (collection.add(v)) {
                this.b++;
                this.a.put(k, collection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.b++;
            return true;
        }
    }

    public void g() {
        for (Collection clear : this.a.values()) {
            clear.clear();
        }
        this.a.clear();
        this.b = 0;
    }

    public Collection<V> b(K k) {
        Collection collection = (Collection) this.a.get(k);
        if (collection == null) {
            collection = d();
        }
        return a((Object) k, collection);
    }

    Collection<V> a(K k, Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return new miq(this, k, (SortedSet) collection, null);
        }
        if (collection instanceof Set) {
            return new mip(this, k, (Set) collection);
        }
        if (collection instanceof List) {
            return a(k, (List) collection, null);
        }
        return new mil(this, k, collection, null);
    }

    List<V> a(K k, List<V> list, mil mil) {
        if (list instanceof RandomAccess) {
            return new mii(this, k, list, mil);
        }
        return new min(this, k, list, mil);
    }

    Set<K> h() {
        if (this.a instanceof SortedMap) {
            return new mik(this, (SortedMap) this.a);
        }
        return new mig(this, this.a);
    }

    Map<K, Collection<V>> i() {
        if (this.a instanceof SortedMap) {
            return new mij(this, (SortedMap) this.a);
        }
        return new mid(this, this.a);
    }
}
