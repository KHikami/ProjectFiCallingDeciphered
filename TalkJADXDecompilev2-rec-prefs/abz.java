package p000;

import java.util.ArrayList;

final class abz implements Runnable {
    final /* synthetic */ ArrayList f198a;
    final /* synthetic */ abw f199b;

    abz(abw abw, ArrayList arrayList) {
        this.f199b = abw;
        this.f198a = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.f198a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            aer aer = (aer) obj;
            abw abw = this.f199b;
            pn m = oa.m(aer.f438a);
            abw.f186d.add(aer);
            m.a(1.0f).a(abw.m326f()).a(new acb(abw, aer, m)).c();
        }
        this.f198a.clear();
        this.f199b.f183a.remove(this.f198a);
    }
}
