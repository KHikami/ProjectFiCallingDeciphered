package p000;

import android.content.Context;

public final class jvd {
    String f21115a;
    String f21116b;
    boolean f21117c;
    juh f21118d;
    boolean f21119e;
    juv f21120f;
    private boolean f21121g;

    public jvd m25300a(String str) {
        this.f21115a = str;
        return this;
    }

    public jvd m25304b(String str) {
        this.f21116b = str;
        return this;
    }

    public jvd m25299a(Context context, int i) {
        boolean z;
        jch a = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i);
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        ba.m4579a(z, "Account id %s not found", Integer.valueOf(i));
        this.f21115a = a.mo3440b("account_name");
        this.f21116b = a.mo3440b("effective_gaia_id");
        return this;
    }

    public jvd m25303a(boolean z) {
        this.f21117c = z;
        return this;
    }

    public jvd m25301a(juh juh) {
        this.f21118d = juh;
        return this;
    }

    public jvd m25305b(boolean z) {
        this.f21119e = z;
        return this;
    }

    public jvd m25302a(juv juv) {
        this.f21120f = juv;
        return this;
    }

    public jvc m25298a() {
        boolean z = false;
        boolean z2 = this.f21121g || this.f21115a != null;
        ba.m4610b(z2, (Object) "Authenticated request requires account name");
        if (!this.f21121g || this.f21115a == null) {
            z = true;
        }
        ba.m4610b(z, (Object) "Unauthenticated request should not specify account name");
        return new jvc(this);
    }
}
