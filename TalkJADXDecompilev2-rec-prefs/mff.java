package p000;

import java.util.Collection;

public final class mff {
    private static final meu f27608a = meu.m31959a(',');

    public static <T> mfe<T> m31984a(T t) {
        if (t == null) {
            return mfi.IS_NULL.m31988a();
        }
        return new mfh(t);
    }

    public static <T> mfe<T> m31985a(Collection<? extends T> collection) {
        return new mfg(collection);
    }
}
