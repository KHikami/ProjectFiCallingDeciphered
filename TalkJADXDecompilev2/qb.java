package defpackage;

import android.os.Build.VERSION;

public final class qb {
    private static final qe a;
    private final Object b;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            a = new qd();
        } else if (i >= 20) {
            a = new qc();
        } else {
            a = new qe((byte) 0);
        }
    }

    qb(Object obj) {
        this.b = obj;
    }

    public int a() {
        return a.b(this.b);
    }

    public int b() {
        return a.d(this.b);
    }

    public int c() {
        return a.c(this.b);
    }

    public int d() {
        return a.a(this.b);
    }

    public boolean e() {
        return a.e(this.b);
    }

    public qb a(int i, int i2, int i3, int i4) {
        return a.a(this.b, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qb qbVar = (qb) obj;
        if (this.b != null) {
            return this.b.equals(qbVar.b);
        }
        if (qbVar.b != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }

    static qb a(Object obj) {
        return obj == null ? null : new qb(obj);
    }

    static Object a(qb qbVar) {
        return qbVar == null ? null : qbVar.b;
    }
}
