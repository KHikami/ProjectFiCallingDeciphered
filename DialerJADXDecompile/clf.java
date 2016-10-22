import java.util.Arrays;

public final class clf extends ckv {
    private byte[] c;
    private byte[][] d;
    private boolean e;

    public clf() {
        this.c = clc.e;
        this.d = clc.d;
        this.e = false;
        this.a = null;
        this.b = -1;
    }

    protected final int a() {
        int i = 0;
        int a = super.a();
        if (!Arrays.equals(this.c, clc.e)) {
            a += ckt.b(1, this.c);
        }
        if (this.d == null || this.d.length <= 0) {
            return a;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.d.length) {
            byte[] bArr = this.d[i];
            if (bArr != null) {
                i3++;
                i2 += ckt.a(bArr);
            }
            i++;
        }
        return (a + i2) + (i3 * 1);
    }

    public final void a(ckt ckt) {
        if (!Arrays.equals(this.c, clc.e)) {
            ckt.a(1, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (byte[] bArr : this.d) {
                if (bArr != null) {
                    ckt.a(2, bArr);
                }
            }
        }
        super.a(ckt);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof clf)) {
            return false;
        }
        clf clf = (clf) obj;
        return !Arrays.equals(this.c, clf.c) ? false : !ckz.a(this.d, clf.d) ? false : (this.a == null || this.a.a()) ? clf.a == null || clf.a.a() : this.a.equals(clf.a);
    }

    public final int hashCode() {
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.c)) * 31) + ckz.a(this.d)) * 31) + 1237) * 31;
        int hashCode2 = (this.a == null || this.a.a()) ? 0 : this.a.hashCode();
        return hashCode2 + hashCode;
    }
}
