package p000;

import java.util.ArrayList;

final class dxt implements Runnable {
    final /* synthetic */ int f10777a;
    final /* synthetic */ ArrayList f10778b;
    final /* synthetic */ dxr f10779c;

    dxt(dxr dxr, int i, ArrayList arrayList) {
        this.f10779c = dxr;
        this.f10777a = i;
        this.f10778b = arrayList;
    }

    public void run() {
        fme a = ((fmf) jyn.m25426a(this.f10779c.f10772c, fmf.class)).mo2035a();
        this.f10779c.m6418a(a);
        ((fit) jyn.m25426a(this.f10779c.f10772c, fit.class)).mo2010a(a, fde.m15018e(this.f10777a), this.f10778b, null, true);
    }
}
