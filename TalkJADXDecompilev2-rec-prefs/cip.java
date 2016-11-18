package p000;

final class cip implements bpg {
    final /* synthetic */ bxy f5394a;
    final /* synthetic */ cio f5395b;

    cip(cio cio, bxy bxy) {
        this.f5395b = cio;
        this.f5394a = bxy;
    }

    public void mo720a(bpd bpd) {
        if (gwb.m2237h(bpd.f4147b)) {
            if (this.f5394a.f4761j >= ((long) (ajf.m2609a().mo2121e() - 4096))) {
                gwb.m1863a(new ciq(this));
            }
        } else if (!fdq.m15090a(this.f5395b.f5390a, this.f5395b.f5391b)) {
            gwb.m1863a(new cir(this));
        }
    }
}
