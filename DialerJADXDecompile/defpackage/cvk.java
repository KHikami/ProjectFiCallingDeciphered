package defpackage;

import android.app.Application;

/* compiled from: PG */
/* renamed from: cvk */
final class cvk implements cue, cwg {
    final Application a;
    final cva b;
    private final cug c;

    cvk(Application application, cxc cxc, cuy cuy) {
        this.a = application;
        this.c = cug.a(application);
        this.b = new cvg(cxc, cuy, cvf.a);
    }

    public final void k_() {
        this.c.a((ctw) this);
    }

    public final void b() {
    }

    public final void a() {
        this.c.b(this);
        cvu cvu = cvu.c;
        cvu.a().submit(new cvl(this));
    }
}
