package p000;

import android.view.MenuItem;

final class vy implements xz {
    final /* synthetic */ vv f35418a;

    vy(vv vvVar) {
        this.f35418a = vvVar;
    }

    public boolean mo4420a(xy xyVar, MenuItem menuItem) {
        return false;
    }

    public void mo4417a(xy xyVar) {
        if (this.f35418a.f35408c == null) {
            return;
        }
        if (this.f35418a.f35406a.f()) {
            this.f35418a.f35408c.onPanelClosed(108, xyVar);
        } else if (this.f35418a.f35408c.onPreparePanel(0, null, xyVar)) {
            this.f35418a.f35408c.onMenuOpened(108, xyVar);
        }
    }
}
