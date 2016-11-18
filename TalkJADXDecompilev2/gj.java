package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

class gj extends gd {
    gj() {
    }

    public Notification a(fx fxVar, fy fyVar) {
        fp guVar = new gu(fxVar.a, fxVar.F, fxVar.d(), fxVar.c(), fxVar.h, fxVar.f, fxVar.i, fxVar.d, fxVar.e, fxVar.g, fxVar.p, fxVar.q, fxVar.r, fxVar.l, fxVar.j, fxVar.n, fxVar.w, fxVar.y, fxVar.s, fxVar.t, fxVar.u, fxVar.C, fxVar.D);
        fq.a((fo) guVar, fxVar.v);
        fq.a(guVar, fxVar.m);
        Notification a = fy.a(fxVar, guVar);
        if (fxVar.m != null) {
            Bundle a2 = a(a);
            if (a2 != null) {
                fxVar.m.a(a2);
            }
        }
        return a;
    }

    public Bundle a(Notification notification) {
        return gt.a(notification);
    }

    public ArrayList<Parcelable> a(fr[] frVarArr) {
        return gt.a((gq[]) frVarArr);
    }
}
