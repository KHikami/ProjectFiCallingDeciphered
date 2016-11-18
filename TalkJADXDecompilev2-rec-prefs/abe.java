package p000;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

final class abe implements OnDismissListener {
    final /* synthetic */ OnGlobalLayoutListener f144a;
    final /* synthetic */ abb f145b;

    abe(abb abb, OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f145b = abb;
        this.f144a = onGlobalLayoutListener;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f145b.f139c.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f144a);
        }
    }
}
