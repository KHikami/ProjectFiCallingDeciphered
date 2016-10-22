import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

/* compiled from: PG */
final class tc extends sl implements jv {
    private /* synthetic */ sz a;

    tc(sz szVar, OnActionExpandListener onActionExpandListener) {
        this.a = szVar;
        super(onActionExpandListener);
    }

    public final boolean a(MenuItem menuItem) {
        return ((OnActionExpandListener) this.d).onMenuItemActionExpand(this.a.a(menuItem));
    }

    public final boolean b(MenuItem menuItem) {
        return ((OnActionExpandListener) this.d).onMenuItemActionCollapse(this.a.a(menuItem));
    }
}
