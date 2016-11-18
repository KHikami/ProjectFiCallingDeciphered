package p000;

final class ctz implements ijl<lzc> {
    final /* synthetic */ dli f9090a;
    final /* synthetic */ cty f9091b;

    ctz(cty cty, dli dli) {
        this.f9091b = cty;
        this.f9090a = dli;
    }

    private void m11006a(lzc lzc) {
        glk.m17970a("Babel_explane", "resolve: Resolved call id {%s}", lzc.f26979a);
        this.f9091b.m10999a(r0, this.f9090a);
    }

    private void m11007b(lzc lzc) {
        glk.m17982e("Babel_explane", "resolve: Failed to resolve call id {%s}", lzc);
        if (this.f9090a != null) {
            this.f9090a.m12187a(true);
        }
        ctn ctn = this.f9091b.f9086d;
        ctv cui = new cui(this.f9091b.f9086d.f9043a, ba.jE);
        if (ctn.f9055m == null) {
            ctn.f9055m = cui;
            for (ctt a : ctn.f9053k) {
                a.mo1394a(ctn.f9055m);
            }
            switch (cts.f9073a[cui.f9074b - 1]) {
                case 1:
                    ctn.f9045c.mo3213a(10030);
                    return;
                case 2:
                    ctn.f9045c.mo3213a(((ctu) cui).f9075a);
                    return;
                case 3:
                    ctn.f9045c.mo3213a(72);
                    return;
                default:
                    return;
            }
        }
    }
}
