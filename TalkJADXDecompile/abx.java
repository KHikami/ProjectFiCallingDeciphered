import android.view.View;
import java.util.ArrayList;

final class abx implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ abw b;

    abx(abw abw, ArrayList arrayList) {
        this.b = abw;
        this.a = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            acg acg = (acg) arrayList.get(i);
            abw abw = this.b;
            aer aer = acg.a;
            int i3 = acg.b;
            int i4 = acg.c;
            int i5 = acg.d;
            int i6 = acg.e;
            View view = aer.a;
            i3 = i5 - i3;
            i4 = i6 - i4;
            if (i3 != 0) {
                oa.m(view).b(0.0f);
            }
            if (i4 != 0) {
                oa.m(view).c(0.0f);
            }
            pn m = oa.m(view);
            abw.e.add(aer);
            m.a(abw.e()).a(new acc(abw, aer, i3, i4, m)).c();
            i = i2;
        }
        this.a.clear();
        this.b.b.remove(this.a);
    }
}
