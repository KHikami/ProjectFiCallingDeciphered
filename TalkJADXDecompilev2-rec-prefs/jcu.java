package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class jcu implements jca, jcm, jza, kcd, kcg, kcm, kcn, kco, kcq {
    private static final kad f19861a = new kad("error_on_invalid_id");
    private final Activity f19862b;
    private int f19863c = -1;
    private List<jcc> f19864d = new ArrayList();
    private boolean f19865e = true;
    private jcf f19866f;
    private boolean f19867g;

    public jcu(Activity activity, kbu kbu) {
        this.f19862b = activity;
        kbu.m25514a((kcq) this);
    }

    public jcu m23911a(jyn jyn) {
        jyn.m25444a(jca.class, (Object) this);
        return this;
    }

    public jcu(Activity activity, kbu kbu, jcf jcf, jce jce) {
        ba.m4536a((Object) jce);
        this.f19862b = activity;
        this.f19866f = jcf;
        kbu.m25514a((kcq) this);
    }

    public jcu m23912a(boolean z) {
        this.f19865e = false;
        return this;
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        if (this.f19866f == null) {
            this.f19866f = (jcf) jyn.m25443a(jcf.class);
        }
    }

    public void mo643a(Bundle bundle) {
        if (bundle == null) {
            this.f19863c = this.f19862b.getIntent().getIntExtra("account_id", -1);
            m23907d();
            for (jcc a : this.f19864d) {
                a.mo1133a(true, jcb.UNKNOWN, this.f19863c != -1 ? jcb.VALID : jcb.INVALID, -1, this.f19863c);
            }
        } else {
            this.f19863c = bundle.getInt("state_account_id");
        }
        this.f19867g = true;
        this.f19866f.mo3460a((jcm) this);
    }

    public void z_() {
        this.f19867g = true;
        m23907d();
    }

    public void R_() {
        this.f19867g = true;
        m23907d();
    }

    public void o_() {
        this.f19866f.mo3465b((jcm) this);
    }

    public void S_() {
        if (this.f19867g) {
            m23907d();
        }
    }

    public void mo645b(Bundle bundle) {
        this.f19867g = false;
        bundle.putInt("state_account_id", this.f19863c);
    }

    public int mo2317a() {
        gwb.aJ();
        return this.f19863c;
    }

    public boolean mo2319b() {
        gwb.aJ();
        return this.f19863c != -1;
    }

    public jch mo2320c() {
        gwb.aJ();
        return this.f19866f.mo3456a(this.f19863c);
    }

    public jca mo2318a(jcc jcc) {
        this.f19864d.add(jcc);
        return this;
    }

    private void m23907d() {
        boolean c = this.f19863c == -1 ? !this.f19865e : this.f19866f.mo3467c(this.f19863c);
        if (!c) {
            if (Log.isLoggable("IntentAccountHandler", 3)) {
                int i = this.f19863c;
                String valueOf = String.valueOf(this.f19862b.getClass().getName());
                new StringBuilder(String.valueOf(valueOf).length() + 62).append("Invalid account state with accountId ").append(i).append(" for activity ").append(valueOf);
            }
            this.f19863c = -1;
            m23908e();
        }
    }

    private void m23908e() {
        this.f19862b.finish();
    }
}
