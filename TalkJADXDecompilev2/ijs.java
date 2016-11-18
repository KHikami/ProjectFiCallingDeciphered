package defpackage;

import java.util.List;

final class ijs extends ikg {
    final /* synthetic */ ijn a;

    ijs(ijn ijn) {
        this.a = ijn;
    }

    public void a(iqo iqo, ayo ayo) {
        if ((ayo instanceof iqq) && iqo.k()) {
            this.a.n = 2;
            itx.a("vclib", "Call joined; participant id = %s", iqo.a());
            this.a.q = new itk(this.a.c.a().a()).a(iqo.a());
            this.a.k.a(2690);
            this.a.d.a(this.a.q);
        }
    }

    public void a(ikd ikd) {
        this.a.m = true;
        this.a.u();
        ijn ijn = this.a;
        ikd a = this.a.c.a();
        if (ijn.n != 0 && a != null && ijn.l != null) {
            List<mav> a2 = a.a(ijn.a, ijn.l.c(), ijn.l.e(), ijn.c.b());
            itx.a(3, "vclib", "Number of logData entries to upload: " + a2.size());
            ils ils = new ils(ijn.a, ijn.b);
            for (mav mav : a2) {
                ijn.d.a(mav);
                ils.a(ijn.l, mav);
            }
        }
    }

    public void b(ikd ikd) {
        int i;
        if (ikd == null) {
            i = 10030;
        } else {
            i = ikd.l();
        }
        if (this.a.q == null) {
            if (i == 10030) {
                this.a.k.a(2907);
            } else {
                this.a.k.a(2691);
            }
        }
        itx.a(4, "vclib", "Call.onCallEnded: " + i);
        this.a.a(ikd);
        ijn ijn = this.a;
        if (!ijn.p) {
            ijn.a(null);
            ijn.a(null);
            ijn.a(null);
            ijn.j.a();
            ijn.g.a();
            ijn.i.a();
            ijn.h.a();
            ijn.e.a();
            ijn.f.a();
            ijn.k.b();
            ikp.a.a();
            ijn.p = true;
        }
        this.a.n = 4;
        this.a.d.a(i);
        inx.a().a(null);
    }
}
