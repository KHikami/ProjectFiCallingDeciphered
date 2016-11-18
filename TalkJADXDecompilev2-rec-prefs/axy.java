package p000;

import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class axy implements aoa<InputStream, axo> {
    public static final anw<Boolean> f2525a = anw.m3521a("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.valueOf(false));
    private final aoa<ByteBuffer, axo> f2526b;
    private final aqy f2527c;

    public axy(aoa<ByteBuffer, axo> aoa_java_nio_ByteBuffer__axo, aqy aqy) {
        this.f2526b = aoa_java_nio_ByteBuffer__axo;
        this.f2527c = aqy;
    }

    private boolean m4321a(InputStream inputStream, anz anz) {
        return !((Boolean) anz.m3528a(f2525a)).booleanValue() && new ImageHeaderParser(inputStream, this.f2527c).m8217b() == ImageType.GIF;
    }

    private aqr<axo> m4320a(InputStream inputStream, int i, int i2, anz anz) {
        byte[] a = axy.m4322a(inputStream);
        if (a == null) {
            return null;
        }
        return this.f2526b.mo394a(ByteBuffer.wrap(a), i, i2, anz);
    }

    private static byte[] m4322a(InputStream inputStream) {
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
