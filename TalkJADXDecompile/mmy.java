import java.util.Map.Entry;

final class mmy extends mjf<Entry<V, K>> {
    final /* synthetic */ mmx a;

    mmy(mmx mmx) {
        this.a = mmx;
    }

    public /* synthetic */ Object get(int i) {
        return b(i);
    }

    private Entry<V, K> b(int i) {
        Entry entry = this.a.a.b.d[i];
        return mls.a(entry.getValue(), entry.getKey());
    }

    mjk<Entry<V, K>> b() {
        return this.a;
    }
}
