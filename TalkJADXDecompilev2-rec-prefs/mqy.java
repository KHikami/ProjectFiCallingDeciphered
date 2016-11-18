package p000;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class mqy {
    private static final OutputStream f28138a = new mqz();

    public static long m32743a(InputStream inputStream, OutputStream outputStream) {
        bm.m6122a((Object) inputStream);
        bm.m6122a((Object) outputStream);
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static byte[] m32744a(InputStream inputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
        mqy.m32743a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
