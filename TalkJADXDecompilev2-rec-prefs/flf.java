package p000;

public final class flf extends fld {
    private final int f13401l;

    public flf(fpn fpn) {
        super(fpn.m15827a(), fpn.m15831b(), fpn.m15832c(), fpn.m15843j(), fpn.m15842i(), fpn.m15846m(), fpn.m15844k(), fpn.m15845l(), fpn.m15847n(), fwx.ON_SERVER, fpn.m15848o());
        this.f13401l = fpn.m15911d();
    }

    public flf(String str, edo edo, long j, long j2, String str2, String str3, int i, fwx fwx) {
        super(str, edo, j, j2, str2, str3, -1, 1, 0, fwx, null);
        this.f13401l = i;
    }

    public void m15629b(blo blo) {
        blo.m5958a();
        try {
            m15628d(blo);
            m15599a(blo);
            blo.m5972a(this.f, this.f13401l);
            blo.m6015b();
            blf.m5821d(blo, this.f);
            blf.m5761a(blo.m6056g());
            ayo bow = new bow(this.f, blo.m6061h(), box.GROUP_LINK_SHARING_STATUS);
            ((gid) jyn.m25426a(blo.m6049f(), gid.class)).mo2276a(bow, bow.m6328a());
        } finally {
            blo.m6028c();
        }
    }

    public void m15630c(blo blo) {
        m15628d(blo);
        m15599a(blo);
    }

    private void m15628d(blo blo) {
        fwy fwy;
        if (this.f13401l == 1) {
            fwy = fwy.LINK_SHARING_STATUS_ON;
        } else if (this.f13401l == 2) {
            fwy = fwy.LINK_SHARING_STATUS_OFF;
        } else {
            fwy = fwy.LINK_SHARING_STATUS_UNKNOWN;
        }
        blo.m5942a(this.f, this.a, this.k, this.g, fwy, this.h, this.i, 0, this.c, null, null);
    }
}
