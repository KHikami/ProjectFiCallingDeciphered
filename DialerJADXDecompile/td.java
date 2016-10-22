import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

/* compiled from: PG */
final class td extends sl implements OnMenuItemClickListener {
    private /* synthetic */ sz a;

    td(sz szVar, OnMenuItemClickListener onMenuItemClickListener) {
        this.a = szVar;
        super(onMenuItemClickListener);
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((OnMenuItemClickListener) this.d).onMenuItemClick(this.a.a(menuItem));
    }
}
