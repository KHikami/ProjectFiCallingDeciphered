package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: yw */
public class yw {
    final /* synthetic */ RecyclerView a;

    public void a(zk zkVar) {
        boolean z;
        boolean z2 = true;
        zkVar.a(true);
        if (zkVar.g != null && zkVar.h == null) {
            zkVar.g = null;
        }
        zkVar.h = null;
        if ((zkVar.i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            RecyclerView recyclerView = this.a;
            View view = zkVar.a;
            recyclerView.b();
            wq wqVar = recyclerView.e;
            int a = wqVar.a.a(view);
            if (a == -1) {
                wqVar.b(view);
                z = true;
            } else if (wqVar.b.c(a)) {
                wqVar.b.d(a);
                wqVar.b(view);
                wqVar.a.a(a);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                zk b = RecyclerView.b(view);
                recyclerView.c.b(b);
                recyclerView.c.a(b);
            }
            if (z) {
                z2 = false;
            }
            recyclerView.a(z2);
            if (!z && zkVar.n()) {
                this.a.removeDetachedView(zkVar.a, false);
            }
        }
    }

    yw(RecyclerView recyclerView) {
        this.a = recyclerView;
    }
}
