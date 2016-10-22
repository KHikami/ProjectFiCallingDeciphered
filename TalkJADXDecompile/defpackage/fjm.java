package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

/* renamed from: fjm */
public final class fjm implements ead {
    private static final boolean a;
    private final fjo b;

    static {
        kae kae = glk.l;
        a = false;
    }

    public fjm(fjo fjo) {
        this.b = fjo;
    }

    public String K_() {
        return "mms_recv_queue";
    }

    public long b() {
        return ((biw) jyn.a(gwb.H(), biw.class)).a("babel_pending_message_failure_duration", 1200000);
    }

    public boolean c() {
        return false;
    }

    public void a(Context context, eaf eaf) {
        String valueOf;
        long a = glj.a();
        try {
            byte[] d = this.b.d();
            String c = this.b.c();
            if (fyg.a) {
                String str = "MmsTransaction.retrieveMessage: ";
                String valueOf2 = String.valueOf(c);
                if (valueOf2.length() != 0) {
                    str.concat(valueOf2);
                } else {
                    valueOf2 = new String(str);
                }
            }
            if (TextUtils.isEmpty(c)) {
                throw new ahy("MmsTransactions: retrieve: empty URL");
            }
            ait a2;
            if (fyi.a(context)) {
                a2 = ((fxw) jyn.a(context, fxw.class)).a(context, d, c);
            } else {
                a2 = fyg.a(context, d, c);
            }
            Uri a3 = fyi.a(context, a2);
            if (a3 == null) {
                glk.e("Babel_RetrieveMmsNetReq", "RetrieveMmsRequest: failed to persist message into telephony", new Object[0]);
                throw new fdo(134, "Failed to persist retrieved mms message");
            }
            fzb.a(1, fyi.c(a3));
            evz ezg = new ezg(a3, this.b.e(), this.b.f());
            long a4 = glj.a();
            ezg.a(a * 1000);
            ezg.b(a4 * 1000);
            ezg.a(this.b);
            RealTimeChatService.a(eaf.b(), ezg);
        } catch (Exception e) {
            valueOf = String.valueOf(e);
            glk.d("Babel_RetrieveMmsNetReq", new StringBuilder(String.valueOf(valueOf).length() + 47).append("RetrieveMmsRequest: failed to retrieve message ").append(valueOf).toString(), (Throwable) e);
            throw new fdo(118, e);
        } catch (Exception e2) {
            valueOf = String.valueOf(e2);
            glk.d("Babel_RetrieveMmsNetReq", new StringBuilder(String.valueOf(valueOf).length() + 47).append("RetrieveMmsRequest: failed to retrieve message ").append(valueOf).toString(), (Throwable) e2);
            throw new fdo(e2.a, e2);
        } catch (Exception e22) {
            valueOf = String.valueOf(e22);
            glk.d("Babel_RetrieveMmsNetReq", new StringBuilder(String.valueOf(valueOf).length() + 47).append("RetrieveMmsRequest: failed to retrieve message ").append(valueOf).toString(), (Throwable) e22);
            throw new fdo(137, e22);
        }
    }

    public void a_(Context context, int i, fdo fdo) {
        bko e = fde.e(i);
        if (e != null) {
            bko k = fde.k();
            if (k == null) {
                glk.d("Babel_RetrieveMmsNetReq", "Skipping request failure for null MMS account", new Object[0]);
                return;
            }
            RealTimeChatService.a(k.g(), this.b.e(), this.b.f(), fdo.c());
            if (!(fdo == null || fdo.c() == 0)) {
                ((iih) jyn.a(context, iih.class)).a(k.g()).b().a(Integer.valueOf(fdo.c())).a(String.valueOf(this.b.e())).c(1524);
            }
            RealTimeChatService.a(e, this.b, fdo);
        } else if (glk.a("Babel_RetrieveMmsNetReq", 3)) {
            glk.a("Babel_RetrieveMmsNetReq", "Skipping request failure for invalid account: " + i, new Object[0]);
        }
    }

    public boolean d() {
        return false;
    }

    public boolean a(String str) {
        return false;
    }

    public boolean a(ead ead) {
        return false;
    }

    public String toString() {
        String str = "RetrieveMmsNetworkRequest ";
        String valueOf = String.valueOf(this.b.toString());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        switch (fdo.c()) {
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
                glk.d("Babel_RetrieveMmsNetReq", "Default no retry on BabelClientError: " + fdo.c(), new Object[0]);
                return false;
        }
    }

    public void f() {
    }

    public List<bhc> e() {
        return null;
    }
}
