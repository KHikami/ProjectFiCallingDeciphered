package p000;

public final class oiv<T> implements oiu<T>, onc<T> {
    private static final Object f33048a = new Object();
    private volatile onc<T> f33049b;
    private volatile Object f33050c = f33048a;

    private oiv(onc<T> onc_T) {
        this.f33049b = onc_T;
    }

    public T mo4147a() {
        T t = this.f33050c;
        if (t == f33048a) {
            synchronized (this) {
                t = this.f33050c;
                if (t == f33048a) {
                    t = this.f33049b.a();
                    T t2 = this.f33050c;
                    if (t2 == f33048a || t2 == t) {
                        this.f33050c = t;
                        this.f33049b = null;
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

    public static <T> onc<T> m38518a(onc<T> onc_T) {
        bn.a(onc_T);
        return onc_T instanceof oiv ? onc_T : new oiv(onc_T);
    }

    public static <T> oiu<T> m38519b(onc<T> onc_T) {
        if (onc_T instanceof oiu) {
            return (oiu) onc_T;
        }
        return new oiv((onc) bn.a(onc_T));
    }
}
