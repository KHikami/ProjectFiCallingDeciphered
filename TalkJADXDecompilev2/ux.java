package defpackage;

import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

final class ux extends ve {
    ux(Context context, Window window, ur urVar) {
        super(context, window, urVar);
    }

    Callback a(Callback callback) {
        return new uy(this, callback);
    }
}
