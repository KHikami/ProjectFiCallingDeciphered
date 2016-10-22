package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;

/* compiled from: PG */
/* renamed from: bc */
class bc extends buf {
    private bd a;
    private int b;

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        c(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new bd(view);
        }
        bd bdVar = this.a;
        bdVar.b = bdVar.a.getTop();
        bdVar.c = bdVar.a.getLeft();
        bdVar.a();
        if (this.b != 0) {
            this.a.a(this.b);
            this.b = 0;
        }
        return true;
    }

    protected void c(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.a(view, i);
    }

    public boolean a(int i) {
        if (this.a != null) {
            return this.a.a(i);
        }
        this.b = i;
        return false;
    }

    public int b() {
        if (this.a != null) {
            return this.a.d;
        }
        return 0;
    }
}
