package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: mil */
class mil extends AbstractCollection<V> {
    final K b;
    Collection<V> c;
    final mil d;
    final Collection<V> e;
    final /* synthetic */ mic f;

    mil(mic mic, K k, Collection<V> collection, mil mil) {
        this.f = mic;
        this.b = k;
        this.c = collection;
        this.d = mil;
        this.e = mil == null ? null : mil.e();
    }

    void a() {
        if (this.d != null) {
            this.d.a();
            if (this.d.e() != this.e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.c.isEmpty()) {
            Collection collection = (Collection) this.f.a.get(this.b);
            if (collection != null) {
                this.c = collection;
            }
        }
    }

    void b() {
        if (this.d != null) {
            this.d.b();
        } else if (this.c.isEmpty()) {
            this.f.a.remove(this.b);
        }
    }

    K c() {
        return this.b;
    }

    void d() {
        if (this.d != null) {
            this.d.d();
        } else {
            this.f.a.put(this.b, this.c);
        }
    }

    public int size() {
        a();
        return this.c.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.c.equals(obj);
    }

    public int hashCode() {
        a();
        return this.c.hashCode();
    }

    public String toString() {
        a();
        return this.c.toString();
    }

    Collection<V> e() {
        return this.c;
    }

    public Iterator<V> iterator() {
        a();
        return new mim(this);
    }

    public boolean add(V v) {
        a();
        boolean isEmpty = this.c.isEmpty();
        boolean add = this.c.add(v);
        if (add) {
            this.f.b = this.f.b + 1;
            if (isEmpty) {
                d();
            }
        }
        return add;
    }

    mil f() {
        return this.d;
    }

    public boolean addAll(Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.c.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.c.size();
        this.f.b = (size2 - size) + this.f.b;
        if (size != 0) {
            return addAll;
        }
        d();
        return addAll;
    }

    public boolean contains(Object obj) {
        a();
        return this.c.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        a();
        return this.c.containsAll(collection);
    }

    public void clear() {
        int size = size();
        if (size != 0) {
            this.c.clear();
            this.f.b -= size;
            b();
        }
    }

    public boolean remove(Object obj) {
        a();
        boolean remove = this.c.remove(obj);
        if (remove) {
            this.f.b = this.f.b - 1;
            b();
        }
        return remove;
    }

    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.c.removeAll(collection);
        if (!removeAll) {
            return removeAll;
        }
        int size2 = this.c.size();
        this.f.b = (size2 - size) + this.f.b;
        b();
        return removeAll;
    }

    public boolean retainAll(Collection<?> collection) {
        bm.a((Object) collection);
        int size = size();
        boolean retainAll = this.c.retainAll(collection);
        if (retainAll) {
            int size2 = this.c.size();
            this.f.b = (size2 - size) + this.f.b;
            b();
        }
        return retainAll;
    }
}
