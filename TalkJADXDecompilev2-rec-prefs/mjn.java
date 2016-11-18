package p000;

import java.io.Serializable;

class mjn<K, V> extends mir<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K f27833a;
    final V f27834b;

    mjn(K k, V v) {
        this.f27833a = k;
        this.f27834b = v;
    }

    public final K getKey() {
        return this.f27833a;
    }

    public final V getValue() {
        return this.f27834b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
