package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: ffc */
public final class ffc implements bhi, bhm {
    private static final boolean a;
    private final Bundle b;
    private final long c;

    static {
        kae kae = glk.o;
        a = false;
    }

    public ffc(Bundle bundle, long j) {
        this.b = bundle;
        this.c = j;
    }

    public int a(Context context, bhb bhb) {
        ffe ffe;
        String string;
        String string2 = this.b.getString("type");
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
        Bundle bundle = this.b;
        switch (ffd.a[ffe.ordinal()]) {
            case wi.j /*1*/:
                string = bundle.getString("focus_account_id");
                break;
            case wi.l /*2*/:
            case wi.z /*3*/:
            case wi.h /*4*/:
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
            glk.e(string, valueOf2, new Object[0]);
            gwb.a(null, 2139);
            if (gjk.b) {
                new gjn().a("gcm_error_unknown").b(string2).b();
            }
            return bhn.a;
        } else if (TextUtils.isEmpty(string)) {
            string = "Babel_GcmMsgReceiver";
            valueOf = "GCM push received for empty recipient in type:";
            valueOf2 = String.valueOf(string2);
            glk.e(string, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new Object[0]);
            gwb.a(null, 1837);
            if (gjk.b) {
                new gjn().a("gcm_error_missing_participant").b();
            }
            return bhn.a;
        } else {
            edo a = edo.a(string);
            bko a2 = fde.a(a);
            if (a2 == null) {
                valueOf = "Babel_GcmMsgReceiver";
                String str = "GCM push received for invalid account: ";
                valueOf2 = String.valueOf(glk.b(string));
                if (valueOf2.length() != 0) {
                    valueOf2 = str.concat(valueOf2);
                } else {
                    valueOf2 = new String(str);
                }
                glk.e(valueOf, valueOf2, new Object[0]);
                gwb.a(null, 1838);
                if (gjk.b) {
                    new gjn().a("gcm_error_unknown_participant").a(a).b();
                }
                ((fnc) jyn.a(context, fnc.class)).a(string);
                return bhn.a;
            }
            int g = a2.g();
            if (fde.d(a2)) {
                if (glk.a("Babel_GcmMsgReceiver", 3)) {
                    string = "Babel_GcmMsgReceiver";
                    string2 = "GCM push received for logged off account: ";
                    valueOf2 = String.valueOf(a2.a());
                    if (valueOf2.length() != 0) {
                        valueOf2 = string2.concat(valueOf2);
                    } else {
                        valueOf2 = new String(string2);
                    }
                    glk.b(string, valueOf2, new Object[0]);
                }
                if (gjk.b) {
                    new gjn().a("gcm_error_logged_out_participant").a(a2).b();
                }
                fde.i(g);
                return bhn.a;
            }
            if (a) {
                string = String.valueOf(ffe);
                string2 = String.valueOf(a2.a());
                new StringBuilder((String.valueOf(string).length() + 42) + String.valueOf(string2).length()).append("GCM hangout push with type: ").append(string).append(" for account: ").append(string2);
            }
            if (gjk.b) {
                gjn gjn = new gjn();
                switch (ffd.a[ffe.ordinal()]) {
                    case wi.j /*1*/:
                        gjn.a("gcm_video_ring");
                        break;
                    case wi.l /*2*/:
                        gjn.a("gcm_heavy");
                        break;
                    case wi.z /*3*/:
                        gjn.a("gcm_sync");
                        break;
                }
                gjn.a(a2).b();
            }
            switch (ffd.a[ffe.ordinal()]) {
                case wi.j /*1*/:
                    if (!fde.d(a2)) {
                        new dip(context, this.b.getString("focus_account_id"), this.b.getString("id"), this.b.getString("notification"), this.b.getString("inviter_jid")).a(context);
                        break;
                    }
                    string = "Babel_GcmMsgReceiver";
                    String str2 = "Hangout notification for account that is not setup yet: ";
                    valueOf2 = String.valueOf(glk.b(a2.a()));
                    glk.d(string, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), new Object[0]);
                    return bhn.a;
                case wi.l /*2*/:
                    string2 = this.b.getString("proto");
                    long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                    if (fdq.G.b(g)) {
                        ((bhl) jyn.a(context, bhl.class)).a(new fpv(g, string2, this.c, elapsedRealtime));
                        break;
                    }
                    break;
                case wi.z /*3*/:
                    RealTimeChatService.a(g, false, fjl.NO_DELAY, flt.SYNC_TICKLE_SYNC);
                    break;
                case wi.h /*4*/:
                    dgg.a().d(this.b.getString("proto"));
                    break;
            }
            return bhn.a;
        }
    }
}
