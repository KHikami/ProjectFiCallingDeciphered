package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

class xo<T> extends xp<T> {
    final Context f29062a;
    Map<ju, MenuItem> f29063b;
    Map<jv, SubMenu> f29064c;

    xo(Context context, T t) {
        super(t);
        this.f29062a = context;
    }

    final MenuItem m33708a(MenuItem menuItem) {
        if (!(menuItem instanceof ju)) {
            return menuItem;
        }
        ju juVar = (ju) menuItem;
        if (this.f29063b == null) {
            this.f29063b = new ky();
        }
        MenuItem menuItem2 = (MenuItem) this.f29063b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        menuItem2 = gwb.m1582a(this.f29062a, juVar);
        this.f29063b.put(juVar, menuItem2);
        return menuItem2;
    }

    final SubMenu m33709a(SubMenu subMenu) {
        if (!(subMenu instanceof jv)) {
            return subMenu;
        }
        jv jvVar = (jv) subMenu;
        if (this.f29064c == null) {
            this.f29064c = new ky();
        }
        SubMenu subMenu2 = (SubMenu) this.f29064c.get(jvVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        subMenu2 = gwb.m1583a(this.f29062a, jvVar);
        this.f29064c.put(jvVar, subMenu2);
        return subMenu2;
    }
}
