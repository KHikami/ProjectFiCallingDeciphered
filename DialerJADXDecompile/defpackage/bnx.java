package defpackage;

import android.content.ComponentName;

/* renamed from: bnx */
final class bnx implements Runnable {
    private /* synthetic */ ComponentName a;
    private /* synthetic */ bnv b;

    bnx(bnv bnv, ComponentName componentName) {
        this.b = bnv;
        this.a = componentName;
    }

    public final void run() {
        bno bno = this.b.a;
        ComponentName componentName = this.a;
        cqn.b();
        if (bno.b != null) {
            bno.b = null;
            bno.a("Disconnected from device AnalyticsService", componentName);
            bni c = bno.f.c();
            c.o();
            cqn.b();
            bob bob = c.a;
            cqn.b();
            bob.o();
            bob.b("Service disconnected");
        }
    }
}
