package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

final class csp implements csl {
    private ctn a;
    private final Set<csm> b = new CopyOnWriteArraySet();

    csp() {
    }

    public ctn a() {
        return this.a;
    }

    public void a(ctn ctn) {
        glk.c("Babel_explane", "setCurrentHangoutCall: HangoutCall: %s", ctn);
        if (ctn != null && ctn == this.a) {
            glk.d("Babel_explane", "setCurrentHangoutCall called with same hangoutCall", new Object[0]);
        }
        this.a = ctn;
        for (csm a : this.b) {
            a.a(this.a);
        }
    }

    public void a(csm csm) {
        if (!this.b.contains(csm)) {
            csm.a(this.a);
            this.b.add(csm);
        }
    }
}
