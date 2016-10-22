package defpackage;

import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;

/* renamed from: gbn */
public final class gbn implements onc {
    private final onc<dr> a;

    public /* synthetic */ Object a() {
        return b();
    }

    public gbn(onc<dr> onc_dr) {
        this.a = onc_dr;
    }

    private StatusMessageSettingsFragment b() {
        return (StatusMessageSettingsFragment) bn.a(gwb.a((dr) this.a.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
