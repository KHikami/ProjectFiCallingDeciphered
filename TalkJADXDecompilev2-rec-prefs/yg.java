package p000;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

final class yg extends xp<OnActionExpandListener> implements ng {
    final /* synthetic */ yd f35827a;

    yg(yd ydVar, OnActionExpandListener onActionExpandListener) {
        this.f35827a = ydVar;
        super(onActionExpandListener);
    }

    public boolean mo4532a(MenuItem menuItem) {
        return ((OnActionExpandListener) this.d).onMenuItemActionExpand(this.f35827a.a(menuItem));
    }

    public boolean mo4533b(MenuItem menuItem) {
        return ((OnActionExpandListener) this.d).onMenuItemActionCollapse(this.f35827a.a(menuItem));
    }
}
