package p000;

import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;

public final class gbn implements onc {
    private final onc<dr> f14604a;

    public /* synthetic */ Object mo1297a() {
        return m16859b();
    }

    public gbn(onc<dr> onc_dr) {
        this.f14604a = onc_dr;
    }

    private StatusMessageSettingsFragment m16859b() {
        return (StatusMessageSettingsFragment) bn.m6215a(gwb.m1587a((dr) this.f14604a.mo1297a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
