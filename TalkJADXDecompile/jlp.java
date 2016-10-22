import android.content.Context;

public final class jlp {
    private static final long a;
    private static final long b;
    private static final long c;
    private jlq d;
    private jlm e;
    private jlm f;

    static {
        a = kdk.MEGABYTES.a(5);
        b = kdk.MEGABYTES.a(100);
        c = kdk.MEGABYTES.a(512);
    }

    public jlp(Context context) {
        this.d = new jls().a(context);
        this.e = new jln().a("media").a(a).b(b).a(0.1f).a();
        this.f = new jln().a("media_sync").a(0).b(c).a(0.25f).a();
    }

    public jlo a() {
        return new jlo(this.d, this.e, this.f);
    }
}
