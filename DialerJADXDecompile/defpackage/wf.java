package defpackage;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

/* compiled from: PG */
/* renamed from: wf */
final class wf implements OnDismissListener {
    private /* synthetic */ OnGlobalLayoutListener a;
    private /* synthetic */ wc b;

    wf(wc wcVar, OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = wcVar;
        this.a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
