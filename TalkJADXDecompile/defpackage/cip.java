package defpackage;

/* renamed from: cip */
final class cip implements bpg {
    final /* synthetic */ bxy a;
    final /* synthetic */ cio b;

    cip(cio cio, bxy bxy) {
        this.b = cio;
        this.a = bxy;
    }

    public void a(bpd bpd) {
        if (gwb.h(bpd.b)) {
            if (this.a.j >= ((long) (ajf.a().e() - 4096))) {
                gwb.a(new ciq(this));
            }
        } else if (!fdq.a(this.b.a, this.b.b)) {
            gwb.a(new cir(this));
        }
    }
}
