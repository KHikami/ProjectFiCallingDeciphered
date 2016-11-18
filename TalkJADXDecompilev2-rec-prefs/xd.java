package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class xd implements wy {
    final Callback f35633a;
    final Context f35634b;
    final ArrayList<xc> f35635c = new ArrayList();
    final lo<Menu, Menu> f35636d = new lo();

    public xd(Context context, Callback callback) {
        this.f35634b = context;
        this.f35633a = callback;
    }

    public boolean mo4444a(wx wxVar, Menu menu) {
        return this.f35633a.onCreateActionMode(m41285b(wxVar), m41281a(menu));
    }

    public boolean mo4446b(wx wxVar, Menu menu) {
        return this.f35633a.onPrepareActionMode(m41285b(wxVar), m41281a(menu));
    }

    public boolean mo4445a(wx wxVar, MenuItem menuItem) {
        return this.f35633a.onActionItemClicked(m41285b(wxVar), gwb.a(this.f35634b, (ju) menuItem));
    }

    public void mo4443a(wx wxVar) {
        this.f35633a.onDestroyActionMode(m41285b(wxVar));
    }

    private Menu m41281a(Menu menu) {
        Menu menu2 = (Menu) this.f35636d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        menu2 = gwb.a(this.f35634b, (jt) menu);
        this.f35636d.put(menu, menu2);
        return menu2;
    }

    public ActionMode m41285b(wx wxVar) {
        int size = this.f35635c.size();
        for (int i = 0; i < size; i++) {
            xc xcVar = (xc) this.f35635c.get(i);
            if (xcVar != null && xcVar.f35632b == wxVar) {
                return xcVar;
            }
        }
        ActionMode xcVar2 = new xc(this.f35634b, wxVar);
        this.f35635c.add(xcVar2);
        return xcVar2;
    }
}
