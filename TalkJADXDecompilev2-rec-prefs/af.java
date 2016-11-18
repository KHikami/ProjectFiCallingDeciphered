package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.ViewTreeObserver.OnPreDrawListener;

public final class af implements OnPreDrawListener {
    final /* synthetic */ CoordinatorLayout f506a;

    public af(CoordinatorLayout coordinatorLayout) {
        this.f506a = coordinatorLayout;
    }

    public boolean onPreDraw() {
        this.f506a.m3126a(0);
        return true;
    }
}
