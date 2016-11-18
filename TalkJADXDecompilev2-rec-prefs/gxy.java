package p000;

import java.util.Arrays;

final class gxy extends gxx {
    private final byte[] f16364a;

    gxy(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f16364a = bArr;
    }

    byte[] mo2414c() {
        return this.f16364a;
    }
}
