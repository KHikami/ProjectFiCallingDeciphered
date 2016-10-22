package defpackage;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* renamed from: dps */
final class dps implements dpq, epk {
    int a;

    dps() {
    }

    public void a(MenuInflater menuInflater, Menu menu) {
        menuInflater.inflate(gwb.qp, menu);
    }

    public void a(Menu menu) {
        if (this.a > 0) {
            menu.removeItem(gwb.qo);
        }
    }

    public boolean a(Activity activity, MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.qo) {
            return false;
        }
        dpw.a(activity);
        return true;
    }

    public void a(kbu kbu) {
        kbu.a(new dpt(this));
    }
}
