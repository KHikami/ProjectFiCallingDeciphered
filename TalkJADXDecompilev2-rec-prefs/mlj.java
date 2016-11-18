package p000;

import java.util.Collection;
import java.util.Iterator;

public final class mlj {
    static final mnz<Object> f27882a = new mlk();
    private static final Iterator<Object> f27883b = new mln();

    public static <T> mny<T> m32459a(Iterator<? extends T> it) {
        bm.m6122a((Object) it);
        if (it instanceof mny) {
            return (mny) it;
        }
        return new mlo(it);
    }

    public static boolean m32463a(Iterator<?> it, Object obj) {
        Object a = mff.m31984a(obj);
        bm.m6123a(a, (Object) "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (a.mo3735a(it.next())) {
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

    public static boolean m32464a(Iterator<?> it, Collection<?> collection) {
        Object a = mff.m31985a((Collection) collection);
        bm.m6122a(a);
        boolean z = false;
        while (it.hasNext()) {
            if (a.mo3735a(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean m32465a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return false;
            }
            if (!mez.m31976b(it.next(), it2.next())) {
                return false;
            }
        }
        if (it2.hasNext()) {
            return false;
        }
        return true;
    }

    public static String m32467b(Iterator<?> it) {
        return miv.f27802a.m31964a(new StringBuilder("["), (Iterator) it).append(']').toString();
    }

    public static <T> T m32468c(Iterator<T> it) {
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

    public static <T> boolean m32462a(Collection<T> collection, Iterator<? extends T> it) {
        bm.m6122a((Object) collection);
        bm.m6122a((Object) it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static <F, T> Iterator<T> m32457a(Iterator<F> it, met<? super F, ? extends T> met__super_F___extends_T) {
        bm.m6122a((Object) met__super_F___extends_T);
        return new mlp(it, met__super_F___extends_T);
    }

    public static <T> T m32466b(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    static void m32469d(Iterator<?> it) {
        bm.m6122a((Object) it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @SafeVarargs
    public static <T> mny<T> m32460a(T... tArr) {
        return mlj.m32461a(tArr, 0, tArr.length, 0);
    }

    static <T> mnz<T> m32461a(T[] tArr, int i, int i2, int i3) {
        bm.m6137a(i2 >= 0);
        bm.m6127a(i, i + i2, tArr.length);
        bm.m6146b(i3, i2);
        if (i2 == 0) {
            return f27882a;
        }
        return new mll(i2, i3, tArr, i);
    }

    public static <T> mny<T> m32458a(T t) {
        return new mlm(t);
    }

    public static <T> mmt<T> m32470e(Iterator<? extends T> it) {
        if (it instanceof mlq) {
            return (mlq) it;
        }
        return new mlq(it);
    }
}
