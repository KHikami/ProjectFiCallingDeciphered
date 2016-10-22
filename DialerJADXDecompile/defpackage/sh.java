package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* renamed from: sh */
public final class sh extends xm {
    private /* synthetic */ ActionMenuItemView c;

    public sh(ActionMenuItemView actionMenuItemView) {
        this.c = actionMenuItemView;
        super(actionMenuItemView);
    }

    public final to a() {
        if (this.c.c != null) {
            return this.c.c.a();
        }
        return null;
    }

    protected final boolean b() {
        if (this.c.b == null || !this.c.b.a(this.c.a)) {
            return false;
        }
        to a = a();
        if (a == null || !a.d()) {
            return false;
        }
        return true;
    }
}
