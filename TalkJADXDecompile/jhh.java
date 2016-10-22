import android.content.Context;
import android.text.TextUtils;

public final class jhh implements jhf {
    final Context a;
    final jkn b;
    private int c;
    private jhi d;
    private final jhk e;
    private final jhl f;
    private final jtv g;

    public jhh(Context context) {
        this.c = -1;
        this.d = null;
        this.e = new jhk(this);
        this.f = new jhl(this);
        this.g = new jhj();
        this.a = context;
        jyn b = jyn.b(context);
        this.b = (jkn) b.a(jkn.class);
        jhg jhg = (jhg) b.b(jhg.class);
        if (jhg != null) {
            this.c = jhg.a();
        }
    }

    public jtv a(Context context, String str, int i, int i2, jtx jtx) {
        return a(context, str, i, i2, jtx, false);
    }

    public jtv b(Context context, String str, int i, int i2, jtx jtx) {
        return a(context, str, i, i2, jtx, true);
    }

    private jtv a(Context context, String str, int i, int i2, jtx jtx, boolean z) {
        if (TextUtils.isEmpty(str)) {
            jtx.a(this.g);
            return this.g;
        }
        int i3;
        jhi jhi;
        jpf a = jpf.a(context, str, jpl.IMAGE);
        int i4 = this.c;
        if (z) {
            i3 = 524288;
        } else {
            i3 = 0;
        }
        if (this.d != null) {
            jhi jhi2 = this.d;
            this.d = (jhi) this.d.h();
            jhi2.a(null);
            jhi = jhi2;
        } else {
            jhi = new jhi();
        }
        jhi.a(((i3 & -33) & -5) & -257, a, gwb.v(this.a, i), i4, i2);
        return a(jhi, jtx);
    }

    public jph a(jhi jhi, jtx jtx) {
        jtv jtv = (jph) this.b.a((jtw) jhi);
        if (jtv == null) {
            jtv = new jph(this.b, jhi);
            switch (jhi.b()) {
                case wi.j /*1*/:
                    jtv.c = this.e;
                    break;
                case wi.l /*2*/:
                    jtv.c = this.f;
                    break;
                default:
                    jtv.c = null;
                    break;
            }
        }
        jhi.a(this.d);
        this.d = jhi;
        this.b.a(jtv, jtx);
        return jtv;
    }
}
