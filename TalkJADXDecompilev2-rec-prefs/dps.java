package p000;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

final class dps implements dpq, epk {
    int f10306a;

    dps() {
    }

    public void mo1646a(MenuInflater menuInflater, Menu menu) {
        menuInflater.inflate(gwb.qp, menu);
    }

    public void mo1645a(Menu menu) {
        if (this.f10306a > 0) {
            menu.removeItem(gwb.qo);
        }
    }

    public boolean mo1648a(Activity activity, MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.qo) {
            return false;
        }
        dpw.m12463a(activity);
        return true;
    }

    public void mo1647a(kbu kbu) {
        kbu.m25514a(new dpt(this));
    }
}
