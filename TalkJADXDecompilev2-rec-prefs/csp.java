package p000;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

final class csp implements csl {
    private ctn f8993a;
    private final Set<csm> f8994b = new CopyOnWriteArraySet();

    csp() {
    }

    public ctn mo1398a() {
        return this.f8993a;
    }

    public void mo1400a(ctn ctn) {
        glk.m17979c("Babel_explane", "setCurrentHangoutCall: HangoutCall: %s", ctn);
        if (ctn != null && ctn == this.f8993a) {
            glk.m17981d("Babel_explane", "setCurrentHangoutCall called with same hangoutCall", new Object[0]);
        }
        this.f8993a = ctn;
        for (csm a : this.f8994b) {
            a.m10867a(this.f8993a);
        }
    }

    public void mo1399a(csm csm) {
        if (!this.f8994b.contains(csm)) {
            csm.m10867a(this.f8993a);
            this.f8994b.add(csm);
        }
    }
}
