package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

public class jgg implements jza, kbi, kcd, kcg, kcj, kcm, kcn, kcq {
    private static final jgw a = new jgi();
    private final ArrayList<jgf> b = new ArrayList();
    private final lo<String, ArrayList<a>> c = new lo();
    private final String d;
    private Activity e;
    private jgu f;
    private jgj g;
    private jgw h = a;
    private boolean i;

    public jgg(Activity activity, kbu kbu) {
        this.e = activity;
        this.d = activity.getClass().getSimpleName();
        kbu.a((kcq) this);
    }

    public jgg(dr drVar, kbu kbu) {
        this.d = drVar.getClass().getSimpleName();
        kbu.a((kcq) this);
    }

    @Deprecated
    public jgg a(jgf jgf) {
        this.b.add(jgf);
        return this;
    }

    @Deprecated
    public jgg b(jgf jgf) {
        this.b.remove(jgf);
        return this;
    }

    public void a(Activity activity) {
        this.e = activity;
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        a(jyn, bundle);
        ba.a(this.f);
    }

    public void a(Bundle bundle) {
        if (this.f == null) {
            a(jyn.b(this.e), bundle);
        }
    }

    private void a(jyn jyn, Bundle bundle) {
        this.f = (jgu) jyn.a(jgu.class);
        if (bundle != null) {
            this.g = (jgj) bundle.getParcelable("boc_background_tasks");
        } else {
            this.g = new jgj(this.f);
        }
        if (!this.i) {
            jgx jgx = (jgx) jyn.b(jgx.class);
            if (jgx != null && (this.e instanceof dw)) {
                this.h = jgx.a(this.e, ((dw) this.e).J_());
            }
        }
    }

    public void R_() {
        ba.a(this.f, (Object) "Did you forget to call onAttachBinder or onCreate in your test?");
        this.f.a(this);
    }

    public void T_() {
        this.f.b(this);
    }

    public void o_() {
        if (this.e.isFinishing()) {
            this.f.c(this);
        }
    }

    public void b(Bundle bundle) {
        bundle.putParcelable("boc_background_tasks", this.g);
    }

    public boolean a(String str) {
        if (this.g == null) {
            return false;
        }
        return this.f.a(this, str);
    }

    public void a(jgc jgc) {
        ba.a(this.f, (Object) "Are you trying to start a task before onCreate?");
        this.g.a(jgc);
        jgc.c(this.e.getApplicationContext());
        this.f.a(jgc, this);
    }

    public void b(jgc jgc) {
        this.h.a(jgc);
        a(jgc);
    }

    public void b(String str) {
        this.f.c(this, str);
        this.h.a(str);
    }

    void c(String str) {
        this.g.b(str);
    }

    void a(String str, jgz jgz) {
        int size;
        this.g.b(str);
        this.h.a(str);
        this.h.a(true);
        ArrayList arrayList = (ArrayList) this.c.get(str);
        if (arrayList != null) {
            for (size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
        for (size = this.b.size() - 1; size >= 0; size--) {
            ((jgf) this.b.get(size)).a(str, jgz, this.h);
        }
        if (this.h.b()) {
            this.h.a(jgz);
        }
    }

    int c() {
        return this.g.a();
    }

    String[] d() {
        return this.g.b();
    }

    int d(String str) {
        return this.g.a(str);
    }
}
