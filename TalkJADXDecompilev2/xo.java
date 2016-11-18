package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

class xo<T> extends xp<T> {
    final Context a;
    Map<ju, MenuItem> b;
    Map<jv, SubMenu> c;

    xo(Context context, T t) {
        super(t);
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof ju)) {
            return menuItem;
        }
        ju juVar = (ju) menuItem;
        if (this.b == null) {
            this.b = new ky();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        menuItem2 = gwb.a(this.a, juVar);
        this.b.put(juVar, menuItem2);
        return menuItem2;
    }

    final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof jv)) {
            return subMenu;
        }
        jv jvVar = (jv) subMenu;
        if (this.c == null) {
            this.c = new ky();
        }
        SubMenu subMenu2 = (SubMenu) this.c.get(jvVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        subMenu2 = gwb.a(this.a, jvVar);
        this.c.put(jvVar, subMenu2);
        return subMenu2;
    }
}
