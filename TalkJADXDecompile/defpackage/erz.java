package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: erz */
final class erz implements OnAttachStateChangeListener {
    final /* synthetic */ ery a;

    erz(ery ery) {
        this.a = ery;
    }

    public void onViewAttachedToWindow(View view) {
        view.sendAccessibilityEvent(32);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
