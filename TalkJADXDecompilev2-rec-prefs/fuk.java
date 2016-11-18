package p000;

import android.widget.Toast;

final class fuk extends fip {
    final int f14031a;
    final boolean f14032b;
    final boolean f14033c;
    final czd f14034d;
    final /* synthetic */ fue f14035e;

    fuk(fue fue, int i, boolean z, boolean z2, czd czd) {
        this.f14035e = fue;
        this.f14031a = i;
        this.f14032b = z;
        this.f14033c = z2;
        this.f14034d = czd;
    }

    public final void mo610a(int i, bko bko, fiu fiu) {
        if (i == this.f14031a && (fiu.m15392c() instanceof ezu)) {
            this.f14035e.f14009b.mo2016b(this);
            this.f14035e.f14011d.mo534a(this.f14033c);
            this.f14034d.mo1484a();
            this.f14035e.f14010c = null;
        }
    }

    public final void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (i == this.f14031a) {
            this.f14035e.f14009b.mo2016b(this);
            this.f14035e.f14011d.mo534a(this.f14032b);
            Toast.makeText(this.f14035e.context, bc.f2939W, 0).show();
            this.f14034d.mo1484a();
            this.f14035e.f14010c = null;
        }
    }
}
