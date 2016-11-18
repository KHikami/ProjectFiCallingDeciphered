package p000;

final class cvj extends ijj {
    final /* synthetic */ cvh f9173a;

    cvj(cvh cvh) {
        this.f9173a = cvh;
    }

    private void m11104a(lym lym) {
        glk.m17979c("Babel_PMngr", "Participant added, id: %s, joined: %s", lym.f26907b, lym.f26922q);
        if (gwb.m2061b(lym.f26922q)) {
            cvh cvh = this.f9173a;
            if (!lym.f26907b.equals(cvh.m11102d())) {
                for (cvm a : cvh.f9161b) {
                    a.mo1387a(lym);
                }
            }
        }
    }

    private void m11105a(lym lym, lym lym2) {
        glk.m17979c("Babel_PMngr", "Participant modified, old id: %s, joined: %s, new id: %s, joined: %s", lym.f26907b, lym.f26922q, lym2.f26907b, lym2.f26922q);
        boolean b = gwb.m2061b(lym.f26922q);
        boolean b2 = gwb.m2061b(lym2.f26922q);
        if (!b && b2) {
            cvh cvh = this.f9173a;
            if (!lym2.f26907b.equals(cvh.m11102d())) {
                for (cvm a : cvh.f9161b) {
                    a.mo1387a(lym2);
                }
            }
        } else if (b && !b2) {
            this.f9173a.m11094a(lym2);
        }
    }

    private void m11106b(lym lym) {
        glk.m17979c("Babel_PMngr", "Participant removed, id: %s, joined: %s", lym.f26907b, lym.f26922q);
        if (gwb.m2061b(lym.f26922q)) {
            this.f9173a.m11094a(lym);
        }
    }

    public void mo1425a() {
        this.f9173a.m11097b();
    }
}
