package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class joa extends jzn implements jcs, jgf, jmo {
    private static final String[] a = new String[]{"update_account", "prepare_accounts", "logout_during_login", "logout", "load_accounts_add", "load_accounts_add_account_activity", "are_accounts_ready_for_login"};
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
    private joh b;
    private jcf c;
    private jcr d;
    private jmz e;
    private final jgg f = new jgg((dr) this, this.lifecycle).a((jgf) this);
    private final jio g = new jio(this.lifecycle);
    private jmu h;
    private String i;

    public static joa a(ed edVar) {
        String str = "helper_for_login";
        joa joa = (joa) edVar.a(str);
        if (joa != null) {
            return joa;
        }
        dr joa2 = new joa();
        ew a = edVar.a();
        a.a(joa2, str);
        a.a();
        edVar.b();
        return joa2;
    }

    private void a(boolean z) {
        for (String b : a) {
            this.f.b(b);
        }
        D();
        this.ap = false;
        this.aq = false;
        if (!z && isAdded()) {
            getFragmentManager().a().a((dr) this).a();
        }
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.b = (joh) this.binder.a(jmq.class);
        this.c = (jcf) this.binder.a(jcf.class);
        this.d = (jcr) this.binder.a(jcr.class);
        this.e = (jmz) this.binder.a(jmz.class);
        this.binder.a(jmo.class, (Object) this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.ap = bundle.getBoolean("logging_in");
            this.am = bundle.getBoolean("login_pending");
            if (this.am) {
                q();
            }
            this.ar = bundle.getBoolean("interactive_login_pending");
            this.aq = bundle.getBoolean("logging_in_interactively");
            this.ao = bundle.getBoolean("preparing_accounts");
            this.as = bundle.getStringArray("account_names_snapshot");
            this.h = (jmu) bundle.getParcelable("login_request");
            this.i = bundle.getString("tag");
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
        bundle.putParcelable("login_request", this.h);
        bundle.putString("tag", this.i);
        bundle.putString("selected_account_name", this.aj);
        bundle.putString("selected_effective_gaia_id", this.ak);
        bundle.putInt("account_id_to_login", this.al);
        bundle.putStringArray("account_names_snapshot", this.as);
        bundle.putBoolean("interactive_login_pending", this.ar);
        bundle.putBoolean("logging_in_interactively", this.aq);
    }

    public void a(jmu jmu, String str) {
        if (this.ap) {
            a(true);
            this.b.a(this.h, this.i);
        }
        this.ap = true;
        this.h = jmu;
        this.i = str;
        this.aj = null;
        this.ak = null;
        this.al = -1;
        q();
    }

    private void q() {
        this.am = true;
        if (this.an == null) {
            this.an = ljy.a(new job(this));
        }
        this.at = this.g.a(this.an);
    }

    public void onResume() {
        super.onResume();
        C();
        x();
    }

    public void onStart() {
        super.onStart();
        if (this.am && this.at == null) {
            q();
        }
    }

    public void onStop() {
        super.onStop();
        this.g.a(this.at);
        this.at = null;
    }

    void e() {
        this.am = false;
        this.an = null;
        if (r()) {
            s();
        }
    }

    private boolean r() {
        if (this.ao || this.f.a("are_accounts_ready_for_login")) {
            return false;
        }
        if (this.h.j) {
            return true;
        }
        this.f.a(new joc("are_accounts_ready_for_login", this.b));
        return false;
    }

    private void s() {
        boolean z = true;
        D();
        if (!t() && !a(this.h.c) && !w()) {
            boolean z2;
            if (this.h.q != null) {
                c(this.h.q, this.h.p);
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !v()) {
                if (this.h.r != null) {
                    int a = this.h.r.a();
                    if (a != -1) {
                        b(a);
                        z2 = true;
                        if (!z2 && !u()) {
                            if (this.h.s != null) {
                                this.ar = true;
                                x();
                            } else {
                                z = false;
                            }
                            if (!z) {
                                c();
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

    private boolean t() {
        if (this.aj == null) {
            return false;
        }
        a(this.aj, this.ak);
        return true;
    }

    private boolean a(int i) {
        if (i == -1) {
            return false;
        }
        b(i);
        return true;
    }

    private void b(int i) {
        if (this.c.c(i)) {
            jch a = this.c.a(i);
            a(a.b("account_name"), a.b("effective_gaia_id"));
            return;
        }
        b("Not a valid account: " + i);
    }

    private boolean u() {
        if (this.h.f) {
            int d = this.c.d(this.h.e);
            if (this.b.a(this.h, d)) {
                return a(d);
            }
        }
        return false;
    }

    private boolean v() {
        if (!this.h.h) {
            return false;
        }
        if (this.h.k != -1) {
            b(this.h.k);
            return true;
        } else if (this.h.l != null) {
            a(this.h.l, this.h.m);
            return true;
        } else if (this.h.n == null) {
            return false;
        } else {
            c(this.h.n, this.h.m);
            return true;
        }
    }

    private boolean w() {
        String str = this.h.o;
        String str2 = this.h.p;
        if (str == null) {
            return false;
        }
        if (this.c.b(str, str2) != -1) {
            a(str, str2);
        } else {
            b("Account not found");
        }
        return true;
    }

    private void c(String str, String str2) {
        int c = this.c.c(str);
        if (c == -1) {
            b("Viewer account id invalid");
        } else {
            a(this.c.a(c).b("account_name"), str2);
        }
    }

    private void x() {
        if (this.ar && isResumed()) {
            dr a;
            D();
            this.ar = false;
            this.aq = true;
            jmh jmh = (jmh) this.binder.a(this.h.s);
            String name = jmh.getClass().getName();
            ed childFragmentManager = getChildFragmentManager();
            dr a2 = childFragmentManager.a(name);
            if (a2 == null) {
                Bundle bundle = this.h.t;
                a = jmh.a(bundle);
                a.setArguments(bundle);
                childFragmentManager.a().a(a, name).a();
                childFragmentManager.b();
            } else {
                a = a2;
            }
            ((jmi) a).a(this.h);
        }
    }

    public void a(String str, String str2) {
        Object obj;
        this.aj = str;
        this.ak = str2;
        int b = this.c.b(str, str2);
        if (this.c.c(b) && this.b.a(this.h, b)) {
            c(b);
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            if (this.h.j) {
                b("RPCs disallowed");
            } else {
                y();
            }
        }
    }

    private void y() {
        C();
        this.f.a(new jog("update_account", this.aj, this.ak, this.b, this.h));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            q();
        } else {
            c();
        }
    }

    private void c(int i) {
        int i2 = -1;
        for (jni a : this.binder.c(jni.class)) {
            i2 = a.a();
            if (i2 != -1) {
                break;
            }
        }
        if (i2 == -1 || i2 == i) {
            if (this.h.g) {
                this.c.a(this.h.e, i);
            }
            a(false);
            this.b.a(this.h, this.i, i);
            return;
        }
        a(i2, i);
    }

    private void a(int i, int i2) {
        this.al = i2;
        this.f.a(new joe("logout_during_login", i, this.b));
    }

    private void z() {
        if (this.al != -1) {
            c(this.al);
        } else {
            c();
        }
    }

    private void A() {
        a(false);
    }

    public void a(String str, jgz jgz, jgw jgw) {
        int i = 0;
        jgw.a(false);
        if ("update_account".equals(str)) {
            if (jgz == null) {
                B();
                return;
            }
            int i2 = jgz.d().getInt("account_id");
            if (jgz.d().getBoolean("has_irrecoverable_error")) {
                Intent g = this.b.g(i2);
                if (g != null) {
                    startActivityForResult(g, 1);
                } else {
                    this.e.c(getChildFragmentManager());
                }
            } else if (jgz.d().getBoolean("has_recoverable_error")) {
                B();
            } else if (this.b.a(this.h, i2)) {
                c(i2);
            } else {
                if (this.c.c(i2)) {
                    jmw b = this.b.b(this.h, i2);
                    if (b != null) {
                        String name = b.getClass().getName();
                        ed childFragmentManager = getChildFragmentManager();
                        dr a = childFragmentManager.a(name);
                        if (a == null) {
                            a = b.a();
                            if (a != null) {
                                childFragmentManager.a().a(a, name).a();
                                childFragmentManager.b();
                            }
                        }
                        jmx jmx = (jmx) a;
                        if (jmx != null) {
                            jmx.a(i2);
                            return;
                        }
                    }
                }
                b("Login request not satisfied for account: " + i2);
            }
        } else if ("prepare_accounts".equals(str)) {
            this.ao = false;
            s();
        } else if ("logout_during_login".equals(str)) {
            z();
        } else if ("logout".equals(str)) {
            A();
        } else if ("load_accounts_add".equals(str)) {
            if (jgz == null || jgz.f()) {
                if (jgz != null) {
                    i = jgz.a();
                }
                b(this.context.getString(gwb.zp), "Load accounts for add account task failed: " + i);
                return;
            }
            this.as = jgz.d().getStringArray("account_name_array");
            this.d.a((dr) this);
        } else if ("load_accounts_add_account_activity".equals(str)) {
            if (jgz == null || jgz.f()) {
                if (jgz != null) {
                    i = jgz.a();
                }
                b(this.context.getString(gwb.zp), "Load accounts for add account activity failed: " + i);
                return;
            }
            Set hashSet = new HashSet(Arrays.asList(jgz.d().getStringArray("account_name_array")));
            hashSet.removeAll(Arrays.asList(this.as));
            if (hashSet.isEmpty()) {
                c();
                return;
            }
            this.aj = (String) hashSet.iterator().next();
            if (r()) {
                a(this.aj, null);
            }
        } else if (!"are_accounts_ready_for_login".equals(str)) {
        } else {
            if (jgz == null || jgz.f()) {
                b(this.context.getString(gwb.zp), "Task result has error");
            } else if (jgz.d().getBoolean("are_accounts_ready_for_login")) {
                s();
            } else if (!this.ao) {
                this.ao = true;
                C();
                this.f.a(new jof("prepare_accounts", this.b));
            }
        }
    }

    public void b() {
        this.f.a(new jod("load_accounts_add", this.d));
    }

    public void a() {
        this.f.a(new jod("load_accounts_add_account_activity", this.d));
    }

    public void c() {
        if (this.ap) {
            a(false);
            this.b.a(this.h, this.i);
        }
    }

    public void b(String str, String str2) {
        String str3 = "LoginHelperFragment";
        String str4 = "Login failed: ";
        String valueOf = String.valueOf(str2);
        Log.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        kae kae = jnz.a;
        if (str != null) {
            Toast.makeText(this.context, str, 1).show();
        }
        c();
    }

    private void b(String str) {
        String str2 = this.h.b;
        if ("com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST".equals(str2)) {
            str2 = this.aj != null ? this.aj : this.h.o;
            str2 = this.context.getString(gwb.zo, new Object[]{str2});
        }
        b(str2, str);
    }

    private void B() {
        this.e.b(getChildFragmentManager());
        D();
    }

    private void c(String str) {
        this.e.a(getChildFragmentManager(), str, this.h.i);
    }

    private void C() {
        if (!isResumed()) {
            return;
        }
        if ((this.ao || this.ap) && !this.aq) {
            String str = this.h.a;
            if (str == null) {
                str = this.context.getString(gwb.zq);
            }
            c(str);
        }
    }

    private void D() {
        this.e.a(getChildFragmentManager());
    }

    public void d() {
        e();
    }

    static jgz a(jnl jnl) {
        jgz jgz = new jgz(jnl.a);
        jgz.d().putBoolean("has_recoverable_error", jnl.b);
        jgz.d().putBoolean("has_irrecoverable_error", jnl.c);
        jgz.d().putInt("account_id", jnl.d);
        return jgz;
    }
}
