package p000;

import android.graphics.Bitmap;

final class ecx extends ecp {
    final /* synthetic */ ecw f11184b;

    ecx(ecw ecw) {
        this.f11184b = ecw;
        super(ecw);
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        Bitmap d;
        iil.m21872a("Expected null", (Object) gjo);
        if (z) {
            d = gkt.m17897d();
        } else {
            d = ((boz) jyn.m25426a(this.f11184b.r, boz.class)).mo638b();
        }
        if (ebz.f11037d) {
            String valueOf = String.valueOf(d);
            new StringBuilder(String.valueOf(valueOf).length() + 38).append("setImageBitmap: success ").append(z).append(" bitmap: ").append(valueOf);
        }
        ((fv) this.f11184b.v).m16302a(d);
        this.f11184b.w.m16428a(this.f11184b.v);
        if (eao.m13368a(this.f11184b.r)) {
            fx fxVar = new fx(this.f11184b.r);
            fz gmVar = new gm();
            gmVar.m18071b(true);
            gmVar.m18068a(d);
            fxVar.m16427a(gmVar);
            this.f11184b.x.m18067a(fxVar.m16433b());
        }
        super.mo604a(gkt, gjo, z, bnn, z2);
    }
}
