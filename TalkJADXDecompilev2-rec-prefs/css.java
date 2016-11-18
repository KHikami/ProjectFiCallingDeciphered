package p000;

import android.app.Activity;

final class css extends itg {
    final /* synthetic */ ite f9004a;
    final /* synthetic */ dhz f9005b;
    final /* synthetic */ Activity f9006c;
    final /* synthetic */ csr f9007d;

    css(csr csr, ite ite, dhz dhz, Activity activity) {
        this.f9007d = csr;
        this.f9004a = ite;
        this.f9005b = dhz;
        this.f9006c = activity;
        super('\u0000');
    }

    public void mo1386a(itk itk) {
        this.f9004a.mo3219b((itg) this);
    }

    public void mo1385a(int i) {
        this.f9004a.mo3219b((itg) this);
        this.f9007d.mo1409a(this.f9005b, null, true, false, false, false);
        this.f9006c.recreate();
    }
}
