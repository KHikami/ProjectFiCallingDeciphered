package p000;

import android.app.Activity;

public final class lfc implements onc {
    private final onc<Activity> f24892a;
    private final onc<kbu> f24893b;
    private final onc<lfp> f24894c;
    private final onc<jcf> f24895d;
    private final onc<jmq> f24896e;
    private final onc<lfl> f24897f;

    public /* synthetic */ Object mo1297a() {
        return m28965b();
    }

    public lfc(onc<Activity> onc_android_app_Activity, onc<kbu> onc_kbu, onc<lfp> onc_lfp, onc<jcf> onc_jcf, onc<jmq> onc_jmq, onc<lfl> onc_lfl) {
        this.f24892a = onc_android_app_Activity;
        this.f24893b = onc_kbu;
        this.f24894c = onc_lfp;
        this.f24895d = onc_jcf;
        this.f24896e = onc_jmq;
        this.f24897f = onc_lfl;
    }

    private jca m28965b() {
        return (jca) bn.m6215a(gwb.m1704a((Activity) this.f24892a.mo1297a(), (kbu) this.f24893b.mo1297a(), (lfp) this.f24894c.mo1297a(), this.f24895d, this.f24896e, this.f24897f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
