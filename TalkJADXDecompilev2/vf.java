package defpackage;

import android.view.ActionMode;
import android.view.Window.Callback;

class vf extends vb {
    final /* synthetic */ ve d;

    vf(ve veVar, Callback callback) {
        this.d = veVar;
        super(veVar, callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.d.n()) {
            switch (i) {
                case 0:
                    return a(callback);
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
