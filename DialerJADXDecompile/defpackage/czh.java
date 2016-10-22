package defpackage;

/* compiled from: PG */
/* renamed from: czh */
final class czh extends czg {
    czh() {
        super();
    }

    public final czg a(Comparable comparable, Comparable comparable2) {
        return czh.a(comparable.compareTo(comparable2));
    }

    public final czg a(int i, int i2) {
        return czh.a(buf.f(i, i2));
    }

    private static czg a(int i) {
        if (i < 0) {
            return czg.b;
        }
        if (i > 0) {
            return czg.c;
        }
        return czg.a;
    }

    public final int a() {
        return 0;
    }
}
