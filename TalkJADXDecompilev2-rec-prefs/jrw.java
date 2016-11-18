package p000;

import android.net.Uri;

final class jrw implements jsh {
    final /* synthetic */ jrv f20957a;
    private final Uri f20958b;
    private final long f20959c;
    private final long f20960d;
    private long f20961e = 0;
    private jqh f20962f;

    boolean m25138a() {
        return this.f20962f != null;
    }

    jqh m25139b() {
        return this.f20962f;
    }

    jrw(jrv jrv, Uri uri, long j, long j2) {
        this.f20957a = jrv;
        this.f20958b = uri;
        this.f20959c = j;
        this.f20960d = j2;
    }

    public void mo3514a(long j, long j2) {
        if (j - this.f20961e > jrv.f20937a) {
            this.f20961e = j;
            try {
                this.f20957a.m25136b();
            } catch (jqh e) {
                this.f20962f = e;
                this.f20957a.m25135a();
            }
        }
        if (this.f20960d + j < j2) {
            this.f20957a.f20942b.mo3595a(this.f20960d + j, this.f20959c);
        }
    }
}
