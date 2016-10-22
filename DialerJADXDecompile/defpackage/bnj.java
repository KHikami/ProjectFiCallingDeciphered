package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bnj */
final class bnj implements Callable {
    private /* synthetic */ bni a;

    bnj(bni bni) {
        this.a = bni;
    }

    private Void a() {
        bno bno = this.a.a;
        cqn.b();
        bno.o();
        bno.c("Sync dispatching local hits");
        long j = bno.g;
        if (!btq.a) {
            bno.c();
        }
        try {
            bno.d();
            bnp bnp = bno.f;
            bnp.a(bnp.g);
            bnp.g.l();
            bno.l();
            if (bno.g != j) {
                bno.c.c();
            }
        } catch (Throwable th) {
            bno.e("Sync local dispatch failed", th);
            bno.l();
        }
        return null;
    }

    public final /* synthetic */ Object call() {
        return a();
    }
}
