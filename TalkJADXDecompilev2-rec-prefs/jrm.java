package p000;

import android.net.Uri;
import android.text.TextUtils;

public final class jrm {
    Uri f20867a;
    String f20868b;
    String f20869c;
    String f20870d;
    String f20871e;
    String f20872f;
    String f20873g;
    String f20874h;
    String f20875i;
    long f20876j;
    boolean f20877k = true;
    int f20878l;
    boolean f20879m;
    mzw f20880n;
    odm f20881o;
    kou f20882p;
    jpz f20883q;
    pbc f20884r = pbc.a;
    jrn f20885s = jrn.ORIGINAL;

    public jrm m25083a(Uri uri) {
        this.f20867a = uri;
        return this;
    }

    public jrm m25084a(String str) {
        this.f20870d = str;
        return this;
    }

    public jrm m25086b(String str) {
        this.f20871e = str;
        return this;
    }

    public jrm m25088c(String str) {
        this.f20872f = str;
        return this;
    }

    public jrm m25085a(boolean z) {
        this.f20877k = true;
        return this;
    }

    public jrm m25087b(boolean z) {
        this.f20879m = false;
        return this;
    }

    public jrl m25082a() {
        boolean z;
        boolean z2 = true;
        if (TextUtils.isEmpty(this.f20871e) && TextUtils.isEmpty(this.f20873g) && TextUtils.isEmpty(this.f20875i)) {
            z = false;
        } else {
            z = true;
        }
        ba.m4610b(z, (Object) "must specify an albumId, albumMediaKey or eventId");
        if (this.f20867a == null || this.f20867a == Uri.EMPTY) {
            z2 = false;
        }
        ba.m4610b(z2, (Object) "must specify a mediaUri");
        return new jrl(this);
    }
}
