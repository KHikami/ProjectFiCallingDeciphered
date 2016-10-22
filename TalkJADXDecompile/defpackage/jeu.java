package defpackage;

import android.app.Activity;

/* renamed from: jeu */
public final class jeu implements onc {
    private final onc<Activity> a;
    private final onc<kbu> b;

    public /* synthetic */ Object a() {
        return b();
    }

    public jeu(onc<Activity> onc_android_app_Activity, onc<kbu> onc_kbu) {
        this.a = onc_android_app_Activity;
        this.b = onc_kbu;
    }

    private jer b() {
        return (jer) bn.a(gwb.a((Activity) this.a.a(), (kbu) this.b.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
