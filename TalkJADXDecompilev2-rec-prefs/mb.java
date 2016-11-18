package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class mb {
    private final Context f27191a;
    private mc f27192b;
    private md f27193c;

    public abstract View m31519a();

    public mb(Context context) {
        this.f27191a = context;
    }

    public View m31520a(MenuItem menuItem) {
        return m31519a();
    }

    public boolean m31525b() {
        return false;
    }

    public boolean m31526c() {
        return true;
    }

    public boolean m31527d() {
        return false;
    }

    public boolean m31528e() {
        return false;
    }

    public void m31521a(SubMenu subMenu) {
    }

    public void m31524a(boolean z) {
        if (this.f27192b != null) {
            this.f27192b.m31665a(z);
        }
    }

    public void m31522a(mc mcVar) {
        this.f27192b = mcVar;
    }

    public void m31523a(md mdVar) {
        if (this.f27193c != null) {
            new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ").append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?");
        }
        this.f27193c = mdVar;
    }

    public void m31529f() {
        this.f27193c = null;
        this.f27192b = null;
    }
}
