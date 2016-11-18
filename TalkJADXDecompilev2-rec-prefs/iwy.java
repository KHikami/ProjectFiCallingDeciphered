package p000;

import android.app.Application;

final class iwy extends ivw {
    private static volatile iwy f19306e;
    final boolean f19307d;
    private iwt f19308f;

    static iwy m23416a(izw izw, Application application, ixa ixa) {
        if (f19306e == null) {
            synchronized (iwy.class) {
                if (f19306e == null) {
                    f19306e = new iwy(izw, application, ixa.mo1636b(), false);
                }
            }
        }
        return f19306e;
    }

    private iwy(izw izw, Application application, int i, boolean z) {
        super(izw, application, ixd.f19323a, i);
        this.f19307d = z;
    }

    synchronized void m23420c() {
        if (!m23379a() && this.f19308f == null) {
            this.f19308f = new iwt(new iwx(this), this.f19250b);
            this.f19308f.m23412a();
        }
    }

    protected synchronized void mo3409b() {
        if (this.f19308f != null) {
            this.f19308f.m23413b();
            this.f19308f = null;
        }
    }

    void m23418a(String str, onw onw) {
        m23417a(str, 0, null, onw);
    }

    void m23417a(String str, int i, String str2, onw onw) {
        if (this.f19249a.m23425a()) {
            ixx ixx = ixx.f19383c;
            ixx.m23473b().submit(new iwz(this, str, i, str2, onw));
        }
    }
}
