package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.hangouts.hangout.IncomingRing;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: dip */
public final class dip {
    final String a;
    private final String b;
    private final String c;
    private final String d;

    public dip(Context context, String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.a = str4;
        IncomingRing.b(context.getPackageName());
        if (IncomingRing.b == null) {
            IncomingRing.o();
        }
    }

    public void a(Context context) {
        glk.c("Babel_IncomingInvitePrc", "Hangout Invitation Receiver got invitation GCM", new Object[0]);
        Handler handler = new Handler(Looper.getMainLooper());
        bko a = fde.a(edo.a(this.b));
        if (this.c == null) {
            glk.a("Babel_IncomingInvitePrc", "Missing hangoutInviteId", new Object[0]);
            dip.a(a, null, 2);
            return;
        }
        khc a2 = dip.a(this.d);
        if (a2 == null) {
            glk.a("Babel_IncomingInvitePrc", "Ignoring null hangoutInviteNotification", new Object[0]);
            dip.a(a, null, 2);
            return;
        }
        khd khd = a2.b;
        dhz a3 = dip.a(khd, a);
        if (a2.d == null) {
            glk.a("Babel_IncomingInvitePrc", "Ignoring hangoutInviteNotification without any command", new Object[0]);
            dip.a(a, a2, 2);
        } else if (gwb.a(a2.d) == 1) {
            glk.a("Babel_IncomingInvitePrc", "Ignoring due to dismiss", new Object[0]);
            handler.post(new diq(this, context, a, a2));
        } else {
            khf khf = khd.o;
            if (khf == null) {
                glk.a("Babel_IncomingInvitePrc", "Ignoring hangoutStartContext without invitation", new Object[0]);
                dip.a(a, a2, 2);
                return;
            }
            String str = khf.b;
            if (TextUtils.isEmpty(str) || khf.a == null) {
                glk.a("Babel_IncomingInvitePrc", "Ignoring hangoutStartContext without invitation data", new Object[0]);
                dip.a(a, a2, 2);
                return;
            }
            int a4 = gwb.a(khf.c);
            if (a4 != 0 && a4 != 1 && a4 != 2) {
                glk.d("Babel_IncomingInvitePrc", "Ignoring unsupported InvitationType %s", khf.c);
                dip.a(a, a2, 4);
            } else if (a3.n() == null) {
                glk.a("Babel_IncomingInvitePrc", "Ignoring null invitee nick", new Object[0]);
                dip.a(a, a2, 2);
            } else {
                String str2;
                if (TextUtils.isEmpty(khd.z)) {
                    str2 = null;
                } else {
                    str2 = khd.z;
                }
                long a5 = gwb.a(a2.a);
                long a6 = gwb.a(khf.a) * 1000;
                if (gwb.a(a2.e) != 0) {
                    int i;
                    blo blo = new blo(context, a.g());
                    if (gwb.a(a2.e) == 1) {
                        i = 20;
                    } else {
                        i = 10;
                    }
                    blo.a(a, str, str2, a5, a6, i);
                    return;
                }
                String str3;
                if (gwb.b(khf.h)) {
                    str3 = khf.g;
                } else {
                    str3 = null;
                }
                handler.post(new dir(this, str, context, a, a3, str3, a5, a2, khd, khf, str2));
            }
        }
    }

    private static khc a(String str) {
        if (str == null) {
            glk.d("Babel_IncomingInvitePrc", "Missing HangoutInviteNotification", new Object[0]);
            return null;
        }
        try {
            return (khc) nzf.a(new khc(), Base64.decode(str, 0));
        } catch (nzd e) {
            glk.d("Babel_IncomingInvitePrc", "Invalid BatchCommand message received", new Object[0]);
            return null;
        }
    }

    static dhz a(khd khd, bko bko) {
        glk.a("Babel_IncomingInvitePrc", "Using start context hangout type=%d", Integer.valueOf(gld.a(khd.d)));
        dib e = new dib(bko.a(), r0).a(gwb.a(khd.K, 1)).e(khd.a);
        if (!TextUtils.isEmpty(khd.z)) {
            e.a("conversation");
            e.b(khd.z);
        }
        if (!TextUtils.isEmpty(khd.q)) {
            e.h(khd.q);
        }
        return e.a();
    }

    static void a(bko bko, khc khc, int i) {
        mbr mbr = new mbr();
        if (khc != null) {
            mbr.a = khc.a;
            if (khc.b != null) {
                mbr.b = khc.b.a;
            }
        }
        mbr.c = Long.valueOf(glj.a() * 1000);
        mbr.e = Integer.valueOf(i);
        RealTimeChatService.a(bko, mbr);
    }
}
