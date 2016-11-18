package defpackage;

import android.os.Build.VERSION;
import android.view.View;

public final class rf {
    private static final ri a;
    private final Object b;

    static {
        if (VERSION.SDK_INT >= 16) {
            a = new rh((byte) 0);
        } else if (VERSION.SDK_INT >= 15) {
            a = new rh();
        } else if (VERSION.SDK_INT >= 14) {
            a = new rg();
        } else {
            a = new ri();
        }
    }

    @Deprecated
    public rf(Object obj) {
        this.b = obj;
    }

    public void a(View view) {
        a.a(this.b, view);
    }

    public void a(boolean z) {
        a.a(this.b, z);
    }

    public void a(int i) {
        a.b(this.b, i);
    }

    public void b(int i) {
        a.a(this.b, i);
    }

    public void c(int i) {
        a.e(this.b, i);
    }

    public void d(int i) {
        a.c(this.b, i);
    }

    public void e(int i) {
        a.d(this.b, i);
    }

    public void f(int i) {
        a.f(this.b, i);
    }

    public void g(int i) {
        a.g(this.b, i);
    }

    public int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        rf rfVar = (rf) obj;
        if (this.b == null) {
            if (rfVar.b != null) {
                return false;
            }
            return true;
        } else if (this.b.equals(rfVar.b)) {
            return true;
        } else {
            return false;
        }
    }
}
