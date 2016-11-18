package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fpk implements fqd {
    private static final long serialVersionUID = 1;
    private final String f13688a;
    private String f13689b;
    private edo f13690c;

    public fpk(lpy lpy) {
        this.f13689b = lpy.f26049b != null ? lpy.f26049b.f25931a : null;
        this.f13690c = gwb.m1604a(gwb.m1400H(), lpy.f26048a, null);
        if (lpy.f26050c != null) {
            this.f13688a = lpy.f26050c.f26044a;
        } else {
            this.f13688a = null;
        }
    }

    public String m15905a() {
        return this.f13688a;
    }

    public String m15907b() {
        return this.f13689b;
    }

    public edo m15908c() {
        return this.f13690c;
    }

    public void mo2060a(int i, mfa<Intent> mfa_android_content_Intent) {
        RealTimeChatService.f6752i.post(new fhi(fde.m15018e(i), this));
    }
}
