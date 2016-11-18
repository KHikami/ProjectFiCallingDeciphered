package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class mim implements Iterator<V> {
    final Iterator<V> f27794a;
    final Collection<V> f27795b = this.f27796c.f27785c;
    final /* synthetic */ mil f27796c;

    mim(mil mil) {
        Iterator listIterator;
        this.f27796c = mil;
        mic mic = mil.f27788f;
        Collection collection = mil.f27785c;
        if (collection instanceof List) {
            listIterator = ((List) collection).listIterator();
        } else {
            listIterator = collection.iterator();
        }
        this.f27794a = listIterator;
    }

    mim(mil mil, Iterator<V> it) {
        this.f27796c = mil;
        this.f27794a = it;
    }

    void m32212a() {
        this.f27796c.m32200a();
        if (this.f27796c.f27785c != this.f27795b) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        m32212a();
        return this.f27794a.hasNext();
    }

    public V next() {
        m32212a();
        return this.f27794a.next();
    }

    public void remove() {
        this.f27794a.remove();
        this.f27796c.f27788f.f27769b = this.f27796c.f27788f.f27769b - 1;
        this.f27796c.m32201b();
    }

    Iterator<V> m32213b() {
        m32212a();
        return this.f27794a;
    }
}
