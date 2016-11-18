package defpackage;

import java.io.ByteArrayOutputStream;

final class aky {
    private static byte a = (byte) 61;

    public static final byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == a) {
                i++;
                int digit = Character.digit((char) bArr[i], 16);
                i++;
                int digit2 = Character.digit((char) bArr[i], 16);
                if (digit == -1 || digit2 == -1) {
                    throw new akx("Invalid quoted-printable encoding");
                }
                try {
                    byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new akx("Invalid quoted-printable encoding");
                }
            }
            byteArrayOutputStream.write(b);
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
