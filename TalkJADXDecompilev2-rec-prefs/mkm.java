package p000;

import java.util.Map.Entry;

final class mkm extends mny<V> {
    final mny<Entry<K, V>> f27854a = this.f27855b.f27853a.mo3873e().mo3806a();
    final /* synthetic */ mkl f27855b;

    mkm(mkl mkl) {
        this.f27855b = mkl;
    }

    public boolean hasNext() {
        return this.f27854a.hasNext();
    }

    public V next() {
        return ((Entry) this.f27854a.next()).getValue();
    }
}
