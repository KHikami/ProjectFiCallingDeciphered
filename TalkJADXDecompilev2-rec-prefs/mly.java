package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class mly<K, V> extends mnh<Entry<K, V>> {
    abstract Map<K, V> mo3791a();

    mly() {
    }

    public int size() {
        return mo3791a().size();
    }

    public void clear() {
        mo3791a().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object key = entry.getKey();
        Object a = mls.m32476a(mo3791a(), key);
        if (!mez.m31976b(a, entry.getValue())) {
            return false;
        }
        if (a != null || mo3791a().containsKey(key)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return mo3791a().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        return mo3791a().keySet().remove(((Entry) obj).getKey());
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            return super.removeAll((Collection) bm.m6122a((Object) collection));
        } catch (UnsupportedOperationException e) {
            return ba.m4588a((Set) this, collection.iterator());
        }
    }

    public boolean retainAll(Collection<?> collection) {
        try {
            return super.retainAll((Collection) bm.m6122a((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection c = ba.m4619c(collection.size());
            for (Object next : collection) {
                if (contains(next)) {
                    c.add(((Entry) next).getKey());
                }
            }
            return mo3791a().keySet().retainAll(c);
        }
    }
}
