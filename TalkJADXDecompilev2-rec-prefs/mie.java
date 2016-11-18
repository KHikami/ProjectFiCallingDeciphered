package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class mie extends mly<K, Collection<V>> {
    final /* synthetic */ mid f27775a;

    mie(mid mid) {
        this.f27775a = mid;
    }

    Map<K, Collection<V>> mo3791a() {
        return this.f27775a;
    }

    public Iterator<Entry<K, Collection<V>>> iterator() {
        return new mif(this.f27775a);
    }

    public boolean contains(Object obj) {
        return miv.m32230a(this.f27775a.f27773a.entrySet(), obj);
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Entry entry = (Entry) obj;
        mic mic = this.f27775a.f27774b;
        Collection collection = (Collection) mls.m32488c(mic.f27768a, entry.getKey());
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            mic.f27769b -= size;
        }
        return true;
    }
}
