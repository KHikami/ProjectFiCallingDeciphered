package p000;

import android.view.Menu;
import android.view.Window.Callback;

final class vr implements yo {
    final /* synthetic */ vg f35396a;

    vr(vg vgVar) {
        this.f35396a = vgVar;
    }

    public void mo4441a(xy xyVar, boolean z) {
        Menu menu;
        Menu r = xyVar.mo4541r();
        boolean z2 = r != xyVar;
        vg vgVar = this.f35396a;
        if (z2) {
            menu = r;
        }
        vq a = vgVar.m40977a(menu);
        if (a == null) {
            return;
        }
        if (z2) {
            this.f35396a.m40979a(a.f35377a, a, r);
            this.f35396a.m40985a(a, true);
            return;
        }
        this.f35396a.m40985a(a, z);
    }

    public boolean mo4442a(xy xyVar) {
        if (xyVar == null && this.f35396a.j) {
            Callback callback = this.f35396a.f35307d.getCallback();
            if (!(callback == null || this.f35396a.f35319p)) {
                callback.onMenuOpened(108, xyVar);
            }
        }
        return true;
    }
}
