package p000;

import android.view.ActionMode;
import android.view.Window.Callback;

class vb extends uw {
    final /* synthetic */ va f35355c;

    vb(va vaVar, Callback callback) {
        this.f35355c = vaVar;
        super(vaVar, callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (this.f35355c.mo4435n()) {
            return m41030a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    final ActionMode m41030a(ActionMode.Callback callback) {
        Object xdVar = new xd(this.f35355c.c, callback);
        wx b = this.f35355c.m40992b((wy) xdVar);
        if (b != null) {
            return xdVar.m41285b(b);
        }
        return null;
    }
}
