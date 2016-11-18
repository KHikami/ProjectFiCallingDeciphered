package p000;

import android.view.MenuItem;

final class xt implements Runnable {
    final /* synthetic */ xu f35735a;
    final /* synthetic */ MenuItem f35736b;
    final /* synthetic */ xy f35737c;
    final /* synthetic */ xs f35738d;

    xt(xs xsVar, xu xuVar, MenuItem menuItem, xy xyVar) {
        this.f35738d = xsVar;
        this.f35735a = xuVar;
        this.f35736b = menuItem;
        this.f35737c = xyVar;
    }

    public void run() {
        if (this.f35735a != null) {
            this.f35738d.f35734a.f35711d = true;
            this.f35735a.f35740b.m41417a(false);
            this.f35738d.f35734a.f35711d = false;
        }
        if (this.f35736b.isEnabled() && this.f35736b.hasSubMenu()) {
            this.f35737c.m41418a(this.f35736b, 0);
        }
    }
}
