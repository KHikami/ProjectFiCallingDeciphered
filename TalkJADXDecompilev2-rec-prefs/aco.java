package p000;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class aco implements OnGlobalLayoutListener {
    boolean f247a = this.f248b.f88c.isAttachedToWindow();
    final /* synthetic */ acm f248b;

    aco(acm acm) {
        this.f248b = acm;
    }

    public void onGlobalLayout() {
        boolean z = this.f247a;
        this.f247a = this.f248b.f88c.isAttachedToWindow();
        if (z && !this.f247a) {
            acm acm = this.f248b;
            acm.f90e = false;
            acm.f91f = -1;
            if (acm.f89d != null) {
                acm.f88c.removeCallbacks(acm.f89d);
            }
        }
    }
}
