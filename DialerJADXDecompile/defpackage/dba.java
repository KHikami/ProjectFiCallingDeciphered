package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: dba */
final class dba extends czk {
    private final czp a;
    private final czt b;

    public final /* synthetic */ ListIterator listIterator(int i) {
        return a(i);
    }

    private dba(czp czp, czt czt) {
        this.a = czp;
        this.b = czt;
    }

    final czp a() {
        return this.a;
    }

    public final dbo a(int i) {
        return this.b.a(i);
    }

    final int a(Object[] objArr, int i) {
        return this.b.a(objArr, i);
    }

    public final Object get(int i) {
        return this.b.get(i);
    }

    dba(czp czp, Object[] objArr) {
        this(czp, czt.b(objArr, objArr.length));
    }
}
