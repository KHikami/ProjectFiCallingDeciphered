package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: dbg */
final class dbg extends czt {
    static final czt a;
    private final transient int b;
    private final transient int c;
    private final transient Object[] d;

    public final /* synthetic */ ListIterator listIterator(int i) {
        return a(i);
    }

    static {
        a = new dbg(daz.a);
    }

    private dbg(Object[] objArr, int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = objArr;
    }

    dbg(Object[] objArr) {
        this(objArr, 0, objArr.length);
    }

    public final int size() {
        return this.c;
    }

    final int a(Object[] objArr, int i) {
        System.arraycopy(this.d, this.b, objArr, i, this.c);
        return this.c + i;
    }

    public final Object get(int i) {
        cob.b(i, this.c);
        return this.d[this.b + i];
    }

    final czt b(int i, int i2) {
        return new dbg(this.d, this.b + i, i2 - i);
    }

    public final dbo a(int i) {
        return das.a(this.d, this.b, this.c, i);
    }
}
