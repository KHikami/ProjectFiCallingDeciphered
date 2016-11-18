package p000;

import android.content.Context;
import android.os.SystemClock;
import android.telecom.DisconnectCause;
import android.text.TextUtils;
import android.text.TextUtils.SimpleStringSplitter;
import java.util.Iterator;

public final class gee {
    final Context f14833a;
    final gcq f14834b;
    final long f14835c;
    boolean f14836d;
    private final geu f14837e;
    private final gcs f14838f = new gcs(this);
    private final gey f14839g;

    public gee(Context context, gcq gcq) {
        this.f14833a = context;
        this.f14834b = gcq;
        gcq.m16941a(this.f14838f);
        this.f14839g = new gey(this);
        this.f14837e = new geu(context, gcq, this.f14839g, new gbx());
        this.f14835c = SystemClock.elapsedRealtime();
    }

    public void m17126a() {
        this.f14834b.m16952c();
        if (!m17125d()) {
            this.f14837e.m17455b();
        } else if (!this.f14836d) {
            glk.m17979c("Babel_telephony", "TeleOutgoingCallRequest.blockCall", new Object[0]);
            this.f14834b.setDisconnected(new DisconnectCause(1, "invalid or blocked number"));
            m17128c();
        }
    }

    void m17127b() {
        if (!this.f14836d) {
            glk.m17979c("Babel_telephony", "TeleOutgoingCallRequest.cancelCall", new Object[0]);
            this.f14834b.setDisconnected(new DisconnectCause(4));
            m17128c();
        }
    }

    void m17128c() {
        if (!this.f14836d) {
            this.f14836d = true;
            this.f14837e.m17458c();
            this.f14839g.m17481c();
            this.f14838f.m16981b();
            this.f14834b.m16941a(null);
            this.f14834b.m16955d().m9200a().m17652b(this);
            if (this.f14834b.getState() == 6) {
                this.f14834b.destroy();
            }
        }
    }

    private boolean m17125d() {
        String c = this.f14834b.m16959f().m17141c();
        if (TextUtils.isEmpty(c)) {
            glk.m17979c("Babel_telephony", "TeleOutgoingCallRequest.isBlockedNumber, no phone number.", new Object[0]);
            return false;
        } else if (glq.m18019d(gwb.m1400H(), c)) {
            String str = "Babel_telephony";
            r4 = "TeleOutgoingCallRequest.isBlockedNumber, potential emergency number, ";
            r0 = String.valueOf(gwb.m1397G(c));
            glk.m17979c(str, r0.length() != 0 ? r4.concat(r0) : new String(r4), new Object[0]);
            return false;
        } else {
            String str2;
            Object b = gwb.m1998b(this.f14833a, "babel_tycho_only_blocked_short_codes", "+1411");
            if (!TextUtils.isEmpty(b)) {
                try {
                    r4 = new glo(c, glq.m18037i(gwb.m1400H())).m17990a(jau.f19622a);
                    SimpleStringSplitter simpleStringSplitter = new SimpleStringSplitter(',');
                    simpleStringSplitter.setString(b);
                    Iterator it = simpleStringSplitter.iterator();
                    while (it.hasNext()) {
                        if (r4.equals((String) it.next())) {
                            r4 = "Babel_telephony";
                            str2 = "TeleOutgoingCallRequest.isBlockedNumber, black listed: ";
                            r0 = String.valueOf(gwb.m1397G(c));
                            glk.m17979c(r4, r0.length() != 0 ? str2.concat(r0) : new String(str2), new Object[0]);
                            return true;
                        }
                    }
                } catch (Throwable e) {
                    Throwable th = e;
                    r4 = "Babel_telephony";
                    str2 = "TeleOutgoingCallRequest.isBlockedNumber, invalid number: ";
                    r0 = String.valueOf(gwb.m1397G(c));
                    glk.m17978c(r4, r0.length() != 0 ? str2.concat(r0) : new String(str2), th);
                    return false;
                }
            }
            if (gwb.m1906a(this.f14833a, "babel_tycho_only_block_special_codes", true)) {
                char charAt = c.charAt(0);
                if ((charAt == '*' || charAt == '#') && c.length() >= 3 && c.length() <= 6) {
                    r4 = "Babel_telephony";
                    str2 = "TeleOutgoingCallRequest.isBlockedNumber, blocking: ";
                    r0 = String.valueOf(gwb.m1397G(c));
                    glk.m17979c(r4, r0.length() != 0 ? str2.concat(r0) : new String(str2), new Object[0]);
                    return true;
                }
            }
            return false;
        }
    }
}
