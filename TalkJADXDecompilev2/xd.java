package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class xd implements wy {
    final Callback a;
    final Context b;
    final ArrayList<xc> c = new ArrayList();
    final lo<Menu, Menu> d = new lo();

    public xd(Context context, Callback callback) {
        this.b = context;
        this.a = callback;
    }

    public boolean a(wx wxVar, Menu menu) {
        return this.a.onCreateActionMode(b(wxVar), a(menu));
    }

    public boolean b(wx wxVar, Menu menu) {
        return this.a.onPrepareActionMode(b(wxVar), a(menu));
    }

    public boolean a(wx wxVar, MenuItem menuItem) {
        return this.a.onActionItemClicked(b(wxVar), gwb.a(this.b, (ju) menuItem));
    }

    public void a(wx wxVar) {
        this.a.onDestroyActionMode(b(wxVar));
    }

    private Menu a(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        menu2 = gwb.a(this.b, (jt) menu);
        this.d.put(menu, menu2);
        return menu2;
    }

    public ActionMode b(wx wxVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            xc xcVar = (xc) this.c.get(i);
            if (xcVar != null && xcVar.b == wxVar) {
                return xcVar;
            }
        }
        ActionMode xcVar2 = new xc(this.b, wxVar);
        this.c.add(xcVar2);
        return xcVar2;
    }
}
