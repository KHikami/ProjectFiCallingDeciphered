package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ffc implements bhi, bhm {
    private static final boolean f12954a = false;
    private final Bundle f12955b;
    private final long f12956c;

    static {
        kae kae = glk.f15568o;
    }

    public ffc(Bundle bundle, long j) {
        this.f12955b = bundle;
        this.f12956c = j;
    }

    public int mo539a(Context context, bhb bhb) {
        ffe ffe;
        String string;
        String string2 = this.f12955b.getString("type");
        if (TextUtils.equals(string2, "hangout")) {
            ffe = ffe.HANGOUT_PUSH;
        } else if (string2 != null && string2.startsWith("call/")) {
            ffe = ffe.CALL_PUSH;
        } else if (string2 == null || TextUtils.equals(string2, "babel:proto")) {
            ffe = ffe.HEAVY_TICKLE;
        } else if (TextUtils.equals(string2, "babel:synctickle")) {
            ffe = ffe.SYNC_TICKLE;
        } else {
            ffe = ffe.UNKNOWN;
        }
        Bundle bundle = this.f12955b;
        switch (ffd.f12957a[ffe.ordinal()]) {
            case 1:
                string = bundle.getString("focus_account_id");
                break;
            case 2:
            case 3:
            case 4:
                string = bundle.getString("recipient");
                break;
            default:
                string = null;
                break;
        }
        String valueOf;
        String valueOf2;
        if (ffe == ffe.UNKNOWN) {
            string = "Babel_GcmMsgReceiver";
            valueOf = String.valueOf("GCM push with unknown type = ");
            valueOf2 = String.valueOf(string2);
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            glk.m17982e(string, valueOf2, new Object[0]);
            gwb.m1823a(null, 2139);
            if (gjk.f15365b) {
                new gjn().m17819a("gcm_error_unknown").m17823b(string2).m17824b();
            }
            return bhn.f3348a;
        } else if (TextUtils.isEmpty(string)) {
            string = "Babel_GcmMsgReceiver";
            valueOf = "GCM push received for empty recipient in type:";
            valueOf2 = String.valueOf(string2);
            glk.m17982e(string, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
            gwb.m1823a(null, 1837);
            if (gjk.f15365b) {
                new gjn().m17819a("gcm_error_missing_participant").m17824b();
            }
            return bhn.f3348a;
        } else {
            edo a = edo.m13604a(string);
            bko a2 = fde.m14993a(a);
            if (a2 == null) {
                valueOf = "Babel_GcmMsgReceiver";
                String str = "GCM push received for invalid account: ";
                valueOf2 = String.valueOf(glk.m17974b(string));
                if (valueOf2.length() != 0) {
                    valueOf2 = str.concat(valueOf2);
                } else {
                    valueOf2 = new String(str);
                }
                glk.m17982e(valueOf, valueOf2, new Object[0]);
                gwb.m1823a(null, 1838);
                if (gjk.f15365b) {
                    new gjn().m17819a("gcm_error_unknown_participant").m17818a(a).m17824b();
                }
                ((fnc) jyn.m25426a(context, fnc.class)).mo2047a(string);
                return bhn.f3348a;
            }
            int g = a2.m5638g();
            if (fde.m15015d(a2)) {
                if (glk.m17973a("Babel_GcmMsgReceiver", 3)) {
                    string = "Babel_GcmMsgReceiver";
                    string2 = "GCM push received for logged off account: ";
                    valueOf2 = String.valueOf(a2.m5629a());
                    if (valueOf2.length() != 0) {
                        valueOf2 = string2.concat(valueOf2);
                    } else {
                        valueOf2 = new String(string2);
                    }
                    glk.m17976b(string, valueOf2, new Object[0]);
                }
                if (gjk.f15365b) {
                    new gjn().m17819a("gcm_error_logged_out_participant").m17817a(a2).m17824b();
                }
                fde.m15027i(g);
                return bhn.f3348a;
            }
            if (f12954a) {
                string = String.valueOf(ffe);
                string2 = String.valueOf(a2.m5629a());
                new StringBuilder((String.valueOf(string).length() + 42) + String.valueOf(string2).length()).append("GCM hangout push with type: ").append(string).append(" for account: ").append(string2);
            }
            if (gjk.f15365b) {
                gjn gjn = new gjn();
                switch (ffd.f12957a[ffe.ordinal()]) {
                    case 1:
                        gjn.m17819a("gcm_video_ring");
                        break;
                    case 2:
                        gjn.m17819a("gcm_heavy");
                        break;
                    case 3:
                        gjn.m17819a("gcm_sync");
                        break;
                }
                gjn.m17817a(a2).m17824b();
            }
            switch (ffd.f12957a[ffe.ordinal()]) {
                case 1:
                    if (!fde.m15015d(a2)) {
                        new dip(context, this.f12955b.getString("focus_account_id"), this.f12955b.getString("id"), this.f12955b.getString("notification"), this.f12955b.getString("inviter_jid")).m12020a(context);
                        break;
                    }
                    string = "Babel_GcmMsgReceiver";
                    String str2 = "Hangout notification for account that is not setup yet: ";
                    valueOf2 = String.valueOf(glk.m17974b(a2.m5629a()));
                    glk.m17981d(string, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), new Object[0]);
                    return bhn.f3348a;
                case 2:
                    string2 = this.f12955b.getString("proto");
                    long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                    if (fdq.f12765G.m14370b(g)) {
                        ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new fpv(g, string2, this.f12956c, elapsedRealtime));
                        break;
                    }
                    break;
                case 3:
                    RealTimeChatService.m9006a(g, false, fjl.NO_DELAY, flt.SYNC_TICKLE_SYNC);
                    break;
                case 4:
                    dgg.m11692a().m11712d(this.f12955b.getString("proto"));
                    break;
            }
            return bhn.f3348a;
        }
    }
}
