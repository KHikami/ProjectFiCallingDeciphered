package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dmj */
final class dmj implements OnClickListener {
    final /* synthetic */ dhu a;
    final /* synthetic */ dhw b;
    final /* synthetic */ dme c;

    dmj(dme dme, dhu dhu, dhw dhw) {
        this.c = dme;
        this.a = dhu;
        this.b = dhw;
    }

    public void onClick(View view) {
        boolean z = true;
        int i = 0;
        gwb.f(1579);
        iry l = this.c.b.l();
        if (l == null) {
            this.a.m();
        } else {
            l.a(!l.g());
        }
        dme dme = this.c;
        dhw dhw = this.b;
        boolean j = dme.b.j();
        if (dhw.a() == j) {
            int i2;
            if (j) {
                z = false;
            }
            dhw.a(z);
            if (j) {
                i2 = 182;
            } else {
                i2 = 184;
            }
            gwb.f(i2);
        }
        dhu dhu = this.a;
        if (l == null || !l.g()) {
            i = 8;
        }
        dhu.b(i);
        this.a.j();
    }
}
