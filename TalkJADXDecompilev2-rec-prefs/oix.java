package p000;

import java.util.LinkedHashMap;

public final class oix<K, V> {
    private final LinkedHashMap<K, onc<V>> f33053a;

    oix(int i) {
        this.f33053a = gwb.J(i);
    }

    public oiw<K, V> m38524a() {
        return new oiw(this.f33053a);
    }

    public oix<K, V> m38525a(K k, onc<V> onc_V) {
        if (onc_V == null) {
            throw new NullPointerException("The provider of the value is null");
        }
        this.f33053a.put(k, onc_V);
        return this;
    }
}
