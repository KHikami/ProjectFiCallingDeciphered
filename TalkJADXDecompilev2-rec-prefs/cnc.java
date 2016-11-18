package p000;

final class cnc implements bnq {
    final /* synthetic */ cne f5688a;
    final /* synthetic */ cnb f5689b;

    cnc(cnb cnb, cne cne) {
        this.f5689b = cnb;
        this.f5688a = cne;
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        this.f5689b.f5685b.f5636f.remove(this.f5688a.f5696d);
        if (z) {
            if (bnn.m5508n().m5542o() != null) {
                this.f5688a.f5698f = bnn.m5508n().m5542o();
            }
            if (this.f5688a.f5699g == null) {
                this.f5688a.f5699g = new cnd(this.f5689b);
                this.f5688a.f5699g.f5691b = gkt;
                if (gjo != null) {
                    this.f5688a.f5699g.f5690a = new gol(null);
                    this.f5688a.f5699g.f5690a.m18222a(false);
                    this.f5688a.f5699g.f5690a.m18220a(gjo);
                }
                this.f5689b.m7960a(this.f5688a);
            } else if (gkt != null) {
                gkt.mo2292b();
            }
        }
    }
}
