package p000;

import java.util.Map.Entry;

final class mjy extends mny<K> {
    final /* synthetic */ mny f27843a;
    final /* synthetic */ mjx f27844b;

    mjy(mjx mjx, mny mny) {
        this.f27844b = mjx;
        this.f27843a = mny;
    }

    public boolean hasNext() {
        return this.f27843a.hasNext();
    }

    public K next() {
        return ((Entry) this.f27843a.next()).getKey();
    }
}
