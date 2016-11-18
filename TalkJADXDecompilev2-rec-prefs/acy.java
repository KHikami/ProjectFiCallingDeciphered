package p000;

import android.view.View;

final class acy {
    int f309a;
    int f310b;
    boolean f311c;
    boolean f312d;
    final /* synthetic */ acx f313e;

    acy(acx acx) {
        this.f313e = acx;
        m638a();
    }

    void m638a() {
        this.f309a = -1;
        this.f310b = nzf.UNSET_ENUM_VALUE;
        this.f311c = false;
        this.f312d = false;
    }

    void m640b() {
        int d;
        if (this.f311c) {
            d = this.f313e.f270j.mo93d();
        } else {
            d = this.f313e.f270j.mo91c();
        }
        this.f310b = d;
    }

    public String toString() {
        return "AnchorInfo{mPosition=" + this.f309a + ", mCoordinate=" + this.f310b + ", mLayoutFromEnd=" + this.f311c + ", mValid=" + this.f312d + '}';
    }

    public void m639a(View view) {
        int b = this.f313e.f270j.m694b();
        if (b >= 0) {
            m641b(view);
            return;
        }
        this.f309a = this.f313e.m468d(view);
        int e;
        if (this.f311c) {
            b = (this.f313e.f270j.mo93d() - b) - this.f313e.f270j.mo90b(view);
            this.f310b = this.f313e.f270j.mo93d() - b;
            if (b > 0) {
                e = this.f310b - this.f313e.f270j.mo96e(view);
                int c = this.f313e.f270j.mo91c();
                e -= c + Math.min(this.f313e.f270j.mo88a(view) - c, 0);
                if (e < 0) {
                    this.f310b = Math.min(b, -e) + this.f310b;
                    return;
                }
                return;
            }
            return;
        }
        e = this.f313e.f270j.mo88a(view);
        c = e - this.f313e.f270j.mo91c();
        this.f310b = e;
        if (c > 0) {
            b = (this.f313e.f270j.mo93d() - Math.min(0, (this.f313e.f270j.mo93d() - b) - this.f313e.f270j.mo90b(view))) - (e + this.f313e.f270j.mo96e(view));
            if (b < 0) {
                this.f310b -= Math.min(c, -b);
            }
        }
    }

    public void m641b(View view) {
        if (this.f311c) {
            this.f310b = this.f313e.f270j.mo90b(view) + this.f313e.f270j.m694b();
        } else {
            this.f310b = this.f313e.f270j.mo88a(view);
        }
        this.f309a = this.f313e.m468d(view);
    }
}
