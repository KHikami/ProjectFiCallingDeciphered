package defpackage;

import android.graphics.Bitmap;

final class ecq extends ecp {
    final /* synthetic */ ecm b;

    ecq(ecm ecm) {
        this.b = ecm;
        super(ecm);
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        Bitmap d;
        iil.a("Expected null", (Object) gjo);
        if (z) {
            d = gkt.d();
        } else {
            bjy bjy;
            if (this.b.q()) {
                bjy = bjy.CARRIER;
            } else if (this.b.r()) {
                bjy = bjy.GV;
            } else {
                bjy = bjy.NONE;
            }
            d = blc.a(bjy);
        }
        this.b.w.a(d);
        super.a(gkt, gjo, z, bnn, z2);
    }
}
