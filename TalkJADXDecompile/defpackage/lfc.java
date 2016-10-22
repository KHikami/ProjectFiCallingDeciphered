package defpackage;

import android.app.Activity;

/* renamed from: lfc */
public final class lfc implements onc {
    private final onc<Activity> a;
    private final onc<kbu> b;
    private final onc<lfp> c;
    private final onc<jcf> d;
    private final onc<jmq> e;
    private final onc<lfl> f;

    public /* synthetic */ Object a() {
        return b();
    }

    public lfc(onc<Activity> onc_android_app_Activity, onc<kbu> onc_kbu, onc<lfp> onc_lfp, onc<jcf> onc_jcf, onc<jmq> onc_jmq, onc<lfl> onc_lfl) {
        this.a = onc_android_app_Activity;
        this.b = onc_kbu;
        this.c = onc_lfp;
        this.d = onc_jcf;
        this.e = onc_jmq;
        this.f = onc_lfl;
    }

    private jca b() {
        return (jca) bn.a(gwb.a((Activity) this.a.a(), (kbu) this.b.a(), (lfp) this.c.a(), this.d, this.e, this.f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
