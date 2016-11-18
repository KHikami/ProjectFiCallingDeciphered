package defpackage;

import java.util.LinkedHashMap;

public final class oix<K, V> {
    private final LinkedHashMap<K, onc<V>> a;

    oix(int i) {
        this.a = gwb.J(i);
    }

    public oiw<K, V> a() {
        return new oiw(this.a);
    }

    public oix<K, V> a(K k, onc<V> onc_V) {
        if (onc_V == null) {
            throw new NullPointerException("The provider of the value is null");
        }
        this.a.put(k, onc_V);
        return this;
    }
}
