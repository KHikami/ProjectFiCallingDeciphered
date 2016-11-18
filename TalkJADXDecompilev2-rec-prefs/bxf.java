package p000;

final class bxf implements gia<fql> {
    final /* synthetic */ bxb f4723a;

    bxf(bxb bxb) {
        this.f4723a = bxb;
    }

    public /* bridge */ /* synthetic */ void mo775a(ayo ayo, Exception exception) {
    }

    private void m6877a(fql fql) {
        gwb.aJ();
        bxh d = this.f4723a.m6871d(fql.f13743a);
        if (d.f4726b != fql.f13744b) {
            boolean z;
            d.f4726b = fql.f13744b;
            bxb bxb = this.f4723a;
            if (d.f4725a) {
                z = false;
            } else {
                z = true;
            }
            long j = d.f4728d;
            bxb.f4712b.m6691d(false);
            if (z) {
                int a = bxb.m6864a(j);
                if (a > 0) {
                    bxb.f4712b.m6693f(a);
                }
            }
        }
        if (d.f4727c != null) {
            gwb.m2042b(d.f4727c);
        }
        if (d.f4726b) {
            if (d.f4727c == null) {
                d.f4727c = new bxd(this.f4723a, fql.f13743a);
            }
            gwb.m1864a(d.f4727c, bxb.f4711a);
        }
    }
}
