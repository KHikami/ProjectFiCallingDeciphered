package p000;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class acn implements OnAttachStateChangeListener {
    final /* synthetic */ acm f246a;

    acn(acm acm) {
        this.f246a = acm;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        acm acm = this.f246a;
        acm.f90e = false;
        acm.f91f = -1;
        if (acm.f89d != null) {
            acm.f88c.removeCallbacks(acm.f89d);
        }
    }
}
