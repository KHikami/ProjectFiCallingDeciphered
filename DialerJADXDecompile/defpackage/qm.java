package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: qm */
final class qm implements Runnable {
    private /* synthetic */ ql a;

    qm(ql qlVar) {
        this.a = qlVar;
    }

    public final void run() {
        ql qlVar;
        qv g;
        Bundle bundle;
        if ((this.a.w & 1) != 0) {
            qlVar = this.a;
            g = qlVar.g(0);
            if (g.h != null) {
                bundle = new Bundle();
                g.h.a(bundle);
                if (bundle.size() > 0) {
                    g.q = bundle;
                }
                g.h.d();
                g.h.clear();
            }
            g.p = true;
            g.o = true;
            if (qlVar.o != null) {
                g = qlVar.g(0);
                if (g != null) {
                    g.k = false;
                    qlVar.a(g, null);
                }
            }
        }
        if ((this.a.w & 4096) != 0) {
            qlVar = this.a;
            g = qlVar.g(108);
            if (g.h != null) {
                bundle = new Bundle();
                g.h.a(bundle);
                if (bundle.size() > 0) {
                    g.q = bundle;
                }
                g.h.d();
                g.h.clear();
            }
            g.p = true;
            g.o = true;
            if (qlVar.o != null) {
                g = qlVar.g(0);
                if (g != null) {
                    g.k = false;
                    qlVar.a(g, null);
                }
            }
        }
        this.a.v = false;
        this.a.w = 0;
    }
}
