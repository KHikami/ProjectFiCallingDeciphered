package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class mly<K, V> extends mnh<Entry<K, V>> {
    abstract Map<K, V> a();

    mly() {
    }

    public int size() {
        return a().size();
    }

    public void clear() {
        a().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object key = entry.getKey();
        Object a = mls.a(a(), key);
        if (!mez.b(a, entry.getValue())) {
            return false;
        }
        if (a != null || a().containsKey(key)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return a().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        return a().keySet().remove(((Entry) obj).getKey());
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            return super.removeAll((Collection) bm.a((Object) collection));
        } catch (UnsupportedOperationException e) {
            return ba.a((Set) this, collection.iterator());
        }
    }

    public boolean retainAll(Collection<?> collection) {
        try {
            return super.retainAll((Collection) bm.a((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection c = ba.c(collection.size());
            for (Object next : collection) {
                if (contains(next)) {
                    c.add(((Entry) next).getKey());
                }
            }
            return a().keySet().retainAll(c);
        }
    }
}
