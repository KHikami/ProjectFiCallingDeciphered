package p000;

import android.view.View;
import java.lang.ref.WeakReference;

final class pp implements Runnable {
    WeakReference<View> f34996a;
    pn f34997b;
    final /* synthetic */ po f34998c;

    pp(po poVar, pn pnVar, View view) {
        this.f34998c = poVar;
        this.f34996a = new WeakReference(view);
        this.f34997b = pnVar;
    }

    public void run() {
        View view = (View) this.f34996a.get();
        if (view != null) {
            this.f34998c.m40304c(this.f34997b, view);
        }
    }
}
