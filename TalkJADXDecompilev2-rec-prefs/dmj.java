package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class dmj implements OnClickListener {
    final /* synthetic */ dhu f10123a;
    final /* synthetic */ dhw f10124b;
    final /* synthetic */ dme f10125c;

    dmj(dme dme, dhu dhu, dhw dhw) {
        this.f10125c = dme;
        this.f10123a = dhu;
        this.f10124b = dhw;
    }

    public void onClick(View view) {
        boolean z = true;
        int i = 0;
        gwb.m2198f(1579);
        iry l = this.f10125c.f10113b.m11720l();
        if (l == null) {
            this.f10123a.m11863m();
        } else {
            l.m23059a(!l.mo1322g());
        }
        dme dme = this.f10125c;
        dhw dhw = this.f10124b;
        boolean j = dme.f10113b.m11718j();
        if (dhw.m11873a() == j) {
            int i2;
            if (j) {
                z = false;
            }
            dhw.mo1595a(z);
            if (j) {
                i2 = 182;
            } else {
                i2 = 184;
            }
            gwb.m2198f(i2);
        }
        dhu dhu = this.f10123a;
        if (l == null || !l.mo1322g()) {
            i = 8;
        }
        dhu.m11852b(i);
        this.f10123a.m11860j();
    }
}
