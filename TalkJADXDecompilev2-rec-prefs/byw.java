package p000;

final class byw implements jxz {
    final /* synthetic */ byv f4805a;

    byw(byv byv) {
        this.f4805a = byv;
    }

    public void c_(String str) {
        if (this.f4805a.m6970a()) {
            this.f4805a.f4799d.mo1979a(this.f4805a.f4796a.mo2317a()).mo1693b().mo1714c(1819);
            byv byv = this.f4805a;
            byv.f4800e.mo2006a(byv.f4802g, byv.f4797b.m6933b());
            long[] jArr = new long[byv.f4797b.m6933b().length];
            for (int i = 0; i < byv.f4797b.m6933b().length; i++) {
                jArr[i] = byv.f4797b.m6946g();
            }
            byv.f4800e.mo2012a(byv.f4801f.mo2036a(-1), byv.f4802g, byv.f4797b.m6933b(), jArr, true, false);
            for (Object obj : byv.f4797b.m6956p().m5590b()) {
                if (!gwb.m2223g(obj, byv.f4797b.m6957q())) {
                    byv.f4800e.mo2008a(byv.f4801f.mo2036a(-1), byv.f4796a.mo2317a(), obj.f11213b.f11244a, obj.f11213b.f11245b, obj.f11216e, true, true);
                }
            }
            gwb.m1832a(byv.f4798c, byv.f4802g, byv.f4797b.m6957q().f11216e, byv.f4797b.m6957q().f11213b.f11244a, byv.f4797b.m6957q().f11213b.f11245b, true);
            byv.f4797b.m6937c(true);
            byv.f4797b.m6961u();
            return;
        }
        glk.m17982e("Babel_BlockConversation", "Not able to block when trying to block from dialog", new Object[0]);
    }

    public void mo784a() {
    }

    public void mo785b() {
    }

    public void mo786c() {
    }

    public void mo788d() {
    }
}
