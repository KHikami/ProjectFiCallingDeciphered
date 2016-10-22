package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: dbv */
public final class dbv {
    public static long a(InputStream inputStream, OutputStream outputStream) {
        cob.i((Object) inputStream);
        cob.i((Object) outputStream);
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
        dbv.a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    static {
        dbw dbw = new dbw();
    }
}
