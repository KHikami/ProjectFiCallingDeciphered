package p000;

import android.app.UiModeManager;
import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

class ve extends va {
    private final UiModeManager f35354y;

    ve(Context context, Window window, ur urVar) {
        super(context, window, urVar);
        this.f35354y = (UiModeManager) context.getSystemService("uimode");
    }

    Callback mo4433a(Callback callback) {
        return new vf(this, callback);
    }

    int mo4434f(int i) {
        if (i == 0 && this.f35354y.getNightMode() == 0) {
            return -1;
        }
        return super.mo4434f(i);
    }
}
