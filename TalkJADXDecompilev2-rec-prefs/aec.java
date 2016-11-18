package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class aec {
    final /* synthetic */ RecyclerView f381a;

    public void m779a(aer aer) {
        boolean z;
        boolean z2 = true;
        aer.m859a(true);
        if (aer.f444g != null && aer.f445h == null) {
            aer.f444g = null;
        }
        aer.f445h = null;
        if ((aer.f446i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            RecyclerView recyclerView = this.f381a;
            View view = aer.f438a;
            recyclerView.m3082e();
            boolean f = recyclerView.f1443e.m246f(view);
            if (f) {
                aer d = RecyclerView.m3038d(view);
                recyclerView.f1441c.m815b(d);
                recyclerView.f1441c.m810a(d);
            }
            if (f) {
                z2 = false;
            }
            recyclerView.m3069b(z2);
            if (!f && aer.m875o()) {
                this.f381a.removeDetachedView(aer.f438a, false);
            }
        }
    }

    aec(RecyclerView recyclerView) {
        this.f381a = recyclerView;
    }
}
