package p000;

import java.util.Map.Entry;

final class mmy extends mjf<Entry<V, K>> {
    final /* synthetic */ mmx f27925a;

    mmy(mmx mmx) {
        this.f27925a = mmx;
    }

    public /* synthetic */ Object get(int i) {
        return m32536b(i);
    }

    private Entry<V, K> m32536b(int i) {
        Entry entry = this.f27925a.f27924a.f27923b.f27918d[i];
        return mls.m32480a(entry.getValue(), entry.getKey());
    }

    mjk<Entry<V, K>> mo3870b() {
        return this.f27925a;
    }
}
