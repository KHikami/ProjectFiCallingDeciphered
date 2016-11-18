package defpackage;

import android.view.MenuItem;

final class vy implements xz {
    final /* synthetic */ vv a;

    vy(vv vvVar) {
        this.a = vvVar;
    }

    public boolean a(xy xyVar, MenuItem menuItem) {
        return false;
    }

    public void a(xy xyVar) {
        if (this.a.c == null) {
            return;
        }
        if (this.a.a.f()) {
            this.a.c.onPanelClosed(108, xyVar);
        } else if (this.a.c.onPreparePanel(0, null, xyVar)) {
            this.a.c.onMenuOpened(108, xyVar);
        }
    }
}
