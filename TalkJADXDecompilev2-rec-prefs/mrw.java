package p000;

import java.util.Arrays;

public final class mrw {
    private static final byte[] f28237a;

    public static int m32811a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    static {
        int i = 0;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 <= 9; i2++) {
            bArr[i2 + 48] = (byte) i2;
        }
        while (i <= 26) {
            bArr[i + 65] = (byte) (i + 10);
            bArr[i + 97] = (byte) (i + 10);
            i++;
        }
        f28237a = bArr;
    }
}
