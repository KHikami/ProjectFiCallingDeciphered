package p000;

import java.util.LinkedHashMap;

final class jba<K, V> {
    int f19668a;
    private LinkedHashMap<K, V> f19669b;

    public jba(int i) {
        this.f19668a = i;
        this.f19669b = new jbb(this, ((i << 2) / 3) + 1, 0.75f, true);
    }

    public synchronized V m23758a(K k) {
        return this.f19669b.get(k);
    }

    public synchronized void m23759a(K k, V v) {
        this.f19669b.put(k, v);
    }
}
