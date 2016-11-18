package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class nxv extends AbstractSet<Entry<K, V>> {
    final /* synthetic */ nxo f31230a;

    nxv(nxo nxo) {
        this.f31230a = nxo;
    }

    public /* synthetic */ boolean add(Object obj) {
        return m37050a((Entry) obj);
    }

    public Iterator<Entry<K, V>> iterator() {
        return new nxu(this.f31230a);
    }

    public int size() {
        return this.f31230a.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f31230a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    private boolean m37050a(Entry<K, V> entry) {
        if (contains(entry)) {
            return false;
        }
        this.f31230a.m37035a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f31230a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f31230a.clear();
    }
}
