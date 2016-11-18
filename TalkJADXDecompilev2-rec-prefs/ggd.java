package p000;

import java.util.Iterator;

final class ggd implements Runnable {
    final /* synthetic */ String f15221a;
    final /* synthetic */ ggc f15222b;

    ggd(ggc ggc, String str) {
        this.f15222b = ggc;
        this.f15221a = str;
    }

    public void run() {
        Iterator it = ggc.f15219a.iterator();
        while (it.hasNext()) {
            ((gge) it.next()).m17637a(this.f15221a);
        }
    }
}
