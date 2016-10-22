import android.content.Context;
import android.net.Uri;

final class jrs {
    Context a;
    Uri b;
    String c;
    String d;
    mzw e;
    odm f;
    kou g;
    jpz h;
    pbc i;

    public jrs(Context context) {
        this.i = pbc.a;
        this.a = context;
    }

    public jrs a(Uri uri) {
        this.b = uri;
        return this;
    }

    public jrs a(String str) {
        this.c = str;
        return this;
    }

    public jrs b(String str) {
        this.d = str;
        return this;
    }

    public jrs a(mzw mzw) {
        this.e = mzw;
        return this;
    }

    public jrs a(odm odm) {
        this.f = odm;
        return this;
    }

    public jrs a(kou kou) {
        this.g = kou;
        return this;
    }

    public jrs a(jpz jpz) {
        this.h = jpz;
        return this;
    }

    public jrs a(pbc pbc) {
        this.i = pbc;
        return this;
    }

    public jrr a() {
        ba.a(this.a);
        ba.a(this.b);
        ba.a(this.h);
        return new jrr(this);
    }
}
