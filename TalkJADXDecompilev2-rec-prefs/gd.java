package p000;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

class gd {
    public Notification mo2203a(fx fxVar, fy fyVar) {
        Notification a = gwb.m1532a(fxVar.f14213F, fxVar.f14215a, fxVar.m16446d(), fxVar.m16443c(), fxVar.f14218d, fxVar.f14219e);
        if (fxVar.f14224j > 0) {
            a.flags |= 128;
        }
        if (fxVar.f14210C != null) {
            a.contentView = fxVar.f14210C;
        }
        return a;
    }

    public Bundle mo2204a(Notification notification) {
        return null;
    }

    public ArrayList<Parcelable> mo2205a(fr[] frVarArr) {
        return null;
    }

    gd() {
    }
}
