package p000;

import android.os.Build.VERSION;

public final class qb {
    private static final qe f28986a;
    private final Object f28987b;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f28986a = new qd();
        } else if (i >= 20) {
            f28986a = new qc();
        } else {
            f28986a = new qe((byte) 0);
        }
    }

    qb(Object obj) {
        this.f28987b = obj;
    }

    public int m33676a() {
        return f28986a.b(this.f28987b);
    }

    public int m33678b() {
        return f28986a.d(this.f28987b);
    }

    public int m33679c() {
        return f28986a.c(this.f28987b);
    }

    public int m33680d() {
        return f28986a.a(this.f28987b);
    }

    public boolean m33681e() {
        return f28986a.e(this.f28987b);
    }

    public qb m33677a(int i, int i2, int i3, int i4) {
        return f28986a.a(this.f28987b, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qb qbVar = (qb) obj;
        if (this.f28987b != null) {
            return this.f28987b.equals(qbVar.f28987b);
        }
        if (qbVar.f28987b != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f28987b == null ? 0 : this.f28987b.hashCode();
    }

    static qb m33675a(Object obj) {
        return obj == null ? null : new qb(obj);
    }

    static Object m33674a(qb qbVar) {
        return qbVar == null ? null : qbVar.f28987b;
    }
}
