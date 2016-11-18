package p000;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class buv extends aee {
    public void mo752a(Rect rect, View view, RecyclerView recyclerView, aep aep) {
        super.mo752a(rect, view, recyclerView, aep);
        aer c = recyclerView.m3073c(view);
        if (c instanceof bwd) {
            bwd bwd = (bwd) c;
            if (bwd.m6813y().f4412b) {
                rect.bottom += view.getResources().getDimensionPixelSize(gwb.ka);
            }
            if (aep.m845d() - 1 == bwd.m864d()) {
                rect.top += view.getResources().getDimensionPixelSize(gwb.jZ);
            }
        }
    }
}
