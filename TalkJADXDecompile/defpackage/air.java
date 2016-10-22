package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: air */
public final class air {
    private static byte a;

    static {
        a = (byte) 61;
    }

    public static final byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == a) {
                try {
                    if ('\r' == ((char) bArr[i + 1]) && '\n' == ((char) bArr[i + 2])) {
                        i += 2;
                    } else {
                        i++;
                        int digit = Character.digit((char) bArr[i], 16);
                        i++;
                        int digit2 = Character.digit((char) bArr[i], 16);
                        if (digit == -1 || digit2 == -1) {
                            return null;
                        }
                        byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    return null;
                }
            }
            byteArrayOutputStream.write(b);
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
