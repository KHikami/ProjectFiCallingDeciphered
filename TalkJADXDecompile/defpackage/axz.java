package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: axz */
public final class axz implements ayc<Bitmap, byte[]> {
    private final CompressFormat a;
    private final int b;

    public axz() {
        this(CompressFormat.JPEG, 100);
    }

    private axz(CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = 100;
    }

    public aqr<byte[]> a(aqr<Bitmap> aqr_android_graphics_Bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) aqr_android_graphics_Bitmap.c()).compress(this.a, this.b, byteArrayOutputStream);
        aqr_android_graphics_Bitmap.e();
        return new axi(byteArrayOutputStream.toByteArray());
    }
}
