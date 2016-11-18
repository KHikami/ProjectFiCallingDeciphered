package p000;

import android.app.Activity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;

public final class gbf implements onc {
    private final onc<Activity> f14583a;

    public /* synthetic */ Object mo1297a() {
        return m16843b();
    }

    public gbf(onc<Activity> onc_android_app_Activity) {
        this.f14583a = onc_android_app_Activity;
    }

    private StatusMessageSettingsActivity m16843b() {
        return (StatusMessageSettingsActivity) bn.m6215a(gwb.m2127d((Activity) this.f14583a.mo1297a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
