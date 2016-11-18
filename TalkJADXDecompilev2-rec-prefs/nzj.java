package p000;

import java.util.Arrays;

final class nzj {
    final int f31318a;
    final byte[] f31319b;

    nzj(int i, byte[] bArr) {
        this.f31318a = i;
        this.f31319b = bArr;
    }

    int m37257a() {
        return (nyu.m37158j(this.f31318a) + 0) + this.f31319b.length;
    }

    void m37258a(nyu nyu) {
        nyu.m37198i(this.f31318a);
        nyu.m37189c(this.f31319b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nzj)) {
            return false;
        }
        nzj nzj = (nzj) obj;
        if (this.f31318a == nzj.f31318a && Arrays.equals(this.f31319b, nzj.f31319b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f31318a + 527) * 31) + Arrays.hashCode(this.f31319b);
    }
}
