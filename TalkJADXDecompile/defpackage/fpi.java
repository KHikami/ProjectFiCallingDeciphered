package defpackage;

import android.content.Intent;

/* renamed from: fpi */
public final class fpi implements fqd {
    private static final long serialVersionUID = 1;
    public final int a;
    public final long b;

    public fpi(lpb lpb) {
        this.a = gwb.a(lpb.a.b, 0);
        if (this.a == 0) {
            glk.e("Babel", "ClientDeclineAllInvitesNotification with unknown affinity", new Object[0]);
            this.b = 0;
            return;
        }
        this.b = gwb.a(lpb.a.a);
    }

    public void a(int i, mfa<Intent> mfa_android_content_Intent) {
        new blo(gwb.H(), i).a(this.a, this.b);
    }
}
