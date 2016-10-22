package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;

/* compiled from: PG */
/* renamed from: yy */
public class yy implements kf {
    public final /* synthetic */ CoordinatorLayout a;

    public yy(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public mj a(View view, mj mjVar) {
        boolean z = true;
        int i = 0;
        CoordinatorLayout coordinatorLayout = this.a;
        if (coordinatorLayout.d == mjVar) {
            return mjVar;
        }
        mj mjVar2;
        coordinatorLayout.d = mjVar;
        boolean z2 = mjVar != null && mjVar.b() > 0;
        coordinatorLayout.e = z2;
        if (coordinatorLayout.e || coordinatorLayout.getBackground() != null) {
            z = false;
        }
        coordinatorLayout.setWillNotDraw(z);
        if (mjVar.e()) {
            mjVar2 = mjVar;
        } else {
            int childCount = coordinatorLayout.getChildCount();
            mj mjVar3 = mjVar;
            while (i < childCount) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (kn.o(childAt) && ((p) childAt.getLayoutParams()).a != null) {
                    mjVar2 = buf.a(mjVar3);
                    if (mjVar2.e()) {
                        break;
                    }
                } else {
                    mjVar2 = mjVar3;
                }
                i++;
                mjVar3 = mjVar2;
            }
            mjVar2 = mjVar3;
        }
        coordinatorLayout.requestLayout();
        return mjVar2;
    }
}
