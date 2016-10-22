import android.view.View;
import java.util.ArrayList;

final class aby implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ abw b;

    aby(abw abw, ArrayList arrayList) {
        this.b = abw;
        this.a = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            View view;
            int i2 = i + 1;
            acf acf = (acf) arrayList.get(i);
            abw abw = this.b;
            aer aer = acf.a;
            View view2 = aer == null ? null : aer.a;
            aer aer2 = acf.b;
            if (aer2 != null) {
                view = aer2.a;
            } else {
                view = null;
            }
            if (view2 != null) {
                pn a = oa.m(view2).a(abw.h());
                abw.g.add(acf.a);
                a.b((float) (acf.e - acf.c));
                a.c((float) (acf.f - acf.d));
                a.a(0.0f).a(new acd(abw, acf, a)).c();
            }
            if (view != null) {
                a = oa.m(view);
                abw.g.add(acf.b);
                a.b(0.0f).c(0.0f).a(abw.h()).a(1.0f).a(new ace(abw, acf, a, view)).c();
            }
            i = i2;
        }
        this.a.clear();
        this.b.c.remove(this.a);
    }
}
