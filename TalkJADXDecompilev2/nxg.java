package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

final class nxg<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> a;

    public /* synthetic */ Object next() {
        return a();
    }

    public nxg(Iterator<Entry<K, Object>> it) {
        this.a = it;
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    private Entry<K, Object> a() {
        Entry<K, Object> entry = (Entry) this.a.next();
        if (entry.getValue() instanceof nxe) {
            return new nxf(entry);
        }
        return entry;
    }

    public void remove() {
        this.a.remove();
    }
}
