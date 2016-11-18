package defpackage;

import java.io.InputStream;

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
