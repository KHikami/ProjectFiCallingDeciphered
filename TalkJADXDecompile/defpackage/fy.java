package defpackage;

import android.app.Notification;

/* renamed from: fy */
public final class fy {
    protected fy() {
    }

    public static Notification a(fx fxVar, fp fpVar) {
        Notification b = fpVar.b();
        if (fxVar.C != null) {
            b.contentView = fxVar.C;
        }
        return b;
    }
}
