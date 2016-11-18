package p000;

import android.content.Intent;

public final class fpj implements fqd {
    private static final long serialVersionUID = 1;
    private final String f13685a;
    private final long f13686b;
    private final String[] f13687c;

    public fpj(lph lph) {
        this.f13685a = lph.f25997a.f25931a;
        if (lph.f25998b == null) {
            glk.m17982e("Babel", "DeleteConversationNotification without deteleAction", new Object[0]);
            this.f13686b = 0;
        } else {
            this.f13686b = gwb.m1523a(lph.f25998b.f25995c);
            if (gwb.m1507a(lph.f25998b.f25993a) == 2) {
                this.f13687c = lph.f25998b.f25996d;
                return;
            }
        }
        this.f13687c = null;
    }

    public String m15901a() {
        return this.f13685a;
    }

    public long m15903b() {
        return this.f13686b;
    }

    public String[] m15904c() {
        return this.f13687c;
    }

    public void mo2060a(int i, mfa<Intent> mfa_android_content_Intent) {
        new fes(this).m15169a(new blo(gwb.m1400H(), i));
    }
}
