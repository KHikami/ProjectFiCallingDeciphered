package defpackage;

public final class oiv<T> implements oiu<T>, onc<T> {
    private static final Object a = new Object();
    private volatile onc<T> b;
    private volatile Object c = a;

    private oiv(onc<T> onc_T) {
        this.b = onc_T;
    }

    public T a() {
        T t = this.c;
        if (t == a) {
            synchronized (this) {
                t = this.c;
                if (t == a) {
                    t = this.b.a();
                    T t2 = this.c;
                    if (t2 == a || t2 == t) {
                        this.c = t;
                        this.b = null;
                    } else {
                        String valueOf = String.valueOf(t2);
                        String valueOf2 = String.valueOf(t);
                        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 72) + String.valueOf(valueOf2).length()).append("Scoped provider was invoked recursively returning different results: ").append(valueOf).append(" & ").append(valueOf2).toString());
                    }
                }
            }
        }
        return t;
    }

    public static <T> onc<T> a(onc<T> onc_T) {
        bn.a(onc_T);
        return onc_T instanceof oiv ? onc_T : new oiv(onc_T);
    }

    public static <T> oiu<T> b(onc<T> onc_T) {
        if (onc_T instanceof oiu) {
            return (oiu) onc_T;
        }
        return new oiv((onc) bn.a(onc_T));
    }
}
