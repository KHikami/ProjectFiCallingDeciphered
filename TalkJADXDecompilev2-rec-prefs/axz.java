package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class axz implements ayc<Bitmap, byte[]> {
    private final CompressFormat f2528a;
    private final int f2529b;

    public axz() {
        this(CompressFormat.JPEG, 100);
    }

    private axz(CompressFormat compressFormat, int i) {
        this.f2528a = compressFormat;
        this.f2529b = 100;
    }

    public aqr<byte[]> mo408a(aqr<Bitmap> aqr_android_graphics_Bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) aqr_android_graphics_Bitmap.mo346c()).compress(this.f2528a, this.f2529b, byteArrayOutputStream);
        aqr_android_graphics_Bitmap.mo348e();
        return new axi(byteArrayOutputStream.toByteArray());
    }
}
