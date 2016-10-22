import android.app.Application;
import android.os.Build.VERSION;
import android.util.Log;

/* compiled from: PG */
final class cvo implements cvn {
    final cxc a;
    final Application b;
    final cwj c;
    final cvt d;
    final cwb e;
    private cvz f;
    private cwi g;

    static {
        buf.B(Integer.valueOf(buf.mf));
    }

    cvo(Application application, cxc cxc, cvr cvr, cwj cwj) {
        buf.B((Object) cvr);
        cvz cvz = cvr.a;
        buf.c(true);
        cwi cwi = cvr.b;
        buf.c(true);
        cvt cvt = cvr.c;
        buf.c(true);
        cwa cwa = cvr.d;
        buf.c(true);
        cvy cvy = cvr.f;
        buf.c(true);
        this.a = (cxc) buf.B((Object) cxc);
        this.b = (Application) buf.B((Object) application);
        this.f = cvr.a;
        this.g = cvr.b;
        this.d = cvr.c;
        this.e = cvr.e;
        this.c = (cwj) buf.B((Object) cwj);
        if (d()) {
            if (cwj.e.compareAndSet(false, true) && cwj.a(application, "primes::shutdown_primes", false)) {
                cwj.a();
            }
            if (!cwj.c) {
                Object obj = this.b;
                if (cvh.a == null) {
                    buf.B(obj);
                    cvh.a = new cvh(obj);
                }
                cvu cvu = cvu.c;
                cvu.a().submit(new cvp(this));
            }
        }
    }

    static cvo a(Application application, i iVar, cvr cvr) {
        return new cvo(application, buf.a(iVar, new cxe(), new cxf(), 1000, 100), cvr, cwj.a);
    }

    public final synchronized void a() {
        if (c() && this.f.a()) {
            cvz.c();
            cuv.a(this.a, this.b, this.f).a();
        }
    }

    public final synchronized void a(cwn cwn, String str) {
        if (c() && this.g.a() && cwn != null && !cwn.equals(cwn.c)) {
            cwp a = cwp.a(this.a, this.g);
            if (!(cwn == null || cwn == cwn.c || str == null || str.isEmpty())) {
                cwn.b = buf.E();
                if (a.a.a()) {
                    cva cva = a.a;
                    dlo dlo = new dlo();
                    dlo.a = Long.valueOf(cwn.b - cwn.a);
                    dln dln = new dln();
                    dln.d = dlo;
                    cva.a(str, dln);
                }
            }
        }
    }

    public final void b() {
        if (c() && this.d.a()) {
            cuj a = cuj.a(this.a, this.d, this.b);
            if (a.b.compareAndSet(false, true)) {
                Thread.setDefaultUncaughtExceptionHandler(new cul(a, Thread.getDefaultUncaughtExceptionHandler()));
            }
        }
    }

    private static boolean d() {
        if (VERSION.SDK_INT >= 16) {
            return true;
        }
        Log.w("Primes", "Primes calls will be ignored. API's < 16 are not supported.");
        return false;
    }

    public final boolean c() {
        return !this.c.c && d();
    }
}
