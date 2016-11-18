package p000;

import android.app.Application;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;

final class iwm extends ivw implements iyk {
    private static volatile iwm f19269d;
    private final boolean f19270e;
    private final int f19271f;
    private final AtomicBoolean f19272g = new AtomicBoolean();

    static iwm m23399a(izw izw, Application application, ixw ixw) {
        if (f19269d == null) {
            synchronized (iwm.class) {
                if (f19269d == null) {
                    f19269d = new iwm(izw, application, ixw.m12427c());
                }
            }
        }
        return f19269d;
    }

    private iwm(izw izw, Application application, float f) {
        super(izw, application, ixd.f19323a);
        boolean z = f > 0.0f && f <= 100.0f;
        ba.m4578a(z, (Object) "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.f19270e = new izv(f / 100.0f).m23611a();
        this.f19271f = (int) (100.0f / f);
    }

    UncaughtExceptionHandler m23401a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new iwo(this, uncaughtExceptionHandler);
    }

    public void mo3410c() {
        m23400b(2);
    }

    public void mo3411d() {
        m23400b(3);
    }

    void m23402a(int i) {
        ook ook = new ook();
        ook.h = new ooe();
        ook.h.b = Integer.valueOf(this.f19271f);
        ook.h.a = i;
        m23378a(null, ook, null);
    }

    protected void mo3409b() {
        if (this.f19272g.get() && (Thread.getDefaultUncaughtExceptionHandler() instanceof iwo)) {
            Thread.setDefaultUncaughtExceptionHandler(((iwo) Thread.getDefaultUncaughtExceptionHandler()).f19275a);
        }
    }

    private void m23400b(int i) {
        if (this.f19249a.m23425a() && this.f19270e) {
            ixx ixx = ixx.f19383c;
            ixx.m23473b().submit(new iwn(this, i));
            return;
        }
        new StringBuilder(55).append("Crash startup metric for event: ").append(i).append(" is dropped.");
    }
}
