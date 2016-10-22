import java.util.ArrayList;
import java.util.List;

final class arh<K, V> {
    final K a;
    arh<K, V> b;
    arh<K, V> c;
    private List<V> d;

    public arh() {
        this(null);
    }

    public arh(K k) {
        this.c = this;
        this.b = this;
        this.a = k;
    }

    public V a() {
        int b = b();
        return b > 0 ? this.d.remove(b - 1) : null;
    }

    public int b() {
        return this.d != null ? this.d.size() : 0;
    }

    public void a(V v) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(v);
    }
}
