public final class flf extends fld {
    private final int l;

    public flf(fpn fpn) {
        super(fpn.a(), fpn.b(), fpn.c(), fpn.j(), fpn.i(), fpn.m(), fpn.k(), fpn.l(), fpn.n(), fwx.ON_SERVER, fpn.o());
        this.l = fpn.d();
    }

    public flf(String str, edo edo, long j, long j2, String str2, String str3, int i, fwx fwx) {
        super(str, edo, j, j2, str2, str3, -1, 1, 0, fwx, null);
        this.l = i;
    }

    public void b(blo blo) {
        blo.a();
        try {
            d(blo);
            a(blo);
            blo.a(this.f, this.l);
            blo.b();
            blf.d(blo, this.f);
            blf.a(blo.g());
            ayo bow = new bow(this.f, blo.h(), box.GROUP_LINK_SHARING_STATUS);
            ((gid) jyn.a(blo.f(), gid.class)).a(bow, bow.a());
        } finally {
            blo.c();
        }
    }

    public void c(blo blo) {
        d(blo);
        a(blo);
    }

    private void d(blo blo) {
        fwy fwy;
        if (this.l == 1) {
            fwy = fwy.LINK_SHARING_STATUS_ON;
        } else if (this.l == 2) {
            fwy = fwy.LINK_SHARING_STATUS_OFF;
        } else {
            fwy = fwy.LINK_SHARING_STATUS_UNKNOWN;
        }
        blo.a(this.f, this.a, this.k, this.g, fwy, this.h, this.i, 0, this.c, null, null);
    }
}
