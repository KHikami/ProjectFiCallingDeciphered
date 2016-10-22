package defpackage;

import java.io.Serializable;

/* renamed from: mfa */
public abstract class mfa<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public abstract T a(T t);

    public abstract boolean a();

    public abstract T b();

    public static <T> mfa<T> b(T t) {
        return new mfn(bm.a((Object) t));
    }

    public static <T> mfa<T> c(T t) {
        if (t == null) {
            return mdv.a;
        }
        return new mfn(t);
    }

    mfa() {
    }
}
