import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class jcu implements jca, jcm, jza, kcd, kcg, kcm, kcn, kco, kcq {
    private static final kad a;
    private final Activity b;
    private int c;
    private List<jcc> d;
    private boolean e;
    private jcf f;
    private boolean g;

    static {
        a = new kad("error_on_invalid_id");
    }

    public jcu(Activity activity, kbu kbu) {
        this.c = -1;
        this.d = new ArrayList();
        this.e = true;
        this.b = activity;
        kbu.a((kcq) this);
    }

    public jcu a(jyn jyn) {
        jyn.a(jca.class, (Object) this);
        return this;
    }

    public jcu(Activity activity, kbu kbu, jcf jcf, jce jce) {
        this.c = -1;
        this.d = new ArrayList();
        this.e = true;
        ba.a((Object) jce);
        this.b = activity;
        this.f = jcf;
        kbu.a((kcq) this);
    }

    public jcu a(boolean z) {
        this.e = false;
        return this;
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        if (this.f == null) {
            this.f = (jcf) jyn.a(jcf.class);
        }
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            this.c = this.b.getIntent().getIntExtra("account_id", -1);
            d();
            for (jcc a : this.d) {
                a.a(true, jcb.UNKNOWN, this.c != -1 ? jcb.VALID : jcb.INVALID, -1, this.c);
            }
        } else {
            this.c = bundle.getInt("state_account_id");
        }
        this.g = true;
        this.f.a((jcm) this);
    }

    public void z_() {
        this.g = true;
        d();
    }

    public void R_() {
        this.g = true;
        d();
    }

    public void o_() {
        this.f.b((jcm) this);
    }

    public void S_() {
        if (this.g) {
            d();
        }
    }

    public void b(Bundle bundle) {
        this.g = false;
        bundle.putInt("state_account_id", this.c);
    }

    public int a() {
        gwb.aJ();
        return this.c;
    }

    public boolean b() {
        gwb.aJ();
        return this.c != -1;
    }

    public jch c() {
        gwb.aJ();
        return this.f.a(this.c);
    }

    public jca a(jcc jcc) {
        this.d.add(jcc);
        return this;
    }

    private void d() {
        boolean c = this.c == -1 ? !this.e : this.f.c(this.c);
        if (!c) {
            if (Log.isLoggable("IntentAccountHandler", 3)) {
                int i = this.c;
                String valueOf = String.valueOf(this.b.getClass().getName());
                new StringBuilder(String.valueOf(valueOf).length() + 62).append("Invalid account state with accountId ").append(i).append(" for activity ").append(valueOf);
            }
            this.c = -1;
            e();
        }
    }

    private void e() {
        this.b.finish();
    }
}
