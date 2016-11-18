package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class fjm implements ead {
    private static final boolean f13208a = false;
    private final fjo f13209b;

    static {
        kae kae = glk.f15565l;
    }

    public fjm(fjo fjo) {
        this.f13209b = fjo;
    }

    public String K_() {
        return "mms_recv_queue";
    }

    public long mo1017b() {
        return ((biw) jyn.m25426a(gwb.m1400H(), biw.class)).mo561a("babel_pending_message_failure_duration", 1200000);
    }

    public boolean mo1018c() {
        return false;
    }

    public void mo1007a(Context context, eaf eaf) {
        String valueOf;
        long a = glj.m17956a();
        try {
            byte[] d = this.f13209b.m15453d();
            String c = this.f13209b.m15452c();
            if (fyg.f14365a) {
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
            if (fyi.m16614a(context)) {
                a2 = ((fxw) jyn.m25426a(context, fxw.class)).m16545a(context, d, c);
            } else {
                a2 = fyg.m16576a(context, d, c);
            }
            Uri a3 = fyi.m16587a(context, a2);
            if (a3 == null) {
                glk.m17982e("Babel_RetrieveMmsNetReq", "RetrieveMmsRequest: failed to persist message into telephony", new Object[0]);
                throw new fdo(134, "Failed to persist retrieved mms message");
            }
            fzb.m16667a(1, fyi.m16624c(a3));
            evz ezg = new ezg(a3, this.f13209b.m15454e(), this.f13209b.m15455f());
            long a4 = glj.m17956a();
            ezg.m8123a(a * 1000);
            ezg.m8128b(a4 * 1000);
            ezg.mo1960a(this.f13209b);
            RealTimeChatService.m8998a(eaf.m13268b(), ezg);
        } catch (Exception e) {
            valueOf = String.valueOf(e);
            glk.m17980d("Babel_RetrieveMmsNetReq", new StringBuilder(String.valueOf(valueOf).length() + 47).append("RetrieveMmsRequest: failed to retrieve message ").append(valueOf).toString(), (Throwable) e);
            throw new fdo(118, e);
        } catch (Exception e2) {
            valueOf = String.valueOf(e2);
            glk.m17980d("Babel_RetrieveMmsNetReq", new StringBuilder(String.valueOf(valueOf).length() + 47).append("RetrieveMmsRequest: failed to retrieve message ").append(valueOf).toString(), (Throwable) e2);
            throw new fdo(e2.f14344a, e2);
        } catch (Exception e22) {
            valueOf = String.valueOf(e22);
            glk.m17980d("Babel_RetrieveMmsNetReq", new StringBuilder(String.valueOf(valueOf).length() + 47).append("RetrieveMmsRequest: failed to retrieve message ").append(valueOf).toString(), (Throwable) e22);
            throw new fdo(137, e22);
        }
    }

    public void a_(Context context, int i, fdo fdo) {
        bko e = fde.m15018e(i);
        if (e != null) {
            bko k = fde.m15031k();
            if (k == null) {
                glk.m17981d("Babel_RetrieveMmsNetReq", "Skipping request failure for null MMS account", new Object[0]);
                return;
            }
            RealTimeChatService.m8996a(k.m5638g(), this.f13209b.m15454e(), this.f13209b.m15455f(), fdo.m15084c());
            if (!(fdo == null || fdo.m15084c() == 0)) {
                ((iih) jyn.m25426a(context, iih.class)).mo1979a(k.m5638g()).mo1693b().mo1698a(Integer.valueOf(fdo.m15084c())).mo1699a(String.valueOf(this.f13209b.m15454e())).mo1714c(1524);
            }
            RealTimeChatService.m9016a(e, this.f13209b, fdo);
        } else if (glk.m17973a("Babel_RetrieveMmsNetReq", 3)) {
            glk.m17970a("Babel_RetrieveMmsNetReq", "Skipping request failure for invalid account: " + i, new Object[0]);
        }
    }

    public boolean mo1019d() {
        return false;
    }

    public boolean mo1016a(String str) {
        return false;
    }

    public boolean mo1015a(ead ead) {
        return false;
    }

    public String toString() {
        String str = "RetrieveMmsNetworkRequest ";
        String valueOf = String.valueOf(this.f13209b.toString());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        switch (fdo.m15084c()) {
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
                glk.m17981d("Babel_RetrieveMmsNetReq", "Default no retry on BabelClientError: " + fdo.m15084c(), new Object[0]);
                return false;
        }
    }

    public void mo1011f() {
    }

    public List<bhc> mo1010e() {
        return null;
    }
}
