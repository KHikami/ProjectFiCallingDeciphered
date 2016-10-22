package defpackage;

/* renamed from: aye */
final class aye<Z, R> {
    final ayc<Z, R> a;
    private final Class<Z> b;
    private final Class<R> c;

    aye(Class<Z> cls, Class<R> cls2, ayc<Z, R> ayc_Z__R) {
        this.b = cls;
        this.c = cls2;
        this.a = ayc_Z__R;
    }

    public boolean a(Class<?> cls, Class<?> cls2) {
        return this.b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.c);
    }
}
