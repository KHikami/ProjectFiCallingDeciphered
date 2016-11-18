package p000;

public final class ojb<T> implements oiu<T>, onc<T> {
    private static final Object f33059a = new Object();
    private volatile onc<T> f33060b;
    private volatile Object f33061c = f33059a;

    private ojb(onc<T> onc_T) {
        this.f33060b = onc_T;
    }

    public T mo4147a() {
        onc onc = this.f33060b;
        if (this.f33061c == f33059a) {
            this.f33061c = onc.a();
            this.f33060b = null;
        }
        return this.f33061c;
    }

    public static <T> onc<T> m38532a(onc<T> onc_T) {
        return ((onc_T instanceof ojb) || (onc_T instanceof oiv)) ? onc_T : new ojb((onc) bn.a(onc_T));
    }
}
