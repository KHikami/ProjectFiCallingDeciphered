final class aze<T, R> {
    final Class<R> a;
    final aoa<T, R> b;
    private final Class<T> c;

    public aze(Class<T> cls, Class<R> cls2, aoa<T, R> aoa_T__R) {
        this.c = cls;
        this.a = cls2;
        this.b = aoa_T__R;
    }

    public boolean a(Class<?> cls, Class<?> cls2) {
        return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
    }
}
