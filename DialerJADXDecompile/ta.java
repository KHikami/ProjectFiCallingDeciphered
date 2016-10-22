import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
class ta extends iv {
    final ActionProvider c;
    private /* synthetic */ sz d;

    public ta(sz szVar, Context context, ActionProvider actionProvider) {
        this.d = szVar;
        super(context);
        this.c = actionProvider;
    }

    public final View a() {
        return this.c.onCreateActionView();
    }

    public final boolean d() {
        return this.c.onPerformDefaultAction();
    }

    public final boolean e() {
        return this.c.hasSubMenu();
    }

    public final void a(SubMenu subMenu) {
        this.c.onPrepareSubMenu(this.d.a(subMenu));
    }
}
