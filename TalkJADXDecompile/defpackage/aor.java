package defpackage;

import java.io.InputStream;

/* renamed from: aor */
public final class aor implements aoh<InputStream> {
    private final aqy a;

    public aor(aqy aqy) {
        this.a = aqy;
    }

    private aog<InputStream> a(InputStream inputStream) {
        return new aoq(inputStream, this.a);
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }
}
