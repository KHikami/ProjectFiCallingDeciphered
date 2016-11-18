package p000;

public final class fes {
    final String f12935a;
    final long f12936b;
    final String[] f12937c;

    public fes(fpj fpj) {
        this.f12935a = fpj.m15901a();
        this.f12936b = fpj.m15903b();
        this.f12937c = fpj.m15904c();
    }

    public fes(String str, long j, String[] strArr) {
        this.f12935a = str;
        this.f12936b = j;
        this.f12937c = strArr;
    }

    public void m15170a(fhb fhb) {
        fhb.m8039a(new eur(this.f12935a, this.f12936b, this.f12937c));
    }

    public void m15169a(blo blo) {
        if (this.f12937c == null) {
            blo.m6035c(this.f12935a, this.f12936b);
            blf.m5820d(blo);
        } else {
            for (String i : this.f12937c) {
                Long i2 = blo.m6068i(this.f12935a, i);
                if (i2 != null) {
                    blf.m5771a(blo, gwb.m1523a(i2));
                }
            }
        }
        blf.m5821d(blo, this.f12935a);
    }
}
