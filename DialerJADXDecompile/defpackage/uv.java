package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
/* renamed from: uv */
public final class uv implements OnGlobalLayoutListener {
    private /* synthetic */ ActivityChooserView a;

    public uv(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public final void onGlobalLayout() {
        if (!this.a.c()) {
            return;
        }
        if (this.a.isShown()) {
            this.a.d().b();
            if (this.a.h != null) {
                this.a.h.a(true);
                return;
            }
            return;
        }
        this.a.d().c();
    }
}
