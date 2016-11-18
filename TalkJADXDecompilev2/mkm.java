package defpackage;

import java.util.Map.Entry;

final class mkm extends mny<V> {
    final mny<Entry<K, V>> a = this.b.a.e().a();
    final /* synthetic */ mkl b;

    mkm(mkl mkl) {
        this.b = mkl;
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    public V next() {
        return ((Entry) this.a.next()).getValue();
    }
}
