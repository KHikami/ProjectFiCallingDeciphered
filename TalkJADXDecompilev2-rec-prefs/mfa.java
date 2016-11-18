package p000;

import java.io.Serializable;

public abstract class mfa<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public abstract T mo3732a(T t);

    public abstract boolean mo3733a();

    public abstract T mo3734b();

    public static <T> mfa<T> m31910b(T t) {
        return new mfn(bm.m6122a((Object) t));
    }

    public static <T> mfa<T> m31911c(T t) {
        if (t == null) {
            return mdv.f27537a;
        }
        return new mfn(t);
    }

    mfa() {
    }
}
