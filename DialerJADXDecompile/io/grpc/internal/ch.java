package io.grpc.internal;

import cyg;
import dbp;
import dgr;
import dhb;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Logger;

/* compiled from: PG */
public final class ch {
    private static final Logger a;
    private static final byte[] b;

    static {
        a = Logger.getLogger(ch.class.getName());
        b = "-bin".getBytes(cyg.a);
    }

    public static byte[][] a(dgr dgr) {
        Object[] objArr = new byte[(dgr.c << 1)][];
        int i = 0;
        for (Entry entry : dgr.b.entrySet()) {
            int i2 = i;
            for (dhb dhb : (List) entry.getValue()) {
                byte[] bArr;
                int i3 = i2 + 1;
                if (dhb.a != null) {
                    bArr = dhb.a.b;
                } else {
                    bArr = ((String) entry.getKey()).getBytes(cyg.a);
                }
                objArr[i2] = bArr;
                i2 = i3 + 1;
                objArr[i3] = dhb.a();
            }
            i = i2;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < objArr.length; i5 += 2) {
            byte[] bArr2 = objArr[i5];
            byte[] bArr3 = objArr[i5 + 1];
            if (a(bArr2, b)) {
                objArr[i4] = bArr2;
                objArr[i4 + 1] = dbp.a.a(bArr3).getBytes(cyg.a);
                i4 += 2;
            } else {
                for (byte b : bArr3) {
                    if (b < 32 || b > 126) {
                        i = 0;
                        break;
                    }
                }
                i = 1;
                if (i != 0) {
                    objArr[i4] = bArr2;
                    objArr[i4 + 1] = bArr3;
                    i4 += 2;
                } else {
                    String str = new String(bArr2, cyg.a);
                    Logger logger = a;
                    String valueOf = String.valueOf(Arrays.toString(bArr3));
                    logger.warning(new StringBuilder((String.valueOf(str).length() + 55) + String.valueOf(valueOf).length()).append("Metadata key=").append(str).append(", value=").append(valueOf).append(" contains invalid ASCII characters").toString());
                }
            }
        }
        if (i4 == objArr.length) {
            return objArr;
        }
        return (byte[][]) Arrays.copyOfRange(objArr, 0, i4);
    }

    public static byte[][] a(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            byte[] bArr3 = bArr[i + 1];
            bArr[i] = bArr2;
            if (a(bArr2, b)) {
                bArr[i + 1] = dbp.a.a(new String(bArr3, cyg.a));
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

    private ch() {
    }
}
