package defpackage;

import android.text.TextUtils;

/* renamed from: bmb */
public class bmb extends cqm {
    public final bnp a;
    public boolean b;

    public bmb(bnp bnp) {
        super(bnp.b(), bnp.c);
        this.a = bnp;
    }

    protected final void a(cqk cqk) {
        bnd bnd = (bnd) cqk.b(bnd.class);
        if (TextUtils.isEmpty(bnd.b)) {
            bnd.b = this.a.g().b();
        }
        if (this.b && TextUtils.isEmpty(bnd.d)) {
            bnh f = this.a.f();
            bnd.d = f.c();
            bnd.e = f.b();
        }
    }
}
