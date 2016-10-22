import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v7.widget.ShareActionProvider;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

/* compiled from: PG */
public final class aab implements OnMenuItemClickListener {
    private /* synthetic */ ShareActionProvider a;

    public aab(ShareActionProvider shareActionProvider) {
        this.a = shareActionProvider;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Intent b = up.a(this.a.c, this.a.d).b(menuItem.getItemId());
        if (b != null) {
            String action = b.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                ShareActionProvider shareActionProvider = this.a;
                if (VERSION.SDK_INT >= 21) {
                    b.addFlags(134742016);
                } else {
                    b.addFlags(524288);
                }
            }
            this.a.c.startActivity(b);
        }
        return true;
    }
}
