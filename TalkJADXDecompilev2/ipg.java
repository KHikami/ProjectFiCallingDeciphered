package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class ipg implements ijh {
    static final long a = TimeUnit.MINUTES.toMillis(55);
    final Context b;
    final iop c;
    iiu d;
    itg e;
    loh f;
    loe g;
    off h;
    ipj i;
    String j;
    private final iti k;
    private final Runnable l = new iph(this);

    public ipg(Context context, iti iti, String str) {
        iop ior;
        this.b = context.getApplicationContext();
        this.k = iti;
        itx.a("vclib", "Using new ApiaryClient: %b", Boolean.valueOf(iti.b().a()));
        if (iti.b().a()) {
            ior = new ior(context, iti.a());
        } else {
            ior = new ioy(context, iti.a());
        }
        this.c = ior;
        if (str != null) {
            this.c.a(str, System.currentTimeMillis());
        }
    }

    public void a() {
        gwb.b(this.l);
        gwb.a(new ipi(this));
    }

    public iti b() {
        return this.k;
    }

    public void a(iiu iiu, itg itg) {
        this.d = iiu;
        this.e = itg;
        this.l.run();
    }

    public void a(loh loh) {
        this.f = loh;
    }

    public void a(loe loe) {
        this.g = loe;
    }

    public void a(off off) {
        this.h = off;
    }

    public <T extends nzf> void a(String str, nzf nzf, Class<T> cls, ijl<T> ijl_T) {
        a(str, nzf, cls, ijl_T, 20000, 1000, 3);
    }

    public <T extends nzf> void a(String str, nzf nzf, Class<T> cls, ijl<T> ijl_T, int i, long j, int i2) {
        gwb.a(new ipk(this, str, nzf, cls, ijl_T, i, 1000, i2));
    }

    @Deprecated
    public iop c() {
        return this.c;
    }
}
