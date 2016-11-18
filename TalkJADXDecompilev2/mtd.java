package defpackage;

final class mtd<V> extends mtb<V> {
    static final mtd<Object> a = new mtd(null);
    private final V b;

    mtd(V v) {
        this.b = v;
    }

    public V get() {
        return this.b;
    }
}
