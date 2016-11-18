package p000;

import java.util.Map;

final class dos extends ijj {
    final /* synthetic */ dor f10260a;

    dos(dor dor) {
        this.f10260a = dor;
    }

    private void m12382a(mab mab) {
        m12384b(mab);
    }

    private void m12383a(mab mab, mab mab2) {
        boolean z;
        if (mab.f27086e == null) {
            z = false;
        } else {
            z = gwb.m2061b(mab.f27086e.f27091a);
        }
        if (!z) {
            m12384b(mab2);
        }
    }

    private void m12384b(mab mab) {
        if (mab.f27087f != null && mab.f27087f.f27090a != null && !mab.f27083b.equals(mab.f27087f.f27090a)) {
            Map s = dgg.m11692a().m11715g().mo3228s();
            itl itl = (itl) s.get(mab.f27087f.f27090a);
            this.f10260a.f10256b.mo1630a(gwb.m1983b(this.f10260a.f10255a, (itl) s.get(mab.f27083b), itl));
        }
    }
}
