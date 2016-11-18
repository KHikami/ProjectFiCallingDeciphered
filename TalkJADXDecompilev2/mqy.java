package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class mqy {
    private static final OutputStream a = new mqz();

    public static long a(InputStream inputStream, OutputStream outputStream) {
        bm.a((Object) inputStream);
        bm.a((Object) outputStream);
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

    public static byte[] a(InputStream inputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
        mqy.a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
