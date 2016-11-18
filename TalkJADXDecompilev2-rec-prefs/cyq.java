package p000;

import android.os.Bundle;

final class cyq implements guk {
    final /* synthetic */ cyp f9344a;

    cyq(cyp cyp) {
        this.f9344a = cyp;
    }

    public void a_(Bundle bundle) {
        boolean z = cyp.f9335a;
        if (this.f9344a.getActivity() == null) {
            glk.m17970a("Babel", "Google API client connected but MakePhoneCallFragment is detached.", new Object[0]);
            return;
        }
        gwb.m1840a(this.f9344a.f9336b);
        if (this.f9344a.f9342h && this.f9344a.f9337c == null && this.f9344a.mo1497e()) {
            this.f9344a.m11282c();
        }
    }

    public void mo1150a(int i) {
        boolean z = cyp.f9335a;
        if (this.f9344a.f9337c != null) {
            this.f9344a.f9337c = null;
        }
    }
}
