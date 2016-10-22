package defpackage;

import android.content.Context;
import pbm;

/* renamed from: iit */
final class iit implements iid {
    final /* synthetic */ iis a;
    private iid b;
    private Context c;

    public iit(iis iis, Context context) {
        this.a = iis;
        this.c = context;
    }

    public void a() {
        d();
        if (this.b != null) {
            this.b.a();
        }
    }

    public void a(mdg mdg) {
        d();
        if (this.b != null) {
            this.b.a(mdg);
        }
    }

    public void a(pbm pbm) {
        d();
        if (this.b != null) {
            this.b.a(pbm);
        }
    }

    public iie b() {
        d();
        return this.b == null ? null : this.b.b();
    }

    public iii c() {
        d();
        return this.b == null ? null : this.b.c();
    }

    private void d() {
        if (this.b == null) {
            iih iih = (iih) jyn.b(this.c, iih.class);
            if (iih != null) {
                this.b = iih.a();
            }
        }
    }
}
