package p000;

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fdh {
    public int f12733a = 100;
    private final bko f12734b;
    private final fdn f12735c;
    @Deprecated
    private boolean f12736d = false;
    @Deprecated
    private boolean f12737e = false;
    @Deprecated
    private boolean f12738f = false;
    private boolean f12739g = false;

    public fdh(bko bko) {
        this.f12734b = bko;
        this.f12735c = new fdn(this.f12734b);
    }

    public String m15047a() {
        int g = this.f12734b.m5638g();
        String valueOf = String.valueOf(glk.m17974b(this.f12734b.m5629a()));
        return new StringBuilder(String.valueOf(valueOf).length() + 12).append(g).append("-").append(valueOf).toString();
    }

    public fdn m15049b() {
        fdn fdn;
        synchronized (this) {
            fdn = this.f12735c;
        }
        return fdn;
    }

    public String m15050c() {
        return m15053f().m5621H();
    }

    public String m15051d() {
        return this.f12734b.m5629a();
    }

    public int m15052e() {
        return this.f12734b.m5638g();
    }

    public bko m15053f() {
        bko bko;
        synchronized (this) {
            bko = this.f12734b;
        }
        return bko;
    }

    public int m15054g() {
        if (((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2146a(m15052e())) {
            return 102;
        }
        int i;
        synchronized (this) {
            if (this.f12733a == 100 || this.f12733a == 101) {
                if (this.f12734b.m5637f()) {
                    this.f12733a = 108;
                } else if (m15056i() && this.f12734b.m5635d()) {
                    this.f12733a = 102;
                } else if (this.f12736d || this.f12737e) {
                    this.f12733a = 101;
                }
            }
            if (fde.f12724a) {
                String valueOf = String.valueOf(m15047a());
                String valueOf2 = String.valueOf(Integer.toString(this.f12733a));
                new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length()).append("Account ").append(valueOf).append(" in state: ").append(valueOf2);
            }
            i = this.f12733a;
        }
        return i;
    }

    @Deprecated
    public boolean m15056i() {
        return m15060m() != null;
    }

    public boolean m15057j() {
        return m15054g() == 102;
    }

    public boolean m15058k() {
        return this.f12734b.m5642k();
    }

    private void m15046a(String str) {
        synchronized (this) {
            String str2 = "Babel";
            String str3 = "Account registration complete:";
            String valueOf = String.valueOf(m15047a());
            glk.m17979c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            if (!TextUtils.isEmpty(null)) {
                bkq.m5666a(gwb.m1400H(), this.f12734b, glj.m17956a());
            }
            this.f12737e = false;
            this.f12738f = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @Deprecated
    void m15048a(boolean z) {
        if (fdq.f12767I.m14370b(m15052e())) {
            ((fnc) jyn.m25426a(gwb.m1400H(), fnc.class)).mo2044a(m15052e());
            return;
        }
        synchronized (this) {
            if (glk.m17973a("Babel", 3)) {
                String str = "Babel";
                String str2 = "register:";
                String valueOf = String.valueOf(m15047a());
                glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            }
            if (((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2146a(this.f12734b.m5638g())) {
                glk.m17979c("Babel", "Skipping registration for SMS only account", new Object[0]);
            } else if (!this.f12734b.m5635d()) {
                str = "Babel";
                str2 = "Account not valid for babel. Skip device registration: ";
                valueOf = String.valueOf(m15047a());
                glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            } else if (!m15056i() || z) {
                fdg fdg = fde.f12728e;
                if (ffh.m15192a().m15203d()) {
                    str = "Babel";
                    str2 = "register - retrying gcm registration:";
                    valueOf = String.valueOf(m15047a());
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    glk.m17979c(str, valueOf, new Object[0]);
                    this.f12736d = true;
                    fdg = fde.f12728e;
                    ffh.m15192a().m15206g();
                    return;
                }
                fdg = fde.f12728e;
                if (ffh.m15192a().m15202c()) {
                    str = "Babel";
                    str2 = "Starting account registration:";
                    valueOf = String.valueOf(m15047a());
                    glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                    RealTimeChatService.m9031a(this.f12734b, this.f12739g);
                    this.f12737e = true;
                    this.f12736d = false;
                } else {
                    this.f12736d = true;
                    str = "Babel";
                    str2 = "Account registration pending Gcm:";
                    valueOf = String.valueOf(m15047a());
                    glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                }
            } else {
                str = "Babel";
                str2 = "Account already registered. Skip device registration: ";
                valueOf = String.valueOf(m15047a());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.m17979c(str, valueOf, new Object[0]);
            }
        }
    }

    public String m15059l() {
        if (fdq.f12767I.m14370b(m15052e())) {
            fnd a = ((fnc) jyn.m25426a(gwb.m1400H(), fnc.class)).mo2044a(m15052e());
            return a != null ? a.f13486c : null;
        } else {
            String m = m15060m();
            if (!TextUtils.isEmpty(m)) {
                int indexOf = m.indexOf(47);
                if (indexOf >= 0) {
                    return m.substring(indexOf + 1);
                }
            }
            return null;
        }
    }

    public String m15060m() {
        if (fdq.f12767I.m14370b(m15052e())) {
            fnd a = ((fnc) jyn.m25426a(gwb.m1400H(), fnc.class)).mo2044a(m15052e());
            if (a != null) {
                return a.f13485b;
            }
            return null;
        }
        jch a2 = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3456a(m15052e());
        return a2 == null ? null : a2.mo3435a("full_jid", null);
    }

    @Deprecated
    public void m15061n() {
        if (fdq.f12767I.m14370b(m15052e())) {
            ((fnc) jyn.m25426a(gwb.m1400H(), fnc.class)).mo2048b(m15052e());
            return;
        }
        synchronized (this) {
            if (ffh.m15192a().m15202c()) {
                RealTimeChatService.m9012a(this.f12734b);
            }
            m15046a(null);
            m15055h();
        }
    }

    @Deprecated
    public void m15062o() {
        bkq.m5666a(gwb.m1400H(), this.f12734b, -1);
    }

    public void m15063p() {
        bkq.m5679b(gwb.m1400H(), this.f12734b, -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @Deprecated
    void m15064q() {
        if (fdq.f12767I.m14370b(m15052e())) {
            ((fnc) jyn.m25426a(gwb.m1400H(), fnc.class)).mo2044a(m15052e());
            return;
        }
        synchronized (this) {
            String valueOf;
            if (!this.f12734b.m5635d()) {
                valueOf = String.valueOf(m15047a());
                glk.m17970a("Babel", new StringBuilder(String.valueOf(valueOf).length() + 61).append("Account ").append(valueOf).append(" not valid for babel. Skip device registration renew.").toString(), new Object[0]);
            } else if (!m15056i() || this.f12738f) {
            } else {
                long c = bkq.m5684c(gwb.m1400H(), this.f12734b);
                long a = glj.m17956a();
                if ((c - a > 86400000 || a - c > fde.m15006b()) && ffh.m15192a().m15202c()) {
                    if (glk.m17973a("Babel", 3)) {
                        valueOf = "Babel";
                        String str = "Renewing account registration:";
                        String valueOf2 = String.valueOf(m15047a());
                        glk.m17970a(valueOf, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str), new Object[0]);
                    }
                    this.f12738f = true;
                    m15048a(true);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m15065r() {
        synchronized (this) {
            if (!this.f12734b.m5635d()) {
            } else if (((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2146a(this.f12734b.m5638g())) {
            } else {
                long d = bkq.m5690d(gwb.m1400H(), this.f12734b);
                long a = glj.m17956a();
                if (d - a > 86400000 || a - d > fde.m15012c()) {
                    if (glk.m17973a("Babel", 3)) {
                        String str = "Babel";
                        String str2 = "Renewing account setting:";
                        String valueOf = String.valueOf(m15047a());
                        glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                    }
                    RealTimeChatService.m9075b(this.f12734b, true);
                }
            }
        }
    }

    public boolean m15066s() {
        boolean d;
        synchronized (this) {
            d = bkq.m5692d(gwb.m1400H(), this.f12734b.m5638g());
        }
        return d;
    }

    public boolean m15067t() {
        boolean e;
        synchronized (this) {
            e = bkq.m5694e(gwb.m1400H(), this.f12734b.m5638g());
        }
        return e;
    }

    public void m15055h() {
        if (fde.f12724a) {
            String str = "Clearing account state for";
            String valueOf = String.valueOf(m15047a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        synchronized (this) {
            this.f12733a = 100;
            this.f12736d = false;
            this.f12737e = false;
            this.f12738f = false;
            this.f12739g = false;
        }
    }
}
