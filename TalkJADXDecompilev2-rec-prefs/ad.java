package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

public final class ad implements OnHierarchyChangeListener {
    final /* synthetic */ CoordinatorLayout f318a;

    public ad(CoordinatorLayout coordinatorLayout) {
        this.f318a = coordinatorLayout;
    }

    public void onChildViewAdded(View view, View view2) {
        if (this.f318a.f1474g != null) {
            this.f318a.f1474g.onChildViewAdded(view, view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        this.f318a.m3126a(2);
        if (this.f318a.f1474g != null) {
            this.f318a.f1474g.onChildViewRemoved(view, view2);
        }
    }
}
