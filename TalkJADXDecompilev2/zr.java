package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

public final class zr implements xz {
    final /* synthetic */ ActionMenuView a;

    public zr(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    public boolean a(xy xyVar, MenuItem menuItem) {
        return this.a.b != null && this.a.b.a(menuItem);
    }

    public void a(xy xyVar) {
        if (this.a.a != null) {
            this.a.a.a(xyVar);
        }
    }
}
