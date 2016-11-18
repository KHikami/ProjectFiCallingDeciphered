package p000;

import android.content.Context;

public abstract class fje extends fip {
    private final Context f4205a;
    private int f4206b;

    public abstract void mo651a(fiu fiu);

    public fje(Context context) {
        this.f4205a = context;
    }

    public final void m6420d() {
        ((fit) jyn.m25426a(this.f4205a, fit.class)).mo2016b(this);
    }

    public final void m6418a(fme fme) {
        this.f4206b = fme.m15674a();
        if (this.f4206b >= 0) {
            ((fit) jyn.m25426a(this.f4205a, fit.class)).mo2007a(this);
        }
    }

    public final void mo610a(int i, bko bko, fiu fiu) {
        if (this.f4206b == i) {
            m6420d();
            mo651a(fiu);
        }
    }

    public final void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (this.f4206b == i) {
            m6420d();
            mo652a((Exception) fdo);
        }
    }

    public void mo652a(Exception exception) {
    }
}
