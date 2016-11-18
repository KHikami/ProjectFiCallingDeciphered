package p000;

import android.view.View;

final class ug implements Runnable {
    final /* synthetic */ View f35243a;
    final /* synthetic */ View f35244b;
    final /* synthetic */ uc f35245c;

    ug(uc ucVar, View view, View view2) {
        this.f35245c = ucVar;
        this.f35243a = view;
        this.f35244b = view2;
    }

    public void run() {
        int i = 0;
        View view = this.f35245c.f35211b;
        View view2 = this.f35243a;
        View view3 = this.f35244b;
        if (view2 != null) {
            view2.setVisibility(oa.m37346b(view, -1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!oa.m37346b(view, 1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }
}
