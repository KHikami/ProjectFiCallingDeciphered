package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: buv */
public final class buv extends aee {
    public void a(Rect rect, View view, RecyclerView recyclerView, aep aep) {
        super.a(rect, view, recyclerView, aep);
        aer c = recyclerView.c(view);
        if (c instanceof bwd) {
            bwd bwd = (bwd) c;
            if (bwd.y().b) {
                rect.bottom += view.getResources().getDimensionPixelSize(gwb.ka);
            }
            if (aep.d() - 1 == bwd.d()) {
                rect.top += view.getResources().getDimensionPixelSize(gwb.jZ);
            }
        }
    }
}
