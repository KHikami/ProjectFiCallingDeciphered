package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.apps.hangouts.hangout.IncomingRing;

/* renamed from: dir */
final class dir implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ bko c;
    final /* synthetic */ dhz d;
    final /* synthetic */ String e;
    final /* synthetic */ long f;
    final /* synthetic */ khc g;
    final /* synthetic */ khd h;
    final /* synthetic */ khf i;
    final /* synthetic */ String j;
    final /* synthetic */ dip k;

    dir(dip dip, String str, Context context, bko bko, dhz dhz, String str2, long j, khc khc, khd khd, khf khf, String str3) {
        this.k = dip;
        this.a = str;
        this.b = context;
        this.c = bko;
        this.d = dhz;
        this.e = str2;
        this.f = j;
        this.g = khc;
        this.h = khd;
        this.i = khf;
        this.j = str3;
    }

    public void run() {
        int i;
        if (this.a.equals("105250506097979753968")) {
            for (dis a : jyn.c(this.b, dis.class)) {
                if (a.a(this.b, this.c, this.d, this.e, this.f)) {
                    glk.a("Babel_IncomingInvitePrc", "Incoming PSTN ring handled by handler: %s", (dis) r0.next());
                    return;
                }
            }
        }
        dip dip = this.k;
        Context context = this.b;
        if (dgg.a().c() && (dgg.a().s() != null || ((dlh) jyn.a(context, dlh.class)).d())) {
            i = 1;
        } else if (IncomingRing.b != null) {
            i = 1;
        } else if (((TelephonyManager) context.getSystemService("phone")).getCallState() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            glk.a("Babel_IncomingInvitePrc", "Downgrading ring to ding because of ongoing ring/call", new Object[0]);
            dip = this.k;
            dip.a(this.c, this.g, 1);
            return;
        }
        if (((fuz) jyn.a(gwb.H(), fuz.class)).b(this.c.g())) {
            String str;
            glk.a("Babel_IncomingInvitePrc", "Got ring hangoutInviteNotification: InviterGaiaId: %s HangoutId: %s", this.a, this.h.a);
            if (gwb.b(this.i.h)) {
                str = null;
            } else {
                str = this.i.d;
            }
            IncomingRing.a(this.b, this.f, this.d, this.a, this.j, this.e, str, this.k.a);
            return;
        }
        glk.a("Babel_IncomingInvitePrc", "Downgrading ring to ding because of user does not want to be notified", new Object[0]);
        dip = this.k;
        dip.a(this.c, this.g, 9);
    }
}
