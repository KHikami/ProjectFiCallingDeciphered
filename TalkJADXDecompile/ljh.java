import java.util.UUID;

final class ljh extends lja {
    private final ljt b;
    private final jhx c;
    private final nwk d;

    ljh(UUID uuid, ljt ljt, jhx jhx, nwk nwk, ljm ljm) {
        super(nwk.k(), uuid, ljm);
        this.b = ljt;
        this.c = jhx;
        this.d = nwk;
    }

    private ljh(ljh ljh, nwk nwk, ljm ljm) {
        super(nwk.k(), (ljo) ljh, ljm);
        this.b = ljh.b;
        this.c = ljh.c;
        this.d = nwk;
    }

    public ljo a(String str, ljm ljm) {
        ogu ogu = (ogu) this.d.f();
        nwk nwk = (nwk) ogu.a(nws.f);
        nwk.b(ogu);
        return new ljh(this, nwk.c(this.d.j()).a(lkb.b.getAndIncrement()).a((double) this.c.a()).a(str), ljm);
    }

    public void e() {
        this.d.b((double) this.c.a());
        this.b.a(this.a, (ogu) this.d.f());
    }
}
