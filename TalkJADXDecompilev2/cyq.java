package defpackage;

import android.os.Bundle;

final class cyq implements guk {
    final /* synthetic */ cyp a;

    cyq(cyp cyp) {
        this.a = cyp;
    }

    public void a_(Bundle bundle) {
        boolean z = cyp.a;
        if (this.a.getActivity() == null) {
            glk.a("Babel", "Google API client connected but MakePhoneCallFragment is detached.", new Object[0]);
            return;
        }
        gwb.a(this.a.b);
        if (this.a.h && this.a.c == null && this.a.e()) {
            this.a.c();
        }
    }

    public void a(int i) {
        boolean z = cyp.a;
        if (this.a.c != null) {
            this.a.c = null;
        }
    }
}
