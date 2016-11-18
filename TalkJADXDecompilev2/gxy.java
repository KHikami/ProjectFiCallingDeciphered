package defpackage;

import java.util.Arrays;

final class gxy extends gxx {
    private final byte[] a;

    gxy(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    byte[] c() {
        return this.a;
    }
}
