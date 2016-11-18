package p000;

import android.content.Context;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;

public final class gbl implements onc {
    private final onc<Context> f14600a;
    private final onc<lfd> f14601b;
    private final onc<StatusMessageSettingsFragment> f14602c;
    private final onc<ero> f14603d;

    public /* synthetic */ Object mo1297a() {
        return m16857b();
    }

    public gbl(onc<Context> onc_android_content_Context, onc<lfd> onc_lfd, onc<StatusMessageSettingsFragment> onc_com_google_android_apps_hangouts_statusmessage_impl_StatusMessageSettingsFragment, onc<ero> onc_ero) {
        this.f14600a = onc_android_content_Context;
        this.f14601b = onc_lfd;
        this.f14602c = onc_com_google_android_apps_hangouts_statusmessage_impl_StatusMessageSettingsFragment;
        this.f14603d = onc_ero;
    }

    private gbg m16857b() {
        return new gbg((Context) this.f14600a.mo1297a(), (lfd) this.f14601b.mo1297a(), (StatusMessageSettingsFragment) this.f14602c.mo1297a(), (ero) this.f14603d.mo1297a());
    }
}
