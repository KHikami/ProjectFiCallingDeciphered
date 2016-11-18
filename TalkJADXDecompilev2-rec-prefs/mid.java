package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class mid extends mmb<K, Collection<V>> {
    final transient Map<K, Collection<V>> f27773a;
    final /* synthetic */ mic f27774b;

    public /* synthetic */ Object get(Object obj) {
        return m32192a(obj);
    }

    public /* synthetic */ Object remove(Object obj) {
        return m32195b(obj);
    }

    mid(mic mic, Map<K, Collection<V>> map) {
        this.f27774b = mic;
        this.f27773a = map;
    }

    protected Set<Entry<K, Collection<V>>> mo3787a() {
        return new mie(this);
    }

    public boolean containsKey(Object obj) {
        return mls.m32487b(this.f27773a, obj);
    }

    public Collection<V> m32192a(Object obj) {
        Collection collection = (Collection) mls.m32476a(this.f27773a, obj);
        if (collection == null) {
            return null;
        }
        return this.f27774b.m32170a(obj, collection);
    }

    public Set<K> keySet() {
        return this.f27774b.mo3779k();
    }

    public int size() {
        return this.f27773a.size();
    }

    public Collection<V> m32195b(Object obj) {
        Collection collection = (Collection) this.f27773a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection<V> c = this.f27774b.mo3785c();
        c.addAll(collection);
        this.f27774b.f27769b -= collection.size();
        collection.clear();
        return c;
    }

    public boolean equals(Object obj) {
        return this == obj || this.f27773a.equals(obj);
    }

    public int hashCode() {
        return this.f27773a.hashCode();
    }

    public String toString() {
        return this.f27773a.toString();
    }

    public void clear() {
        if (this.f27773a == this.f27774b.f27768a) {
            this.f27774b.mo3831g();
        } else {
            mlj.m32469d(new mif(this));
        }
    }

    Entry<K, Collection<V>> m32193a(Entry<K, Collection<V>> entry) {
        Object key = entry.getKey();
        return mls.m32480a(key, this.f27774b.m32170a(key, (Collection) entry.getValue()));
    }
}
