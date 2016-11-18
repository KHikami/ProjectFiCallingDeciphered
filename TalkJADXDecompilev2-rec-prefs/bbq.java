package p000;

import android.content.Context;
import android.text.TextUtils;

final class bbq implements bbm {
    private final Context f2905a;
    private final jcf f2906b;
    private final fzw f2907c;

    bbq(Context context) {
        this.f2905a = context;
        this.f2906b = (jcf) jyn.m25426a(context, jcf.class);
        this.f2907c = (fzw) jyn.m25426a(context, fzw.class);
    }

    private jch m4776s(int i) {
        return this.f2906b.mo3456a(i);
    }

    public String mo440a(int i) {
        return m4776s(i).mo3440b("account_name");
    }

    public String mo442b(int i) {
        return m4773a(i, true);
    }

    public String mo443c(int i) {
        return m4773a(i, false);
    }

    private String m4773a(int i, boolean z) {
        jch s = m4776s(i);
        if (this.f2907c.mo2146a(i)) {
            return this.f2905a.getString(gwb.iK);
        }
        String b = s.mo3440b("display_name");
        return (!z || TextUtils.isEmpty(b)) ? s.mo3440b("account_name") : b;
    }

    public jmb mo441a() {
        return new bbr();
    }

    public boolean mo444d(int i) {
        return this.f2907c.mo2152c(i) || mo445e(i);
    }

    public boolean mo445e(int i) {
        return bbq.m4775a(m4776s(i));
    }

    static boolean m4775a(jch jch) {
        return jch.mo3448c("is_gv_sms_integration_enabled");
    }

    public boolean mo446f(int i) {
        jch s = m4776s(i);
        return s.mo3438a("is_gv_calling_available") && s.mo3448c("gv_use_tycho_branding");
    }

    public boolean mo447g(int i) {
        return !m4776s(i).mo3439a("allowed_for_domain", true);
    }

    public boolean mo448h(int i) {
        return m4776s(i).mo3448c("is_history_forced");
    }

    public boolean mo449i(int i) {
        return m4776s(i).mo3448c("is_history_default_on");
    }

    public String mo450j(int i) {
        return m4776s(i).mo3435a("domain_name", "");
    }

    public boolean mo451k(int i) {
        if (gwb.m1906a(this.f2905a, "babel_allowed_for_domain_bit", true) || m4776s(i).mo3439a("allowed_for_domain", true)) {
            return true;
        }
        return false;
    }

    public boolean mo452l(int i) {
        return m4776s(i).mo3448c("show_chat_warning");
    }

    public boolean mo453m(int i) {
        return m4776s(i).mo3448c("blocked_for_child");
    }

    public boolean mo454n(int i) {
        return m4776s(i).mo3439a("is_photo_service_enabled", true);
    }

    public boolean mo455o(int i) {
        if (this.f2907c.mo2146a(i) || !m4776s(i).mo3439a("allowed_for_domain", true)) {
            return false;
        }
        return true;
    }

    public boolean mo456p(int i) {
        if (m4776s(i).mo3433a("account_age_group", 0) == 3) {
            return true;
        }
        return false;
    }

    public boolean mo457q(int i) {
        int a = m4776s(i).mo3433a("account_age_group", 0);
        if (a == 3 || a == 2) {
            return true;
        }
        return false;
    }

    private boolean m4774a(String str) {
        bbn bbn = (bbn) jyn.m25433b(this.f2905a, bbn.class);
        return bbn != null && bbn.mo2199a(str);
    }

    public boolean mo458r(int i) {
        jch s = m4776s(i);
        return mo445e(i) && mo446f(i) && m4774a(s.mo3440b("account_name")) && s.mo3440b("effective_gaia_id") == null;
    }
}
