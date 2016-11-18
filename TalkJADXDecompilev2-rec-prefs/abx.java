package p000;

import android.view.View;
import java.util.ArrayList;

final class abx implements Runnable {
    final /* synthetic */ ArrayList f194a;
    final /* synthetic */ abw f195b;

    abx(abw abw, ArrayList arrayList) {
        this.f195b = abw;
        this.f194a = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.f194a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            acg acg = (acg) arrayList.get(i);
            abw abw = this.f195b;
            aer aer = acg.f224a;
            int i3 = acg.f225b;
            int i4 = acg.f226c;
            int i5 = acg.f227d;
            int i6 = acg.f228e;
            View view = aer.f438a;
            i3 = i5 - i3;
            i4 = i6 - i4;
            if (i3 != 0) {
                oa.m(view).b(0.0f);
            }
            if (i4 != 0) {
                oa.m(view).c(0.0f);
            }
            pn m = oa.m(view);
            abw.f187e.add(aer);
            m.a(abw.m325e()).a(new acc(abw, aer, i3, i4, m)).c();
            i = i2;
        }
        this.f194a.clear();
        this.f195b.f184b.remove(this.f194a);
    }
}
