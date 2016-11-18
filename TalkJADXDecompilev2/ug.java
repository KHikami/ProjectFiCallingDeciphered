package defpackage;

import android.view.View;

final class ug implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ uc c;

    ug(uc ucVar, View view, View view2) {
        this.c = ucVar;
        this.a = view;
        this.b = view2;
    }

    public void run() {
        int i = 0;
        View view = this.c.b;
        View view2 = this.a;
        View view3 = this.b;
        if (view2 != null) {
            view2.setVisibility(oa.b(view, -1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!oa.b(view, 1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }
}
