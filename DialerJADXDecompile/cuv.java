import android.app.Application;

/* compiled from: PG */
final class cuv implements cwl {
    private static cuv c;
    final cva a;
    final cuq b;
    private final cur d;
    private final cwj e;
    private boolean f;

    private cuv(cxc cxc, Application application, cuy cuy, cwj cwj) {
        buf.B((Object) cxc);
        buf.B((Object) application);
        this.b = new cuq(application);
        this.a = new cvg(cxc, cuy, cvf.b);
        this.d = new cur(new cuw(this), application);
        this.e = (cwj) buf.B((Object) cwj);
        cwj.a((cwl) this);
    }

    static synchronized cuv a(cxc cxc, Application application, cuy cuy) {
        cuv cuv;
        synchronized (cuv.class) {
            if (c == null) {
                c = new cuv(cxc, application, cuy, cwj.a);
            }
            cuv = c;
        }
        return cuv;
    }

    public final synchronized void a() {
        if (!(this.e.c || this.f)) {
            this.d.a();
            this.f = true;
        }
    }

    public final synchronized void a(cwj cwj) {
        if (cwj.c && this.f) {
            cur cur = this.d;
            cur.d.b(cur.e);
            cur.d.b(cur.f);
            this.f = false;
        }
    }
}
