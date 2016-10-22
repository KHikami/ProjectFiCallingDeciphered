package defpackage;

import android.graphics.Bitmap;
import java.io.InputStream;

/* renamed from: awy */
public final class awy implements aoa<InputStream, Bitmap> {
    private final awn a;
    private final aqy b;

    public /* bridge */ /* synthetic */ boolean a(Object obj, anz anz) {
        return a((InputStream) obj);
    }

    public awy(awn awn, aqy aqy) {
        this.a = awn;
        this.b = aqy;
    }

    private boolean a(InputStream inputStream) {
        return awn.a();
    }

    private aqr<Bitmap> a(InputStream inputStream, int i, int i2, anz anz) {
        if (inputStream instanceof aww) {
            inputStream = (aww) inputStream;
            Object obj = null;
        } else {
            int i3 = 1;
            inputStream = new aww(inputStream, this.b);
        }
        InputStream a = bal.a(inputStream);
        try {
            aqr<Bitmap> a2 = this.a.a(new bao(a), i, i2, anz, new awz(inputStream, a));
            return a2;
        } finally {
            a.b();
            if (obj != null) {
                inputStream.b();
            }
        }
    }
}
