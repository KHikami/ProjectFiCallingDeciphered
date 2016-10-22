import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

/* compiled from: PG */
class sk extends sl {
    final Context a;
    Map b;
    Map c;

    sk(Context context, Object obj) {
        super(obj);
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof hq)) {
            return menuItem;
        }
        hq hqVar = (hq) menuItem;
        if (this.b == null) {
            this.b = new hv();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        menuItem2 = buf.a(this.a, hqVar);
        this.b.put(hqVar, menuItem2);
        return menuItem2;
    }

    final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof hr)) {
            return subMenu;
        }
        hr hrVar = (hr) subMenu;
        if (this.c == null) {
            this.c = new hv();
        }
        SubMenu subMenu2 = (SubMenu) this.c.get(hrVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        subMenu2 = buf.a(this.a, hrVar);
        this.c.put(hrVar, subMenu2);
        return subMenu2;
    }
}
