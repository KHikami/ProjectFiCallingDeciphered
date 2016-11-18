package defpackage;

final class mke<K, V> extends mkf<K, V> {
    private final transient mkd<K, V> c;

    mke(K k, V v, mkd<K, V> mkd_K__V, mkd<K, V> mkd_K__V2) {
        super(k, v, mkd_K__V);
        this.c = mkd_K__V2;
    }

    mkd<K, V> b() {
        return this.c;
    }
}
