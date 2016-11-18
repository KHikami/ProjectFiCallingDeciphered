package defpackage;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fqc implements fqd {
    private static final long serialVersionUID = 2;
    private final long a;
    private final boolean b;

    public fqc(lux lux) {
        this.b = gwb.b(Boolean.valueOf(lux.c != null));
        if (this.b) {
            this.a = gwb.a(lux.c.b);
        } else {
            this.a = 0;
        }
    }

    public void a(int i, mfa<Intent> mfa_android_content_Intent) {
        bko e = fde.e(i);
        if (this.b) {
            long j = this.a;
            if (e != null) {
                ((fuz) jyn.a(gwb.H(), fuz.class)).a(i, j);
            }
            RealTimeChatService.a(e, j);
        }
    }
}
