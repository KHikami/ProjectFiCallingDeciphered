package p000;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class fjq implements ead {
    private static final boolean f13224a = false;
    private final fjr f13225b;

    static {
        kae kae = glk.f15565l;
    }

    public fjq(fjr fjr) {
        this.f13225b = fjr;
    }

    public String K_() {
        return "mms_queue";
    }

    public long mo1017b() {
        return ((biw) jyn.m25426a(gwb.m1400H(), biw.class)).mo561a("babel_pending_sms_message_failure_duration", 300000);
    }

    public boolean mo1018c() {
        return false;
    }

    public void mo1007a(Context context, eaf eaf) {
        String valueOf;
        if (f13224a) {
            String str = "Sending mms request ";
            String valueOf2 = String.valueOf(this.f13225b.toString());
            if (valueOf2.length() != 0) {
                str.concat(valueOf2);
            } else {
                valueOf2 = new String(str);
            }
        }
        long a = glj.m17956a();
        try {
            fyh a2;
            if (this.f13225b.m15479n() != null) {
                a2 = fyg.m16579a(context, this.f13225b.m15471f(), this.f13225b.m15472g(), this.f13225b.m15479n(), false, false, 604800, 129, this.f13225b.m15468c());
            } else {
                a2 = fyg.m16578a(context, this.f13225b.m15471f(), this.f13225b.m15472g(), this.f13225b.m15473h(), this.f13225b.m15474i(), this.f13225b.m15475j(), this.f13225b.m15476k(), this.f13225b.m15477l(), this.f13225b.m15478m(), false, false, 604800, 129, this.f13225b.m15468c());
            }
            aiq aiq = new aiq(this);
            Uri a3 = fyi.m16588a(context, a2.f14366a, a2.f14367b, aiq);
            if (a3 == null) {
                glk.m17982e("Babel_SendMmsNetworkReq", "SendMmsRequest: failed to persist message into telephony", new Object[0]);
                throw new fdo(134, "Failed to persist sent mms message");
            }
            fzb.m16667a(1, fyi.m16624c(a3));
            evz ezk = new ezk(a3, a2.f14366a.mo225f(), this.f13225b.m15468c(), aiq.m2558a());
            long a4 = glj.m17956a();
            ezk.m8123a(1000 * a);
            ezk.m8128b(a4 * 1000);
            ezk.mo1960a(this.f13225b);
            RealTimeChatService.m8998a(eaf.m13268b(), ezk);
        } catch (Exception e) {
            valueOf = String.valueOf(e);
            glk.m17980d("Babel_SendMmsNetworkReq", new StringBuilder(String.valueOf(valueOf).length() + 39).append("SendMmsRequest: failed to send message ").append(valueOf).toString(), (Throwable) e);
            throw new fdo(118, e);
        } catch (Exception e2) {
            valueOf = String.valueOf(e2);
            glk.m17980d("Babel_SendMmsNetworkReq", new StringBuilder(String.valueOf(valueOf).length() + 39).append("SendMmsRequest: failed to send message ").append(valueOf).toString(), (Throwable) e2);
            throw new fdo(136, e2);
        } catch (Exception e22) {
            valueOf = String.valueOf(e22);
            glk.m17980d("Babel_SendMmsNetworkReq", new StringBuilder(String.valueOf(valueOf).length() + 39).append("SendMmsRequest: failed to send message ").append(valueOf).toString(), (Throwable) e22);
            throw new fdo(e22.f14344a, e22);
        }
    }

    public void a_(Context context, int i, fdo fdo) {
        int i2 = 0;
        bko e = fde.m15018e(i);
        if (e != null) {
            bko k = fde.m15031k();
            if (k == null) {
                glk.m17981d("Babel_SendMmsNetworkReq", "Skipping request failure for null MMS account", new Object[0]);
                return;
            }
            String e2 = this.f13225b.m15470e();
            String d = this.f13225b.m15469d();
            if (fdo != null) {
                i2 = fdo.m15084c();
            }
            RealTimeChatService.m9022a(k, e2, d, i2);
            RealTimeChatService.m9016a(e, this.f13225b, fdo);
        } else if (glk.m17973a("Babel_SendMmsNetworkReq", 3)) {
            glk.m17970a("Babel_SendMmsNetworkReq", "Skipping request failure for invalid account: " + i, new Object[0]);
        }
    }

    public boolean mo1019d() {
        return false;
    }

    public boolean mo1016a(String str) {
        return str.startsWith(this.f13225b.m15469d());
    }

    public boolean mo1015a(ead ead) {
        return false;
    }

    public String toString() {
        String str = "SendMmsNetworkRequest ";
        String valueOf = String.valueOf(this.f13225b.toString());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        int c = fdo.m15084c();
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
                glk.m17981d("Babel_SendMmsNetworkReq", "Default no retry on BabelClientError: " + c, new Object[0]);
                return false;
        }
    }

    public void mo1011f() {
    }

    public List<bhc> mo1010e() {
        return null;
    }
}
