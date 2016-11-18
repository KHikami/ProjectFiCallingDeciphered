package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class mie extends mly<K, Collection<V>> {
    final /* synthetic */ mid a;

    mie(mid mid) {
        this.a = mid;
    }

    Map<K, Collection<V>> a() {
        return this.a;
    }

    public Iterator<Entry<K, Collection<V>>> iterator() {
        return new mif(this.a);
    }

    public boolean contains(Object obj) {
        return miv.a(this.a.a.entrySet(), obj);
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Entry entry = (Entry) obj;
        mic mic = this.a.b;
        Collection collection = (Collection) mls.c(mic.a, entry.getKey());
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            mic.b -= size;
        }
        return true;
    }
}
