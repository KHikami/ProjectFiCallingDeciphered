package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: mb */
public abstract class mb {
    private final Context a;
    private mc b;
    private md c;

    public abstract View a();

    public mb(Context context) {
        this.a = context;
    }

    public View a(MenuItem menuItem) {
        return a();
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public void a(SubMenu subMenu) {
    }

    public void a(boolean z) {
        if (this.b != null) {
            this.b.a(z);
        }
    }

    public void a(mc mcVar) {
        this.b = mcVar;
    }

    public void a(md mdVar) {
        if (this.c != null) {
            new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ").append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?");
        }
        this.c = mdVar;
    }

    public void f() {
        this.c = null;
        this.b = null;
    }
}
