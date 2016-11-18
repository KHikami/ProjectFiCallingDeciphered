package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

final class pp implements Runnable {
    WeakReference<View> a;
    pn b;
    final /* synthetic */ po c;

    pp(po poVar, pn pnVar, View view) {
        this.c = poVar;
        this.a = new WeakReference(view);
        this.b = pnVar;
    }

    public void run() {
        View view = (View) this.a.get();
        if (view != null) {
            this.c.c(this.b, view);
        }
    }
}
