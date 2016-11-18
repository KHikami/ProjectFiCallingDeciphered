package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class mil extends AbstractCollection<V> {
    final K f27784b;
    Collection<V> f27785c;
    final mil f27786d;
    final Collection<V> f27787e;
    final /* synthetic */ mic f27788f;

    mil(mic mic, K k, Collection<V> collection, mil mil) {
        this.f27788f = mic;
        this.f27784b = k;
        this.f27785c = collection;
        this.f27786d = mil;
        this.f27787e = mil == null ? null : mil.m32204e();
    }

    void m32200a() {
        if (this.f27786d != null) {
            this.f27786d.m32200a();
            if (this.f27786d.m32204e() != this.f27787e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f27785c.isEmpty()) {
            Collection collection = (Collection) this.f27788f.f27768a.get(this.f27784b);
            if (collection != null) {
                this.f27785c = collection;
            }
        }
    }

    void m32201b() {
        if (this.f27786d != null) {
            this.f27786d.m32201b();
        } else if (this.f27785c.isEmpty()) {
            this.f27788f.f27768a.remove(this.f27784b);
        }
    }

    K m32202c() {
        return this.f27784b;
    }

    void m32203d() {
        if (this.f27786d != null) {
            this.f27786d.m32203d();
        } else {
            this.f27788f.f27768a.put(this.f27784b, this.f27785c);
        }
    }

    public int size() {
        m32200a();
        return this.f27785c.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m32200a();
        return this.f27785c.equals(obj);
    }

    public int hashCode() {
        m32200a();
        return this.f27785c.hashCode();
    }

    public String toString() {
        m32200a();
        return this.f27785c.toString();
    }

    Collection<V> m32204e() {
        return this.f27785c;
    }

    public Iterator<V> iterator() {
        m32200a();
        return new mim(this);
    }

    public boolean add(V v) {
        m32200a();
        boolean isEmpty = this.f27785c.isEmpty();
        boolean add = this.f27785c.add(v);
        if (add) {
            this.f27788f.f27769b = this.f27788f.f27769b + 1;
            if (isEmpty) {
                m32203d();
            }
        }
        return add;
    }

    mil m32205f() {
        return this.f27786d;
    }

    public boolean addAll(Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f27785c.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f27785c.size();
        this.f27788f.f27769b = (size2 - size) + this.f27788f.f27769b;
        if (size != 0) {
            return addAll;
        }
        m32203d();
        return addAll;
    }

    public boolean contains(Object obj) {
        m32200a();
        return this.f27785c.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        m32200a();
        return this.f27785c.containsAll(collection);
    }

    public void clear() {
        int size = size();
        if (size != 0) {
            this.f27785c.clear();
            this.f27788f.f27769b -= size;
            m32201b();
        }
    }

    public boolean remove(Object obj) {
        m32200a();
        boolean remove = this.f27785c.remove(obj);
        if (remove) {
            this.f27788f.f27769b = this.f27788f.f27769b - 1;
            m32201b();
        }
        return remove;
    }

    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f27785c.removeAll(collection);
        if (!removeAll) {
            return removeAll;
        }
        int size2 = this.f27785c.size();
        this.f27788f.f27769b = (size2 - size) + this.f27788f.f27769b;
        m32201b();
        return removeAll;
    }

    public boolean retainAll(Collection<?> collection) {
        bm.m6122a((Object) collection);
        int size = size();
        boolean retainAll = this.f27785c.retainAll(collection);
        if (retainAll) {
            int size2 = this.f27785c.size();
            this.f27788f.f27769b = (size2 - size) + this.f27788f.f27769b;
            m32201b();
        }
        return retainAll;
    }
}
