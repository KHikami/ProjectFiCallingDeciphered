package p000;

import android.view.Window.Callback;

final class vm implements yo {
    final /* synthetic */ vg f35372a;

    vm(vg vgVar) {
        this.f35372a = vgVar;
    }

    public boolean mo4442a(xy xyVar) {
        Callback callback = this.f35372a.f35307d.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, xyVar);
        }
        return true;
    }

    public void mo4441a(xy xyVar, boolean z) {
        this.f35372a.m40996b(xyVar);
    }
}
