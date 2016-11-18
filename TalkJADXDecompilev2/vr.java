package defpackage;

import android.view.Menu;
import android.view.Window.Callback;

final class vr implements yo {
    final /* synthetic */ vg a;

    vr(vg vgVar) {
        this.a = vgVar;
    }

    public void a(xy xyVar, boolean z) {
        Menu menu;
        Menu r = xyVar.r();
        boolean z2 = r != xyVar;
        vg vgVar = this.a;
        if (z2) {
            menu = r;
        }
        vq a = vgVar.a(menu);
        if (a == null) {
            return;
        }
        if (z2) {
            this.a.a(a.a, a, r);
            this.a.a(a, true);
            return;
        }
        this.a.a(a, z);
    }

    public boolean a(xy xyVar) {
        if (xyVar == null && this.a.j) {
            Callback callback = this.a.d.getCallback();
            if (!(callback == null || this.a.p)) {
                callback.onMenuOpened(108, xyVar);
            }
        }
        return true;
    }
}
