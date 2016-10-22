package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

/* compiled from: PG */
/* renamed from: un */
public final class un implements sv {
    private /* synthetic */ ActionMenuView a;

    public un(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    public final boolean a(su suVar, MenuItem menuItem) {
        return this.a.e != null && this.a.e.a(menuItem);
    }

    public final void a(su suVar) {
        if (this.a.d != null) {
            this.a.d.a(suVar);
        }
    }
}
