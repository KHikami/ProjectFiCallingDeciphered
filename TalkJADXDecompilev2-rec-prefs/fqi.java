package p000;

import android.content.Intent;

public final class fqi implements fqd {
    private static final long serialVersionUID = 1;
    private final String f13738a;
    private final int f13739b;

    public fqi(String str, int i) {
        this.f13738a = str;
        this.f13739b = i;
    }

    public fqi(loy loy) {
        this.f13738a = loy.f25960a.f25931a;
        this.f13739b = gwb.m1507a(loy.f25962c);
    }

    public String m15961a() {
        return this.f13738a;
    }

    public int m15963b() {
        return this.f13739b;
    }

    public void mo2060a(int i, mfa<Intent> mfa_android_content_Intent) {
        new fdb(this).m14990b(new blo(gwb.m1400H(), i));
    }
}
