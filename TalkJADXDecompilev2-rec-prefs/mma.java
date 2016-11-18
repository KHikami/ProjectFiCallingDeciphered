package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class mma<K, V> extends AbstractCollection<V> {
    final Map<K, V> f27900a;

    mma(Map<K, V> map) {
        this.f27900a = (Map) bm.m6122a((Object) map);
    }

    public boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException e) {
            for (Entry entry : this.f27900a.entrySet()) {
                if (mez.m31976b(obj, entry.getValue())) {
                    this.f27900a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            return super.removeAll((Collection) bm.m6122a((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection g = ba.m4641g();
            for (Entry entry : this.f27900a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    g.add(entry.getKey());
                }
            }
            return this.f27900a.keySet().removeAll(g);
        }
    }

    public boolean retainAll(Collection<?> collection) {
        try {
            return super.retainAll((Collection) bm.m6122a((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection g = ba.m4641g();
            for (Entry entry : this.f27900a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    g.add(entry.getKey());
                }
            }
            return this.f27900a.keySet().retainAll(g);
        }
    }

    public Iterator<V> iterator() {
        return mls.m32485b(this.f27900a.entrySet().iterator());
    }

    public int size() {
        return this.f27900a.size();
    }

    public boolean isEmpty() {
        return this.f27900a.isEmpty();
    }

    public boolean contains(Object obj) {
        return this.f27900a.containsValue(obj);
    }

    public void clear() {
        this.f27900a.clear();
    }
}
