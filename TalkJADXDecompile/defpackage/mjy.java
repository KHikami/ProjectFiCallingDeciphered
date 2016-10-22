package defpackage;

import java.util.Map.Entry;

/* renamed from: mjy */
final class mjy extends mny<K> {
    final /* synthetic */ mny a;
    final /* synthetic */ mjx b;

    mjy(mjx mjx, mny mny) {
        this.b = mjx;
        this.a = mny;
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    public K next() {
        return ((Entry) this.a.next()).getKey();
    }
}
