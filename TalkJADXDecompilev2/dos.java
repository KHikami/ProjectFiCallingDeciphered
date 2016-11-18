package defpackage;

import java.util.Map;

final class dos extends ijj {
    final /* synthetic */ dor a;

    dos(dor dor) {
        this.a = dor;
    }

    private void a(mab mab) {
        b(mab);
    }

    private void a(mab mab, mab mab2) {
        boolean z;
        if (mab.e == null) {
            z = false;
        } else {
            z = gwb.b(mab.e.a);
        }
        if (!z) {
            b(mab2);
        }
    }

    private void b(mab mab) {
        if (mab.f != null && mab.f.a != null && !mab.b.equals(mab.f.a)) {
            Map s = dgg.a().g().s();
            itl itl = (itl) s.get(mab.f.a);
            this.a.b.a(gwb.b(this.a.a, (itl) s.get(mab.b), itl));
        }
    }
}
