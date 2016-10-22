package defpackage;

import android.app.Activity;

/* renamed from: css */
final class css extends itg {
    final /* synthetic */ ite a;
    final /* synthetic */ dhz b;
    final /* synthetic */ Activity c;
    final /* synthetic */ csr d;

    css(csr csr, ite ite, dhz dhz, Activity activity) {
        this.d = csr;
        this.a = ite;
        this.b = dhz;
        this.c = activity;
        super('\u0000');
    }

    public void a(itk itk) {
        this.a.b((itg) this);
    }

    public void a(int i) {
        this.a.b((itg) this);
        this.d.a(this.b, null, true, false, false, false);
        this.c.recreate();
    }
}
