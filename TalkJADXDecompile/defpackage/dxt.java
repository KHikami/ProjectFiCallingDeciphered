package defpackage;

import java.util.ArrayList;

/* renamed from: dxt */
final class dxt implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ dxr c;

    dxt(dxr dxr, int i, ArrayList arrayList) {
        this.c = dxr;
        this.a = i;
        this.b = arrayList;
    }

    public void run() {
        fme a = ((fmf) jyn.a(this.c.c, fmf.class)).a();
        this.c.a(a);
        ((fit) jyn.a(this.c.c, fit.class)).a(a, fde.e(this.a), this.b, null, true);
    }
}
