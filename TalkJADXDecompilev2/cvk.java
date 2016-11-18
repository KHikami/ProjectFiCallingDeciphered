package defpackage;

import android.text.TextUtils;
import java.util.List;

final class cvk extends ijj {
    final /* synthetic */ cvh a;

    cvk(cvh cvh) {
        this.a = cvh;
    }

    public /* synthetic */ void a(nzf nzf, nzf nzf2) {
        b((mab) nzf2);
    }

    public /* synthetic */ void b(nzf nzf) {
        c((mab) nzf);
    }

    private void a(mab mab) {
        if (gwb.a(mab.d) != 1) {
            return;
        }
        if (TextUtils.equals(mab.b, this.a.d())) {
            cvh cvh = this.a;
            if (!cvh.a.i() && mab.f != null && mab.b.equals(cvh.d()) && !TextUtils.isEmpty(mab.f.a) && !mab.f.a.equals(cvh.d())) {
                cvh.a.b(true);
                return;
            }
            return;
        }
        boolean z = mab.e != null && gwb.b(mab.e.a);
        cvh cvh2 = this.a;
        List<cvn> list = (List) cvh2.c.get(cvh2.b(mab.b));
        if (list != null) {
            for (cvn a : list) {
                a.a(z);
            }
        }
    }

    private void b(mab mab) {
        a(mab);
    }

    private void c(mab mab) {
        if (gwb.a(mab.d) == 1) {
            cvh cvh = this.a;
            List<cvn> list = (List) cvh.c.get(cvh.b(mab.b));
            if (list != null) {
                for (cvn a : list) {
                    a.a(true);
                }
            }
        }
    }
}
