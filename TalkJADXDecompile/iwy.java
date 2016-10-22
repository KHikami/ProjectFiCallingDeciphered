import android.app.Application;

final class iwy extends ivw {
    private static volatile iwy e;
    final boolean d;
    private iwt f;

    static iwy a(izw izw, Application application, ixa ixa) {
        if (e == null) {
            synchronized (iwy.class) {
                if (e == null) {
                    e = new iwy(izw, application, ixa.b(), false);
                }
            }
        }
        return e;
    }

    private iwy(izw izw, Application application, int i, boolean z) {
        super(izw, application, ixd.a, i);
        this.d = z;
    }

    synchronized void c() {
        if (!a() && this.f == null) {
            this.f = new iwt(new iwx(this), this.b);
            this.f.a();
        }
    }

    protected synchronized void b() {
        if (this.f != null) {
            this.f.b();
            this.f = null;
        }
    }

    void a(String str, onw onw) {
        a(str, 0, null, onw);
    }

    void a(String str, int i, String str2, onw onw) {
        if (this.a.a()) {
            ixx ixx = ixx.c;
            ixx.b().submit(new iwz(this, str, i, str2, onw));
        }
    }
}
