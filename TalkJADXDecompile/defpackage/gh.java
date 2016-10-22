package defpackage;

import android.app.Notification;

/* renamed from: gh */
final class gh extends gd {
    gh() {
    }

    public Notification a(fx fxVar, fy fyVar) {
        Notification a = gwb.a(fxVar.a, fxVar.F, fxVar.d(), fxVar.c(), fxVar.h, fxVar.f, fxVar.i, fxVar.d, fxVar.e, fxVar.g);
        if (fxVar.C != null) {
            a.contentView = fxVar.C;
        }
        return a;
    }
}
