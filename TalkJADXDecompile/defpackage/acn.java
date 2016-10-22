package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: acn */
final class acn implements OnAttachStateChangeListener {
    final /* synthetic */ acm a;

    acn(acm acm) {
        this.a = acm;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        acm acm = this.a;
        acm.e = false;
        acm.f = -1;
        if (acm.d != null) {
            acm.c.removeCallbacks(acm.d);
        }
    }
}
