import android.content.Context;
import android.net.Uri;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class fjv implements ead {
    private static final boolean a;
    private final fjw b;

    static {
        kae kae = glk.l;
        a = false;
    }

    public fjv(fjw fjw) {
        this.b = fjw;
    }

    public String K_() {
        return "sms_queue";
    }

    public long b() {
        return ((biw) jyn.a(gwb.H(), biw.class)).a("babel_pending_sms_message_failure_duration", 300000);
    }

    public boolean c() {
        return false;
    }

    public void a(Context context, eaf eaf) {
        long a = glj.a();
        String f;
        try {
            boolean o;
            f = this.b.f();
            String g = this.b.g();
            String i = this.b.i();
            if (ajf.a().r()) {
                o = ((fzw) jyn.a(context, fzw.class)).o();
            } else {
                o = false;
            }
            fza a2 = fyz.a(context, f, g, i, o, this.b.j());
            if (a2.a()) {
                glk.e("Babel_SendSmsNetworkReq", "SendSmsRequest: sending timed out", new Object[0]);
                throw new fdo(117);
            }
            evz ezn;
            int b = a2.b();
            if (a) {
                new StringBuilder(33).append("Result failure level: ").append(b);
            }
            switch (b) {
                case wi.w /*0*/:
                    Uri a3 = fyi.a(context, this.b.f(), this.b.g(), this.b.c() / 1000, this.b.h(), false);
                    if (a) {
                        String valueOf = String.valueOf(a3);
                        new StringBuilder(String.valueOf(valueOf).length() + 12).append("messageUri: ").append(valueOf);
                    }
                    if (a3 != null) {
                        fzb.a(0, fyi.c(a3));
                    } else {
                        glk.e("Babel_SendSmsNetworkReq", "SendSmsRequest: sms provider returning null", new Object[0]);
                    }
                    ezn = new ezn(a3, this.b.c());
                    break;
                case wi.j /*1*/:
                    glk.e("Babel_SendSmsNetworkReq", "SendSmsRequest: temporary failure", new Object[0]);
                    throw new fdo(116);
                case wi.l /*2*/:
                    glk.e("Babel_SendSmsNetworkReq", "SendSmsRequest: permanent failure", new Object[0]);
                    throw new fdo(117);
                default:
                    ezn = null;
                    break;
            }
            if (ezn == null) {
                throw new fdo(106, "response null");
            }
            long a4 = glj.a();
            ezn.a(1000 * a);
            ezn.b(a4 * 1000);
            ezn.a(this.b);
            RealTimeChatService.a(eaf.b(), ezn);
        } catch (Exception e) {
            f = String.valueOf(e);
            glk.d("Babel_SendSmsNetworkReq", new StringBuilder(String.valueOf(f).length() + 39).append("SendSmsRequest: failed to send message ").append(f).toString(), (Throwable) e);
            throw new fdo(117, e);
        }
    }

    public void a_(Context context, int i, fdo fdo) {
        int i2 = 0;
        bko e = fde.e(i);
        if (e != null) {
            bko k = fde.k();
            if (k == null) {
                glk.d("Babel_SendSmsNetworkReq", "Skipping request failure for null SMS account", new Object[0]);
                return;
            }
            String e2 = this.b.e();
            String d = this.b.d();
            if (fdo != null) {
                i2 = fdo.c();
            }
            RealTimeChatService.a(k, e2, d, i2);
            RealTimeChatService.a(e, this.b, fdo);
        } else if (glk.a("Babel_SendSmsNetworkReq", 3)) {
            glk.a("Babel_SendSmsNetworkReq", "Skipping request failure for invalid account: " + i, new Object[0]);
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
        String str = "SendSmsNetworkRequest ";
        String valueOf = String.valueOf(this.b.toString());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        if (eaf.c() >= 3) {
            return false;
        }
        switch (fdo.c()) {
            case 106:
            case 117:
                return false;
            case 116:
                return true;
            default:
                glk.d("Babel_SendSmsNetworkReq", "Default no retry on BabelClientError: " + fdo.c(), new Object[0]);
                return false;
        }
    }

    public void f() {
    }

    public List<bhc> e() {
        return null;
    }
}
