package defpackage;

import android.view.ActionMode;
import android.view.Window.Callback;

/* compiled from: PG */
/* renamed from: qk */
class qk extends qi {
    private /* synthetic */ qj a;

    qk(qj qjVar, Callback callback) {
        this.a = qjVar;
        super(qjVar, callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.a.n) {
            switch (i) {
                case rl.c /*0*/:
                    return a(callback);
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
