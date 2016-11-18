package p000;

import java.util.Iterator;
import java.util.Map;

class mlz<K, V> extends mnh<K> {
    final Map<K, V> f27779c;

    mlz(Map<K, V> map) {
        this.f27779c = (Map) bm.m6122a((Object) map);
    }

    Map<K, V> m32199a() {
        return this.f27779c;
    }

    public Iterator<K> iterator() {
        return mls.m32479a(m32199a().entrySet().iterator());
    }

    public int size() {
        return m32199a().size();
    }

    public boolean isEmpty() {
        return m32199a().isEmpty();
    }

    public boolean contains(Object obj) {
        return m32199a().containsKey(obj);
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        m32199a().remove(obj);
        return true;
    }

    public void clear() {
        m32199a().clear();
    }
}
