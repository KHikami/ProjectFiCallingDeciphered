package io.grpc.internal;

import java.util.Arrays;
import java.util.logging.Logger;
import mes;
import mqq;
import okw;

public final class dc {
    private static final Logger a;
    private static final byte[] b;

    static {
        a = Logger.getLogger(dc.class.getName());
        b = "-bin".getBytes(mes.a);
    }

    public static byte[][] a(okw okw) {
        Object[] a = okw.a();
        int i = 0;
        for (int i2 = 0; i2 < a.length; i2 += 2) {
            byte[] bArr = a[i2];
            byte[] bArr2 = a[i2 + 1];
            if (a(bArr, b)) {
                a[i] = bArr;
                a[i + 1] = mqq.a.a(bArr2).getBytes(mes.a);
                i += 2;
            } else {
                int i3;
                for (byte b : bArr2) {
                    if (b < 32 || b > 126) {
                        i3 = 0;
                        break;
                    }
                }
                i3 = 1;
                if (i3 != 0) {
                    a[i] = bArr;
                    a[i + 1] = bArr2;
                    i += 2;
                } else {
                    String str = new String(bArr, mes.a);
                    Logger logger = a;
                    String valueOf = String.valueOf(Arrays.toString(bArr2));
                    logger.warning(new StringBuilder((String.valueOf(str).length() + 55) + String.valueOf(valueOf).length()).append("Metadata key=").append(str).append(", value=").append(valueOf).append(" contains invalid ASCII characters").toString());
                }
            }
        }
        if (i == a.length) {
            return a;
        }
        return (byte[][]) Arrays.copyOfRange(a, 0, i);
    }

    public static byte[][] a(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            byte[] bArr3 = bArr[i + 1];
            bArr[i] = bArr2;
            if (a(bArr2, b)) {
                bArr[i + 1] = mqq.a.a(new String(bArr3, mes.a));
            }
        }
        return bArr;
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    private dc() {
    }
}
