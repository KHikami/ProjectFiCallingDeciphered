package p000;

import android.app.Application;

abstract class ivw {
    final ixb f19249a;
    final Application f19250b;
    volatile boolean f19251c;

    abstract void mo3409b();

    protected ivw(izw izw, Application application, int i) {
        this(izw, application, i, Integer.MAX_VALUE);
    }

    protected ivw(izw izw, Application application, int i, int i2) {
        ba.m4536a((Object) izw);
        ba.m4536a((Object) application);
        this.f19250b = application;
        this.f19249a = new ixb(izw, ixe.m23428b(application), i, i2);
        iyn.f19402a.m23493a(new ivx(this));
    }

    protected boolean m23379a() {
        return this.f19251c;
    }

    protected final void m23378a(String str, ook ook, onw onw) {
        if (!iyn.f19402a.m23494a()) {
            this.f19249a.m23423a(str, ook, onw);
        }
    }
}
