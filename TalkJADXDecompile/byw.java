final class byw implements jxz {
    final /* synthetic */ byv a;

    byw(byv byv) {
        this.a = byv;
    }

    public void c_(String str) {
        if (this.a.a()) {
            this.a.d.a(this.a.a.a()).b().c(1819);
            byv byv = this.a;
            byv.e.a(byv.g, byv.b.b());
            long[] jArr = new long[byv.b.b().length];
            for (int i = 0; i < byv.b.b().length; i++) {
                jArr[i] = byv.b.g();
            }
            byv.e.a(byv.f.a(-1), byv.g, byv.b.b(), jArr, true, false);
            for (Object obj : byv.b.p().b()) {
                if (!gwb.g(obj, byv.b.q())) {
                    byv.e.a(byv.f.a(-1), byv.a.a(), obj.b.a, obj.b.b, obj.e, true, true);
                }
            }
            gwb.a(byv.c, byv.g, byv.b.q().e, byv.b.q().b.a, byv.b.q().b.b, true);
            byv.b.c(true);
            byv.b.u();
            return;
        }
        glk.e("Babel_BlockConversation", "Not able to block when trying to block from dialog", new Object[0]);
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }
}
