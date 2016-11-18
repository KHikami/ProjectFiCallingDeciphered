package defpackage;

import java.util.Arrays;

final class nzj {
    final int a;
    final byte[] b;

    nzj(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    int a() {
        return (nyu.j(this.a) + 0) + this.b.length;
    }

    void a(nyu nyu) {
        nyu.i(this.a);
        nyu.c(this.b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nzj)) {
            return false;
        }
        nzj nzj = (nzj) obj;
        if (this.a == nzj.a && Arrays.equals(this.b, nzj.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
