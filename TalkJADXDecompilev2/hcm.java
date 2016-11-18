package defpackage;

public final class hcm implements Cloneable {
    private static final hcn a = new hcn();
    private boolean b;
    private int[] c;
    private hcn[] d;
    private int e;

    hcm() {
        this(10);
    }

    private hcm(int i) {
        this.b = false;
        int c = c(i);
        this.c = new int[c];
        this.d = new hcn[c];
        this.e = 0;
    }

    private int c(int i) {
        int i2 = i << 2;
        for (int i3 = 4; i3 < 32; i3++) {
            if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            }
        }
        return i2 / 4;
    }

    private void c() {
        int i = this.e;
        int[] iArr = this.c;
        hcn[] hcnArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            hcn hcn = hcnArr[i3];
            if (hcn != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    hcnArr[i2] = hcn;
                    hcnArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    private int d(int i) {
        int i2 = 0;
        int i3 = this.e - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.c[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ -1;
    }

    int a() {
        if (this.b) {
            c();
        }
        return this.e;
    }

    hcn a(int i) {
        int d = d(i);
        return (d < 0 || this.d[d] == a) ? null : this.d[d];
    }

    void a(int i, hcn hcn) {
        int d = d(i);
        if (d >= 0) {
            this.d[d] = hcn;
            return;
        }
        d ^= -1;
        if (d >= this.e || this.d[d] != a) {
            if (this.b && this.e >= this.c.length) {
                c();
                d = d(i) ^ -1;
            }
            if (this.e >= this.c.length) {
                int c = c(this.e + 1);
                Object obj = new int[c];
                Object obj2 = new hcn[c];
                System.arraycopy(this.c, 0, obj, 0, this.c.length);
                System.arraycopy(this.d, 0, obj2, 0, this.d.length);
                this.c = obj;
                this.d = obj2;
            }
            if (this.e - d != 0) {
                System.arraycopy(this.c, d, this.c, d + 1, this.e - d);
                System.arraycopy(this.d, d, this.d, d + 1, this.e - d);
            }
            this.c[d] = i;
            this.d[d] = hcn;
            this.e++;
            return;
        }
        this.c[d] = i;
        this.d[d] = hcn;
    }

    hcn b(int i) {
        if (this.b) {
            c();
        }
        return this.d[i];
    }

    public boolean b() {
        return a() == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcm)) {
            return false;
        }
        hcm hcm = (hcm) obj;
        if (a() != hcm.a()) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.c;
        int[] iArr2 = hcm.c;
        int i2 = this.e;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            hcn[] hcnArr = this.d;
            hcn[] hcnArr2 = hcm.d;
            i2 = this.e;
            for (i = 0; i < i2; i++) {
                if (!hcnArr[i].equals(hcnArr2[i])) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.b) {
            c();
        }
        int i = 17;
        for (int i2 = 0; i2 < this.e; i2++) {
            i = (((i * 31) + this.c[i2]) * 31) + this.d[i2].hashCode();
        }
        return i;
    }

    public /* synthetic */ Object clone() {
        int a = a();
        hcm hcm = new hcm(a);
        System.arraycopy(this.c, 0, hcm.c, 0, a);
        for (int i = 0; i < a; i++) {
            if (this.d[i] != null) {
                hcm.d[i] = (hcn) this.d[i].clone();
            }
        }
        hcm.e = a;
        return hcm;
    }
}
