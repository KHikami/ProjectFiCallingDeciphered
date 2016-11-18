package p000;

import java.util.Arrays;

final class hcr {
    final int f16623a;
    final byte[] f16624b;

    hcr(int i, byte[] bArr) {
        this.f16623a = i;
        this.f16624b = bArr;
    }

    int m19349a() {
        return (hcj.m19291d(this.f16623a) + 0) + this.f16624b.length;
    }

    void m19350a(hcj hcj) {
        hcj.m19314c(this.f16623a);
        hcj.m19313b(this.f16624b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcr)) {
            return false;
        }
        hcr hcr = (hcr) obj;
        return this.f16623a == hcr.f16623a && Arrays.equals(this.f16624b, hcr.f16624b);
    }

    public int hashCode() {
        return ((this.f16623a + 527) * 31) + Arrays.hashCode(this.f16624b);
    }
}
