package p000;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.apps.hangouts.hangout.IncomingRing;

final class dir implements Runnable {
    final /* synthetic */ String f9887a;
    final /* synthetic */ Context f9888b;
    final /* synthetic */ bko f9889c;
    final /* synthetic */ dhz f9890d;
    final /* synthetic */ String f9891e;
    final /* synthetic */ long f9892f;
    final /* synthetic */ khc f9893g;
    final /* synthetic */ khd f9894h;
    final /* synthetic */ khf f9895i;
    final /* synthetic */ String f9896j;
    final /* synthetic */ dip f9897k;

    dir(dip dip, String str, Context context, bko bko, dhz dhz, String str2, long j, khc khc, khd khd, khf khf, String str3) {
        this.f9897k = dip;
        this.f9887a = str;
        this.f9888b = context;
        this.f9889c = bko;
        this.f9890d = dhz;
        this.f9891e = str2;
        this.f9892f = j;
        this.f9893g = khc;
        this.f9894h = khd;
        this.f9895i = khf;
        this.f9896j = str3;
    }

    public void run() {
        int i;
        if (this.f9887a.equals("105250506097979753968")) {
            for (dis a : jyn.m25438c(this.f9888b, dis.class)) {
                if (a.mo2194a(this.f9888b, this.f9889c, this.f9890d, this.f9891e, this.f9892f)) {
                    glk.m17970a("Babel_IncomingInvitePrc", "Incoming PSTN ring handled by handler: %s", (dis) r0.next());
                    return;
                }
            }
        }
        dip dip = this.f9897k;
        Context context = this.f9888b;
        if (dgg.m11692a().m11710c() && (dgg.m11692a().m11727s() != null || ((dlh) jyn.m25426a(context, dlh.class)).mo1416d())) {
            i = 1;
        } else if (IncomingRing.f6355b != null) {
            i = 1;
        } else if (((TelephonyManager) context.getSystemService("phone")).getCallState() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            glk.m17970a("Babel_IncomingInvitePrc", "Downgrading ring to ding because of ongoing ring/call", new Object[0]);
            dip = this.f9897k;
            dip.m12019a(this.f9889c, this.f9893g, 1);
            return;
        }
        if (((fuz) jyn.m25426a(gwb.m1400H(), fuz.class)).m16294b(this.f9889c.m5638g())) {
            String str;
            glk.m17970a("Babel_IncomingInvitePrc", "Got ring hangoutInviteNotification: InviterGaiaId: %s HangoutId: %s", this.f9887a, this.f9894h.f21709a);
            if (gwb.m2061b(this.f9895i.f21746h)) {
                str = null;
            } else {
                str = this.f9895i.f21742d;
            }
            IncomingRing.m8605a(this.f9888b, this.f9892f, this.f9890d, this.f9887a, this.f9896j, this.f9891e, str, this.f9897k.f9879a);
            return;
        }
        glk.m17970a("Babel_IncomingInvitePrc", "Downgrading ring to ding because of user does not want to be notified", new Object[0]);
        dip = this.f9897k;
        dip.m12019a(this.f9889c, this.f9893g, 9);
    }
}
