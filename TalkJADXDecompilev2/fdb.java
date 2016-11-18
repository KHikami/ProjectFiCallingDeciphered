package defpackage;

public final class fdb {
    final String a;
    final int b;

    public fdb(fqi fqi) {
        this.a = fqi.a();
        this.b = fqi.b();
    }

    public fdb(String str, int i) {
        this.a = str;
        this.b = 1;
    }

    public void a(blo blo) {
        blo.e(this.a, this.b);
        if (!blo.a(this.a)) {
            return;
        }
        if (this.b == 2) {
            blo.l(this.a, 4);
        } else {
            blo.k(this.a, 4);
        }
    }

    public void b(blo blo) {
        blo.a();
        try {
            blo.e(this.a, this.b);
            for (String e : blo.ad(this.a)) {
                blo.e(e, this.b);
            }
            blo.b();
        } finally {
            blo.c();
        }
    }
}
