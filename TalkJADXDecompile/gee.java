import android.content.Context;
import android.os.SystemClock;
import android.telecom.DisconnectCause;
import android.text.TextUtils;
import android.text.TextUtils.SimpleStringSplitter;
import java.util.Iterator;

public final class gee { //TeleOutgoingCallRequest
    final Context a;
    final gcq b; //call connection
    final long c;
    boolean d;
    private final geu e; //TeleSetupController
    private final gcs f; //disconect call listener
    private final gey g; //wifi or cell caller

    public gee(Context context, gcq gcq) {
        this.a = context;
        this.b = gcq;
        this.f = new gcs(this);//new disconnect call listener
        gcq.a(this.f);
        this.g = new gey(this);
        this.e = new geu(context, gcq, this.g, new gbx()); //new TeleSetupController
        this.c = SystemClock.elapsedRealtime();
    }

    public void a() {
        this.b.c();
        if (!d()) {//not a blacklisted blocked number
            this.e.b();//starts the setup (more like does the entire setup)
        } else if (!this.d) {
            glk.c("Babel_telephony", "TeleOutgoingCallRequest.blockCall", new Object[0]);
            this.b.setDisconnected(new DisconnectCause(1, "invalid or blocked number"));
            c();
        }
    }

    void b() {
        if (!this.d) {
            glk.c("Babel_telephony", "TeleOutgoingCallRequest.cancelCall", new Object[0]);
            this.b.setDisconnected(new DisconnectCause(4));
            c();
        }
    }

    void c() {
        if (!this.d) {
            this.d = true;
            this.e.c();//geu.d(3)
            this.g.c();//gey.c()
            this.f.b();//gcs.b()
            this.b.a(null);//gcg.a(Object?)
            this.b.d().a().b(this);//gcg.d().a().b(gee)
            if (this.b.getState() == 6) {
                this.b.destroy();
            }
        }
    }

    private boolean d() {
        String c = this.b.f().c();
        if (TextUtils.isEmpty(c)) {
            glk.c("Babel_telephony", "TeleOutgoingCallRequest.isBlockedNumber, no phone number.", new Object[0]);
            return false;
        } else if (glq.d(gwb.H(), c)) {
            String str = "Babel_telephony";
            r4 = "TeleOutgoingCallRequest.isBlockedNumber, potential emergency number, ";
            r0 = String.valueOf(gwb.G(c));
            glk.c(str, r0.length() != 0 ? r4.concat(r0) : new String(r4), new Object[0]);
            return false;
        } else {
            String str2;
            Object b = gwb.b(this.a, "babel_tycho_only_blocked_short_codes", "+1411");
            if (!TextUtils.isEmpty(b)) {
                try {
                    r4 = new glo(c, glq.i(gwb.H())).a(jau.a);
                    SimpleStringSplitter simpleStringSplitter = new SimpleStringSplitter(',');
                    simpleStringSplitter.setString(b);
                    Iterator it = simpleStringSplitter.iterator();
                    while (it.hasNext()) {
                        if (r4.equals((String) it.next())) {
                            r4 = "Babel_telephony";
                            str2 = "TeleOutgoingCallRequest.isBlockedNumber, black listed: ";
                            r0 = String.valueOf(gwb.G(c));
                            glk.c(r4, r0.length() != 0 ? str2.concat(r0) : new String(str2), new Object[0]);
                            return true;
                        }
                    }
                } catch (Throwable e) {
                    Throwable th = e;
                    r4 = "Babel_telephony";
                    str2 = "TeleOutgoingCallRequest.isBlockedNumber, invalid number: ";
                    r0 = String.valueOf(gwb.G(c));
                    glk.c(r4, r0.length() != 0 ? str2.concat(r0) : new String(str2), th);
                    return false;
                }
            }
            if (gwb.a(this.a, "babel_tycho_only_block_special_codes", true)) {
                char charAt = c.charAt(0);
                if ((charAt == '*' || charAt == '#') && c.length() >= 3 && c.length() <= 6) {
                    r4 = "Babel_telephony";
                    str2 = "TeleOutgoingCallRequest.isBlockedNumber, blocking: ";
                    r0 = String.valueOf(gwb.G(c));
                    glk.c(r4, r0.length() != 0 ? str2.concat(r0) : new String(str2), new Object[0]);
                    return true;
                }
            }
            return false;
        }
    }
}
