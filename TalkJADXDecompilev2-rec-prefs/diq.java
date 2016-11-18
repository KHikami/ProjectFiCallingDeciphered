package p000;

import android.content.Context;
import com.google.android.apps.hangouts.hangout.IncomingRing;

final class diq implements Runnable {
    final /* synthetic */ Context f9883a;
    final /* synthetic */ bko f9884b;
    final /* synthetic */ khc f9885c;
    final /* synthetic */ dip f9886d;

    diq(dip dip, Context context, bko bko, khc khc) {
        this.f9886d = dip;
        this.f9883a = context;
        this.f9884b = bko;
        this.f9885c = khc;
    }

    public void run() {
        dip dip = this.f9886d;
        Context context = this.f9883a;
        bko bko = this.f9884b;
        khc khc = this.f9885c;
        glk.m17979c("Babel_IncomingInvitePrc", "Got hangoutInviteNotification DISMISS: reason: %s HangoutId: %s", khc.f21688g, khc.f21683b.f21709a);
        dhz a = dip.m12017a(r3, bko);
        int a2 = gwb.m1507a(khc.f21688g);
        for (dis a3 : jyn.m25438c(context, dis.class)) {
            if (a3.mo2192a(context, bko.m5638g(), a, a2)) {
                glk.m17979c("Babel_IncomingInvitePrc", "Hangout ringing cancelled by handler: %s", (dis) r5.next());
                return;
            }
        }
        IncomingRing incomingRing = IncomingRing.f6355b;
        if (incomingRing == null || !incomingRing.m8635d().equals(a)) {
            if (a2 == 3) {
                did s = dgg.m11692a().m11727s();
                if (s == null || !s.m11981e().equals(a)) {
                    ((dlh) jyn.m25426a(gwb.m1400H(), dlh.class)).mo1415c(a);
                } else {
                    int H = s.m11943H();
                    if (s.m11943H() == 0) {
                        glk.m17979c("Babel_IncomingInvitePrc", "Ending hangout because inviter canceled and hangout is empty.", new Object[0]);
                        s.m11973b(11009);
                    }
                    glk.m17979c("Babel_IncomingInvitePrc", "Ignoring canceled notification because %d remote end points are already connected.", Integer.valueOf(H));
                    return;
                }
            }
            glk.m17979c("Babel_IncomingInvitePrc", "Ignoring dismiss command because no matching ring activity or hangout found.", new Object[0]);
            return;
        }
        glk.m17979c("Babel_IncomingInvitePrc", "Cancelling hangout ringing.", new Object[0]);
        iil.m21872a("Expected null", a.m11904n());
        incomingRing.m8644m();
    }
}
