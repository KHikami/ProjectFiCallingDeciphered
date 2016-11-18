package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class jmj implements jca, jcm, jmr, jza, kcd, kcg, kcm, kcn, kco, kcq {
    final dw a;
    jmq b;
    String c;
    jml d;
    private jcf e;
    private String f;
    private jcb g = jcb.UNKNOWN;
    private int h = -1;
    private jmu i;
    private jmu j;
    private int k;
    private boolean l;
    private final List<jcc> m = new ArrayList();
    private final jio n;

    public /* synthetic */ jca a(jcc jcc) {
        return b(jcc);
    }

    public jmj(dw dwVar, kbu kbu) {
        this.a = dwVar;
        kbu.a((kcq) this);
        this.n = new jio(kbu);
    }

    public jmj a(jyn jyn) {
        jyn.a(jca.class, (Object) this);
        jyn.a(jmj.class, (Object) this);
        return this;
    }

    public jmj(dw dwVar, kbu kbu, jcf jcf, jmq jmq, jmy jmy) {
        ba.a((Object) jmy);
        this.n = new jio(kbu);
        this.a = dwVar;
        this.e = jcf;
        this.b = jmq;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        if (this.e == null && this.b == null) {
            this.e = (jcf) jyn.a(jcf.class);
            this.b = (jmq) jyn.a(jmq.class);
        }
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        this.l = false;
        bundle.putString("account_key", this.f);
        bundle.putInt("account_id", this.h);
        bundle.putInt("account_handler_state", this.g.ordinal());
        bundle.putParcelable("completed_login_request", this.i);
        String str = "queued_login_request";
        if (this.d == null) {
            parcelable = null;
        } else {
            parcelable = this.d.a;
        }
        bundle.putParcelable(str, parcelable);
        bundle.putParcelable("pending_login_request", this.j);
        bundle.putInt("pending_id", this.k);
        bundle.putString("tag", this.c);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            jml jml;
            this.f = bundle.getString("account_key");
            this.h = bundle.getInt("account_id");
            this.g = jcb.values()[bundle.getInt("account_handler_state")];
            this.i = (jmu) bundle.getParcelable("completed_login_request");
            jmu jmu = (jmu) bundle.getParcelable("queued_login_request");
            if (jmu == null) {
                jml = null;
            } else {
                jml = new jml(this, jmu);
            }
            this.d = jml;
            this.j = (jmu) bundle.getParcelable("pending_login_request");
            this.k = bundle.getInt("pending_id");
            this.c = bundle.getString("tag");
        }
        this.l = true;
        this.e.a((jcm) this);
        this.b.a((jmr) this);
    }

    public void o_() {
        this.e.b((jcm) this);
        this.b.b(this);
    }

    public void z_() {
        this.l = true;
        f();
    }

    public void R_() {
        this.l = true;
        f();
    }

    public int a() {
        gwb.aJ();
        return this.h;
    }

    public boolean b() {
        gwb.aJ();
        return this.h != -1;
    }

    public boolean d() {
        gwb.aJ();
        return this.e.c(this.h) && this.e.a(this.h).a();
    }

    public jch c() {
        gwb.aJ();
        return this.e.a(this.h);
    }

    public jmj b(jcc jcc) {
        this.m.add(jcc);
        return this;
    }

    public jmj a(String str) {
        this.f = str;
        return this;
    }

    public void a(jmu jmu) {
        if (jmu.e == null) {
            jmu.e = this.f;
        }
        if (jmu.e == null) {
            jmu.e = jyn.a(this.a, "LoginAccountHandler.account_key", null);
        }
        if (jmu.h) {
            jmu.a(this.a, this.a.getIntent());
            if (!this.e.c(jmu.k)) {
                jmu.k = -1;
            }
        }
        this.c = UUID.randomUUID().toString();
        this.d = new jml(this, jmu);
        this.n.a(ljy.a(new jmk(this)));
    }

    public void a(jmu jmu, String str, int i) {
        if (TextUtils.equals(str, this.c)) {
            this.c = null;
            this.j = jmu;
            this.k = i;
            g();
        }
    }

    public boolean e() {
        return (this.d == null && this.c == null && this.j == null) ? false : true;
    }

    public void S_() {
        if (this.l) {
            h();
        }
    }

    void f() {
        h();
        if (!this.a.isFinishing()) {
            if (this.l && this.d != null) {
                this.d.b.run();
            }
            g();
        }
    }

    private void g() {
        if (this.l && this.j != null) {
            boolean z;
            jcb jcb;
            jmu jmu;
            int i = this.k;
            jcb jcb2 = i != -1 ? jcb.VALID : jcb.INVALID;
            jmu jmu2 = this.j;
            if (i != -1 || this.h == -1) {
                jmu jmu3 = jmu2;
                z = false;
                jcb = jcb2;
                jmu = jmu3;
            } else if (a(jmu2, this.h)) {
                jcb = jcb.VALID;
                i = this.h;
                boolean z2 = this.j.c != -1;
                jmu = this.i;
                z = z2;
            } else {
                z = false;
                i = -1;
                jcb = jcb.UNKNOWN;
                jmu = null;
            }
            this.k = -1;
            this.j = null;
            a(jmu, jcb, i, z);
        }
    }

    private void a(jmu jmu, jcb jcb, int i, boolean z) {
        int i2 = 0;
        jcb jcb2 = this.g;
        int i3 = this.h;
        this.i = jmu;
        this.g = jcb;
        this.h = i;
        boolean z2 = (!z && jcb == jcb2 && i == i3) ? false : true;
        ArrayList arrayList = new ArrayList(this.m);
        int size = arrayList.size();
        while (i2 < size) {
            int i4 = i2 + 1;
            ((jcc) arrayList.get(i2)).a(z2, jcb2, jcb, i3, i);
            i2 = i4;
        }
    }

    private boolean a(jmu jmu, int i) {
        return this.e.c(i) && this.b.a(jmu, i);
    }

    private void h() {
        if (!e() && this.h != -1 && !a(this.i, this.h)) {
            a(null, jcb.UNKNOWN, -1, false);
        }
    }
}
