import android.view.MenuItem;

/* compiled from: PG */
final class sp implements Runnable {
    private /* synthetic */ sq a;
    private /* synthetic */ MenuItem b;
    private /* synthetic */ su c;
    private /* synthetic */ so d;

    sp(so soVar, sq sqVar, MenuItem menuItem, su suVar) {
        this.d = soVar;
        this.a = sqVar;
        this.b = menuItem;
        this.c = suVar;
    }

    public final void run() {
        if (this.a != null) {
            this.d.a.d = true;
            this.a.b.a(false);
            this.d.a.d = false;
        }
        if (this.b.isEnabled() && this.b.hasSubMenu()) {
            this.c.a(this.b, null, 0);
        }
    }
}
