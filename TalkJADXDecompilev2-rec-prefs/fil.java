package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;

public class fil implements fim, no {
    public final /* synthetic */ CoordinatorLayout f13135a;

    public void mo610a(int i, bko bko, fiu fiu) {
        iil.m21876b();
    }

    public fil(CoordinatorLayout coordinatorLayout) {
        this.f13135a = coordinatorLayout;
    }

    public qb m15346a(View view, qb qbVar) {
        boolean z = true;
        int i = 0;
        CoordinatorLayout coordinatorLayout = this.f13135a;
        if (br.m6472a(coordinatorLayout.f1472e, qbVar)) {
            return qbVar;
        }
        qb qbVar2;
        coordinatorLayout.f1472e = qbVar;
        boolean z2 = qbVar != null && qbVar.m33678b() > 0;
        coordinatorLayout.f1473f = z2;
        if (coordinatorLayout.f1473f || coordinatorLayout.getBackground() != null) {
            z = false;
        }
        coordinatorLayout.setWillNotDraw(z);
        if (qbVar.m33681e()) {
            qbVar2 = qbVar;
        } else {
            int childCount = coordinatorLayout.getChildCount();
            qb qbVar3 = qbVar;
            while (i < childCount) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (oa.p(childAt)) {
                    gwb a = ((ae) childAt.getLayoutParams()).m759a();
                    if (a != null) {
                        qbVar2 = a.m2404a(qbVar3);
                        if (qbVar2.m33681e()) {
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
