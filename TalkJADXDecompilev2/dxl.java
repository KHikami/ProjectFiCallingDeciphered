package defpackage;

import java.util.ArrayList;

final class dxl implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ dxk c;

    dxl(dxk dxk, int i, ArrayList arrayList) {
        this.c = dxk;
        this.a = i;
        this.b = arrayList;
    }

    public void run() {
        fme a = ((fmf) jyn.a(this.c.b.d, fmf.class)).a();
        this.c.a(a);
        ((fit) jyn.a(this.c.b.d, fit.class)).a(a, fde.e(this.a), this.b, null, true);
    }
}
