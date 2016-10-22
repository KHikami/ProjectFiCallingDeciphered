import android.widget.ImageView;

final class cms implements bnq {
    final /* synthetic */ cmq a;
    final /* synthetic */ int b;
    final /* synthetic */ cmr c;

    cms(cmr cmr, cmq cmq, int i) {
        this.c = cmr;
        this.a = cmq;
        this.b = i;
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (z) {
            if (bnn.n().o() != null) {
                this.a.c = bnn.n().o();
            }
            ImageView imageView = (ImageView) bnn.l();
            if (gwb.a((Integer) imageView.getTag(), -1) == this.b && this.a.d == null) {
                this.a.d = new cmo(this.c.a);
                this.a.d.b = gkt;
                if (gjo != null) {
                    this.a.d.a = new gol(gjo);
                }
                cmr cmr = this.c;
                cmr.a(imageView, this.a);
                return;
            }
            String str = "Babel_Stickers";
            String str2 = "Obsolete update: ";
            String valueOf = String.valueOf(this.a.a);
            glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            if (gkt != null) {
                gkt.b();
                return;
            }
            return;
        }
        glk.d("Babel_Stickers", "Load failed.", new Object[0]);
    }
}
