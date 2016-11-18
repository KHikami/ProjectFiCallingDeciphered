package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class mma<K, V> extends AbstractCollection<V> {
    final Map<K, V> a;

    mma(Map<K, V> map) {
        this.a = (Map) bm.a((Object) map);
    }

    public boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException e) {
            for (Entry entry : this.a.entrySet()) {
                if (mez.b(obj, entry.getValue())) {
                    this.a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            return super.removeAll((Collection) bm.a((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection g = ba.g();
            for (Entry entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    g.add(entry.getKey());
                }
            }
            return this.a.keySet().removeAll(g);
        }
    }

    public boolean retainAll(Collection<?> collection) {
        try {
            return super.retainAll((Collection) bm.a((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection g = ba.g();
            for (Entry entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    g.add(entry.getKey());
                }
            }
            return this.a.keySet().retainAll(g);
        }
    }

    public Iterator<V> iterator() {
        return mls.b(this.a.entrySet().iterator());
    }

    public int size() {
        return this.a.size();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    public void clear() {
        this.a.clear();
    }
}
