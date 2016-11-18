package defpackage;

import android.graphics.Bitmap;

final class ecx extends ecp {
    final /* synthetic */ ecw b;

    ecx(ecw ecw) {
        this.b = ecw;
        super(ecw);
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        Bitmap d;
        iil.a("Expected null", (Object) gjo);
        if (z) {
            d = gkt.d();
        } else {
            d = ((boz) jyn.a(this.b.r, boz.class)).b();
        }
        if (ebz.d) {
            String valueOf = String.valueOf(d);
            new StringBuilder(String.valueOf(valueOf).length() + 38).append("setImageBitmap: success ").append(z).append(" bitmap: ").append(valueOf);
        }
        ((fv) this.b.v).a(d);
        this.b.w.a(this.b.v);
        if (eao.a(this.b.r)) {
            fx fxVar = new fx(this.b.r);
            fz gmVar = new gm();
            gmVar.b(true);
            gmVar.a(d);
            fxVar.a(gmVar);
            this.b.x.a(fxVar.b());
        }
        super.a(gkt, gjo, z, bnn, z2);
    }
}
