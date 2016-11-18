package p000;

import java.util.UUID;

final class ljh extends lja {
    private final ljt f25084b;
    private final jhx f25085c;
    private final nwk f25086d;

    ljh(UUID uuid, ljt ljt, jhx jhx, nwk nwk, ljm ljm) {
        super(nwk.k(), uuid, ljm);
        this.f25084b = ljt;
        this.f25085c = jhx;
        this.f25086d = nwk;
    }

    private ljh(ljh ljh, nwk nwk, ljm ljm) {
        super(nwk.k(), (ljo) ljh, ljm);
        this.f25084b = ljh.f25084b;
        this.f25085c = ljh.f25085c;
        this.f25086d = nwk;
    }

    public ljo mo3716a(String str, ljm ljm) {
        ogu ogu = (ogu) this.f25086d.f();
        nwk nwk = (nwk) ogu.m33431a(nws.f);
        nwk.b(ogu);
        return new ljh(this, nwk.c(this.f25086d.j()).a(lkb.f25135b.getAndIncrement()).a((double) this.f25085c.mo3524a()).a(str), ljm);
    }

    public void mo3718e() {
        this.f25086d.b((double) this.f25085c.mo3524a());
        this.f25084b.mo3720a(this.f25063a, (ogu) this.f25086d.f());
    }
}
