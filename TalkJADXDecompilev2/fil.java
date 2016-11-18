package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;

public class fil implements fim, no {
    public final /* synthetic */ CoordinatorLayout a;

    public void a(int i, bko bko, fiu fiu) {
        iil.b();
    }

    public fil(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public qb a(View view, qb qbVar) {
        boolean z = true;
        int i = 0;
        CoordinatorLayout coordinatorLayout = this.a;
        if (br.a(coordinatorLayout.e, qbVar)) {
            return qbVar;
        }
        qb qbVar2;
        coordinatorLayout.e = qbVar;
        boolean z2 = qbVar != null && qbVar.b() > 0;
        coordinatorLayout.f = z2;
        if (coordinatorLayout.f || coordinatorLayout.getBackground() != null) {
            z = false;
        }
        coordinatorLayout.setWillNotDraw(z);
        if (qbVar.e()) {
            qbVar2 = qbVar;
        } else {
            int childCount = coordinatorLayout.getChildCount();
            qb qbVar3 = qbVar;
            while (i < childCount) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (oa.p(childAt)) {
                    gwb a = ((ae) childAt.getLayoutParams()).a();
                    if (a != null) {
                        qbVar2 = a.a(qbVar3);
                        if (qbVar2.e()) {
                            break;
                        }
                        i++;
                        qbVar3 = qbVar2;
                    }
                }
                qbVar2 = qbVar3;
                i++;
                qbVar3 = qbVar2;
            }
            qbVar2 = qbVar3;
        }
        coordinatorLayout.requestLayout();
        return qbVar2;
    }
}
