package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class nwv {
    static final Charset f31198a = Charset.forName("UTF-8");
    static final Charset f31199b = Charset.forName("ISO-8859-1");
    public static final byte[] f31200c;
    public static final ByteBuffer f31201d;
    public static final nvw f31202e;

    static {
        byte[] bArr = new byte[0];
        f31200c = bArr;
        f31201d = ByteBuffer.wrap(bArr);
        bArr = f31200c;
        f31202e = nvw.m36757a(bArr, 0, bArr.length, false);
    }

    public static int m37008a(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    public static int m37009a(boolean z) {
        return z ? 1231 : 1237;
    }

    static int m37007a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static boolean m37010a(nxi nxi) {
        return false;
    }
}
