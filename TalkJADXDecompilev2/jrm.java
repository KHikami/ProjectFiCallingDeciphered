package defpackage;

import android.net.Uri;
import android.text.TextUtils;

public final class jrm {
    Uri a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    long j;
    boolean k = true;
    int l;
    boolean m;
    mzw n;
    odm o;
    kou p;
    jpz q;
    pbc r = pbc.a;
    jrn s = jrn.ORIGINAL;

    public jrm a(Uri uri) {
        this.a = uri;
        return this;
    }

    public jrm a(String str) {
        this.d = str;
        return this;
    }

    public jrm b(String str) {
        this.e = str;
        return this;
    }

    public jrm c(String str) {
        this.f = str;
        return this;
    }

    public jrm a(boolean z) {
        this.k = true;
        return this;
    }

    public jrm b(boolean z) {
        this.m = false;
        return this;
    }

    public jrl a() {
        boolean z;
        boolean z2 = true;
        if (TextUtils.isEmpty(this.e) && TextUtils.isEmpty(this.g) && TextUtils.isEmpty(this.i)) {
            z = false;
        } else {
            z = true;
        }
        ba.b(z, (Object) "must specify an albumId, albumMediaKey or eventId");
        if (this.a == null || this.a == Uri.EMPTY) {
            z2 = false;
        }
        ba.b(z2, (Object) "must specify a mediaUri");
        return new jrl(this);
    }
}
