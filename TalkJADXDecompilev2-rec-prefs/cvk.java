package p000;

import android.text.TextUtils;
import java.util.List;

final class cvk extends ijj {
    final /* synthetic */ cvh f9174a;

    cvk(cvh cvh) {
        this.f9174a = cvh;
    }

    public /* synthetic */ void mo1390a(nzf nzf, nzf nzf2) {
        m11112b((mab) nzf2);
    }

    public /* synthetic */ void mo1426b(nzf nzf) {
        m11113c((mab) nzf);
    }

    private void m11111a(mab mab) {
        if (gwb.m1507a(mab.f27085d) != 1) {
            return;
        }
        if (TextUtils.equals(mab.f27083b, this.f9174a.m11102d())) {
            cvh cvh = this.f9174a;
            if (!cvh.f9160a.m11064i() && mab.f27087f != null && mab.f27083b.equals(cvh.m11102d()) && !TextUtils.isEmpty(mab.f27087f.f27090a) && !mab.f27087f.f27090a.equals(cvh.m11102d())) {
                cvh.f9160a.m11056b(true);
                return;
            }
            return;
        }
        boolean z = mab.f27086e != null && gwb.m2061b(mab.f27086e.f27091a);
        cvh cvh2 = this.f9174a;
        List<cvn> list = (List) cvh2.f9162c.get(cvh2.m11096b(mab.f27083b));
        if (list != null) {
            for (cvn a : list) {
                a.mo1423a(z);
            }
        }
    }

    private void m11112b(mab mab) {
        m11111a(mab);
    }

    private void m11113c(mab mab) {
        if (gwb.m1507a(mab.f27085d) == 1) {
            cvh cvh = this.f9174a;
            List<cvn> list = (List) cvh.f9162c.get(cvh.m11096b(mab.f27083b));
            if (list != null) {
                for (cvn a : list) {
                    a.mo1423a(true);
                }
            }
        }
    }
}
