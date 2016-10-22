import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.android.dialer.app.dialpad.DialpadFragment;

/* compiled from: PG */
public final class aom extends PopupMenu {
    private /* synthetic */ DialpadFragment a;

    public aom(DialpadFragment dialpadFragment, Context context, View view) {
        this.a = dialpadFragment;
        super(context, view);
    }

    public final void show() {
        boolean z;
        int i = 0;
        Menu menu = getMenu();
        if (this.a.d()) {
            z = false;
        } else {
            z = true;
        }
        while (i < menu.size()) {
            MenuItem item = menu.getItem(i);
            item.setEnabled(z);
            if (item.getItemId() == aq.aG) {
                item.setVisible(buf.f(this.a.getContext()));
            }
            i++;
        }
        super.show();
    }
}
