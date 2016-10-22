package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cuj */
final class cuj implements cwg {
    private static cuj d;
    final cva a;
    AtomicBoolean b;
    final Application c;
    private final boolean e;
    private final cvt f;

    private cuj(cxc cxc, cvt cvt, Application application) {
        boolean z = false;
        this.b = new AtomicBoolean(false);
        buf.B((Object) cxc);
        buf.B((Object) application);
        buf.B((Object) cvt);
        cvt.c();
        buf.c(true, (Object) "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.f = cvt;
        this.c = application;
        this.a = new cvg(cxc, cvt, cvf.a);
        cxb cxb = new cxb(1.0f);
        if (cxb.a == 1.0f || cxb.b.nextFloat() <= cxb.a) {
            z = true;
        }
        this.e = z;
    }

    static synchronized cuj a(cxc cxc, cvt cvt, Application application) {
        cuj cuj;
        synchronized (cuj.class) {
            if (d == null) {
                d = new cuj(cxc, cvt, application);
            }
            cuj = d;
        }
        return cuj;
    }

    public final void k_() {
        a(2);
    }

    public final void b() {
        a(3);
    }

    private final synchronized void a(int i) {
        if (this.a.a()) {
            if (this.e) {
                cvu cvu = cvu.c;
                cvu.a().submit(new cuk(this, i));
            } else {
                new StringBuilder(55).append("Crash startup metric for event: ").append(i).append(" is dropped.");
            }
        }
    }
}
