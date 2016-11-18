package defpackage;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class yh extends xp<OnMenuItemClickListener> implements OnMenuItemClickListener {
    final /* synthetic */ yd a;

    yh(yd ydVar, OnMenuItemClickListener onMenuItemClickListener) {
        this.a = ydVar;
        super(onMenuItemClickListener);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((OnMenuItemClickListener) this.d).onMenuItemClick(this.a.a(menuItem));
    }
}
