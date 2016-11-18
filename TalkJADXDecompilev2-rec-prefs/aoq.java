package p000;

import java.io.InputStream;

public final class aoq implements aog<InputStream> {
    private final aww f1974a;

    public /* synthetic */ Object mo317a() {
        return m3579c();
    }

    aoq(InputStream inputStream, aqy aqy) {
        this.f1974a = new aww(inputStream, aqy);
        this.f1974a.mark(5242880);
    }

    private InputStream m3579c() {
        this.f1974a.reset();
        return this.f1974a;
    }

    public void mo318b() {
        this.f1974a.m4233b();
    }
}
