package p000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class joa extends jzn implements jcs, jgf, jmo {
    private static final String[] f20566a = new String[]{"update_account", "prepare_accounts", "logout_during_login", "logout", "load_accounts_add", "load_accounts_add_account_activity", "are_accounts_ready_for_login"};
    private String aj;
    private String ak;
    private int al = -1;
    private boolean am;
    private Runnable an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private String[] as;
    private ggn at;
    private joh f20567b;
    private jcf f20568c;
    private jcr f20569d;
    private jmz f20570e;
    private final jgg f20571f = new jgg((dr) this, this.lifecycle).m24129a((jgf) this);
    private final jio f20572g = new jio(this.lifecycle);
    private jmu f20573h;
    private String f20574i;

    public static joa m24783a(ed edVar) {
        String str = "helper_for_login";
        joa joa = (joa) edVar.mo1844a(str);
        if (joa != null) {
            return joa;
        }
        dr joa2 = new joa();
        ew a = edVar.mo1845a();
        a.mo1528a(joa2, str);
        a.mo1522a();
        edVar.mo1848b();
        return joa2;
    }

    private void m24785a(boolean z) {
        for (String b : f20566a) {
            this.f20571f.m24138b(b);
        }
        m24781D();
        this.ap = false;
        this.aq = false;
        if (!z && isAdded()) {
            getFragmentManager().mo1845a().mo1527a((dr) this).mo1522a();
        }
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f20567b = (joh) this.binder.m25443a(jmq.class);
        this.f20568c = (jcf) this.binder.m25443a(jcf.class);
        this.f20569d = (jcr) this.binder.m25443a(jcr.class);
        this.f20570e = (jmz) this.binder.m25443a(jmz.class);
        this.binder.m25444a(jmo.class, (Object) this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.ap = bundle.getBoolean("logging_in");
            this.am = bundle.getBoolean("login_pending");
            if (this.am) {
                m24792q();
            }
            this.ar = bundle.getBoolean("interactive_login_pending");
            this.aq = bundle.getBoolean("logging_in_interactively");
            this.ao = bundle.getBoolean("preparing_accounts");
            this.as = bundle.getStringArray("account_names_snapshot");
            this.f20573h = (jmu) bundle.getParcelable("login_request");
            this.f20574i = bundle.getString("tag");
            this.aj = bundle.getString("selected_account_name");
            this.ak = bundle.getString("selected_effective_gaia_id");
            this.al = bundle.getInt("account_id_to_login");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("logging_in", this.ap);
        bundle.putBoolean("login_pending", this.am);
        bundle.putBoolean("preparing_accounts", this.ao);
        bundle.putParcelable("login_request", this.f20573h);
        bundle.putString("tag", this.f20574i);
        bundle.putString("selected_account_name", this.aj);
        bundle.putString("selected_effective_gaia_id", this.ak);
        bundle.putInt("account_id_to_login", this.al);
        bundle.putStringArray("account_names_snapshot", this.as);
        bundle.putBoolean("interactive_login_pending", this.ar);
        bundle.putBoolean("logging_in_interactively", this.aq);
    }

    public void m24805a(jmu jmu, String str) {
        if (this.ap) {
            m24785a(true);
            this.f20567b.m24832a(this.f20573h, this.f20574i);
        }
        this.ap = true;
        this.f20573h = jmu;
        this.f20574i = str;
        this.aj = null;
        this.ak = null;
        this.al = -1;
        m24792q();
    }

    private void m24792q() {
        this.am = true;
        if (this.an == null) {
            this.an = ljy.m29195a(new job(this));
        }
        this.at = this.f20572g.m24316a(this.an);
    }

    public void onResume() {
        super.onResume();
        m24780C();
        m24799x();
    }

    public void onStart() {
        super.onStart();
        if (this.am && this.at == null) {
            m24792q();
        }
    }

    public void onStop() {
        super.onStop();
        this.f20572g.m24318a(this.at);
        this.at = null;
    }

    void m24810e() {
        this.am = false;
        this.an = null;
        if (m24793r()) {
            m24794s();
        }
    }

    private boolean m24793r() {
        if (this.ao || this.f20571f.m24135a("are_accounts_ready_for_login")) {
            return false;
        }
        if (this.f20573h.f20507j) {
            return true;
        }
        this.f20571f.m24134a(new joc("are_accounts_ready_for_login", this.f20567b));
        return false;
    }

    private void m24794s() {
        boolean z = true;
        m24781D();
        if (!m24795t() && !m24786a(this.f20573h.f20500c) && !m24798w()) {
            boolean z2;
            if (this.f20573h.f20514q != null) {
                m24791c(this.f20573h.f20514q, this.f20573h.f20513p);
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !m24797v()) {
                if (this.f20573h.f20515r != null) {
                    int a = this.f20573h.f20515r.m24688a();
                    if (a != -1) {
                        m24787b(a);
                        z2 = true;
                        if (!z2 && !m24796u()) {
                            if (this.f20573h.f20516s != null) {
                                this.ar = true;
                                m24799x();
                            } else {
                                z = false;
                            }
                            if (!z) {
                                mo3569c();
                                return;
                            }
                            return;
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                }
            }
        }
    }

    private boolean m24795t() {
        if (this.aj == null) {
            return false;
        }
        mo3566a(this.aj, this.ak);
        return true;
    }

    private boolean m24786a(int i) {
        if (i == -1) {
            return false;
        }
        m24787b(i);
        return true;
    }

    private void m24787b(int i) {
        if (this.f20568c.mo3467c(i)) {
            jch a = this.f20568c.mo3456a(i);
            mo3566a(a.mo3440b("account_name"), a.mo3440b("effective_gaia_id"));
            return;
        }
        m24788b("Not a valid account: " + i);
    }

    private boolean m24796u() {
        if (this.f20573h.f20503f) {
            int d = this.f20568c.mo3468d(this.f20573h.f20502e);
            if (this.f20567b.mo3576a(this.f20573h, d)) {
                return m24786a(d);
            }
        }
        return false;
    }

    private boolean m24797v() {
        if (!this.f20573h.f20505h) {
            return false;
        }
        if (this.f20573h.f20508k != -1) {
            m24787b(this.f20573h.f20508k);
            return true;
        } else if (this.f20573h.f20509l != null) {
            mo3566a(this.f20573h.f20509l, this.f20573h.f20510m);
            return true;
        } else if (this.f20573h.f20511n == null) {
            return false;
        } else {
            m24791c(this.f20573h.f20511n, this.f20573h.f20510m);
            return true;
        }
    }

    private boolean m24798w() {
        String str = this.f20573h.f20512o;
        String str2 = this.f20573h.f20513p;
        if (str == null) {
            return false;
        }
        if (this.f20568c.mo3462b(str, str2) != -1) {
            mo3566a(str, str2);
        } else {
            m24788b("Account not found");
        }
        return true;
    }

    private void m24791c(String str, String str2) {
        int c = this.f20568c.mo3466c(str);
        if (c == -1) {
            m24788b("Viewer account id invalid");
        } else {
            mo3566a(this.f20568c.mo3456a(c).mo3440b("account_name"), str2);
        }
    }

    private void m24799x() {
        if (this.ar && isResumed()) {
            dr a;
            m24781D();
            this.ar = false;
            this.aq = true;
            jmh jmh = (jmh) this.binder.m25443a(this.f20573h.f20516s);
            String name = jmh.getClass().getName();
            ed childFragmentManager = getChildFragmentManager();
            dr a2 = childFragmentManager.mo1844a(name);
            if (a2 == null) {
                Bundle bundle = this.f20573h.f20517t;
                a = jmh.mo1738a(bundle);
                a.setArguments(bundle);
                childFragmentManager.mo1845a().mo1528a(a, name).mo1522a();
                childFragmentManager.mo1848b();
            } else {
                a = a2;
            }
            ((jmi) a).mo1739a(this.f20573h);
        }
    }

    public void mo3566a(String str, String str2) {
        Object obj;
        this.aj = str;
        this.ak = str2;
        int b = this.f20568c.mo3462b(str, str2);
        if (this.f20568c.mo3467c(b) && this.f20567b.mo3576a(this.f20573h, b)) {
            m24789c(b);
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            if (this.f20573h.f20507j) {
                m24788b("RPCs disallowed");
            } else {
                m24800y();
            }
        }
    }

    private void m24800y() {
        m24780C();
        this.f20571f.m24134a(new jog("update_account", this.aj, this.ak, this.f20567b, this.f20573h));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            m24792q();
        } else {
            mo3569c();
        }
    }

    private void m24789c(int i) {
        int i2 = -1;
        for (jni a : this.binder.m25457c(jni.class)) {
            i2 = a.m24751a();
            if (i2 != -1) {
                break;
            }
        }
        if (i2 == -1 || i2 == i) {
            if (this.f20573h.f20504g) {
                this.f20568c.mo3459a(this.f20573h.f20502e, i);
            }
            m24785a(false);
            this.f20567b.m24833a(this.f20573h, this.f20574i, i);
            return;
        }
        m24784a(i2, i);
    }

    private void m24784a(int i, int i2) {
        this.al = i2;
        this.f20571f.m24134a(new joe("logout_during_login", i, this.f20567b));
    }

    private void m24801z() {
        if (this.al != -1) {
            m24789c(this.al);
        } else {
            mo3569c();
        }
    }

    private void m24778A() {
        m24785a(false);
    }

    public void mo662a(String str, jgz jgz, jgw jgw) {
        int i = 0;
        jgw.m7031a(false);
        if ("update_account".equals(str)) {
            if (jgz == null) {
                m24779B();
                return;
            }
            int i2 = jgz.m24192d().getInt("account_id");
            if (jgz.m24192d().getBoolean("has_irrecoverable_error")) {
                Intent g = this.f20567b.m24844g(i2);
                if (g != null) {
                    startActivityForResult(g, 1);
                } else {
                    this.f20570e.mo3581c(getChildFragmentManager());
                }
            } else if (jgz.m24192d().getBoolean("has_recoverable_error")) {
                m24779B();
            } else if (this.f20567b.mo3576a(this.f20573h, i2)) {
                m24789c(i2);
            } else {
                if (this.f20568c.mo3467c(i2)) {
                    jmw b = this.f20567b.m24836b(this.f20573h, i2);
                    if (b != null) {
                        String name = b.getClass().getName();
                        ed childFragmentManager = getChildFragmentManager();
                        dr a = childFragmentManager.mo1844a(name);
                        if (a == null) {
                            a = b.mo1734a();
                            if (a != null) {
                                childFragmentManager.mo1845a().mo1528a(a, name).mo1522a();
                                childFragmentManager.mo1848b();
                            }
                        }
                        jmx jmx = (jmx) a;
                        if (jmx != null) {
                            jmx.mo1736a(i2);
                            return;
                        }
                    }
                }
                m24788b("Login request not satisfied for account: " + i2);
            }
        } else if ("prepare_accounts".equals(str)) {
            this.ao = false;
            m24794s();
        } else if ("logout_during_login".equals(str)) {
            m24801z();
        } else if ("logout".equals(str)) {
            m24778A();
        } else if ("load_accounts_add".equals(str)) {
            if (jgz == null || jgz.m24194f()) {
                if (jgz != null) {
                    i = jgz.m24188a();
                }
                mo3568b(this.context.getString(gwb.zp), "Load accounts for add account task failed: " + i);
                return;
            }
            this.as = jgz.m24192d().getStringArray("account_name_array");
            this.f20569d.mo3477a((dr) this);
        } else if ("load_accounts_add_account_activity".equals(str)) {
            if (jgz == null || jgz.m24194f()) {
                if (jgz != null) {
                    i = jgz.m24188a();
                }
                mo3568b(this.context.getString(gwb.zp), "Load accounts for add account activity failed: " + i);
                return;
            }
            Set hashSet = new HashSet(Arrays.asList(jgz.m24192d().getStringArray("account_name_array")));
            hashSet.removeAll(Arrays.asList(this.as));
            if (hashSet.isEmpty()) {
                mo3569c();
                return;
            }
            this.aj = (String) hashSet.iterator().next();
            if (m24793r()) {
                mo3566a(this.aj, null);
            }
        } else if (!"are_accounts_ready_for_login".equals(str)) {
        } else {
            if (jgz == null || jgz.m24194f()) {
                mo3568b(this.context.getString(gwb.zp), "Task result has error");
            } else if (jgz.m24192d().getBoolean("are_accounts_ready_for_login")) {
                m24794s();
            } else if (!this.ao) {
                this.ao = true;
                m24780C();
                this.f20571f.m24134a(new jof("prepare_accounts", this.f20567b));
            }
        }
    }

    public void mo3567b() {
        this.f20571f.m24134a(new jod("load_accounts_add", this.f20569d));
    }

    public void mo495a() {
        this.f20571f.m24134a(new jod("load_accounts_add_account_activity", this.f20569d));
    }

    public void mo3569c() {
        if (this.ap) {
            m24785a(false);
            this.f20567b.m24832a(this.f20573h, this.f20574i);
        }
    }

    public void mo3568b(String str, String str2) {
        String str3 = "LoginHelperFragment";
        String str4 = "Login failed: ";
        String valueOf = String.valueOf(str2);
        Log.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        kae kae = jnz.f20565a;
        if (str != null) {
            Toast.makeText(this.context, str, 1).show();
        }
        mo3569c();
    }

    private void m24788b(String str) {
        String str2 = this.f20573h.f20499b;
        if ("com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST".equals(str2)) {
            str2 = this.aj != null ? this.aj : this.f20573h.f20512o;
            str2 = this.context.getString(gwb.zo, new Object[]{str2});
        }
        mo3568b(str2, str);
    }

    private void m24779B() {
        this.f20570e.mo3580b(getChildFragmentManager());
        m24781D();
    }

    private void m24790c(String str) {
        this.f20570e.mo3579a(getChildFragmentManager(), str, this.f20573h.f20506i);
    }

    private void m24780C() {
        if (!isResumed()) {
            return;
        }
        if ((this.ao || this.ap) && !this.aq) {
            String str = this.f20573h.f20498a;
            if (str == null) {
                str = this.context.getString(gwb.zq);
            }
            m24790c(str);
        }
    }

    private void m24781D() {
        this.f20570e.mo3578a(getChildFragmentManager());
    }

    public void mo3570d() {
        m24810e();
    }

    static jgz m24782a(jnl jnl) {
        jgz jgz = new jgz(jnl.f20538a);
        jgz.m24192d().putBoolean("has_recoverable_error", jnl.f20539b);
        jgz.m24192d().putBoolean("has_irrecoverable_error", jnl.f20540c);
        jgz.m24192d().putInt("account_id", jnl.f20541d);
        return jgz;
    }
}
