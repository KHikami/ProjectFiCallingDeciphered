package p000;

import android.os.Build.VERSION;
import android.view.View;

public final class rf {
    private static final ri f28996a;
    private final Object f28997b;

    static {
        if (VERSION.SDK_INT >= 16) {
            f28996a = new rh((byte) 0);
        } else if (VERSION.SDK_INT >= 15) {
            f28996a = new rh();
        } else if (VERSION.SDK_INT >= 14) {
            f28996a = new rg();
        } else {
            f28996a = new ri();
        }
    }

    @Deprecated
    public rf(Object obj) {
        this.f28997b = obj;
    }

    public void m33692a(View view) {
        f28996a.a(this.f28997b, view);
    }

    public void m33693a(boolean z) {
        f28996a.a(this.f28997b, z);
    }

    public void m33691a(int i) {
        f28996a.b(this.f28997b, i);
    }

    public void m33694b(int i) {
        f28996a.a(this.f28997b, i);
    }

    public void m33695c(int i) {
        f28996a.e(this.f28997b, i);
    }

    public void m33696d(int i) {
        f28996a.c(this.f28997b, i);
    }

    public void m33697e(int i) {
        f28996a.d(this.f28997b, i);
    }

    public void m33698f(int i) {
        f28996a.f(this.f28997b, i);
    }

    public void m33699g(int i) {
        f28996a.g(this.f28997b, i);
    }

    public int hashCode() {
        return this.f28997b == null ? 0 : this.f28997b.hashCode();
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
        if (this.f28997b == null) {
            if (rfVar.f28997b != null) {
                return false;
            }
            return true;
        } else if (this.f28997b.equals(rfVar.f28997b)) {
            return true;
        } else {
            return false;
        }
    }
}
