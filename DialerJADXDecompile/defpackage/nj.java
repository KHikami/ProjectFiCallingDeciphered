package defpackage;

import android.os.Build.VERSION;

/* compiled from: PG */
/* renamed from: nj */
public final class nj {
    public static final nm a;
    public final Object b;

    static {
        if (VERSION.SDK_INT >= 16) {
            a = new nn();
        } else if (VERSION.SDK_INT >= 15) {
            a = new nl();
        } else if (VERSION.SDK_INT >= 14) {
            a = new nk();
        } else {
            a = new nm();
        }
    }

    @Deprecated
    public nj(Object obj) {
        this.b = obj;
    }

    public final void a(boolean z) {
        a.d(this.b, z);
    }

    public final void a(int i) {
        a.b(this.b, i);
    }

    public final void b(int i) {
        a.a(this.b, i);
    }

    public final void c(int i) {
        a.e(this.b, i);
    }

    public final int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        nj njVar = (nj) obj;
        if (this.b == null) {
            if (njVar.b != null) {
                return false;
            }
            return true;
        } else if (this.b.equals(njVar.b)) {
            return true;
        } else {
            return false;
        }
    }
}
