package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class ipg implements ijh {
    static final long f18644a = TimeUnit.MINUTES.toMillis(55);
    final Context f18645b;
    final iop f18646c;
    iiu f18647d;
    itg f18648e;
    loh f18649f;
    loe f18650g;
    off f18651h;
    ipj f18652i;
    String f18653j;
    private final iti f18654k;
    private final Runnable f18655l = new iph(this);

    public ipg(Context context, iti iti, String str) {
        iop ior;
        this.f18645b = context.getApplicationContext();
        this.f18654k = iti;
        itx.m23282a("vclib", "Using new ApiaryClient: %b", Boolean.valueOf(iti.m23218b().m23220a()));
        if (iti.m23218b().m23220a()) {
            ior = new ior(context, iti.m23217a());
        } else {
            ior = new ioy(context, iti.m23217a());
        }
        this.f18646c = ior;
        if (str != null) {
            this.f18646c.mo3349a(str, System.currentTimeMillis());
        }
    }

    public void mo3357a() {
        gwb.m2042b(this.f18655l);
        gwb.m1863a(new ipi(this));
    }

    public iti m22843b() {
        return this.f18654k;
    }

    public void m22837a(iiu iiu, itg itg) {
        this.f18647d = iiu;
        this.f18648e = itg;
        this.f18655l.run();
    }

    public void mo3361a(loh loh) {
        this.f18649f = loh;
    }

    public void mo3360a(loe loe) {
        this.f18650g = loe;
    }

    public void mo3362a(off off) {
        this.f18651h = off;
    }

    public <T extends nzf> void mo3358a(String str, nzf nzf, Class<T> cls, ijl<T> ijl_T) {
        mo3359a(str, nzf, cls, ijl_T, 20000, 1000, 3);
    }

    public <T extends nzf> void mo3359a(String str, nzf nzf, Class<T> cls, ijl<T> ijl_T, int i, long j, int i2) {
        gwb.m1863a(new ipk(this, str, nzf, cls, ijl_T, i, 1000, i2));
    }

    @Deprecated
    public iop m22844c() {
        return this.f18646c;
    }
}
