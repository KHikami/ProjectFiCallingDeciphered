package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;

class bp<V extends View> extends gwb {
    private bq f899a;
    private int f900b = 0;
    private int f901c = 0;

    public boolean mo220a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo231b(coordinatorLayout, v, i);
        if (this.f899a == null) {
            this.f899a = new bq(v);
        }
        this.f899a.m6379a();
        if (this.f900b != 0) {
            this.f899a.m6380a(this.f900b);
            this.f900b = 0;
        }
        if (this.f901c != 0) {
            this.f899a.m6382b(this.f901c);
            this.f901c = 0;
        }
        return true;
    }

    protected void mo231b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m3127a((View) v, i);
    }

    public boolean m2422a(int i) {
        if (this.f899a != null) {
            return this.f899a.m6380a(i);
        }
        this.f900b = i;
        return false;
    }

    public int m2424b() {
        return this.f899a != null ? this.f899a.m6381b() : 0;
    }
}
