package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: mlj */
public final class mlj {
    static final mnz<Object> a;
    private static final Iterator<Object> b;

    static {
        a = new mlk();
        b = new mln();
    }

    public static <T> mny<T> a(Iterator<? extends T> it) {
        bm.a((Object) it);
        if (it instanceof mny) {
            return (mny) it;
        }
        return new mlo(it);
    }

    public static boolean a(Iterator<?> it, Object obj) {
        Object a = mff.a(obj);
        bm.a(a, (Object) "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (a.a(it.next())) {
                break;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return true;
        }
        return false;
    }

    public static boolean a(Iterator<?> it, Collection<?> collection) {
        Object a = mff.a((Collection) collection);
        bm.a(a);
        boolean z = false;
        while (it.hasNext()) {
            if (a.a(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return false;
            }
            if (!mez.b(it.next(), it2.next())) {
                return false;
            }
        }
        if (it2.hasNext()) {
            return false;
        }
        return true;
    }

    public static String b(Iterator<?> it) {
        return miv.a.a(new StringBuilder("["), (Iterator) it).append(']').toString();
    }

    public static <T> T c(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder append = new StringBuilder("expected one element but was: <").append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            append.append(", ").append(it.next());
        }
        if (it.hasNext()) {
            append.append(", ...");
        }
        append.append('>');
        throw new IllegalArgumentException(append.toString());
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        bm.a((Object) collection);
        bm.a((Object) it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static <F, T> Iterator<T> a(Iterator<F> it, met<? super F, ? extends T> met__super_F___extends_T) {
        bm.a((Object) met__super_F___extends_T);
        return new mlp(it, met__super_F___extends_T);
    }

    public static <T> T b(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    static void d(Iterator<?> it) {
        bm.a((Object) it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @SafeVarargs
    public static <T> mny<T> a(T... tArr) {
        return mlj.a(tArr, 0, tArr.length, 0);
    }

    static <T> mnz<T> a(T[] tArr, int i, int i2, int i3) {
        bm.a(i2 >= 0);
        bm.a(i, i + i2, tArr.length);
        bm.b(i3, i2);
        if (i2 == 0) {
            return a;
        }
        return new mll(i2, i3, tArr, i);
    }

    public static <T> mny<T> a(T t) {
        return new mlm(t);
    }

    public static <T> mmt<T> e(Iterator<? extends T> it) {
        if (it instanceof mlq) {
            return (mlq) it;
        }
        return new mlq(it);
    }
}
