package defpackage;

import android.view.MenuItem;

final class xt implements Runnable {
    final /* synthetic */ xu a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ xy c;
    final /* synthetic */ xs d;

    xt(xs xsVar, xu xuVar, MenuItem menuItem, xy xyVar) {
        this.d = xsVar;
        this.a = xuVar;
        this.b = menuItem;
        this.c = xyVar;
    }

    public void run() {
        if (this.a != null) {
            this.d.a.d = true;
            this.a.b.a(false);
            this.d.a.d = false;
        }
        if (this.b.isEnabled() && this.b.hasSubMenu()) {
            this.c.a(this.b, 0);
        }
    }
}
