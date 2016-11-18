package defpackage;

public final class ojb<T> implements oiu<T>, onc<T> {
    private static final Object a = new Object();
    private volatile onc<T> b;
    private volatile Object c = a;

    private ojb(onc<T> onc_T) {
        this.b = onc_T;
    }

    public T a() {
        onc onc = this.b;
        if (this.c == a) {
            this.c = onc.a();
            this.b = null;
        }
        return this.c;
    }

    public static <T> onc<T> a(onc<T> onc_T) {
        return ((onc_T instanceof ojb) || (onc_T instanceof oiv)) ? onc_T : new ojb((onc) bn.a(onc_T));
    }
}
