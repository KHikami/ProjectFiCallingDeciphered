import java.io.Serializable;

class mjn<K, V> extends mir<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K a;
    final V b;

    mjn(K k, V v) {
        this.a = k;
        this.b = v;
    }

    public final K getKey() {
        return this.a;
    }

    public final V getValue() {
        return this.b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
