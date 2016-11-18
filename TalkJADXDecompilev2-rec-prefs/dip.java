package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.hangouts.hangout.IncomingRing;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dip {
    final String f9879a;
    private final String f9880b;
    private final String f9881c;
    private final String f9882d;

    public dip(Context context, String str, String str2, String str3, String str4) {
        this.f9880b = str;
        this.f9881c = str2;
        this.f9882d = str3;
        this.f9879a = str4;
        IncomingRing.m8609b(context.getPackageName());
        if (IncomingRing.f6355b == null) {
            IncomingRing.m8612o();
        }
    }

    public void m12020a(Context context) {
        glk.m17979c("Babel_IncomingInvitePrc", "Hangout Invitation Receiver got invitation GCM", new Object[0]);
        Handler handler = new Handler(Looper.getMainLooper());
        bko a = fde.m14993a(edo.m13604a(this.f9880b));
        if (this.f9881c == null) {
            glk.m17970a("Babel_IncomingInvitePrc", "Missing hangoutInviteId", new Object[0]);
            dip.m12019a(a, null, 2);
            return;
        }
        khc a2 = dip.m12018a(this.f9882d);
        if (a2 == null) {
            glk.m17970a("Babel_IncomingInvitePrc", "Ignoring null hangoutInviteNotification", new Object[0]);
            dip.m12019a(a, null, 2);
            return;
        }
        khd khd = a2.f21683b;
        dhz a3 = dip.m12017a(khd, a);
        if (a2.f21685d == null) {
            glk.m17970a("Babel_IncomingInvitePrc", "Ignoring hangoutInviteNotification without any command", new Object[0]);
            dip.m12019a(a, a2, 2);
        } else if (gwb.m1507a(a2.f21685d) == 1) {
            glk.m17970a("Babel_IncomingInvitePrc", "Ignoring due to dismiss", new Object[0]);
            handler.post(new diq(this, context, a, a2));
        } else {
            khf khf = khd.f21723o;
            if (khf == null) {
                glk.m17970a("Babel_IncomingInvitePrc", "Ignoring hangoutStartContext without invitation", new Object[0]);
                dip.m12019a(a, a2, 2);
                return;
            }
            String str = khf.f21740b;
            if (TextUtils.isEmpty(str) || khf.f21739a == null) {
                glk.m17970a("Babel_IncomingInvitePrc", "Ignoring hangoutStartContext without invitation data", new Object[0]);
                dip.m12019a(a, a2, 2);
                return;
            }
            int a4 = gwb.m1507a(khf.f21741c);
            if (a4 != 0 && a4 != 1 && a4 != 2) {
                glk.m17981d("Babel_IncomingInvitePrc", "Ignoring unsupported InvitationType %s", khf.f21741c);
                dip.m12019a(a, a2, 4);
            } else if (a3.m11904n() == null) {
                glk.m17970a("Babel_IncomingInvitePrc", "Ignoring null invitee nick", new Object[0]);
                dip.m12019a(a, a2, 2);
            } else {
                String str2;
                if (TextUtils.isEmpty(khd.f21734z)) {
                    str2 = null;
                } else {
                    str2 = khd.f21734z;
                }
                long a5 = gwb.m1523a(a2.f21682a);
                long a6 = gwb.m1523a(khf.f21739a) * 1000;
                if (gwb.m1507a(a2.f21686e) != 0) {
                    int i;
                    blo blo = new blo(context, a.m5638g());
                    if (gwb.m1507a(a2.f21686e) == 1) {
                        i = 20;
                    } else {
                        i = 10;
                    }
                    blo.m5968a(a, str, str2, a5, a6, i);
                    return;
                }
                String str3;
                if (gwb.m2061b(khf.f21746h)) {
                    str3 = khf.f21745g;
                } else {
                    str3 = null;
                }
                handler.post(new dir(this, str, context, a, a3, str3, a5, a2, khd, khf, str2));
            }
        }
    }

    private static khc m12018a(String str) {
        if (str == null) {
            glk.m17981d("Babel_IncomingInvitePrc", "Missing HangoutInviteNotification", new Object[0]);
            return null;
        }
        try {
            return (khc) nzf.m1027a(new khc(), Base64.decode(str, 0));
        } catch (nzd e) {
            glk.m17981d("Babel_IncomingInvitePrc", "Invalid BatchCommand message received", new Object[0]);
            return null;
        }
    }

    static dhz m12017a(khd khd, bko bko) {
        glk.m17970a("Babel_IncomingInvitePrc", "Using start context hangout type=%d", Integer.valueOf(gld.m17919a(khd.f21712d)));
        dib e = new dib(bko.m5629a(), r0).m11911a(gwb.m1508a(khd.f21700K, 1)).m11916e(khd.f21709a);
        if (!TextUtils.isEmpty(khd.f21734z)) {
            e.m11912a("conversation");
            e.m11913b(khd.f21734z);
        }
        if (!TextUtils.isEmpty(khd.f21725q)) {
            e.m11919h(khd.f21725q);
        }
        return e.m11910a();
    }

    static void m12019a(bko bko, khc khc, int i) {
        mbr mbr = new mbr();
        if (khc != null) {
            mbr.f27262a = khc.f21682a;
            if (khc.f21683b != null) {
                mbr.f27263b = khc.f21683b.f21709a;
            }
        }
        mbr.f27264c = Long.valueOf(glj.m17956a() * 1000);
        mbr.f27266e = Integer.valueOf(i);
        RealTimeChatService.m9030a(bko, mbr);
    }
}
