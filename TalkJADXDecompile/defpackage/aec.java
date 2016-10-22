package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: aec */
public class aec {
    final /* synthetic */ RecyclerView a;

    public void a(aer aer) {
        boolean z;
        boolean z2 = true;
        aer.a(true);
        if (aer.g != null && aer.h == null) {
            aer.g = null;
        }
        aer.h = null;
        if ((aer.i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            RecyclerView recyclerView = this.a;
            View view = aer.a;
            recyclerView.e();
            boolean f = recyclerView.e.f(view);
            if (f) {
                aer d = RecyclerView.d(view);
                recyclerView.c.b(d);
                recyclerView.c.a(d);
            }
            if (f) {
                z2 = false;
            }
            recyclerView.b(z2);
            if (!f && aer.o()) {
                this.a.removeDetachedView(aer.a, false);
            }
        }
    }

    aec(RecyclerView recyclerView) {
        this.a = recyclerView;
    }
}
