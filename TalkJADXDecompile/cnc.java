final class cnc implements bnq {
    final /* synthetic */ cne a;
    final /* synthetic */ cnb b;

    cnc(cnb cnb, cne cne) {
        this.b = cnb;
        this.a = cne;
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        this.b.b.f.remove(this.a.d);
        if (z) {
            if (bnn.n().o() != null) {
                this.a.f = bnn.n().o();
            }
            if (this.a.g == null) {
                this.a.g = new cnd(this.b);
                this.a.g.b = gkt;
                if (gjo != null) {
                    this.a.g.a = new gol(null);
                    this.a.g.a.a(false);
                    this.a.g.a.a(gjo);
                }
                this.b.a(this.a);
            } else if (gkt != null) {
                gkt.b();
            }
        }
    }
}
