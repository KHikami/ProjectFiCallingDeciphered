package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class mid extends mmb<K, Collection<V>> {
    final transient Map<K, Collection<V>> a;
    final /* synthetic */ mic b;

    public /* synthetic */ Object get(Object obj) {
        return a(obj);
    }

    public /* synthetic */ Object remove(Object obj) {
        return b(obj);
    }

    mid(mic mic, Map<K, Collection<V>> map) {
        this.b = mic;
        this.a = map;
    }

    protected Set<Entry<K, Collection<V>>> a() {
        return new mie(this);
    }

    public boolean containsKey(Object obj) {
        return mls.b(this.a, obj);
    }

    public Collection<V> a(Object obj) {
        Collection collection = (Collection) mls.a(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.b.a(obj, collection);
    }

    public Set<K> keySet() {
        return this.b.k();
    }

    public int size() {
        return this.a.size();
    }

    public Collection<V> b(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection<V> c = this.b.c();
        c.addAll(collection);
        this.b.b -= collection.size();
        collection.clear();
        return c;
    }

    public boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    public void clear() {
        if (this.a == this.b.a) {
            this.b.g();
        } else {
            mlj.d(new mif(this));
        }
    }

    Entry<K, Collection<V>> a(Entry<K, Collection<V>> entry) {
        Object key = entry.getKey();
        return mls.a(key, this.b.a(key, (Collection) entry.getValue()));
    }
}
