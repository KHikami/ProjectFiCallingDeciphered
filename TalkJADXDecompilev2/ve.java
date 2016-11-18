package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

class ve extends va {
    private final UiModeManager y;

    ve(Context context, Window window, ur urVar) {
        super(context, window, urVar);
        this.y = (UiModeManager) context.getSystemService("uimode");
    }

    Callback a(Callback callback) {
        return new vf(this, callback);
    }

    int f(int i) {
        if (i == 0 && this.y.getNightMode() == 0) {
            return -1;
        }
        return super.f(i);
    }
}
