package defpackage;

public final class aia {
    private static byte[] a = new byte[255];

    static {
        int i;
        for (i = 0; i < 255; i++) {
            a[i] = (byte) -1;
        }
        for (i = 90; i >= 65; i--) {
            a[i] = (byte) (i - 65);
        }
        for (i = 122; i >= 97; i--) {
            a[i] = (byte) ((i - 97) + 26);
        }
        for (i = 57; i >= 48; i--) {
            a[i] = (byte) ((i - 48) + 52);
        }
        a[43] = (byte) 62;
        a[47] = (byte) 63;
    }

    public static byte[] a(byte[] bArr) {
        int i;
        int i2 = 0;
        Object obj = new byte[bArr.length];
        int i3 = 0;
        for (i = 0; i < bArr.length; i++) {
            int i4;
            byte b = bArr[i];
            if (b == (byte) 61 || a[b] != (byte) -1) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                i4 = i3 + 1;
                obj[i3] = bArr[i];
                i3 = i4;
            }
        }
        Object obj2 = new byte[i3];
        System.arraycopy(obj, 0, obj2, 0, i3);
        if (obj2.length == 0) {
            return new byte[0];
        }
        int length = obj2.length / 4;
        i = obj2.length;
        while (obj2[i - 1] == (byte) 61) {
            i--;
            if (i == 0) {
                return new byte[0];
            }
        }
        byte[] bArr2 = new byte[(i - length)];
        i3 = 0;
        while (i2 < length) {
            int i5 = i2 << 2;
            byte b2 = obj2[i5 + 2];
            byte b3 = obj2[i5 + 3];
            byte b4 = a[obj2[i5]];
            byte b5 = a[obj2[i5 + 1]];
            if (b2 != (byte) 61 && b3 != (byte) 61) {
                b2 = a[b2];
                b3 = a[b3];
                bArr2[i3] = (byte) ((b4 << 2) | (b5 >> 4));
                bArr2[i3 + 1] = (byte) (((b5 & 15) << 4) | ((b2 >> 2) & 15));
                bArr2[i3 + 2] = (byte) ((b2 << 6) | b3);
            } else if (b2 == (byte) 61) {
                bArr2[i3] = (byte) ((b5 >> 4) | (b4 << 2));
            } else if (b3 == (byte) 61) {
                b2 = a[b2];
                bArr2[i3] = (byte) ((b4 << 2) | (b5 >> 4));
                bArr2[i3 + 1] = (byte) (((b5 & 15) << 4) | ((b2 >> 2) & 15));
            }
            i3 += 3;
            i2++;
        }
        return bArr2;
    }
}
