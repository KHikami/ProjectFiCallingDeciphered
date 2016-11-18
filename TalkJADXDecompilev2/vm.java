package defpackage;

import android.view.Window.Callback;

final class vm implements yo {
    final /* synthetic */ vg a;

    vm(vg vgVar) {
        this.a = vgVar;
    }

    public boolean a(xy xyVar) {
        Callback callback = this.a.d.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, xyVar);
        }
        return true;
    }

    public void a(xy xyVar, boolean z) {
        this.a.b(xyVar);
    }
}
