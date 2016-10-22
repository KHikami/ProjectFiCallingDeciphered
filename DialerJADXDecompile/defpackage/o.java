package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

/* compiled from: PG */
/* renamed from: o */
public final class o implements OnHierarchyChangeListener {
    private /* synthetic */ CoordinatorLayout a;

    public o(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (this.a.f != null) {
            this.a.f.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.a;
        int size = coordinatorLayout.a.size();
        int i = 0;
        Object obj = null;
        while (i < size) {
            Object obj2;
            View view3 = (View) coordinatorLayout.a.get(i);
            if (view3 == view2) {
                obj2 = 1;
            } else {
                if (obj != null) {
                    p pVar = (p) view3.getLayoutParams();
                    buf buf = pVar.a;
                    if (buf != null && pVar.a(coordinatorLayout, view3, view2)) {
                        buf.d(coordinatorLayout, view3, view2);
                    }
                }
                obj2 = obj;
            }
            i++;
            obj = obj2;
        }
        if (this.a.f != null) {
            this.a.f.onChildViewRemoved(view, view2);
        }
    }
}
