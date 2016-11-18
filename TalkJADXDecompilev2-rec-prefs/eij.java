package p000;

import java.util.ArrayList;
import java.util.List;

final class eij implements Runnable {
    final /* synthetic */ List f11607a;
    final /* synthetic */ int f11608b;
    final /* synthetic */ eih f11609c;

    eij(eih eih, List list, int i) {
        this.f11609c = eih;
        this.f11607a = list;
        this.f11608b = i;
    }

    public void run() {
        List arrayList = new ArrayList();
        for (String eic : this.f11607a) {
            arrayList.add(new eic(eic, true));
        }
        this.f11609c.m13972a(this.f11608b, arrayList);
    }
}
