package p000;

import android.app.Activity;

public final class jeu implements onc {
    private final onc<Activity> f19949a;
    private final onc<kbu> f19950b;

    public /* synthetic */ Object mo1297a() {
        return m24059b();
    }

    public jeu(onc<Activity> onc_android_app_Activity, onc<kbu> onc_kbu) {
        this.f19949a = onc_android_app_Activity;
        this.f19950b = onc_kbu;
    }

    private jer m24059b() {
        return (jer) bn.m6215a(gwb.m1705a((Activity) this.f19949a.mo1297a(), (kbu) this.f19950b.mo1297a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
