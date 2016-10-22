package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: rz */
public final class rz implements ru {
    private Callback a;
    private Context b;
    private ArrayList c;
    private ij d;

    public rz(Context context, Callback callback) {
        this.b = context;
        this.a = callback;
        this.c = new ArrayList();
        this.d = new ij();
    }

    public final boolean a(rt rtVar, Menu menu) {
        return this.a.onCreateActionMode(b(rtVar), a(menu));
    }

    public final boolean b(rt rtVar, Menu menu) {
        return this.a.onPrepareActionMode(b(rtVar), a(menu));
    }

    public final boolean a(rt rtVar, MenuItem menuItem) {
        return this.a.onActionItemClicked(b(rtVar), buf.a(this.b, (hq) menuItem));
    }

    public final void a(rt rtVar) {
        this.a.onDestroyActionMode(b(rtVar));
    }

    private final Menu a(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        menu2 = buf.a(this.b, (hp) menu);
        this.d.put(menu, menu2);
        return menu2;
    }

    public final ActionMode b(rt rtVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ry ryVar = (ry) this.c.get(i);
            if (ryVar != null && ryVar.a == rtVar) {
                return ryVar;
            }
        }
        ActionMode ryVar2 = new ry(this.b, rtVar);
        this.c.add(ryVar2);
        return ryVar2;
    }
}
