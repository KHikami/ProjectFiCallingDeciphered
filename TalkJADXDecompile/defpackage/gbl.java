package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;

/* renamed from: gbl */
public final class gbl implements onc {
    private final onc<Context> a;
    private final onc<lfd> b;
    private final onc<StatusMessageSettingsFragment> c;
    private final onc<ero> d;

    public /* synthetic */ Object a() {
        return b();
    }

    public gbl(onc<Context> onc_android_content_Context, onc<lfd> onc_lfd, onc<StatusMessageSettingsFragment> onc_com_google_android_apps_hangouts_statusmessage_impl_StatusMessageSettingsFragment, onc<ero> onc_ero) {
        this.a = onc_android_content_Context;
        this.b = onc_lfd;
        this.c = onc_com_google_android_apps_hangouts_statusmessage_impl_StatusMessageSettingsFragment;
        this.d = onc_ero;
    }

    private gbg b() {
        return new gbg((Context) this.a.a(), (lfd) this.b.a(), (StatusMessageSettingsFragment) this.c.a(), (ero) this.d.a());
    }
}
