package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ky<K, V> extends lo<K, V> implements Map<K, V> {
    le<K, V> f23988a;

    public ky(int i) {
        super(i);
    }

    public ky(lo loVar) {
        super(loVar);
    }

    private le<K, V> m28020b() {
        if (this.f23988a == null) {
            this.f23988a = new kz(this);
        }
        return this.f23988a;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m28014a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean m28021a(Collection<?> collection) {
        return le.m28159a((Map) this, (Collection) collection);
    }

    public boolean m28022b(Collection<?> collection) {
        return le.m28161b(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m28020b().m28173d();
    }

    public Set<K> keySet() {
        return m28020b().m28174e();
    }

    public Collection<V> values() {
        return m28020b().m28175f();
    }
}
