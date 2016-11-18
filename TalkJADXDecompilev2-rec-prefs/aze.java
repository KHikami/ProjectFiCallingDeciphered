package p000;

final class aze<T, R> {
    final Class<R> f2581a;
    final aoa<T, R> f2582b;
    private final Class<T> f2583c;

    public aze(Class<T> cls, Class<R> cls2, aoa<T, R> aoa_T__R) {
        this.f2583c = cls;
        this.f2581a = cls2;
        this.f2582b = aoa_T__R;
    }

    public boolean m4411a(Class<?> cls, Class<?> cls2) {
        return this.f2583c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f2581a);
    }
}
