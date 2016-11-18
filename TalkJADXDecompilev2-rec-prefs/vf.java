package p000;

import android.view.ActionMode;
import android.view.Window.Callback;

class vf extends vb {
    final /* synthetic */ ve f35356d;

    vf(ve veVar, Callback callback) {
        this.f35356d = veVar;
        super(veVar, callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.f35356d.mo4435n()) {
            switch (i) {
                case 0:
                    return m41030a(callback);
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
