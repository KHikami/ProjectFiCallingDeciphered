package defpackage;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

final class yg extends xp<OnActionExpandListener> implements ng {
    final /* synthetic */ yd a;

    yg(yd ydVar, OnActionExpandListener onActionExpandListener) {
        this.a = ydVar;
        super(onActionExpandListener);
    }

    public boolean a(MenuItem menuItem) {
        return ((OnActionExpandListener) this.d).onMenuItemActionExpand(this.a.a(menuItem));
    }

    public boolean b(MenuItem menuItem) {
        return ((OnActionExpandListener) this.d).onMenuItemActionCollapse(this.a.a(menuItem));
    }
}
