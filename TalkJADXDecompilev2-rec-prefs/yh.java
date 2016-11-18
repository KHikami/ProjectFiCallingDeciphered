package p000;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class yh extends xp<OnMenuItemClickListener> implements OnMenuItemClickListener {
    final /* synthetic */ yd f35828a;

    yh(yd ydVar, OnMenuItemClickListener onMenuItemClickListener) {
        this.f35828a = ydVar;
        super(onMenuItemClickListener);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((OnMenuItemClickListener) this.d).onMenuItemClick(this.f35828a.a(menuItem));
    }
}
