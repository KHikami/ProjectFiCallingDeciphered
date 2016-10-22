package defpackage;

import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivityPeer;

/* renamed from: gbd */
public final class gbd implements onc {
    private final onc<StatusMessageSettingsActivity> a;

    public /* synthetic */ Object a() {
        return b();
    }

    public gbd(onc<StatusMessageSettingsActivity> onc_com_google_android_apps_hangouts_statusmessage_impl_StatusMessageSettingsActivity) {
        this.a = onc_com_google_android_apps_hangouts_statusmessage_impl_StatusMessageSettingsActivity;
    }

    private StatusMessageSettingsActivityPeer b() {
        return new StatusMessageSettingsActivityPeer((StatusMessageSettingsActivity) this.a.a());
    }
}
