package p000;

public final class flh extends fld {
    private final int f13402l;
    private final int f13403m;
    private final int f13404n;
    private final long f13405o;

    public flh(fpu fpu) {
        super(fpu.m15827a(), fpu.m15831b(), fpu.m15832c(), fpu.m15843j(), fpu.m15842i(), fpu.m15846m(), fpu.m15844k(), fpu.m15845l(), fpu.m15847n(), fwx.ON_SERVER, fpu.m15848o());
        this.f13402l = fpu.m15936d();
        this.f13403m = fpu.m15937e();
        this.f13404n = fpu.m15939g();
        this.f13405o = gwb.m1523a(Long.valueOf(fpu.m15843j()));
    }

    public flh(String str, edo edo, long j, long j2, String str2, String str3, int i, fwx fwx) {
        super(str, edo, j, j2, str2, str3, -1, 1, 0, fwx, null);
        this.f13402l = -1;
        this.f13403m = i;
        this.f13404n = -1;
        this.f13405o = gwb.m1523a(Long.valueOf(j2));
    }

    public void m15635b(blo blo) {
        blo.m5958a();
        try {
            m15634d(blo);
            m15599a(blo);
            if (this.f13405o > 0) {
                blo.m5959a(this.f13403m, this.f13404n, this.h, this.f);
            }
            blo.m6015b();
            blf.m5821d(blo, this.f);
        } finally {
            blo.m6028c();
        }
    }

    public void m15636c(blo blo) {
        m15634d(blo);
        m15599a(blo);
    }

    private void m15634d(blo blo) {
        fwy fwy;
        if (this.f13403m == 1) {
            fwy = fwy.OFF_THE_RECORD;
        } else {
            fwy = fwy.ON_THE_RECORD;
        }
        blo.m5942a(this.f, this.a, this.k, this.g, fwy, this.h, this.f13405o, 0, this.c, null, null);
    }
}
