package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

public final class ad implements OnHierarchyChangeListener {
    final /* synthetic */ CoordinatorLayout a;

    public ad(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public void onChildViewAdded(View view, View view2) {
        if (this.a.g != null) {
            this.a.g.onChildViewAdded(view, view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        this.a.a(2);
        if (this.a.g != null) {
            this.a.g.onChildViewRemoved(view, view2);
        }
    }
}
