package p000;

import android.graphics.Bitmap;
import java.io.InputStream;

public final class awy implements aoa<InputStream, Bitmap> {
    private final awn f2458a;
    private final aqy f2459b;

    public /* bridge */ /* synthetic */ boolean mo395a(Object obj, anz anz) {
        return m4235a((InputStream) obj);
    }

    public awy(awn awn, aqy aqy) {
        this.f2458a = awn;
        this.f2459b = aqy;
    }

    private boolean m4235a(InputStream inputStream) {
        return awn.m4189a();
    }

    private aqr<Bitmap> m4234a(InputStream inputStream, int i, int i2, anz anz) {
        if (inputStream instanceof aww) {
            inputStream = (aww) inputStream;
            Object obj = null;
        } else {
            int i3 = 1;
            inputStream = new aww(inputStream, this.f2459b);
        }
        InputStream a = bal.m4670a(inputStream);
        try {
            aqr<Bitmap> a2 = this.f2458a.m4198a(new bao(a), i, i2, anz, new awz(inputStream, a));
            return a2;
        } finally {
            a.m4673b();
            if (obj != null) {
                inputStream.m4233b();
            }
        }
    }
}
