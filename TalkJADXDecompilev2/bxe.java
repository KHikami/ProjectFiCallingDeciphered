package defpackage;

final class bxe implements gia<fqk> {
    final /* synthetic */ bxb a;

    bxe(bxb bxb) {
        this.a = bxb;
    }

    public /* bridge */ /* synthetic */ void a(ayo ayo, Exception exception) {
    }

    private void a(fqk fqk) {
        gwb.aJ();
        bxh d = this.a.d(fqk.a);
        if (d.a != fqk.b) {
            boolean z;
            d.a = fqk.b;
            bxb bxb = this.a;
            if (d.b) {
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
    }
}
