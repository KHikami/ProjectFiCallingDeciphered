package p000;

import android.view.View;

final class ue implements Runnable {
    final /* synthetic */ View f35237a;
    final /* synthetic */ View f35238b;
    final /* synthetic */ uc f35239c;

    ue(uc ucVar, View view, View view2) {
        this.f35239c = ucVar;
        this.f35237a = view;
        this.f35238b = view2;
    }

    public void run() {
        int i = 0;
        View view = this.f35239c.f35218i;
        View view2 = this.f35237a;
        View view3 = this.f35238b;
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
