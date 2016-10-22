import android.app.Application;

abstract class ivw {
    final ixb a;
    final Application b;
    volatile boolean c;

    abstract void b();

    protected ivw(izw izw, Application application, int i) {
        this(izw, application, i, Integer.MAX_VALUE);
    }

    protected ivw(izw izw, Application application, int i, int i2) {
        ba.a((Object) izw);
        ba.a((Object) application);
        this.b = application;
        this.a = new ixb(izw, ixe.b(application), i, i2);
        iyn.a.a(new ivx(this));
    }

    protected boolean a() {
        return this.c;
    }

    protected final void a(String str, ook ook, onw onw) {
        if (!iyn.a.a()) {
            this.a.a(str, ook, onw);
        }
    }
}
