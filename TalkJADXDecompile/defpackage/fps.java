package defpackage;

import android.content.Intent;

/* renamed from: fps */
public final class fps implements fqd {
    private static final long serialVersionUID = 1;
    private final String a;
    private final int b;

    public fps(lvi lvi) {
        this.a = lvi.a.a;
        this.b = gwb.a(lvi.b);
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public void a(int i, mfa<Intent> mfa_android_content_Intent) {
        fhc fhc = new fhc();
        new fky(this).a(new blo(gwb.H(), i));
        fhc.c();
    }
}
