package defpackage;

/* renamed from: flh */
public final class flh extends fld {
    private final int l;
    private final int m;
    private final int n;
    private final long o;

    public flh(fpu fpu) {
        super(fpu.a(), fpu.b(), fpu.c(), fpu.j(), fpu.i(), fpu.m(), fpu.k(), fpu.l(), fpu.n(), fwx.ON_SERVER, fpu.o());
        this.l = fpu.d();
        this.m = fpu.e();
        this.n = fpu.g();
        this.o = gwb.a(Long.valueOf(fpu.j()));
    }

    public flh(String str, edo edo, long j, long j2, String str2, String str3, int i, fwx fwx) {
        super(str, edo, j, j2, str2, str3, -1, 1, 0, fwx, null);
        this.l = -1;
        this.m = i;
        this.n = -1;
        this.o = gwb.a(Long.valueOf(j2));
    }

    public void b(blo blo) {
        blo.a();
        try {
            d(blo);
            a(blo);
            if (this.o > 0) {
                blo.a(this.m, this.n, this.h, this.f);
            }
            blo.b();
            blf.d(blo, this.f);
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
        if (this.m == 1) {
            fwy = fwy.OFF_THE_RECORD;
        } else {
            fwy = fwy.ON_THE_RECORD;
        }
        blo.a(this.f, this.a, this.k, this.g, fwy, this.h, this.o, 0, this.c, null, null);
    }
}
