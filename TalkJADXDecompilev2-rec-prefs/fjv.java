package p000;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class fjv implements ead {
    private static final boolean f13279a = false;
    private final fjw f13280b;

    static {
        kae kae = glk.f15565l;
    }

    public fjv(fjw fjw) {
        this.f13280b = fjw;
    }

    public String K_() {
        return "sms_queue";
    }

    public long mo1017b() {
        return ((biw) jyn.m25426a(gwb.m1400H(), biw.class)).mo561a("babel_pending_sms_message_failure_duration", 300000);
    }

    public boolean mo1018c() {
        return false;
    }

    public void mo1007a(Context context, eaf eaf) {
        long a = glj.m17956a();
        String f;
        try {
            boolean o;
            f = this.f13280b.m15510f();
            String g = this.f13280b.m15511g();
            String i = this.f13280b.m15513i();
            if (ajf.m2609a().mo2134r()) {
                o = ((fzw) jyn.m25426a(context, fzw.class)).mo2167o();
            } else {
                o = false;
            }
            fza a2 = fyz.m16652a(context, f, g, i, o, this.f13280b.m15514j());
            if (a2.m16655a()) {
                glk.m17982e("Babel_SendSmsNetworkReq", "SendSmsRequest: sending timed out", new Object[0]);
                throw new fdo(117);
            }
            evz ezn;
            int b = a2.m16656b();
            if (f13279a) {
                new StringBuilder(33).append("Result failure level: ").append(b);
            }
            switch (b) {
                case 0:
                    Uri a3 = fyi.m16589a(context, this.f13280b.m15510f(), this.f13280b.m15511g(), this.f13280b.m15507c() / 1000, this.f13280b.m15512h(), false);
                    if (f13279a) {
                        String valueOf = String.valueOf(a3);
                        new StringBuilder(String.valueOf(valueOf).length() + 12).append("messageUri: ").append(valueOf);
                    }
                    if (a3 != null) {
                        fzb.m16667a(0, fyi.m16624c(a3));
                    } else {
                        glk.m17982e("Babel_SendSmsNetworkReq", "SendSmsRequest: sms provider returning null", new Object[0]);
                    }
                    ezn = new ezn(a3, this.f13280b.m15507c());
                    break;
                case 1:
                    glk.m17982e("Babel_SendSmsNetworkReq", "SendSmsRequest: temporary failure", new Object[0]);
                    throw new fdo(116);
                case 2:
                    glk.m17982e("Babel_SendSmsNetworkReq", "SendSmsRequest: permanent failure", new Object[0]);
                    throw new fdo(117);
                default:
                    ezn = null;
                    break;
            }
            if (ezn == null) {
                throw new fdo(106, "response null");
            }
            long a4 = glj.m17956a();
            ezn.m8123a(1000 * a);
            ezn.m8128b(a4 * 1000);
            ezn.mo1960a(this.f13280b);
            RealTimeChatService.m8998a(eaf.m13268b(), ezn);
        } catch (Exception e) {
            f = String.valueOf(e);
            glk.m17980d("Babel_SendSmsNetworkReq", new StringBuilder(String.valueOf(f).length() + 39).append("SendSmsRequest: failed to send message ").append(f).toString(), (Throwable) e);
            throw new fdo(117, e);
        }
    }

    public void a_(Context context, int i, fdo fdo) {
        int i2 = 0;
        bko e = fde.m15018e(i);
        if (e != null) {
            bko k = fde.m15031k();
            if (k == null) {
                glk.m17981d("Babel_SendSmsNetworkReq", "Skipping request failure for null SMS account", new Object[0]);
                return;
            }
            String e2 = this.f13280b.m15509e();
            String d = this.f13280b.m15508d();
            if (fdo != null) {
                i2 = fdo.m15084c();
            }
            RealTimeChatService.m9022a(k, e2, d, i2);
            RealTimeChatService.m9016a(e, this.f13280b, fdo);
        } else if (glk.m17973a("Babel_SendSmsNetworkReq", 3)) {
            glk.m17970a("Babel_SendSmsNetworkReq", "Skipping request failure for invalid account: " + i, new Object[0]);
        }
    }

    public boolean mo1019d() {
        return false;
    }

    public boolean mo1016a(String str) {
        return str.startsWith(this.f13280b.m15508d());
    }

    public boolean mo1015a(ead ead) {
        return false;
    }

    public String toString() {
        String str = "SendSmsNetworkRequest ";
        String valueOf = String.valueOf(this.f13280b.toString());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        if (eaf.m13269c() >= 3) {
            return false;
        }
        switch (fdo.m15084c()) {
            case 106:
            case 117:
                return false;
            case 116:
                return true;
            default:
                glk.m17981d("Babel_SendSmsNetworkReq", "Default no retry on BabelClientError: " + fdo.m15084c(), new Object[0]);
                return false;
        }
    }

    public void mo1011f() {
    }

    public List<bhc> mo1010e() {
        return null;
    }
}
