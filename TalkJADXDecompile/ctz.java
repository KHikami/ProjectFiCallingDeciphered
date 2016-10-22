final class ctz implements ijl<lzc> {
    final /* synthetic */ dli a;
    final /* synthetic */ cty b;

    ctz(cty cty, dli dli) {
        this.b = cty;
        this.a = dli;
    }

    private void a(lzc lzc) {
        glk.a("Babel_explane", "resolve: Resolved call id {%s}", lzc.a);
        this.b.a(r0, this.a);
    }

    private void b(lzc lzc) {
        glk.e("Babel_explane", "resolve: Failed to resolve call id {%s}", lzc);
        if (this.a != null) {
            this.a.a(true);
        }
        ctn ctn = this.b.d;
        ctv cui = new cui(this.b.d.a, ba.jE);
        if (ctn.m == null) {
            ctn.m = cui;
            for (ctt a : ctn.k) {
                a.a(ctn.m);
            }
            switch (cts.a[cui.b - 1]) {
                case wi.j /*1*/:
                    ctn.c.a(10030);
                case wi.l /*2*/:
                    ctn.c.a(((ctu) cui).a);
                case wi.z /*3*/:
                    ctn.c.a(72);
                default:
            }
        }
    }
}
