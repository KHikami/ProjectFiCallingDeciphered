import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
final class wx implements Runnable {
    private /* synthetic */ ArrayList a;
    private /* synthetic */ ww b;

    wx(ww wwVar, ArrayList arrayList) {
        this.b = wwVar;
        this.a = arrayList;
    }

    public final void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            xg xgVar = (xg) it.next();
            yv yvVar = this.b;
            zk zkVar = xgVar.a;
            int i = xgVar.b;
            int i2 = xgVar.c;
            int i3 = xgVar.d;
            int i4 = xgVar.e;
            View view = zkVar.a;
            i = i3 - i;
            i2 = i4 - i2;
            if (i != 0) {
                kn.l(view).b(0.0f);
            }
            if (i2 != 0) {
                kn.l(view).c(0.0f);
            }
            lv l = kn.l(view);
            yvVar.e.add(zkVar);
            l.a(yvVar.k).a(new xc(yvVar, zkVar, i, i2, l)).b();
        }
        this.a.clear();
        this.b.b.remove(this.a);
    }
}
