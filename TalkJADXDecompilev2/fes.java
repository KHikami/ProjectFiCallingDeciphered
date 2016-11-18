package defpackage;

public final class fes {
    final String a;
    final long b;
    final String[] c;

    public fes(fpj fpj) {
        this.a = fpj.a();
        this.b = fpj.b();
        this.c = fpj.c();
    }

    public fes(String str, long j, String[] strArr) {
        this.a = str;
        this.b = j;
        this.c = strArr;
    }

    public void a(fhb fhb) {
        fhb.a(new eur(this.a, this.b, this.c));
    }

    public void a(blo blo) {
        if (this.c == null) {
            blo.c(this.a, this.b);
            blf.d(blo);
        } else {
            for (String i : this.c) {
                Long i2 = blo.i(this.a, i);
                if (i2 != null) {
                    blf.a(blo, gwb.a(i2));
                }
            }
        }
        blf.d(blo, this.a);
    }
}
