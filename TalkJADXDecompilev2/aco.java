package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class aco implements OnGlobalLayoutListener {
    boolean a = this.b.c.isAttachedToWindow();
    final /* synthetic */ acm b;

    aco(acm acm) {
        this.b = acm;
    }

    public void onGlobalLayout() {
        boolean z = this.a;
        this.a = this.b.c.isAttachedToWindow();
        if (z && !this.a) {
            acm acm = this.b;
            acm.e = false;
            acm.f = -1;
            if (acm.d != null) {
                acm.c.removeCallbacks(acm.d);
            }
        }
    }
}