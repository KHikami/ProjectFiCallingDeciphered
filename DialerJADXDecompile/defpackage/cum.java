package defpackage;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;

/* compiled from: PG */
/* renamed from: cum */
final class cum implements cwl {
    private static cum c;
    final cwr a;
    final cwj b;
    private final Application d;
    private final ActivityLifecycleCallbacks e;

    private cum(cwj cwj, Application application, cwr cwr, cva cva) {
        this.e = new cun(this);
        buf.B((Object) cva);
        this.b = (cwj) buf.B((Object) cwj);
        this.d = (Application) buf.B((Object) application);
        this.a = (cwr) buf.B((Object) cwr);
        this.a.b = new cwq((byte) 0);
        cwj.a((cwl) this);
    }

    static synchronized cum a(cxc cxc, Application application) {
        cum cum;
        synchronized (cum.class) {
            if (c == null) {
                c = new cum(cwj.a, application, new cwr(), new cvg(cxc, new cuo(), cvf.b));
            }
            cum = c;
        }
        return cum;
    }

    final synchronized void a() {
        boolean z = !this.b.c && this.b.d;
        if (this.a.a != z) {
            if (this.a.a) {
                this.d.unregisterActivityLifecycleCallbacks(this.e);
                this.a.b();
            } else {
                this.a.a();
                this.d.registerActivityLifecycleCallbacks(this.e);
            }
        }
    }

    public final void a(cwj cwj) {
        if (cwj.c) {
            this.a.b();
        }
        a();
    }
}
