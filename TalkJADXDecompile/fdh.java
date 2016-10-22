import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fdh {
    public int a;
    private final bko b;
    private final fdn c;
    @Deprecated
    private boolean d;
    @Deprecated
    private boolean e;
    @Deprecated
    private boolean f;
    private boolean g;

    public fdh(bko bko) {
        this.a = 100;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.b = bko;
        this.c = new fdn(this.b);
    }

    public String a() {
        int g = this.b.g();
        String valueOf = String.valueOf(glk.b(this.b.a()));
        return new StringBuilder(String.valueOf(valueOf).length() + 12).append(g).append("-").append(valueOf).toString();
    }

    public fdn b() {
        fdn fdn;
        synchronized (this) {
            fdn = this.c;
        }
        return fdn;
    }

    public String c() {
        return f().H();
    }

    public String d() {
        return this.b.a();
    }

    public int e() {
        return this.b.g();
    }

    public bko f() {
        bko bko;
        synchronized (this) {
            bko = this.b;
        }
        return bko;
    }

    public int g() {
        if (((fzw) jyn.a(gwb.H(), fzw.class)).a(e())) {
            return 102;
        }
        int i;
        synchronized (this) {
            if (this.a == 100 || this.a == 101) {
                if (this.b.f()) {
                    this.a = 108;
                } else if (i() && this.b.d()) {
                    this.a = 102;
                } else if (this.d || this.e) {
                    this.a = 101;
                }
            }
            if (fde.a) {
                String valueOf = String.valueOf(a());
                String valueOf2 = String.valueOf(Integer.toString(this.a));
                new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length()).append("Account ").append(valueOf).append(" in state: ").append(valueOf2);
            }
            i = this.a;
        }
        return i;
    }

    @Deprecated
    public boolean i() {
        return m() != null;
    }

    public boolean j() {
        return g() == 102;
    }

    public boolean k() {
        return this.b.k();
    }

    private void a(String str) {
        synchronized (this) {
            String str2 = "Babel";
            String str3 = "Account registration complete:";
            String valueOf = String.valueOf(a());
            glk.c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            if (!TextUtils.isEmpty(null)) {
                bkq.a(gwb.H(), this.b, glj.a());
            }
            this.e = false;
            this.f = false;
        }
    }

    @Deprecated
    void a(boolean z) {
        if (fdq.I.b(e())) {
            ((fnc) jyn.a(gwb.H(), fnc.class)).a(e());
            return;
        }
        synchronized (this) {
            if (glk.a("Babel", 3)) {
                String str = "Babel";
                String str2 = "register:";
                String valueOf = String.valueOf(a());
                glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            }
            if (((fzw) jyn.a(gwb.H(), fzw.class)).a(this.b.g())) {
                glk.c("Babel", "Skipping registration for SMS only account", new Object[0]);
            } else if (!this.b.d()) {
                str = "Babel";
                str2 = "Account not valid for babel. Skip device registration: ";
                valueOf = String.valueOf(a());
                glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            } else if (!i() || z) {
                fdg fdg = fde.e;
                if (ffh.a().d()) {
                    str = "Babel";
                    str2 = "register - retrying gcm registration:";
                    valueOf = String.valueOf(a());
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    glk.c(str, valueOf, new Object[0]);
                    this.d = true;
                    fdg = fde.e;
                    ffh.a().g();
                    return;
                }
                fdg = fde.e;
                if (ffh.a().c()) {
                    str = "Babel";
                    str2 = "Starting account registration:";
                    valueOf = String.valueOf(a());
                    glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                    RealTimeChatService.a(this.b, this.g);
                    this.e = true;
                    this.d = false;
                } else {
                    this.d = true;
                    str = "Babel";
                    str2 = "Account registration pending Gcm:";
                    valueOf = String.valueOf(a());
                    glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                }
            } else {
                str = "Babel";
                str2 = "Account already registered. Skip device registration: ";
                valueOf = String.valueOf(a());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.c(str, valueOf, new Object[0]);
            }
        }
    }

    public String l() {
        if (fdq.I.b(e())) {
            fnd a = ((fnc) jyn.a(gwb.H(), fnc.class)).a(e());
            return a != null ? a.c : null;
        } else {
            String m = m();
            if (!TextUtils.isEmpty(m)) {
                int indexOf = m.indexOf(47);
                if (indexOf >= 0) {
                    return m.substring(indexOf + 1);
                }
            }
            return null;
        }
    }

    public String m() {
        if (fdq.I.b(e())) {
            fnd a = ((fnc) jyn.a(gwb.H(), fnc.class)).a(e());
            if (a != null) {
                return a.b;
            }
            return null;
        }
        jch a2 = ((jcf) jyn.a(gwb.H(), jcf.class)).a(e());
        return a2 == null ? null : a2.a("full_jid", null);
    }

    @Deprecated
    public void n() {
        if (fdq.I.b(e())) {
            ((fnc) jyn.a(gwb.H(), fnc.class)).b(e());
            return;
        }
        synchronized (this) {
            if (ffh.a().c()) {
                RealTimeChatService.a(this.b);
            }
            a(null);
            h();
        }
    }

    @Deprecated
    public void o() {
        bkq.a(gwb.H(), this.b, -1);
    }

    public void p() {
        bkq.b(gwb.H(), this.b, -1);
    }

    @Deprecated
    void q() {
        if (fdq.I.b(e())) {
            ((fnc) jyn.a(gwb.H(), fnc.class)).a(e());
            return;
        }
        synchronized (this) {
            String valueOf;
            if (!this.b.d()) {
                valueOf = String.valueOf(a());
                glk.a("Babel", new StringBuilder(String.valueOf(valueOf).length() + 61).append("Account ").append(valueOf).append(" not valid for babel. Skip device registration renew.").toString(), new Object[0]);
            } else if (!i() || this.f) {
            } else {
                long c = bkq.c(gwb.H(), this.b);
                long a = glj.a();
                if ((c - a > 86400000 || a - c > fde.b()) && ffh.a().c()) {
                    if (glk.a("Babel", 3)) {
                        valueOf = "Babel";
                        String str = "Renewing account registration:";
                        String valueOf2 = String.valueOf(a());
                        glk.a(valueOf, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str), new Object[0]);
                    }
                    this.f = true;
                    a(true);
                }
            }
        }
    }

    void r() {
        synchronized (this) {
            if (!this.b.d()) {
            } else if (((fzw) jyn.a(gwb.H(), fzw.class)).a(this.b.g())) {
            } else {
                long d = bkq.d(gwb.H(), this.b);
                long a = glj.a();
                if (d - a > 86400000 || a - d > fde.c()) {
                    if (glk.a("Babel", 3)) {
                        String str = "Babel";
                        String str2 = "Renewing account setting:";
                        String valueOf = String.valueOf(a());
                        glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                    }
                    RealTimeChatService.b(this.b, true);
                }
            }
        }
    }

    public boolean s() {
        boolean d;
        synchronized (this) {
            d = bkq.d(gwb.H(), this.b.g());
        }
        return d;
    }

    public boolean t() {
        boolean e;
        synchronized (this) {
            e = bkq.e(gwb.H(), this.b.g());
        }
        return e;
    }

    public void h() {
        if (fde.a) {
            String str = "Clearing account state for";
            String valueOf = String.valueOf(a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        synchronized (this) {
            this.a = 100;
            this.d = false;
            this.e = false;
            this.f = false;
            this.g = false;
        }
    }
}
