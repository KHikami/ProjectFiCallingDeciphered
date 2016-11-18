package p000;

public final class hcm implements Cloneable {
    private static final hcn f16612a = new hcn();
    private boolean f16613b;
    private int[] f16614c;
    private hcn[] f16615d;
    private int f16616e;

    hcm() {
        this(10);
    }

    private hcm(int i) {
        this.f16613b = false;
        int c = m19322c(i);
        this.f16614c = new int[c];
        this.f16615d = new hcn[c];
        this.f16616e = 0;
    }

    private int m19322c(int i) {
        int i2 = i << 2;
        for (int i3 = 4; i3 < 32; i3++) {
            if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            }
        }
        return i2 / 4;
    }

    private void m19323c() {
        int i = this.f16616e;
        int[] iArr = this.f16614c;
        hcn[] hcnArr = this.f16615d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            hcn hcn = hcnArr[i3];
            if (hcn != f16612a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    hcnArr[i2] = hcn;
                    hcnArr[i3] = null;
                }
                i2++;
            }
        }
        this.f16613b = false;
        this.f16616e = i2;
    }

    private int m19324d(int i) {
        int i2 = 0;
        int i3 = this.f16616e - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.f16614c[i4];
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

    int m19325a() {
        if (this.f16613b) {
            m19323c();
        }
        return this.f16616e;
    }

    hcn m19326a(int i) {
        int d = m19324d(i);
        return (d < 0 || this.f16615d[d] == f16612a) ? null : this.f16615d[d];
    }

    void m19327a(int i, hcn hcn) {
        int d = m19324d(i);
        if (d >= 0) {
            this.f16615d[d] = hcn;
            return;
        }
        d ^= -1;
        if (d >= this.f16616e || this.f16615d[d] != f16612a) {
            if (this.f16613b && this.f16616e >= this.f16614c.length) {
                m19323c();
                d = m19324d(i) ^ -1;
            }
            if (this.f16616e >= this.f16614c.length) {
                int c = m19322c(this.f16616e + 1);
                Object obj = new int[c];
                Object obj2 = new hcn[c];
                System.arraycopy(this.f16614c, 0, obj, 0, this.f16614c.length);
                System.arraycopy(this.f16615d, 0, obj2, 0, this.f16615d.length);
                this.f16614c = obj;
                this.f16615d = obj2;
            }
            if (this.f16616e - d != 0) {
                System.arraycopy(this.f16614c, d, this.f16614c, d + 1, this.f16616e - d);
                System.arraycopy(this.f16615d, d, this.f16615d, d + 1, this.f16616e - d);
            }
            this.f16614c[d] = i;
            this.f16615d[d] = hcn;
            this.f16616e++;
            return;
        }
        this.f16614c[d] = i;
        this.f16615d[d] = hcn;
    }

    hcn m19328b(int i) {
        if (this.f16613b) {
            m19323c();
        }
        return this.f16615d[i];
    }

    public boolean m19329b() {
        return m19325a() == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcm)) {
            return false;
        }
        hcm hcm = (hcm) obj;
        if (m19325a() != hcm.m19325a()) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.f16614c;
        int[] iArr2 = hcm.f16614c;
        int i2 = this.f16616e;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            hcn[] hcnArr = this.f16615d;
            hcn[] hcnArr2 = hcm.f16615d;
            i2 = this.f16616e;
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
        if (this.f16613b) {
            m19323c();
        }
        int i = 17;
        for (int i2 = 0; i2 < this.f16616e; i2++) {
            i = (((i * 31) + this.f16614c[i2]) * 31) + this.f16615d[i2].hashCode();
        }
        return i;
    }

    public /* synthetic */ Object clone() {
        int a = m19325a();
        hcm hcm = new hcm(a);
        System.arraycopy(this.f16614c, 0, hcm.f16614c, 0, a);
        for (int i = 0; i < a; i++) {
            if (this.f16615d[i] != null) {
                hcm.f16615d[i] = (hcn) this.f16615d[i].clone();
            }
        }
        hcm.f16616e = a;
        return hcm;
    }
}
