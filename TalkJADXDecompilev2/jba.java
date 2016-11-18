package defpackage;

import java.util.LinkedHashMap;

final class jba<K, V> {
    int a;
    private LinkedHashMap<K, V> b;

    public jba(int i) {
        this.a = i;
        this.b = new jbb(this, ((i << 2) / 3) + 1, 0.75f, true);
    }

    public synchronized V a(K k) {
        return this.b.get(k);
    }

    public synchronized void a(K k, V v) {
        this.b.put(k, v);
    }
}
