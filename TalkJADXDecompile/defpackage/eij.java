package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: eij */
final class eij implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ eih c;

    eij(eih eih, List list, int i) {
        this.c = eih;
        this.a = list;
        this.b = i;
    }

    public void run() {
        List arrayList = new ArrayList();
        for (String eic : this.a) {
            arrayList.add(new eic(eic, true));
        }
        this.c.a(this.b, arrayList);
    }
}
