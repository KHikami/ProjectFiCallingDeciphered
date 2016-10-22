package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: bko */
public final class bko {
    private final jcf a;
    private final bbm b;
    private final fzw c;
    private final String d;
    private final boolean e;
    private edo f;

    public bko(jcf jcf, bbm bbm, fzw fzw, String str) {
        this.a = jcf;
        this.d = (String) iil.b("Expected non-null", (Object) str);
        this.e = "SMS".equals(this.d);
        this.b = bbm;
        this.c = fzw;
    }

    private jch O() {
        return this.a.a(g());
    }

    @Deprecated
    public String a() {
        return this.d;
    }

    public edo b() {
        if (e()) {
            return this.f;
        }
        String valueOf = String.valueOf(glk.b(this.d));
        glk.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 72).append("participantId id not yet set for account: ").append(valueOf).append(" -- account not yet signed in?").toString(), new Object[0]);
        throw new IllegalStateException("participantId id not yet set, account not yet signed in?");
    }

    public boolean a(edo edo) {
        if (e()) {
            return this.f.a(edo);
        }
        return false;
    }

    @Deprecated
    public String c() {
        return this.b.b(g());
    }

    public boolean d() {
        if (!e() || TextUtils.isEmpty(this.f.a) || f()) {
            return false;
        }
        return true;
    }

    public boolean e() {
        if (this.f != null) {
            return true;
        }
        try {
            jch O = O();
            if (O.a("gaia_id") || O.a("chat_id")) {
                this.f = new edo(O.b("gaia_id"), O.b("chat_id"));
            }
        } catch (Throwable e) {
            String valueOf = String.valueOf(glk.b(this.d));
            glk.c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 17).append("Account ").append(valueOf).append(" missing.").toString(), e);
        }
        if (this.f == null) {
            return false;
        }
        return true;
    }

    public boolean f() {
        if (!e() || TextUtils.isEmpty(this.f.a)) {
            return false;
        }
        try {
            if (this.b.k(g()) && P() && !this.b.m(g())) {
                return false;
            }
            return true;
        } catch (Throwable e) {
            String valueOf = String.valueOf(glk.b(this.d));
            glk.c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 19).append("Account ").append(valueOf).append(" not found.").toString(), e);
            return false;
        }
    }

    public int g() {
        int b = this.a.b(this.d);
        if (b == -1) {
            glk.d("Babel", "Returning invalid account ID", new Object[0]);
        }
        return b;
    }

    @Deprecated
    public boolean h() {
        return this.b.q(g());
    }

    @Deprecated
    public String i() {
        return this.b.j(g());
    }

    @Deprecated
    public boolean j() {
        return this.b.l(g());
    }

    @Deprecated
    public boolean k() {
        return this.b.g(g());
    }

    @Deprecated
    public boolean l() {
        return this.b.i(g());
    }

    @Deprecated
    public boolean m() {
        return this.c.c(g());
    }

    @Deprecated
    public boolean n() {
        if (this.e || !O().a("allowed_for_domain", true)) {
            return false;
        }
        return true;
    }

    public boolean o() {
        return !this.e;
    }

    private boolean P() {
        if (O().a("chat_archive_enabled", true) || k()) {
            return true;
        }
        return false;
    }

    public String p() {
        return O().b("profile_photo_url");
    }

    public boolean a(String str) {
        if (str == null) {
            return false;
        }
        eqb eqb = (eqb) bkq.a(O()).get(str);
        return eqb != null && eqb.b();
    }

    public boolean q() {
        for (eqb eqb : bkq.a(O()).values()) {
            if (eqb != null && eqb.c()) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> r() {
        Map a = bkq.a(O());
        ArrayList<String> arrayList = new ArrayList();
        for (eqb eqb : a.values()) {
            if (eqb.b()) {
                arrayList.add(eqb.a());
            }
        }
        return arrayList;
    }

    public boolean s() {
        return u() != null;
    }

    public boolean b(String str) {
        eqb eqb = (eqb) bkq.a(O()).get(str);
        return eqb != null && eqb.d();
    }

    public String t() {
        for (eqb eqb : bkq.a(O()).values()) {
            if (eqb.d() && eqb.e()) {
                return glq.i(gwb.H(), eqb.a());
            }
        }
        return gwb.H().getResources().getString(bc.kH);
    }

    public String u() {
        for (eqb eqb : bkq.a(O()).values()) {
            if (eqb.d() && eqb.e()) {
                return eqb.a();
            }
        }
        return null;
    }

    public boolean v() {
        return O().c("can_opt_into_gv_sms_integration");
    }

    private boolean Q() {
        return O().c("gv_sms_integration_shown");
    }

    @Deprecated
    public boolean w() {
        return this.b.e(g());
    }

    public boolean x() {
        return O().a("phone_verification_prompt_shown", true);
    }

    public boolean y() {
        return O().c("gv_can_use_caller_id_feature");
    }

    public int z() {
        if (this.e) {
            return 3;
        }
        if (m() || w()) {
            return 0;
        }
        return 1;
    }

    public static String A() {
        String f = glq.f(gwb.H());
        if (TextUtils.isEmpty(f)) {
            return gwb.H().getResources().getString(bc.kH);
        }
        return glq.i(gwb.H(), glq.e(gwb.H(), f));
    }

    public String B() {
        if (!F()) {
            return null;
        }
        String f = glq.f(gwb.H());
        if (TextUtils.isEmpty(f)) {
            return "unknown_sim_number";
        }
        return glq.e(gwb.H(), f);
    }

    public String C() {
        if (w()) {
            String u = u();
            if (u != null) {
                String valueOf = String.valueOf(glq.e(gwb.H(), u));
                u = String.valueOf("_gv");
                return u.length() != 0 ? valueOf.concat(u) : new String(valueOf);
            }
        }
        return null;
    }

    private static boolean c(String str) {
        return ((fzw) jyn.a(gwb.H(), fzw.class)).j().equals(str);
    }

    public boolean D() {
        Object u = u();
        return !TextUtils.isEmpty(u) && bko.c(u);
    }

    public boolean E() {
        if (!this.e && F() && w()) {
            return bko.c("auto");
        }
        return false;
    }

    public boolean F() {
        return m() && glq.e(gwb.H()) && (this.e || !this.b.r(g()));
    }

    public int G() {
        if (this.e) {
            return 3;
        }
        boolean F = F();
        boolean w = w();
        if (F && w) {
            String j = ((fzw) jyn.a(gwb.H(), fzw.class)).j();
            if (j.equals("auto")) {
                return 0;
            }
            if (j.equals(B())) {
                return 3;
            }
            if (j.equals(C())) {
                return 2;
            }
            int i;
            Object u = u();
            if (u != null) {
                u = glq.e(gwb.H(), (String) u);
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

    public int a(int i) {
        int G = G();
        if (G != 0) {
            return G;
        }
        if (gwb.i(i)) {
            return i;
        }
        return 2;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bko)) {
            return false;
        }
        return this.d.equals(((bko) obj).d);
    }

    public String toString() {
        return glk.b(this.d);
    }

    public String H() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append(glk.b(this.d));
        return stringBuilder.toString();
    }

    private boolean R() {
        return O().a("is_gv_calling_available");
    }

    public int I() {
        if (!R()) {
            return 0;
        }
        if (O().c("gv_emergency_dialing_supported") && !bko.S()) {
            return 3;
        }
        if (O().c("is_gv_calling_available")) {
            return 1;
        }
        if (O().c("gv_should_show_voice_tos")) {
            return 2;
        }
        return 3;
    }

    public boolean J() {
        if (!R()) {
            return false;
        }
        int I = I();
        if (I == 1 || I == 2) {
            return true;
        }
        return false;
    }

    public String K() {
        if (R()) {
            return O().b("gv_account_balance");
        }
        return null;
    }

    public boolean L() {
        if (R() && O().c("gv_emergency_dialing_supported") && bko.S()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean M() {
        return this.b.f(g());
    }

    public boolean N() {
        return v() && gwb.a(this, bnc.GOOGLE_VOICE) && !Q() && !w();
    }

    private static boolean S() {
        return jyn.c(gwb.H(), eni.class).size() > 0;
    }
}
