package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class ye extends mb {
    final ActionProvider a;
    final /* synthetic */ yd b;

    public ye(yd ydVar, Context context, ActionProvider actionProvider) {
        this.b = ydVar;
        super(context);
        this.a = actionProvider;
    }

    public View a() {
        return this.a.onCreateActionView();
    }

    public boolean d() {
        return this.a.onPerformDefaultAction();
    }

    public boolean e() {
        return this.a.hasSubMenu();
    }

    public void a(SubMenu subMenu) {
        this.a.onPrepareSubMenu(this.b.a(subMenu));
    }
}
