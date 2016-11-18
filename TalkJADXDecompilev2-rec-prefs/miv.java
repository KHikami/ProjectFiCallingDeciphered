package p000;

import java.util.Collection;

public final class miv {
    static final meu f27802a = meu.m31960a(", ").mo3741b("null");

    static boolean m32230a(Collection<?> collection, Object obj) {
        boolean z = false;
        bm.m6122a((Object) collection);
        try {
            z = collection.contains(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return z;
    }

    static StringBuilder m32228a(int i) {
        gwb.m2121d(i, "size");
        return new StringBuilder((int) Math.min(((long) i) << 3, 1073741824));
    }

    public static <T> Collection<T> m32229a(Iterable<T> iterable) {
        return (Collection) iterable;
    }
}
