package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.hangout.IncomingRing;

/* renamed from: diq */
final class diq implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ bko b;
    final /* synthetic */ khc c;
    final /* synthetic */ dip d;

    diq(dip dip, Context context, bko bko, khc khc) {
        this.d = dip;
        this.a = context;
        this.b = bko;
        this.c = khc;
    }

    public void run() {
        dip dip = this.d;
        Context context = this.a;
        bko bko = this.b;
        khc khc = this.c;
        glk.c("Babel_IncomingInvitePrc", "Got hangoutInviteNotification DISMISS: reason: %s HangoutId: %s", khc.g, khc.b.a);
        dhz a = dip.a(r3, bko);
        int a2 = gwb.a(khc.g);
        for (dis a3 : jyn.c(context, dis.class)) {
            if (a3.a(context, bko.g(), a, a2)) {
                glk.c("Babel_IncomingInvitePrc", "Hangout ringing cancelled by handler: %s", (dis) r5.next());
                return;
            }
        }
        IncomingRing incomingRing = IncomingRing.b;
        if (incomingRing == null || !incomingRing.d().equals(a)) {
            if (a2 == 3) {
                did s = dgg.a().s();
                if (s == null || !s.e().equals(a)) {
                    ((dlh) jyn.a(gwb.H(), dlh.class)).c(a);
                } else {
                    int H = s.H();
                    if (s.H() == 0) {
                        glk.c("Babel_IncomingInvitePrc", "Ending hangout because inviter canceled and hangout is empty.", new Object[0]);
                        s.b(11009);
                    }
                    glk.c("Babel_IncomingInvitePrc", "Ignoring canceled notification because %d remote end points are already connected.", Integer.valueOf(H));
                    return;
                }
            }
            glk.c("Babel_IncomingInvitePrc", "Ignoring dismiss command because no matching ring activity or hangout found.", new Object[0]);
            return;
        }
        glk.c("Babel_IncomingInvitePrc", "Cancelling hangout ringing.", new Object[0]);
        iil.a("Expected null", a.n());
        incomingRing.m();
    }
}
