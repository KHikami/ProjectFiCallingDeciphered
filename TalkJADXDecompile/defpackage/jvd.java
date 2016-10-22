package defpackage;

import android.content.Context;

/* renamed from: jvd */
public final class jvd {
    String a;
    String b;
    boolean c;
    juh d;
    boolean e;
    juv f;
    private boolean g;

    public jvd a(String str) {
        this.a = str;
        return this;
    }

    public jvd b(String str) {
        this.b = str;
        return this;
    }

    public jvd a(Context context, int i) {
        boolean z;
        jch a = ((jcf) jyn.a(context, jcf.class)).a(i);
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        ba.a(z, "Account id %s not found", Integer.valueOf(i));
        this.a = a.b("account_name");
        this.b = a.b("effective_gaia_id");
        return this;
    }

    public jvd a(boolean z) {
        this.c = z;
        return this;
    }

    public jvd a(juh juh) {
        this.d = juh;
        return this;
    }

    public jvd b(boolean z) {
        this.e = z;
        return this;
    }

    public jvd a(juv juv) {
        this.f = juv;
        return this;
    }

    public jvc a() {
        boolean z = false;
        boolean z2 = this.g || this.a != null;
        ba.b(z2, (Object) "Authenticated request requires account name");
        if (!this.g || this.a == null) {
            z = true;
        }
        ba.b(z, (Object) "Unauthenticated request should not specify account name");
        return new jvc(this);
    }
}
