package p000;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class cyc implements OnMenuItemClickListener {
    final /* synthetic */ cxv f9324a;

    cyc(cxv cxv) {
        this.f9324a = cxv;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem == this.f9324a.f9310u) {
            this.f9324a.f9305p.mo1880a(this.f9324a.f9295f);
            return true;
        } else if (menuItem == this.f9324a.f9312w) {
            this.f9324a.f9306q.mo1880a(this.f9324a.f9295f);
            return true;
        } else if (menuItem == this.f9324a.f9311v) {
            this.f9324a.f9307r.mo1880a(this.f9324a.f9295f);
            return true;
        } else if (menuItem == this.f9324a.f9313x) {
            this.f9324a.f9308s.mo1880a(this.f9324a.f9295f);
            return true;
        } else {
            if (menuItem == this.f9324a.f9314y) {
                this.f9324a.f9309t.mo1880a(this.f9324a.f9295f);
            }
            return false;
        }
    }
}
