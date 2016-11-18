package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class nwv {
    static final Charset a = Charset.forName("UTF-8");
    static final Charset b = Charset.forName("ISO-8859-1");
    public static final byte[] c;
    public static final ByteBuffer d;
    public static final nvw e;

    static {
        byte[] bArr = new byte[0];
        c = bArr;
        d = ByteBuffer.wrap(bArr);
        bArr = c;
        e = nvw.a(bArr, 0, bArr.length, false);
    }

    public static int a(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static boolean a(nxi nxi) {
        return false;
    }
}
