package defpackage;

/* renamed from: aza */
final class aza<T> {
    final ant<T> a;
    private final Class<T> b;

    public aza(Class<T> cls, ant<T> ant_T) {
        this.b = cls;
        this.a = ant_T;
    }

    public boolean a(Class<?> cls) {
        return this.b.isAssignableFrom(cls);
    }
}
