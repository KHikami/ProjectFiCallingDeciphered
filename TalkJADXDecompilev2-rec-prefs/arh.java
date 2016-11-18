package p000;

import java.util.ArrayList;
import java.util.List;

final class arh<K, V> {
    final K f2212a;
    arh<K, V> f2213b;
    arh<K, V> f2214c;
    private List<V> f2215d;

    public arh() {
        this(null);
    }

    public arh(K k) {
        this.f2214c = this;
        this.f2213b = this;
        this.f2212a = k;
    }

    public V m3846a() {
        int b = m3848b();
        return b > 0 ? this.f2215d.remove(b - 1) : null;
    }

    public int m3848b() {
        return this.f2215d != null ? this.f2215d.size() : 0;
    }

    public void m3847a(V v) {
        if (this.f2215d == null) {
            this.f2215d = new ArrayList();
        }
        this.f2215d.add(v);
    }
}
