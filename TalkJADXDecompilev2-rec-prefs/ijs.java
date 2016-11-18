package p000;

import java.util.List;

final class ijs extends ikg {
    final /* synthetic */ ijn f17795a;

    ijs(ijn ijn) {
        this.f17795a = ijn;
    }

    public void mo1552a(iqo iqo, ayo ayo) {
        if ((ayo instanceof iqq) && iqo.m22969k()) {
            this.f17795a.f17776n = 2;
            itx.m23282a("vclib", "Call joined; participant id = %s", iqo.m22949a());
            this.f17795a.f17779q = new itk(this.f17795a.f17765c.m22029a().m22110a()).m23221a(iqo.m22949a());
            this.f17795a.f17773k.m23011a(2690);
            this.f17795a.f17766d.mo1386a(this.f17795a.f17779q);
        }
    }

    public void mo1551a(ikd ikd) {
        this.f17795a.f17775m = true;
        this.f17795a.m21983u();
        ijn ijn = this.f17795a;
        ikd a = this.f17795a.f17765c.m22029a();
        if (ijn.f17776n != 0 && a != null && ijn.f17774l != null) {
            List<mav> a2 = a.m22111a(ijn.f17763a, ijn.f17774l.m23164c(), ijn.f17774l.m23170e(), ijn.f17765c.m22052b());
            itx.m23277a(3, "vclib", "Number of logData entries to upload: " + a2.size());
            ils ils = new ils(ijn.f17763a, ijn.f17764b);
            for (mav mav : a2) {
                ijn.f17766d.mo1543a(mav);
                ils.m22260a(ijn.f17774l, mav);
            }
        }
    }

    public void mo1556b(ikd ikd) {
        int i;
        if (ikd == null) {
            i = 10030;
        } else {
            i = ikd.m22140l();
        }
        if (this.f17795a.f17779q == null) {
            if (i == 10030) {
                this.f17795a.f17773k.m23011a(2907);
            } else {
                this.f17795a.f17773k.m23011a(2691);
            }
        }
        itx.m23277a(4, "vclib", "Call.onCallEnded: " + i);
        this.f17795a.m21952a(ikd);
        ijn ijn = this.f17795a;
        if (!ijn.f17778p) {
            ijn.mo3218a(null);
            ijn.mo3214a(null);
            ijn.mo3215a(null);
            ijn.f17772j.m22771a();
            ijn.f17769g.m10405a();
            ijn.f17771i.m10305a();
            ijn.f17770h.m10312a();
            ijn.f17767e.m22230a();
            ijn.f17768f.m22339a();
            ijn.f17773k.m23016b();
            ikp.f17924a.m22193a();
            ijn.f17778p = true;
        }
        this.f17795a.f17776n = 4;
        this.f17795a.f17766d.mo1385a(i);
        inx.m22408a().m22411a(null);
    }
}
