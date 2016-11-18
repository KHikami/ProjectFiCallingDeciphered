package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

public final class bko {
    private final jcf f3631a;
    private final bbm f3632b;
    private final fzw f3633c;
    private final String f3634d;
    private final boolean f3635e = "SMS".equals(this.f3634d);
    private edo f3636f;

    public bko(jcf jcf, bbm bbm, fzw fzw, String str) {
        this.f3631a = jcf;
        this.f3634d = (String) iil.m21875b("Expected non-null", (Object) str);
        this.f3632b = bbm;
        this.f3633c = fzw;
    }

    private jch m5609O() {
        return this.f3631a.mo3456a(m5638g());
    }

    @Deprecated
    public String m5629a() {
        return this.f3634d;
    }

    public edo m5632b() {
        if (m5636e()) {
            return this.f3636f;
        }
        String valueOf = String.valueOf(glk.m17974b(this.f3634d));
        glk.m17982e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 72).append("participantId id not yet set for account: ").append(valueOf).append(" -- account not yet signed in?").toString(), new Object[0]);
        throw new IllegalStateException("participantId id not yet set, account not yet signed in?");
    }

    public boolean m5630a(edo edo) {
        if (m5636e()) {
            return this.f3636f.m13608a(edo);
        }
        return false;
    }

    @Deprecated
    public String m5634c() {
        return this.f3632b.mo442b(m5638g());
    }

    public boolean m5635d() {
        if (!m5636e() || TextUtils.isEmpty(this.f3636f.f11244a) || m5637f()) {
            return false;
        }
        return true;
    }

    public boolean m5636e() {
        if (this.f3636f != null) {
            return true;
        }
        try {
            jch O = m5609O();
            if (O.mo3438a("gaia_id") || O.mo3438a("chat_id")) {
                this.f3636f = new edo(O.mo3440b("gaia_id"), O.mo3440b("chat_id"));
            }
        } catch (Throwable e) {
            String valueOf = String.valueOf(glk.m17974b(this.f3634d));
            glk.m17978c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 17).append("Account ").append(valueOf).append(" missing.").toString(), e);
        }
        if (this.f3636f == null) {
            return false;
        }
        return true;
    }

    public boolean m5637f() {
        if (!m5636e() || TextUtils.isEmpty(this.f3636f.f11244a)) {
            return false;
        }
        try {
            if (this.f3632b.mo451k(m5638g()) && m5610P() && !this.f3632b.mo453m(m5638g())) {
                return false;
            }
            return true;
        } catch (Throwable e) {
            String valueOf = String.valueOf(glk.m17974b(this.f3634d));
            glk.m17978c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 19).append("Account ").append(valueOf).append(" not found.").toString(), e);
            return false;
        }
    }

    public int m5638g() {
        int b = this.f3631a.mo3461b(this.f3634d);
        if (b == -1) {
            glk.m17981d("Babel", "Returning invalid account ID", new Object[0]);
        }
        return b;
    }

    @Deprecated
    public boolean m5639h() {
        return this.f3632b.mo457q(m5638g());
    }

    @Deprecated
    public String m5640i() {
        return this.f3632b.mo450j(m5638g());
    }

    @Deprecated
    public boolean m5641j() {
        return this.f3632b.mo452l(m5638g());
    }

    @Deprecated
    public boolean m5642k() {
        return this.f3632b.mo447g(m5638g());
    }

    @Deprecated
    public boolean m5643l() {
        return this.f3632b.mo449i(m5638g());
    }

    @Deprecated
    public boolean m5644m() {
        return this.f3633c.mo2152c(m5638g());
    }

    @Deprecated
    public boolean m5645n() {
        if (this.f3635e || !m5609O().mo3439a("allowed_for_domain", true)) {
            return false;
        }
        return true;
    }

    public boolean m5646o() {
        return !this.f3635e;
    }

    private boolean m5610P() {
        if (m5609O().mo3439a("chat_archive_enabled", true) || m5642k()) {
            return true;
        }
        return false;
    }

    public String m5647p() {
        return m5609O().mo3440b("profile_photo_url");
    }

    public boolean m5631a(String str) {
        if (str == null) {
            return false;
        }
        eqb eqb = (eqb) bkq.m5663a(m5609O()).get(str);
        return eqb != null && eqb.m14241b();
    }

    public boolean m5648q() {
        for (eqb eqb : bkq.m5663a(m5609O()).values()) {
            if (eqb != null && eqb.m14242c()) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> m5649r() {
        Map a = bkq.m5663a(m5609O());
        ArrayList<String> arrayList = new ArrayList();
        for (eqb eqb : a.values()) {
            if (eqb.m14241b()) {
                arrayList.add(eqb.m14240a());
            }
        }
        return arrayList;
    }

    public boolean m5650s() {
        return m5652u() != null;
    }

    public boolean m5633b(String str) {
        eqb eqb = (eqb) bkq.m5663a(m5609O()).get(str);
        return eqb != null && eqb.m14243d();
    }

    public String m5651t() {
        for (eqb eqb : bkq.m5663a(m5609O()).values()) {
            if (eqb.m14243d() && eqb.m14244e()) {
                return glq.m18038i(gwb.m1400H(), eqb.m14240a());
            }
        }
        return gwb.m1400H().getResources().getString(bc.kH);
    }

    public String m5652u() {
        for (eqb eqb : bkq.m5663a(m5609O()).values()) {
            if (eqb.m14243d() && eqb.m14244e()) {
                return eqb.m14240a();
            }
        }
        return null;
    }

    public boolean m5653v() {
        return m5609O().mo3448c("can_opt_into_gv_sms_integration");
    }

    private boolean m5611Q() {
        return m5609O().mo3448c("gv_sms_integration_shown");
    }

    @Deprecated
    public boolean m5654w() {
        return this.f3632b.mo445e(m5638g());
    }

    public boolean m5655x() {
        return m5609O().mo3439a("phone_verification_prompt_shown", true);
    }

    public boolean m5656y() {
        return m5609O().mo3448c("gv_can_use_caller_id_feature");
    }

    public int m5657z() {
        if (this.f3635e) {
            return 3;
        }
        if (m5644m() || m5654w()) {
            return 0;
        }
        return 1;
    }

    public static String m5608A() {
        String f = glq.m18025f(gwb.m1400H());
        if (TextUtils.isEmpty(f)) {
            return gwb.m1400H().getResources().getString(bc.kH);
        }
        return glq.m18038i(gwb.m1400H(), glq.m18021e(gwb.m1400H(), f));
    }

    public String m5615B() {
        if (!m5619F()) {
            return null;
        }
        String f = glq.m18025f(gwb.m1400H());
        if (TextUtils.isEmpty(f)) {
            return "unknown_sim_number";
        }
        return glq.m18021e(gwb.m1400H(), f);
    }

    public String m5616C() {
        if (m5654w()) {
            String u = m5652u();
            if (u != null) {
                String valueOf = String.valueOf(glq.m18021e(gwb.m1400H(), u));
                u = String.valueOf("_gv");
                return u.length() != 0 ? valueOf.concat(u) : new String(valueOf);
            }
        }
        return null;
    }

    private static boolean m5614c(String str) {
        return ((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2162j().equals(str);
    }

    public boolean m5617D() {
        Object u = m5652u();
        return !TextUtils.isEmpty(u) && bko.m5614c(u);
    }

    public boolean m5618E() {
        if (!this.f3635e && m5619F() && m5654w()) {
            return bko.m5614c("auto");
        }
        return false;
    }

    public boolean m5619F() {
        return m5644m() && glq.m18023e(gwb.m1400H()) && (this.f3635e || !this.f3632b.mo458r(m5638g()));
    }

    public int m5620G() {
        if (this.f3635e) {
            return 3;
        }
        boolean F = m5619F();
        boolean w = m5654w();
        if (F && w) {
            String j = ((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2162j();
            if (j.equals("auto")) {
                return 0;
            }
            if (j.equals(m5615B())) {
                return 3;
            }
            if (j.equals(m5616C())) {
                return 2;
            }
            int i;
            Object u = m5652u();
            if (u != null) {
                u = glq.m18021e(gwb.m1400H(), (String) u);
            }
            if (j.equals(u)) {
                i = 2;
            } else {
                i = 3;
            }
            return i;
        } else if (w) {
            return 2;
        } else {
            return 3;
        }
    }

    public int m5628a(int i) {
        int G = m5620G();
        if (G != 0) {
            return G;
        }
        if (gwb.m2254i(i)) {
            return i;
        }
        return 2;
    }

    public int hashCode() {
        return this.f3634d.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bko)) {
            return false;
        }
        return this.f3634d.equals(((bko) obj).f3634d);
    }

    public String toString() {
        return glk.m17974b(this.f3634d);
    }

    public String m5621H() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append(glk.m17974b(this.f3634d));
        return stringBuilder.toString();
    }

    private boolean m5612R() {
        return m5609O().mo3438a("is_gv_calling_available");
    }

    public int m5622I() {
        if (!m5612R()) {
            return 0;
        }
        if (m5609O().mo3448c("gv_emergency_dialing_supported") && !bko.m5613S()) {
            return 3;
        }
        if (m5609O().mo3448c("is_gv_calling_available")) {
            return 1;
        }
        if (m5609O().mo3448c("gv_should_show_voice_tos")) {
            return 2;
        }
        return 3;
    }

    public boolean m5623J() {
        if (!m5612R()) {
            return false;
        }
        int I = m5622I();
        if (I == 1 || I == 2) {
            return true;
        }
        return false;
    }

    public String m5624K() {
        if (m5612R()) {
            return m5609O().mo3440b("gv_account_balance");
        }
        return null;
    }

    public boolean m5625L() {
        if (m5612R() && m5609O().mo3448c("gv_emergency_dialing_supported") && bko.m5613S()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean m5626M() {
        return this.f3632b.mo446f(m5638g());
    }

    public boolean m5627N() {
        return m5653v() && gwb.m1923a(this, bnc.GOOGLE_VOICE) && !m5611Q() && !m5654w();
    }

    private static boolean m5613S() {
        return jyn.m25438c(gwb.m1400H(), eni.class).size() > 0;
    }
}
