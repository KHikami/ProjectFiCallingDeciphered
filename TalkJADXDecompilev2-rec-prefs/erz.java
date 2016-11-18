package p000;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class erz implements OnAttachStateChangeListener {
    final /* synthetic */ ery f12146a;

    erz(ery ery) {
        this.f12146a = ery;
    }

    public void onViewAttachedToWindow(View view) {
        view.sendAccessibilityEvent(32);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
