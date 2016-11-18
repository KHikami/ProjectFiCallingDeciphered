package defpackage;

import java.util.Arrays;

final class hcr {
    final int a;
    final byte[] b;

    hcr(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    int a() {
        return (hcj.d(this.a) + 0) + this.b.length;
    }

    void a(hcj hcj) {
        hcj.c(this.a);
        hcj.b(this.b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcr)) {
            return false;
        }
        hcr hcr = (hcr) obj;
        return this.a == hcr.a && Arrays.equals(this.b, hcr.b);
    }

    public int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
