package p000;

import java.util.Iterator;

public class gyn<T extends gyd> {
    final /* synthetic */ gye f16379a;

    public void m18963a(T t) {
        this.f16379a.f16368a = t;
        Iterator it = this.f16379a.f16370c.iterator();
        while (it.hasNext()) {
            ((gyi) it.next()).mo2417b();
        }
        this.f16379a.f16370c.clear();
        this.f16379a.f16369b = null;
    }

    gyn(gye gye) {
        this.f16379a = gye;
    }
}
