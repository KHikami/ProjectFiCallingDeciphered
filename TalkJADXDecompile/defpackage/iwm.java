package defpackage;

import android.app.Application;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import ooe;
import ook;

/* renamed from: iwm */
final class iwm extends ivw implements iyk {
    private static volatile iwm d;
    private final boolean e;
    private final int f;
    private final AtomicBoolean g;

    static iwm a(izw izw, Application application, ixw ixw) {
        if (d == null) {
            synchronized (iwm.class) {
                if (d == null) {
                    d = new iwm(izw, application, ixw.c());
                }
            }
        }
        return d;
    }

    private iwm(izw izw, Application application, float f) {
        super(izw, application, ixd.a);
        this.g = new AtomicBoolean();
        boolean z = f > 0.0f && f <= 100.0f;
        ba.a(z, (Object) "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.e = new izv(f / 100.0f).a();
        this.f = (int) (100.0f / f);
    }

    UncaughtExceptionHandler a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new iwo(this, uncaughtExceptionHandler);
    }

    public void c() {
        b(2);
    }

    public void d() {
        b(3);
    }

    void a(int i) {
        ook ook = new ook();
        ook.h = new ooe();
        ook.h.b = Integer.valueOf(this.f);
        ook.h.a = i;
        a(null, ook, null);
    }

    protected void b() {
        if (this.g.get() && (Thread.getDefaultUncaughtExceptionHandler() instanceof iwo)) {
            Thread.setDefaultUncaughtExceptionHandler(((iwo) Thread.getDefaultUncaughtExceptionHandler()).a);
        }
    }

    private void b(int i) {
        if (this.a.a() && this.e) {
            ixx ixx = ixx.c;
            ixx.b().submit(new iwn(this, i));
            return;
        }
        new StringBuilder(55).append("Crash startup metric for event: ").append(i).append(" is dropped.");
    }
}
