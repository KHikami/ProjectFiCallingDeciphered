package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

public final class xl extends acm {
    final /* synthetic */ ActionMenuItemView a;

    public xl(ActionMenuItemView actionMenuItemView) {
        this.a = actionMenuItemView;
        super(actionMenuItemView);
    }

    public ys a() {
        if (this.a.c != null) {
            return this.a.c.a();
        }
        return null;
    }

    protected boolean b() {
        if (this.a.b == null || !this.a.b.a(this.a.a)) {
            return false;
        }
        ys a = a();
        if (a == null || !a.d()) {
            return false;
        }
        return true;
    }
}
