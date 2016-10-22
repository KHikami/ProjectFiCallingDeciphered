package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: das */
public final class das {
    private static dbo a;

    static {
        a = new dat();
        daw daw = new daw();
    }

    public static boolean a(Iterator it, Object obj) {
        Object a = cyo.a(obj);
        cob.b(a, (Object) "predicate");
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

    public static boolean a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return false;
            }
            if (!cob.a(it.next(), it2.next())) {
                return false;
            }
        }
        if (it2.hasNext()) {
            return false;
        }
        return true;
    }

    public static String a(Iterator it) {
        return czf.a.a(new StringBuilder("["), it).append(']').toString();
    }

    public static Iterator a(Iterator it, cyh cyh) {
        cob.i((Object) cyh);
        return new dax(it, cyh);
    }

    @SafeVarargs
    public static dbn a(Object... objArr) {
        return das.a(objArr, 0, objArr.length, 0);
    }

    static dbo a(Object[] objArr, int i, int i2, int i3) {
        cob.a(i2 >= 0);
        cob.b(i, i + i2, objArr.length);
        cob.c(i3, i2);
        if (i2 == 0) {
            return a;
        }
        return new dau(i2, i3, objArr, i);
    }

    public static dbn a(Object obj) {
        return new dav(obj);
    }
}
