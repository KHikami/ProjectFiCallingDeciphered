package defpackage;

import android.view.Menu;
import android.view.Window.Callback;
import java.util.List;

/* compiled from: PG */
/* renamed from: qf */
final class qf extends qk {
    private /* synthetic */ qe a;

    qf(qe qeVar, Callback callback) {
        this.a = qeVar;
        super(qeVar, callback);
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        qv g = this.a.g(0);
        if (g == null || g.h == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, g.h, i);
        }
    }
}
