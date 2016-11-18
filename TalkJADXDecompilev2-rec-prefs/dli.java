package p000;

import android.app.Activity;
import android.app.ProgressDialog;

public class dli {
    public final /* synthetic */ ProgressDialog f10077a;
    public final /* synthetic */ epi f10078b;

    public void m12187a(boolean z) {
        boolean z2;
        boolean z3;
        glk.m17970a("Babel_calls", "StartHangoutTask: starting ongoing Hangout activity; isExpressLane = " + z, new Object[0]);
        ba.m4536a(this.f10078b.f11981h);
        ba.m4536a(this.f10078b.f11982i);
        Activity activity = this.f10078b.f11974a;
        dhz dhz = this.f10078b.f11981h;
        if (this.f10078b.f11982i.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f10078b.f11981h.m11902l() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        activity.startActivity(gwb.m1552a(dhz, z2, null, z3, this.f10078b.f11975b, this.f10078b.f11976c, 2, this.f10078b.f11977d, this.f10078b.f11978e, this.f10078b.f11979f, this.f10078b.f11980g, z));
        this.f10077a.dismiss();
    }

    public dli(epi epi, ProgressDialog progressDialog) {
        this.f10078b = epi;
        this.f10077a = progressDialog;
    }
}
