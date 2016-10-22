import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

final class mif implements Iterator<Entry<K, Collection<V>>> {
    final Iterator<Entry<K, Collection<V>>> a;
    Collection<V> b;
    final /* synthetic */ mid c;

    mif(mid mid) {
        this.c = mid;
        this.a = this.c.a.entrySet().iterator();
    }

    public /* synthetic */ Object next() {
        return a();
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    private Entry<K, Collection<V>> a() {
        Entry entry = (Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        return this.c.a(entry);
    }

    public void remove() {
        this.a.remove();
        this.c.b.b -= this.b.size();
        this.b.clear();
    }
}
