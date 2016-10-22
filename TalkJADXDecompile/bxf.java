final class bxf implements gia<fql> {
    final /* synthetic */ bxb a;

    bxf(bxb bxb) {
        this.a = bxb;
    }

    public /* bridge */ /* synthetic */ void a(ayo ayo, Exception exception) {
    }

    private void a(fql fql) {
        gwb.aJ();
        bxh d = this.a.d(fql.a);
        if (d.b != fql.b) {
            boolean z;
            d.b = fql.b;
            bxb bxb = this.a;
            if (d.a) {
                z = false;
            } else {
                z = true;
            }
            long j = d.d;
            bxb.b.d(false);
            if (z) {
                int a = bxb.a(j);
                if (a > 0) {
                    bxb.b.f(a);
                }
            }
        }
        if (d.c != null) {
            gwb.b(d.c);
        }
        if (d.b) {
            if (d.c == null) {
                d.c = new bxd(this.a, fql.a);
            }
            gwb.a(d.c, bxb.a);
        }
    }
}
