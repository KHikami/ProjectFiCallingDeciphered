package p000;

import java.util.ArrayList;

final class dxs implements Runnable {
    final /* synthetic */ int f10774a;
    final /* synthetic */ ArrayList f10775b;
    final /* synthetic */ dxr f10776c;

    dxs(dxr dxr, int i, ArrayList arrayList) {
        this.f10776c = dxr;
        this.f10774a = i;
        this.f10775b = arrayList;
    }

    public void run() {
        fme a = ((fmf) jyn.m25426a(this.f10776c.f10772c, fmf.class)).mo2035a();
        this.f10776c.m6418a(a);
        ((fit) jyn.m25426a(this.f10776c.f10772c, fit.class)).mo2010a(a, fde.m15018e(this.f10774a), this.f10775b, null, true);
    }
}
