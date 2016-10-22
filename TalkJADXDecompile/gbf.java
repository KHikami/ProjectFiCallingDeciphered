import android.app.Activity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;

public final class gbf implements onc {
    private final onc<Activity> a;

    public /* synthetic */ Object a() {
        return b();
    }

    public gbf(onc<Activity> onc_android_app_Activity) {
        this.a = onc_android_app_Activity;
    }

    private StatusMessageSettingsActivity b() {
        return (StatusMessageSettingsActivity) bn.a(gwb.d((Activity) this.a.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
