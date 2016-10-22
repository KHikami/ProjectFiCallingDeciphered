import android.app.Activity;
import android.content.Intent;

public final class liv {
    private static final Runnable c;
    ljo a;
    private final Runnable b;
    private final Activity d;
    private ljo e;
    private boolean f;
    private lji g;
    private lji h;

    static {
        c = new lix();
    }

    public liv(Activity activity) {
        this.b = new liw(this);
        this.f = false;
        this.d = activity;
    }

    public void a() {
        this.e = lkb.a();
        a("Intenting into", "onCreate", this.d.getIntent());
    }

    public void b() {
        B();
    }

    public void a(Intent intent) {
        a("Reintenting into", "onNewIntent", intent);
    }

    public void c() {
        B();
    }

    private void a(String str, String str2, Intent intent) {
        lhc lhc = lhc.I_AM_THE_FRAMEWORK;
        ljo a = ljy.a(intent);
        if (a != null) {
            lkb.b(a);
            this.a = a;
        } else {
            gwb.aC(this.d).c(d(str));
            this.a = lkb.a();
        }
        this.g = lkb.a(d(str2), lhc.I_AM_THE_FRAMEWORK);
        gwb.a(this.b);
    }

    public void d() {
        C();
        a("onStart");
    }

    public void e() {
        B();
    }

    public void f() {
        C();
        a("onPostCreate");
    }

    public void g() {
        B();
    }

    public void h() {
        C();
        a("onResume");
    }

    public void i() {
        B();
    }

    public void j() {
        this.e = lkb.a();
        lkb.b(this.a);
    }

    public void k() {
        this.a = null;
        lkb.b(this.e);
        this.e = null;
    }

    public void l() {
        a("onPause");
    }

    public void m() {
        B();
        D();
    }

    public void n() {
        a("onStop");
    }

    public void o() {
        B();
        D();
    }

    public void p() {
        a("retainCustomNonConfigurationInstance");
        lkb.a(lkb.a());
    }

    public void q() {
        B();
        D();
        gwb.aL().postAtFrontOfQueue(c);
    }

    public void r() {
        lkb.a(null);
        a("onDestroy");
    }

    public void s() {
        B();
        D();
        this.a = null;
    }

    public void t() {
        E();
        b("Back pressed");
    }

    public void u() {
        c("Back pressed");
    }

    public void v() {
        b("onRequestPermissionsResult");
    }

    public void w() {
        c("onRequestPermissionsResult");
    }

    public void x() {
        E();
        b("onActivityResult");
    }

    public void y() {
        c("onActivityResult");
    }

    public void z() {
        E();
        b("onOptionsItemSelected");
    }

    public void A() {
        c("onOptionsItemSelected");
    }

    private void a(String str) {
        this.e = lkb.a();
        if (this.a != null) {
            lkb.b(this.a);
        } else {
            gwb.aC(this.d).a(this.d.getClass(), str);
            this.a = lkb.a();
        }
        this.g = lkb.a(d(str), lhc.I_AM_THE_FRAMEWORK);
    }

    private void B() {
        bm.a(this.g);
        lkb.a(this.g);
        this.g = null;
        lkb.b(this.e);
        this.e = null;
    }

    private void C() {
        if (this.f) {
            this.a = null;
            this.f = false;
        }
    }

    private void D() {
        this.f = true;
        if (!this.d.isChangingConfigurations() && !this.d.isFinishing()) {
            this.a = null;
        }
    }

    private void b(String str) {
        if (lkb.a(lhc.I_AM_THE_FRAMEWORK)) {
            bm.b(this.h == null, (Object) "Expected nonLifecycleStepSpan to be null.");
            this.h = lkb.a(str);
            return;
        }
        gwb.aC(this.d).b(str);
    }

    private void c(String str) {
        lke aD = gwb.aD(this.d);
        if (this.h != null) {
            aD.a(this.h);
            this.h = null;
            return;
        }
        aD.a(str);
    }

    private void E() {
        bm.b(this.g == null, (Object) "Expected lifecycleStepSpan to be null.");
    }

    private String d(String str) {
        String valueOf = String.valueOf(this.d.getClass().getSimpleName());
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()).append(str).append(" ").append(valueOf).toString();
    }
}
