package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: wy */
final class wy implements Runnable {
    private /* synthetic */ ArrayList a;
    private /* synthetic */ ww b;

    wy(ww wwVar, ArrayList arrayList) {
        this.b = wwVar;
        this.a = arrayList;
    }

    public final void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            View view;
            xf xfVar = (xf) it.next();
            yv yvVar = this.b;
            zk zkVar = xfVar.a;
            View view2 = zkVar == null ? null : zkVar.a;
            zk zkVar2 = xfVar.b;
            if (zkVar2 != null) {
                view = zkVar2.a;
            } else {
                view = null;
            }
            if (view2 != null) {
                lv a = kn.l(view2).a(yvVar.l);
                yvVar.g.add(xfVar.a);
                a.b((float) (xfVar.e - xfVar.c));
                a.c((float) (xfVar.f - xfVar.d));
                a.a(0.0f).a(new xd(yvVar, xfVar, a)).b();
            }
            if (view != null) {
                a = kn.l(view);
                yvVar.g.add(xfVar.b);
                a.b(0.0f).c(0.0f).a(yvVar.l).a(1.0f).a(new xe(yvVar, xfVar, a, view)).b();
            }
        }
        this.a.clear();
        this.b.c.remove(this.a);
    }
}
