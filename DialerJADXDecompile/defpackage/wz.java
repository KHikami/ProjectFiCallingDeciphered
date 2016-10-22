package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: wz */
final class wz implements Runnable {
    private /* synthetic */ ArrayList a;
    private /* synthetic */ ww b;

    wz(ww wwVar, ArrayList arrayList) {
        this.b = wwVar;
        this.a = arrayList;
    }

    public final void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            zk zkVar = (zk) it.next();
            yv yvVar = this.b;
            lv l = kn.l(zkVar.a);
            yvVar.d.add(zkVar);
            l.a(1.0f).a(yvVar.i).a(new xb(yvVar, zkVar, l)).b();
        }
        this.a.clear();
        this.b.a.remove(this.a);
    }
}
