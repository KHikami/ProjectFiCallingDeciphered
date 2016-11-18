package p000;

import android.app.Activity;
import android.content.Intent;

public final class liv {
    private static final Runnable f25066c = new lix();
    ljo f25067a;
    private final Runnable f25068b = new liw(this);
    private final Activity f25069d;
    private ljo f25070e;
    private boolean f25071f = false;
    private lji f25072g;
    private lji f25073h;

    public liv(Activity activity) {
        this.f25069d = activity;
    }

    public void m29130a() {
        this.f25070e = lkb.m29204a();
        m29125a("Intenting into", "onCreate", this.f25069d.getIntent());
    }

    public void m29132b() {
        m29120B();
    }

    public void m29131a(Intent intent) {
        m29125a("Reintenting into", "onNewIntent", intent);
    }

    public void m29133c() {
        m29120B();
    }

    private void m29125a(String str, String str2, Intent intent) {
        lhc lhc = lhc.I_AM_THE_FRAMEWORK;
        ljo a = ljy.m29197a(intent);
        if (a != null) {
            lkb.m29211b(a);
            this.f25067a = a;
        } else {
            gwb.aC(this.f25069d).m29184c(m29128d(str));
            this.f25067a = lkb.m29204a();
        }
        this.f25072g = lkb.m29203a(m29128d(str2), lhc.I_AM_THE_FRAMEWORK);
        gwb.m1863a(this.f25068b);
    }

    public void m29134d() {
        m29121C();
        m29124a("onStart");
    }

    public void m29135e() {
        m29120B();
    }

    public void m29136f() {
        m29121C();
        m29124a("onPostCreate");
    }

    public void m29137g() {
        m29120B();
    }

    public void m29138h() {
        m29121C();
        m29124a("onResume");
    }

    public void m29139i() {
        m29120B();
    }

    public void m29140j() {
        this.f25070e = lkb.m29204a();
        lkb.m29211b(this.f25067a);
    }

    public void m29141k() {
        this.f25067a = null;
        lkb.m29211b(this.f25070e);
        this.f25070e = null;
    }

    public void m29142l() {
        m29124a("onPause");
    }

    public void m29143m() {
        m29120B();
        m29122D();
    }

    public void m29144n() {
        m29124a("onStop");
    }

    public void m29145o() {
        m29120B();
        m29122D();
    }

    public void m29146p() {
        m29124a("retainCustomNonConfigurationInstance");
        lkb.m29206a(lkb.m29204a());
    }

    public void m29147q() {
        m29120B();
        m29122D();
        gwb.aL().postAtFrontOfQueue(f25066c);
    }

    public void m29148r() {
        lkb.m29206a(null);
        m29124a("onDestroy");
    }

    public void m29149s() {
        m29120B();
        m29122D();
        this.f25067a = null;
    }

    public void m29150t() {
        m29123E();
        m29126b("Back pressed");
    }

    public void m29151u() {
        m29127c("Back pressed");
    }

    public void m29152v() {
        m29126b("onRequestPermissionsResult");
    }

    public void m29153w() {
        m29127c("onRequestPermissionsResult");
    }

    public void m29154x() {
        m29123E();
        m29126b("onActivityResult");
    }

    public void m29155y() {
        m29127c("onActivityResult");
    }

    public void m29156z() {
        m29123E();
        m29126b("onOptionsItemSelected");
    }

    public void m29129A() {
        m29127c("onOptionsItemSelected");
    }

    private void m29124a(String str) {
        this.f25070e = lkb.m29204a();
        if (this.f25067a != null) {
            lkb.m29211b(this.f25067a);
        } else {
            gwb.aC(this.f25069d).m29181a(this.f25069d.getClass(), str);
            this.f25067a = lkb.m29204a();
        }
        this.f25072g = lkb.m29203a(m29128d(str), lhc.I_AM_THE_FRAMEWORK);
    }

    private void m29120B() {
        bm.m6122a(this.f25072g);
        lkb.m29205a(this.f25072g);
        this.f25072g = null;
        lkb.m29211b(this.f25070e);
        this.f25070e = null;
    }

    private void m29121C() {
        if (this.f25071f) {
            this.f25067a = null;
            this.f25071f = false;
        }
    }

    private void m29122D() {
        this.f25071f = true;
        if (!this.f25069d.isChangingConfigurations() && !this.f25069d.isFinishing()) {
            this.f25067a = null;
        }
    }

    private void m29126b(String str) {
        if (lkb.m29208a(lhc.I_AM_THE_FRAMEWORK)) {
            bm.m6151b(this.f25073h == null, (Object) "Expected nonLifecycleStepSpan to be null.");
            this.f25073h = lkb.m29202a(str);
            return;
        }
        gwb.aC(this.f25069d).m29183b(str);
    }

    private void m29127c(String str) {
        lke aD = gwb.aD(this.f25069d);
        if (this.f25073h != null) {
            aD.m29216a(this.f25073h);
            this.f25073h = null;
            return;
        }
        aD.m29215a(str);
    }

    private void m29123E() {
        bm.m6151b(this.f25072g == null, (Object) "Expected lifecycleStepSpan to be null.");
    }

    private String m29128d(String str) {
        String valueOf = String.valueOf(this.f25069d.getClass().getSimpleName());
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()).append(str).append(" ").append(valueOf).toString();
    }
}
