package p000;

public final class nza implements Cloneable {
    private static final nzb f31299a = new nzb();
    private boolean f31300b;
    private int[] f31301c;
    private nzb[] f31302d;
    private int f31303e;

    public /* synthetic */ Object clone() {
        return m37229c();
    }

    nza() {
        this(10);
    }

    private nza(int i) {
        this.f31300b = false;
        int d = m37221d(i);
        this.f31301c = new int[d];
        this.f31302d = new nzb[d];
        this.f31303e = 0;
    }

    nzb m37225a(int i) {
        int e = m37223e(i);
        if (e < 0 || this.f31302d[e] == f31299a) {
            return null;
        }
        return this.f31302d[e];
    }

    void m37227b(int i) {
        int e = m37223e(i);
        if (e >= 0 && this.f31302d[e] != f31299a) {
            this.f31302d[e] = f31299a;
            this.f31300b = true;
        }
    }

    private void m37222d() {
        int i = this.f31303e;
        int[] iArr = this.f31301c;
        nzb[] nzbArr = this.f31302d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            nzb nzb = nzbArr[i3];
            if (nzb != f31299a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    nzbArr[i2] = nzb;
                    nzbArr[i3] = null;
                }
                i2++;
            }
        }
        this.f31300b = false;
        this.f31303e = i2;
    }

    void m37226a(int i, nzb nzb) {
        int e = m37223e(i);
        if (e >= 0) {
            this.f31302d[e] = nzb;
            return;
        }
        e ^= -1;
        if (e >= this.f31303e || this.f31302d[e] != f31299a) {
            if (this.f31300b && this.f31303e >= this.f31301c.length) {
                m37222d();
                e = m37223e(i) ^ -1;
            }
            if (this.f31303e >= this.f31301c.length) {
                int d = m37221d(this.f31303e + 1);
                Object obj = new int[d];
                Object obj2 = new nzb[d];
                System.arraycopy(this.f31301c, 0, obj, 0, this.f31301c.length);
                System.arraycopy(this.f31302d, 0, obj2, 0, this.f31302d.length);
                this.f31301c = obj;
                this.f31302d = obj2;
            }
            if (this.f31303e - e != 0) {
                System.arraycopy(this.f31301c, e, this.f31301c, e + 1, this.f31303e - e);
                System.arraycopy(this.f31302d, e, this.f31302d, e + 1, this.f31303e - e);
            }
            this.f31301c[e] = i;
            this.f31302d[e] = nzb;
            this.f31303e++;
            return;
        }
        this.f31301c[e] = i;
        this.f31302d[e] = nzb;
    }

    int m37224a() {
        if (this.f31300b) {
            m37222d();
        }
        return this.f31303e;
    }

    public boolean m37228b() {
        return m37224a() == 0;
    }

    nzb m37230c(int i) {
        if (this.f31300b) {
            m37222d();
        }
        return this.f31302d[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nza)) {
            return false;
        }
        nza nza = (nza) obj;
        if (m37224a() != nza.m37224a()) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.f31301c;
        int[] iArr2 = nza.f31301c;
        int i2 = this.f31303e;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            nzb[] nzbArr = this.f31302d;
            nzb[] nzbArr2 = nza.f31302d;
            i2 = this.f31303e;
            for (i = 0; i < i2; i++) {
                if (!nzbArr[i].equals(nzbArr2[i])) {
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
        if (this.f31300b) {
            m37222d();
        }
        int i = 17;
        for (int i2 = 0; i2 < this.f31303e; i2++) {
            i = (((i * 31) + this.f31301c[i2]) * 31) + this.f31302d[i2].hashCode();
        }
        return i;
    }

    private int m37221d(int i) {
        int i2 = i << 2;
        for (int i3 = 4; i3 < 32; i3++) {
            if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            }
        }
        return i2 / 4;
    }

    private int m37223e(int i) {
        int i2 = 0;
        int i3 = this.f31303e - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.f31301c[i4];
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

    public final nza m37229c() {
        int i = 0;
        int a = m37224a();
        nza nza = new nza(a);
        System.arraycopy(this.f31301c, 0, nza.f31301c, 0, a);
        while (i < a) {
            if (this.f31302d[i] != null) {
                nza.f31302d[i] = this.f31302d[i].m37237b();
            }
            i++;
        }
        nza.f31303e = a;
        return nza;
    }
}
