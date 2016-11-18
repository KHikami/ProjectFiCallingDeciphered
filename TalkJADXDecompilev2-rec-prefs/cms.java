package p000;

import android.widget.ImageView;

final class cms implements bnq {
    final /* synthetic */ cmq f5662a;
    final /* synthetic */ int f5663b;
    final /* synthetic */ cmr f5664c;

    cms(cmr cmr, cmq cmq, int i) {
        this.f5664c = cmr;
        this.f5662a = cmq;
        this.f5663b = i;
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (z) {
            if (bnn.m5508n().m5542o() != null) {
                this.f5662a.f5658c = bnn.m5508n().m5542o();
            }
            ImageView imageView = (ImageView) bnn.m5506l();
            if (gwb.m1508a((Integer) imageView.getTag(), -1) == this.f5663b && this.f5662a.f5659d == null) {
                this.f5662a.f5659d = new cmo(this.f5664c.f5661a);
                this.f5662a.f5659d.f5653b = gkt;
                if (gjo != null) {
                    this.f5662a.f5659d.f5652a = new gol(gjo);
                }
                cmr cmr = this.f5664c;
                cmr.m7932a(imageView, this.f5662a);
                return;
            }
            String str = "Babel_Stickers";
            String str2 = "Obsolete update: ";
            String valueOf = String.valueOf(this.f5662a.f5656a);
            glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            if (gkt != null) {
                gkt.mo2292b();
                return;
            }
            return;
        }
        glk.m17981d("Babel_Stickers", "Load failed.", new Object[0]);
    }
}
