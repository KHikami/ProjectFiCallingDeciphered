package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;

/* renamed from: dli */
public class dli {
    public final /* synthetic */ ProgressDialog a;
    public final /* synthetic */ epi b;

    public void a(boolean z) {
        boolean z2;
        boolean z3;
        glk.a("Babel_calls", "StartHangoutTask: starting ongoing Hangout activity; isExpressLane = " + z, new Object[0]);
        ba.a(this.b.h);
        ba.a(this.b.i);
        Activity activity = this.b.a;
        dhz dhz = this.b.h;
        if (this.b.i.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.b.h.l() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        activity.startActivity(gwb.a(dhz, z2, null, z3, this.b.b, this.b.c, 2, this.b.d, this.b.e, this.b.f, this.b.g, z));
        this.a.dismiss();
    }

    public dli(epi epi, ProgressDialog progressDialog) {
        this.b = epi;
        this.a = progressDialog;
    }
}
