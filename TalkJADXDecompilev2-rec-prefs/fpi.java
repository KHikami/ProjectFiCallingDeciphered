package p000;

import android.content.Intent;

public final class fpi implements fqd {
    private static final long serialVersionUID = 1;
    public final int f13683a;
    public final long f13684b;

    public fpi(lpb lpb) {
        this.f13683a = gwb.m1508a(lpb.f25984a.f25991b, 0);
        if (this.f13683a == 0) {
            glk.m17982e("Babel", "ClientDeclineAllInvitesNotification with unknown affinity", new Object[0]);
            this.f13684b = 0;
            return;
        }
        this.f13684b = gwb.m1523a(lpb.f25984a.f25990a);
    }

    public void mo2060a(int i, mfa<Intent> mfa_android_content_Intent) {
        new blo(gwb.m1400H(), i).m5960a(this.f13683a, this.f13684b);
    }
}
