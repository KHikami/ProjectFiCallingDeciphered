package defpackage;

import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;
import oiv;

/* renamed from: env */
public class env implements gbm {
    final lhx a;
    onc<lfd> b;
    onc<dr> c;
    onc<StatusMessageSettingsFragment> d;
    onc<gbg> e;
    final /* synthetic */ ekf f;

    env(ekf ekf, lhx lhx) {
        this.f = ekf;
        this.a = (lhx) bn.a(lhx);
        a();
    }

    void a() {
        this.b = this.f.a;
        this.c = oiv.a(new lhy(this.a));
        this.d = new gbn(this.c);
        this.e = new gbl(this.f.b.c.a, this.b, this.d, this.f.b.c.e);
    }

    public gbg b() {
        return (gbg) this.e.a();
    }
}
