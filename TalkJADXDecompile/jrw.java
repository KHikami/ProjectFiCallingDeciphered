import android.net.Uri;

final class jrw implements jsh {
    final /* synthetic */ jrv a;
    private final Uri b;
    private final long c;
    private final long d;
    private long e;
    private jqh f;

    boolean a() {
        return this.f != null;
    }

    jqh b() {
        return this.f;
    }

    jrw(jrv jrv, Uri uri, long j, long j2) {
        this.a = jrv;
        this.e = 0;
        this.b = uri;
        this.c = j;
        this.d = j2;
    }

    public void a(long j, long j2) {
        if (j - this.e > jrv.a) {
            this.e = j;
            try {
                this.a.b();
            } catch (jqh e) {
                this.f = e;
                this.a.a();
            }
        }
        if (this.d + j < j2) {
            this.a.b.a(this.d + j, this.c);
        }
    }
}
