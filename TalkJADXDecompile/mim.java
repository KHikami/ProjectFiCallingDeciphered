import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class mim implements Iterator<V> {
    final Iterator<V> a;
    final Collection<V> b;
    final /* synthetic */ mil c;

    mim(mil mil) {
        Iterator listIterator;
        this.c = mil;
        this.b = this.c.c;
        mic mic = mil.f;
        Collection collection = mil.c;
        if (collection instanceof List) {
            listIterator = ((List) collection).listIterator();
        } else {
            listIterator = collection.iterator();
        }
        this.a = listIterator;
    }

    mim(mil mil, Iterator<V> it) {
        this.c = mil;
        this.b = this.c.c;
        this.a = it;
    }

    void a() {
        this.c.a();
        if (this.c.c != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    public V next() {
        a();
        return this.a.next();
    }

    public void remove() {
        this.a.remove();
        this.c.f.f.b = this.c.f.b - 1;
        this.c.b();
    }

    Iterator<V> b() {
        a();
        return this.a;
    }
}
