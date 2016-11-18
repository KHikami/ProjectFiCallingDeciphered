package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class fjq implements ead {
    private static final boolean a = false;
    private final fjr b;

    static {
        kae kae = glk.l;
    }

    public fjq(fjr fjr) {
        this.b = fjr;
    }

    public String K_() {
        return "mms_queue";
    }

    public long b() {
        return ((biw) jyn.a(gwb.H(), biw.class)).a("babel_pending_sms_message_failure_duration", 300000);
    }

    public boolean c() {
        return false;
    }

    public void a(Context context, eaf eaf) {
        String valueOf;
        if (a) {
            String str = "Sending mms request ";
            String valueOf2 = String.valueOf(this.b.toString());
            if (valueOf2.length() != 0) {
                str.concat(valueOf2);
            } else {
                valueOf2 = new String(str);
            }
        }
        long a = glj.a();
        try {
            fyh a2;
            if (this.b.n() != null) {
                a2 = fyg.a(context, this.b.f(), this.b.g(), this.b.n(), false, false, 604800, 129, this.b.c());
            } else {
                a2 = fyg.a(context, this.b.f(), this.b.g(), this.b.h(), this.b.i(), this.b.j(), this.b.k(), this.b.l(), this.b.m(), false, false, 604800, 129, this.b.c());
            }
            aiq aiq = new aiq(this);
            Uri a3 = fyi.a(context, a2.a, a2.b, aiq);
            if (a3 == null) {
                glk.e("Babel_SendMmsNetworkReq", "SendMmsRequest: failed to persist message into telephony", new Object[0]);
                throw new fdo(134, "Failed to persist sent mms message");
            }
            fzb.a(1, fyi.c(a3));
            evz ezk = new ezk(a3, a2.a.f(), this.b.c(), aiq.a());
            long a4 = glj.a();
            ezk.a(1000 * a);
            ezk.b(a4 * 1000);
            ezk.a(this.b);
            RealTimeChatService.a(eaf.b(), ezk);
        } catch (Exception e) {
            valueOf = String.valueOf(e);
            glk.d("Babel_SendMmsNetworkReq", new StringBuilder(String.valueOf(valueOf).length() + 39).append("SendMmsRequest: failed to send message ").append(valueOf).toString(), (Throwable) e);
            throw new fdo(118, e);
        } catch (Exception e2) {
            valueOf = String.valueOf(e2);
            glk.d("Babel_SendMmsNetworkReq", new StringBuilder(String.valueOf(valueOf).length() + 39).append("SendMmsRequest: failed to send message ").append(valueOf).toString(), (Throwable) e2);
            throw new fdo(136, e2);
        } catch (Exception e22) {
            valueOf = String.valueOf(e22);
            glk.d("Babel_SendMmsNetworkReq", new StringBuilder(String.valueOf(valueOf).length() + 39).append("SendMmsRequest: failed to send message ").append(valueOf).toString(), (Throwable) e22);
            throw new fdo(e22.a, e22);
        }
    }

    public void a_(Context context, int i, fdo fdo) {
        int i2 = 0;
        bko e = fde.e(i);
        if (e != null) {
            bko k = fde.k();
            if (k == null) {
                glk.d("Babel_SendMmsNetworkReq", "Skipping request failure for null MMS account", new Object[0]);
                return;
            }
            String e2 = this.b.e();
            String d = this.b.d();
            if (fdo != null) {
                i2 = fdo.c();
            }
            RealTimeChatService.a(k, e2, d, i2);
            RealTimeChatService.a(e, this.b, fdo);
        } else if (glk.a("Babel_SendMmsNetworkReq", 3)) {
            glk.a("Babel_SendMmsNetworkReq", "Skipping request failure for invalid account: " + i, new Object[0]);
        }
    }

    public boolean d() {
        return false;
    }

    public boolean a(String str) {
        return str.startsWith(this.b.d());
    }

    public boolean a(ead ead) {
        return false;
    }

    public String toString() {
        String str = "SendMmsNetworkRequest ";
        String valueOf = String.valueOf(this.b.toString());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        int c = fdo.c();
        switch (c) {
            case 106:
            case 119:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
                return false;
            case 118:
                return true;
            default:
                glk.d("Babel_SendMmsNetworkReq", "Default no retry on BabelClientError: " + c, new Object[0]);
                return false;
        }
    }

    public void f() {
    }

    public List<bhc> e() {
        return null;
    }
}
