package defpackage;

import java.util.Iterator;

/* renamed from: gyn */
public class gyn<T extends gyd> {
    final /* synthetic */ gye a;

    public void a(T t) {
        this.a.a = t;
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((gyi) it.next()).b();
        }
        this.a.c.clear();
        this.a.b = null;
    }

    gyn(gye gye) {
        this.a = gye;
    }
}
