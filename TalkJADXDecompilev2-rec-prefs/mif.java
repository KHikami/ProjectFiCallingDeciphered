package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

final class mif implements Iterator<Entry<K, Collection<V>>> {
    final Iterator<Entry<K, Collection<V>>> f27776a = this.f27778c.f27773a.entrySet().iterator();
    Collection<V> f27777b;
    final /* synthetic */ mid f27778c;

    mif(mid mid) {
        this.f27778c = mid;
    }

    public /* synthetic */ Object next() {
        return m32198a();
    }

    public boolean hasNext() {
        return this.f27776a.hasNext();
    }

    private Entry<K, Collection<V>> m32198a() {
        Entry entry = (Entry) this.f27776a.next();
        this.f27777b = (Collection) entry.getValue();
        return this.f27778c.m32193a(entry);
    }

    public void remove() {
        this.f27776a.remove();
        this.f27778c.f27774b.f27769b -= this.f27777b.size();
        this.f27777b.clear();
    }
}
