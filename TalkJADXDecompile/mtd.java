final class mtd<V> extends mtb<V> {
    static final mtd<Object> a;
    private final V b;

    static {
        a = new mtd(null);
    }

    mtd(V v) {
        this.b = v;
    }

    public V get() {
        return this.b;
    }
}
