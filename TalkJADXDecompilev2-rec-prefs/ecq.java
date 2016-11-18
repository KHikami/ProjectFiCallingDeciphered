package p000;

import android.graphics.Bitmap;

final class ecq extends ecp {
    final /* synthetic */ ecm f11178b;

    ecq(ecm ecm) {
        this.f11178b = ecm;
        super(ecm);
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        Bitmap d;
        iil.m21872a("Expected null", (Object) gjo);
        if (z) {
            d = gkt.m17897d();
        } else {
            bjy bjy;
            if (this.f11178b.m13325q()) {
                bjy = bjy.CARRIER;
            } else if (this.f11178b.m13326r()) {
                bjy = bjy.GV;
            } else {
                bjy = bjy.NONE;
            }
            d = blc.m5740a(bjy);
        }
        this.f11178b.f11033w.m16423a(d);
        super.mo604a(gkt, gjo, z, bnn, z2);
    }
}
