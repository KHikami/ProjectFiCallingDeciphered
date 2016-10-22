package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: mlz */
class mlz<K, V> extends mnh<K> {
    final Map<K, V> c;

    mlz(Map<K, V> map) {
        this.c = (Map) bm.a((Object) map);
    }

    Map<K, V> a() {
        return this.c;
    }

    public Iterator<K> iterator() {
        return mls.a(a().entrySet().iterator());
    }

    public int size() {
        return a().size();
    }

    public boolean isEmpty() {
        return a().isEmpty();
    }

    public boolean contains(Object obj) {
        return a().containsKey(obj);
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        a().remove(obj);
        return true;
    }

    public void clear() {
        a().clear();
    }
}
