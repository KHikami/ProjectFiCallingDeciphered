package p000;

import android.content.Context;
import android.net.Uri;

final class jrs {
    Context f20924a;
    Uri f20925b;
    String f20926c;
    String f20927d;
    mzw f20928e;
    odm f20929f;
    kou f20930g;
    jpz f20931h;
    pbc f20932i = pbc.a;

    public jrs(Context context) {
        this.f20924a = context;
    }

    public jrs m25121a(Uri uri) {
        this.f20925b = uri;
        return this;
    }

    public jrs m25122a(String str) {
        this.f20926c = str;
        return this;
    }

    public jrs m25128b(String str) {
        this.f20927d = str;
        return this;
    }

    public jrs m25125a(mzw mzw) {
        this.f20928e = mzw;
        return this;
    }

    public jrs m25126a(odm odm) {
        this.f20929f = odm;
        return this;
    }

    public jrs m25124a(kou kou) {
        this.f20930g = kou;
        return this;
    }

    public jrs m25123a(jpz jpz) {
        this.f20931h = jpz;
        return this;
    }

    public jrs m25127a(pbc pbc) {
        this.f20932i = pbc;
        return this;
    }

    public jrr m25120a() {
        ba.m4536a(this.f20924a);
        ba.m4536a(this.f20925b);
        ba.m4536a(this.f20931h);
        return new jrr(this);
    }
}
