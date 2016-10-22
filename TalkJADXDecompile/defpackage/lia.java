package defpackage;

import android.app.Activity;

/* renamed from: lia */
public final class lia implements onc {
    private final onc<Activity> a;

    public /* synthetic */ Object a() {
        return b();
    }

    public lia(onc<Activity> onc_android_app_Activity) {
        this.a = onc_android_app_Activity;
    }

    private kbu b() {
        return (kbu) bn.a(gwb.j((Activity) this.a.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
