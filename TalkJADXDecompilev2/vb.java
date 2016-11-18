package defpackage;

import android.view.ActionMode;
import android.view.Window.Callback;

class vb extends uw {
    final /* synthetic */ va c;

    vb(va vaVar, Callback callback) {
        this.c = vaVar;
        super(vaVar, callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (this.c.n()) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    final ActionMode a(ActionMode.Callback callback) {
        Object xdVar = new xd(this.c.c, callback);
        wx b = this.c.b((wy) xdVar);
        if (b != null) {
            return xdVar.b(b);
        }
        return null;
    }
}
