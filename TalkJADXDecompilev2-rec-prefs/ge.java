package p000;

import android.app.Notification;
import android.os.Parcelable;
import java.util.ArrayList;

class ge extends gk {
    ge() {
    }

    public Notification mo2203a(fx fxVar, fy fyVar) {
        fp gnVar = new gn(fxVar.f14215a, fxVar.f14213F, fxVar.m16446d(), fxVar.m16443c(), fxVar.f14222h, fxVar.f14220f, fxVar.f14223i, fxVar.f14218d, fxVar.f14219e, fxVar.f14221g, fxVar.f14230p, fxVar.f14231q, fxVar.f14232r, fxVar.f14225k, fxVar.f14226l, fxVar.f14224j, fxVar.f14228n, fxVar.f14237w, fxVar.f14214G, fxVar.f14239y, fxVar.f14233s, fxVar.f14234t, fxVar.f14235u, fxVar.f14210C, fxVar.f14211D);
        fq.m15943a((fo) gnVar, fxVar.f14236v);
        fq.m15944a(gnVar, fxVar.f14227m);
        Notification a = fy.m16562a(fxVar, gnVar);
        if (fxVar.f14227m != null) {
            fxVar.f14227m.mo2176a(mo2204a(a));
        }
        return a;
    }

    public ArrayList<Parcelable> mo2205a(fr[] frVarArr) {
        return gwb.m1687a((gq[]) frVarArr);
    }
}
