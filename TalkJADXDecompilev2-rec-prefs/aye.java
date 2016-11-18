package p000;

final class aye<Z, R> {
    final ayc<Z, R> f2534a;
    private final Class<Z> f2535b;
    private final Class<R> f2536c;

    aye(Class<Z> cls, Class<R> cls2, ayc<Z, R> ayc_Z__R) {
        this.f2535b = cls;
        this.f2536c = cls2;
        this.f2534a = ayc_Z__R;
    }

    public boolean m4333a(Class<?> cls, Class<?> cls2) {
        return this.f2535b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f2536c);
    }
}
