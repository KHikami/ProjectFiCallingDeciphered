package defpackage;

import android.content.Context;

public final class jlp {
    private static final long a = kdk.c.a(5);
    private static final long b = kdk.c.a(100);
    private static final long c = kdk.c.a(512);
    private jlq d;
    private jlm e = new jln().a("media").a(a).b(b).a(0.1f).a();
    private jlm f = new jln().a("media_sync").a(0).b(c).a(0.25f).a();

    public jlp(Context context) {
        this.d = new jls().a(context);
    }

    public jlo a() {
        return new jlo(this.d, this.e, this.f);
    }
}
