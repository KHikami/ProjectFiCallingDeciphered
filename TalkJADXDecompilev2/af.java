package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.ViewTreeObserver.OnPreDrawListener;

public final class af implements OnPreDrawListener {
    final /* synthetic */ CoordinatorLayout a;

    public af(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public boolean onPreDraw() {
        this.a.a(0);
        return true;
    }
}
