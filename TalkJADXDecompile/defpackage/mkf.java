package defpackage;

/* renamed from: mkf */
class mkf<K, V> extends mkd<K, V> {
    private final transient mkd<K, V> c;

    mkf(K k, V v, mkd<K, V> mkd_K__V) {
        super(k, v);
        this.c = mkd_K__V;
    }

    final mkd<K, V> a() {
        return this.c;
    }

    final boolean c() {
        return false;
    }
}
