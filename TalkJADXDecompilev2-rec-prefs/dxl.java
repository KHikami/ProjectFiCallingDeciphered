package p000;

import java.util.ArrayList;

final class dxl implements Runnable {
    final /* synthetic */ int f10762a;
    final /* synthetic */ ArrayList f10763b;
    final /* synthetic */ dxk f10764c;

    dxl(dxk dxk, int i, ArrayList arrayList) {
        this.f10764c = dxk;
        this.f10762a = i;
        this.f10763b = arrayList;
    }

    public void run() {
        fme a = ((fmf) jyn.m25426a(this.f10764c.f10760b.f10714d, fmf.class)).mo2035a();
        this.f10764c.m6418a(a);
        ((fit) jyn.m25426a(this.f10764c.f10760b.f10714d, fit.class)).mo2010a(a, fde.m15018e(this.f10762a), this.f10763b, null, true);
    }
}
