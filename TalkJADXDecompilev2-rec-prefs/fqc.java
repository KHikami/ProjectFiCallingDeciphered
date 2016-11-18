package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fqc implements fqd {
    private static final long serialVersionUID = 2;
    private final long f13730a;
    private final boolean f13731b;

    public fqc(lux lux) {
        this.f13731b = gwb.m2061b(Boolean.valueOf(lux.f26549c != null));
        if (this.f13731b) {
            this.f13730a = gwb.m1523a(lux.f26549c.f26028b);
        } else {
            this.f13730a = 0;
        }
    }

    public void mo2060a(int i, mfa<Intent> mfa_android_content_Intent) {
        bko e = fde.m15018e(i);
        if (this.f13731b) {
            long j = this.f13730a;
            if (e != null) {
                ((fuz) jyn.m25426a(gwb.m1400H(), fuz.class)).m16288a(i, j);
            }
            RealTimeChatService.m9014a(e, j);
        }
    }
}
