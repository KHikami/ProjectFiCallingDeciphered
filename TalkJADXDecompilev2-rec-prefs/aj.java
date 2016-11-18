package p000;

import android.support.design.widget.CoordinatorLayout;

final class aj implements Runnable {
    final /* synthetic */ ai f982a;
    private final CoordinatorLayout f983b;
    private final V f984c;

    aj(ai aiVar, CoordinatorLayout coordinatorLayout, V v) {
        this.f982a = aiVar;
        this.f983b = coordinatorLayout;
        this.f984c = v;
    }

    public void run() {
        if (this.f984c != null && this.f982a.f903b != null) {
            if (this.f982a.f903b.g()) {
                this.f982a.a_(this.f983b, this.f984c, this.f982a.f903b.c());
                oa.a(this.f984c, this);
                return;
            }
            this.f982a.m2429a(this.f983b, this.f984c);
        }
    }
}
