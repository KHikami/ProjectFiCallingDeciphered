package p000;

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class ye extends mb {
    final ActionProvider f35824a;
    final /* synthetic */ yd f35825b;

    public ye(yd ydVar, Context context, ActionProvider actionProvider) {
        this.f35825b = ydVar;
        super(context);
        this.f35824a = actionProvider;
    }

    public View m41495a() {
        return this.f35824a.onCreateActionView();
    }

    public boolean m41497d() {
        return this.f35824a.onPerformDefaultAction();
    }

    public boolean m41498e() {
        return this.f35824a.hasSubMenu();
    }

    public void m41496a(SubMenu subMenu) {
        this.f35824a.onPrepareSubMenu(this.f35825b.a(subMenu));
    }
}
