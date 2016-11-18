package p000;

import android.view.View;
import java.util.ArrayList;

final class aby implements Runnable {
    final /* synthetic */ ArrayList f196a;
    final /* synthetic */ abw f197b;

    aby(abw abw, ArrayList arrayList) {
        this.f197b = abw;
        this.f196a = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.f196a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            View view;
            int i2 = i + 1;
            acf acf = (acf) arrayList.get(i);
            abw abw = this.f197b;
            aer aer = acf.f218a;
            View view2 = aer == null ? null : aer.f438a;
            aer aer2 = acf.f219b;
            if (aer2 != null) {
                view = aer2.f438a;
            } else {
                view = null;
            }
            if (view2 != null) {
                pn a = oa.m(view2).a(abw.m330h());
                abw.f189g.add(acf.f218a);
                a.b((float) (acf.f222e - acf.f220c));
                a.c((float) (acf.f223f - acf.f221d));
                a.a(0.0f).a(new acd(abw, acf, a)).c();
            }
            if (view != null) {
                a = oa.m(view);
                abw.f189g.add(acf.f219b);
                a.b(0.0f).c(0.0f).a(abw.m330h()).a(1.0f).a(new ace(abw, acf, a, view)).c();
            }
            i = i2;
        }
        this.f196a.clear();
        this.f197b.f185c.remove(this.f196a);
    }
}
