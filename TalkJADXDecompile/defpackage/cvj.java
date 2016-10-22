package defpackage;

/* renamed from: cvj */
final class cvj extends ijj {
    final /* synthetic */ cvh a;

    cvj(cvh cvh) {
        this.a = cvh;
    }

    private void a(lym lym) {
        glk.c("Babel_PMngr", "Participant added, id: %s, joined: %s", lym.b, lym.q);
        if (gwb.b(lym.q)) {
            cvh cvh = this.a;
            if (!lym.b.equals(cvh.d())) {
                for (cvm a : cvh.b) {
                    a.a(lym);
                }
            }
        }
    }

    private void a(lym lym, lym lym2) {
        glk.c("Babel_PMngr", "Participant modified, old id: %s, joined: %s, new id: %s, joined: %s", lym.b, lym.q, lym2.b, lym2.q);
        boolean b = gwb.b(lym.q);
        boolean b2 = gwb.b(lym2.q);
        if (!b && b2) {
            cvh cvh = this.a;
            if (!lym2.b.equals(cvh.d())) {
                for (cvm a : cvh.b) {
                    a.a(lym2);
                }
            }
        } else if (b && !b2) {
            this.a.a(lym2);
        }
    }

    private void b(lym lym) {
        glk.c("Babel_PMngr", "Participant removed, id: %s, joined: %s", lym.b, lym.q);
        if (gwb.b(lym.q)) {
            this.a.a(lym);
        }
    }

    public void a() {
        this.a.b();
    }
}
