package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

public class jgg implements jza, kbi, kcd, kcg, kcj, kcm, kcn, kcq {
    private static final jgw f19998a = new jgi();
    private final ArrayList<jgf> f19999b = new ArrayList();
    private final lo<String, ArrayList<C0000a>> f20000c = new lo();
    private final String f20001d;
    private Activity f20002e;
    private jgu f20003f;
    private jgj f20004g;
    private jgw f20005h = f19998a;
    private boolean f20006i;

    public jgg(Activity activity, kbu kbu) {
        this.f20002e = activity;
        this.f20001d = activity.getClass().getSimpleName();
        kbu.m25514a((kcq) this);
    }

    public jgg(dr drVar, kbu kbu) {
        this.f20001d = drVar.getClass().getSimpleName();
        kbu.m25514a((kcq) this);
    }

    @Deprecated
    public jgg m24129a(jgf jgf) {
        this.f19999b.add(jgf);
        return this;
    }

    @Deprecated
    public jgg m24136b(jgf jgf) {
        this.f19999b.remove(jgf);
        return this;
    }

    public void mo1885a(Activity activity) {
        this.f20002e = activity;
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        m24128a(jyn, bundle);
        ba.m4536a(this.f20003f);
    }

    public void mo643a(Bundle bundle) {
        if (this.f20003f == null) {
            m24128a(jyn.m25435b(this.f20002e), bundle);
        }
    }

    private void m24128a(jyn jyn, Bundle bundle) {
        this.f20003f = (jgu) jyn.m25443a(jgu.class);
        if (bundle != null) {
            this.f20004g = (jgj) bundle.getParcelable("boc_background_tasks");
        } else {
            this.f20004g = new jgj(this.f20003f);
        }
        if (!this.f20006i) {
            jgx jgx = (jgx) jyn.m25454b(jgx.class);
            if (jgx != null && (this.f20002e instanceof dw)) {
                this.f20005h = jgx.mo3505a(this.f20002e, ((dw) this.f20002e).J_());
            }
        }
    }

    public void R_() {
        ba.m4537a(this.f20003f, (Object) "Did you forget to call onAttachBinder or onCreate in your test?");
        this.f20003f.m24172a(this);
    }

    public void T_() {
        this.f20003f.m24175b(this);
    }

    public void o_() {
        if (this.f20002e.isFinishing()) {
            this.f20003f.m24178c(this);
        }
    }

    public void mo645b(Bundle bundle) {
        bundle.putParcelable("boc_background_tasks", this.f20004g);
    }

    public boolean m24135a(String str) {
        if (this.f20004g == null) {
            return false;
        }
        return this.f20003f.m24173a(this, str);
    }

    public void m24134a(jgc jgc) {
        ba.m4537a(this.f20003f, (Object) "Are you trying to start a task before onCreate?");
        this.f20004g.m24152a(jgc);
        jgc.m6403c(this.f20002e.getApplicationContext());
        this.f20003f.m24170a(jgc, this);
    }

    public void m24139b(jgc jgc) {
        this.f20005h.m7029a(jgc);
        m24134a(jgc);
    }

    public void m24138b(String str) {
        this.f20003f.m24179c(this, str);
        this.f20005h.mo794a(str);
    }

    void m24141c(String str) {
        this.f20004g.m24153b(str);
    }

    void m24133a(String str, jgz jgz) {
        int size;
        this.f20004g.m24153b(str);
        this.f20005h.mo794a(str);
        this.f20005h.m7031a(true);
        ArrayList arrayList = (ArrayList) this.f20000c.get(str);
        if (arrayList != null) {
            for (size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
        for (size = this.f19999b.size() - 1; size >= 0; size--) {
            ((jgf) this.f19999b.get(size)).mo662a(str, jgz, this.f20005h);
        }
        if (this.f20005h.m7033b()) {
            this.f20005h.mo796a(jgz);
        }
    }

    int m24140c() {
        return this.f20004g.m24150a();
    }

    String[] m24143d() {
        return this.f20004g.m24154b();
    }

    int m24142d(String str) {
        return this.f20004g.m24151a(str);
    }
}
