package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

/* compiled from: PG */
/* renamed from: qj */
class qj extends qh {
    private final UiModeManager x;

    qj(Context context, Window window, qa qaVar) {
        super(context, window, qaVar);
        this.x = (UiModeManager) context.getSystemService("uimode");
    }

    Callback a(Callback callback) {
        return new qk(this, callback);
    }

    final int f(int i) {
        if (i == 0 && this.x.getNightMode() == 0) {
            return -1;
        }
        return super.f(i);
    }
}
