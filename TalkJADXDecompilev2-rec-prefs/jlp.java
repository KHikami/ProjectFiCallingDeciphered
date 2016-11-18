package p000;

import android.content.Context;

public final class jlp {
    private static final long f20433a = kdk.f21416c.m25595a(5);
    private static final long f20434b = kdk.f21416c.m25595a(100);
    private static final long f20435c = kdk.f21416c.m25595a(512);
    private jlq f20436d;
    private jlm f20437e = new jln().m24659a("media").m24658a(f20433a).m24660b(f20434b).m24657a(0.1f).m24656a();
    private jlm f20438f = new jln().m24659a("media_sync").m24658a(0).m24660b(f20435c).m24657a(0.25f).m24656a();

    public jlp(Context context) {
        this.f20436d = new jls().m24677a(context);
    }

    public jlo m24664a() {
        return new jlo(this.f20436d, this.f20437e, this.f20438f);
    }
}
