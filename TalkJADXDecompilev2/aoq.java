package defpackage;

import java.io.InputStream;

public final class aoq implements aog<InputStream> {
    private final aww a;

    public /* synthetic */ Object a() {
        return c();
    }

    aoq(InputStream inputStream, aqy aqy) {
        this.a = new aww(inputStream, aqy);
        this.a.mark(5242880);
    }

    private InputStream c() {
        this.a.reset();
        return this.a;
    }

    public void b() {
        this.a.b();
    }
}
