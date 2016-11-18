package defpackage;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class cyc implements OnMenuItemClickListener {
    final /* synthetic */ cxv a;

    cyc(cxv cxv) {
        this.a = cxv;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem == this.a.u) {
            this.a.p.a(this.a.f);
            return true;
        } else if (menuItem == this.a.w) {
            this.a.q.a(this.a.f);
            return true;
        } else if (menuItem == this.a.v) {
            this.a.r.a(this.a.f);
            return true;
        } else if (menuItem == this.a.x) {
            this.a.s.a(this.a.f);
            return true;
        } else {
            if (menuItem == this.a.y) {
                this.a.t.a(this.a.f);
            }
            return false;
        }
    }
}
