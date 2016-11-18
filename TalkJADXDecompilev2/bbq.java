package defpackage;

import android.content.Context;
import android.text.TextUtils;

final class bbq implements bbm {
    private final Context a;
    private final jcf b;
    private final fzw c;

    bbq(Context context) {
        this.a = context;
        this.b = (jcf) jyn.a(context, jcf.class);
        this.c = (fzw) jyn.a(context, fzw.class);
    }

    private jch s(int i) {
        return this.b.a(i);
    }

    public String a(int i) {
        return s(i).b("account_name");
    }

    public String b(int i) {
        return a(i, true);
    }

    public String c(int i) {
        return a(i, false);
    }

    private String a(int i, boolean z) {
        jch s = s(i);
        if (this.c.a(i)) {
            return this.a.getString(gwb.iK);
        }
        String b = s.b("display_name");
        return (!z || TextUtils.isEmpty(b)) ? s.b("account_name") : b;
    }

    public jmb a() {
        return new bbr();
    }

    public boolean d(int i) {
        return this.c.c(i) || e(i);
    }

    public boolean e(int i) {
        return bbq.a(s(i));
    }

    static boolean a(jch jch) {
        return jch.c("is_gv_sms_integration_enabled");
    }

    public boolean f(int i) {
        jch s = s(i);
        return s.a("is_gv_calling_available") && s.c("gv_use_tycho_branding");
    }

    public boolean g(int i) {
        return !s(i).a("allowed_for_domain", true);
    }

    public boolean h(int i) {
        return s(i).c("is_history_forced");
    }

    public boolean i(int i) {
        return s(i).c("is_history_default_on");
    }

    public String j(int i) {
        return s(i).a("domain_name", "");
    }

    public boolean k(int i) {
        if (gwb.a(this.a, "babel_allowed_for_domain_bit", true) || s(i).a("allowed_for_domain", true)) {
            return true;
        }
        return false;
    }

    public boolean l(int i) {
        return s(i).c("show_chat_warning");
    }

    public boolean m(int i) {
        return s(i).c("blocked_for_child");
    }

    public boolean n(int i) {
        return s(i).a("is_photo_service_enabled", true);
    }

    public boolean o(int i) {
        if (this.c.a(i) || !s(i).a("allowed_for_domain", true)) {
            return false;
        }
        return true;
    }

    public boolean p(int i) {
        if (s(i).a("account_age_group", 0) == 3) {
            return true;
        }
        return false;
    }

    public boolean q(int i) {
        int a = s(i).a("account_age_group", 0);
        if (a == 3 || a == 2) {
            return true;
        }
        return false;
    }

    private boolean a(String str) {
        bbn bbn = (bbn) jyn.b(this.a, bbn.class);
        return bbn != null && bbn.a(str);
    }

    public boolean r(int i) {
        jch s = s(i);
        return e(i) && f(i) && a(s.b("account_name")) && s.b("effective_gaia_id") == null;
    }
}
