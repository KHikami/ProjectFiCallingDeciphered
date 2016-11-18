package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class jmj implements jca, jcm, jmr, jza, kcd, kcg, kcm, kcn, kco, kcq {
    final dw f20466a;
    jmq f20467b;
    String f20468c;
    jml f20469d;
    private jcf f20470e;
    private String f20471f;
    private jcb f20472g = jcb.UNKNOWN;
    private int f20473h = -1;
    private jmu f20474i;
    private jmu f20475j;
    private int f20476k;
    private boolean f20477l;
    private final List<jcc> f20478m = new ArrayList();
    private final jio f20479n;

    public /* synthetic */ jca mo2318a(jcc jcc) {
        return m24702b(jcc);
    }

    public jmj(dw dwVar, kbu kbu) {
        this.f20466a = dwVar;
        kbu.m25514a((kcq) this);
        this.f20479n = new jio(kbu);
    }

    public jmj m24697a(jyn jyn) {
        jyn.m25444a(jca.class, (Object) this);
        jyn.m25444a(jmj.class, (Object) this);
        return this;
    }

    public jmj(dw dwVar, kbu kbu, jcf jcf, jmq jmq, jmy jmy) {
        ba.m4536a((Object) jmy);
        this.f20479n = new jio(kbu);
        this.f20466a = dwVar;
        this.f20470e = jcf;
        this.f20467b = jmq;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        if (this.f20470e == null && this.f20467b == null) {
            this.f20470e = (jcf) jyn.m25443a(jcf.class);
            this.f20467b = (jmq) jyn.m25443a(jmq.class);
        }
    }

    public void mo645b(Bundle bundle) {
        Parcelable parcelable;
        this.f20477l = false;
        bundle.putString("account_key", this.f20471f);
        bundle.putInt("account_id", this.f20473h);
        bundle.putInt("account_handler_state", this.f20472g.ordinal());
        bundle.putParcelable("completed_login_request", this.f20474i);
        String str = "queued_login_request";
        if (this.f20469d == null) {
            parcelable = null;
        } else {
            parcelable = this.f20469d.f20481a;
        }
        bundle.putParcelable(str, parcelable);
        bundle.putParcelable("pending_login_request", this.f20475j);
        bundle.putInt("pending_id", this.f20476k);
        bundle.putString("tag", this.f20468c);
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            jml jml;
            this.f20471f = bundle.getString("account_key");
            this.f20473h = bundle.getInt("account_id");
            this.f20472g = jcb.values()[bundle.getInt("account_handler_state")];
            this.f20474i = (jmu) bundle.getParcelable("completed_login_request");
            jmu jmu = (jmu) bundle.getParcelable("queued_login_request");
            if (jmu == null) {
                jml = null;
            } else {
                jml = new jml(this, jmu);
            }
            this.f20469d = jml;
            this.f20475j = (jmu) bundle.getParcelable("pending_login_request");
            this.f20476k = bundle.getInt("pending_id");
            this.f20468c = bundle.getString("tag");
        }
        this.f20477l = true;
        this.f20470e.mo3460a((jcm) this);
        this.f20467b.mo3574a((jmr) this);
    }

    public void o_() {
        this.f20470e.mo3465b((jcm) this);
        this.f20467b.mo3577b(this);
    }

    public void z_() {
        this.f20477l = true;
        m24708f();
    }

    public void R_() {
        this.f20477l = true;
        m24708f();
    }

    public int mo2317a() {
        gwb.aJ();
        return this.f20473h;
    }

    public boolean mo2319b() {
        gwb.aJ();
        return this.f20473h != -1;
    }

    public boolean m24706d() {
        gwb.aJ();
        return this.f20470e.mo3467c(this.f20473h) && this.f20470e.mo3456a(this.f20473h).mo3437a();
    }

    public jch mo2320c() {
        gwb.aJ();
        return this.f20470e.mo3456a(this.f20473h);
    }

    public jmj m24702b(jcc jcc) {
        this.f20478m.add(jcc);
        return this;
    }

    public jmj m24696a(String str) {
        this.f20471f = str;
        return this;
    }

    public void m24700a(jmu jmu) {
        if (jmu.f20502e == null) {
            jmu.f20502e = this.f20471f;
        }
        if (jmu.f20502e == null) {
            jmu.f20502e = jyn.m25428a(this.f20466a, "LoginAccountHandler.account_key", null);
        }
        if (jmu.f20505h) {
            jmu.m24733a(this.f20466a, this.f20466a.getIntent());
            if (!this.f20470e.mo3467c(jmu.f20508k)) {
                jmu.f20508k = -1;
            }
        }
        this.f20468c = UUID.randomUUID().toString();
        this.f20469d = new jml(this, jmu);
        this.f20479n.m24316a(ljy.m29195a(new jmk(this)));
    }

    public void mo3565a(jmu jmu, String str, int i) {
        if (TextUtils.equals(str, this.f20468c)) {
            this.f20468c = null;
            this.f20475j = jmu;
            this.f20476k = i;
            m24692g();
        }
    }

    public boolean m24707e() {
        return (this.f20469d == null && this.f20468c == null && this.f20475j == null) ? false : true;
    }

    public void S_() {
        if (this.f20477l) {
            m24693h();
        }
    }

    void m24708f() {
        m24693h();
        if (!this.f20466a.isFinishing()) {
            if (this.f20477l && this.f20469d != null) {
                this.f20469d.f20482b.run();
            }
            m24692g();
        }
    }

    private void m24692g() {
        if (this.f20477l && this.f20475j != null) {
            boolean z;
            jcb jcb;
            jmu jmu;
            int i = this.f20476k;
            jcb jcb2 = i != -1 ? jcb.VALID : jcb.INVALID;
            jmu jmu2 = this.f20475j;
            if (i != -1 || this.f20473h == -1) {
                jmu jmu3 = jmu2;
                z = false;
                jcb = jcb2;
                jmu = jmu3;
            } else if (m24691a(jmu2, this.f20473h)) {
                jcb = jcb.VALID;
                i = this.f20473h;
                boolean z2 = this.f20475j.f20500c != -1;
                jmu = this.f20474i;
                z = z2;
            } else {
                z = false;
                i = -1;
                jcb = jcb.UNKNOWN;
                jmu = null;
            }
            this.f20476k = -1;
            this.f20475j = null;
            m24690a(jmu, jcb, i, z);
        }
    }

    private void m24690a(jmu jmu, jcb jcb, int i, boolean z) {
        int i2 = 0;
        jcb jcb2 = this.f20472g;
        int i3 = this.f20473h;
        this.f20474i = jmu;
        this.f20472g = jcb;
        this.f20473h = i;
        boolean z2 = (!z && jcb == jcb2 && i == i3) ? false : true;
        ArrayList arrayList = new ArrayList(this.f20478m);
        int size = arrayList.size();
        while (i2 < size) {
            int i4 = i2 + 1;
            ((jcc) arrayList.get(i2)).mo1133a(z2, jcb2, jcb, i3, i);
            i2 = i4;
        }
    }

    private boolean m24691a(jmu jmu, int i) {
        return this.f20470e.mo3467c(i) && this.f20467b.mo3576a(jmu, i);
    }

    private void m24693h() {
        if (!m24707e() && this.f20473h != -1 && !m24691a(this.f20474i, this.f20473h)) {
            m24690a(null, jcb.UNKNOWN, -1, false);
        }
    }
}
