package p000;

public final class fdb {
    final String f12719a;
    final int f12720b;

    public fdb(fqi fqi) {
        this.f12719a = fqi.m15961a();
        this.f12720b = fqi.m15963b();
    }

    public fdb(String str, int i) {
        this.f12719a = str;
        this.f12720b = 1;
    }

    public void m14989a(blo blo) {
        blo.m6046e(this.f12719a, this.f12720b);
        if (!blo.m5871a(this.f12719a)) {
            return;
        }
        if (this.f12720b == 2) {
            blo.m6082l(this.f12719a, 4);
        } else {
            blo.m6077k(this.f12719a, 4);
        }
    }

    public void m14990b(blo blo) {
        blo.m5958a();
        try {
            blo.m6046e(this.f12719a, this.f12720b);
            for (String e : blo.ad(this.f12719a)) {
                blo.m6046e(e, this.f12720b);
            }
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }
}
