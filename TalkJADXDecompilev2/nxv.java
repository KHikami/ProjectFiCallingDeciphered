package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class nxv extends AbstractSet<Entry<K, V>> {
    final /* synthetic */ nxo a;

    nxv(nxo nxo) {
        this.a = nxo;
    }

    public /* synthetic */ boolean add(Object obj) {
        return a((Entry) obj);
    }

    public Iterator<Entry<K, V>> iterator() {
        return new nxu(this.a);
    }

    public int size() {
        return this.a.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    private boolean a(Entry<K, V> entry) {
        if (contains(entry)) {
            return false;
        }
        this.a.a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.a.clear();
    }
}
