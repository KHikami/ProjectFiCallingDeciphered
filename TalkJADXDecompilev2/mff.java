package defpackage;

import java.util.Collection;

public final class mff {
    private static final meu a = meu.a(',');

    public static <T> mfe<T> a(T t) {
        if (t == null) {
            return mfi.IS_NULL.a();
        }
        return new mfh(t);
    }

    public static <T> mfe<T> a(Collection<? extends T> collection) {
        return new mfg(collection);
    }
}
