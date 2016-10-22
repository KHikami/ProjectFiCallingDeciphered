package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: dbi */
final class dbi extends dao {
    static final dbi a;
    private final transient Object[] b;
    private transient Object[] c;
    private final transient int d;
    private final transient int e;

    static {
        a = new dbi(daz.a, 0, null, 0);
    }

    dbi(Object[] objArr, int i, Object[] objArr2, int i2) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i2;
        this.e = i;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.c;
        if (obj == null || objArr == null) {
            return false;
        }
        int E = buf.E(obj);
        while (true) {
            E &= this.d;
            Object obj2 = objArr[E];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            E++;
        }
    }

    public final int size() {
        return this.b.length;
    }

    public final dbn b() {
        return das.a(this.b);
    }

    final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.b.length);
        return this.b.length + i;
    }

    final czt d() {
        if (this.c == null) {
            return dbg.a;
        }
        return new dba((czp) this, this.b);
    }

    public final int hashCode() {
        return this.e;
    }

    final boolean e() {
        return true;
    }

    public final /* synthetic */ Iterator iterator() {
        return das.a(this.b);
    }
}
