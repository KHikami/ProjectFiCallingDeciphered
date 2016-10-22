import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

final class abe implements OnDismissListener {
    final /* synthetic */ OnGlobalLayoutListener a;
    final /* synthetic */ abb b;

    abe(abb abb, OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = abb;
        this.a = onGlobalLayoutListener;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.c.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
