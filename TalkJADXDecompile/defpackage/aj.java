package defpackage;

import android.support.design.widget.CoordinatorLayout;
import oa;

/* renamed from: aj */
final class aj implements Runnable {
    final /* synthetic */ ai a;
    private final CoordinatorLayout b;
    private final V c;

    aj(ai aiVar, CoordinatorLayout coordinatorLayout, V v) {
        this.a = aiVar;
        this.b = coordinatorLayout;
        this.c = v;
    }

    public void run() {
        if (this.c != null && this.a.b != null) {
            if (this.a.b.g()) {
                this.a.a_(this.b, this.c, this.a.b.c());
                oa.a(this.c, this);
                return;
            }
            this.a.a(this.b, this.c);
        }
    }
}
