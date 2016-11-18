package p000;

import java.util.Iterator;
import java.util.Map.Entry;

final class nxg<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> f31213a;

    public /* synthetic */ Object next() {
        return m37029a();
    }

    public nxg(Iterator<Entry<K, Object>> it) {
        this.f31213a = it;
    }

    public boolean hasNext() {
        return this.f31213a.hasNext();
    }

    private Entry<K, Object> m37029a() {
        Entry<K, Object> entry = (Entry) this.f31213a.next();
        if (entry.getValue() instanceof nxe) {
            return new nxf(entry);
        }
        return entry;
    }

    public void remove() {
        this.f31213a.remove();
    }
}
