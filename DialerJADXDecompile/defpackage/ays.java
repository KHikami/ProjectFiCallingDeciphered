package defpackage;

import android.view.MenuItem;
import android.widget.PopupMenu.OnMenuItemClickListener;
import com.android.incallui.CallButtonFragment;

/* compiled from: PG */
/* renamed from: ays */
public final class ays implements OnMenuItemClickListener {
    private /* synthetic */ CallButtonFragment a;

    public ays(CallButtonFragment callButtonFragment) {
        this.a = callButtonFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.a.a(menuItem.getItemId()).performClick();
        return true;
    }
}
