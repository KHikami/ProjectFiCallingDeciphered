package defpackage;

import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: axy */
public final class axy implements aoa<InputStream, axo> {
    public static final anw<Boolean> a;
    private final aoa<ByteBuffer, axo> b;
    private final aqy c;

    static {
        a = anw.a("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.valueOf(false));
    }

    public axy(aoa<ByteBuffer, axo> aoa_java_nio_ByteBuffer__axo, aqy aqy) {
        this.b = aoa_java_nio_ByteBuffer__axo;
        this.c = aqy;
    }

    private boolean a(InputStream inputStream, anz anz) {
        return !((Boolean) anz.a(a)).booleanValue() && new ImageHeaderParser(inputStream, this.c).b() == ImageType.GIF;
    }

    private aqr<axo> a(InputStream inputStream, int i, int i2, anz anz) {
        byte[] a = axy.a(inputStream);
        if (a == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(a), i, i2, anz);
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            return null;
        }
    }
}
