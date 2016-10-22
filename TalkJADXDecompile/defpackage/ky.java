package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: ky */
public class ky<K, V> extends lo<K, V> implements Map<K, V> {
    le<K, V> a;

    public ky(int i) {
        super(i);
    }

    public ky(lo loVar) {
        super(loVar);
    }

    private le<K, V> b() {
        if (this.a == null) {
            this.a = new kz(this);
        }
        return this.a;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean a(Collection<?> collection) {
        return le.a((Map) this, (Collection) collection);
    }

    public boolean b(Collection<?> collection) {
        return le.b(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return b().d();
    }

    public Set<K> keySet() {
        return b().e();
    }

    public Collection<V> values() {
        return b().f();
    }
}
