package defpackage;

public final class nza implements Cloneable {
    private static final nzb a = new nzb();
    private boolean b;
    private int[] c;
    private nzb[] d;
    private int e;

    public /* synthetic */ Object clone() {
        return c();
    }

    nza() {
        this(10);
    }

    private nza(int i) {
        this.b = false;
        int d = d(i);
        this.c = new int[d];
        this.d = new nzb[d];
        this.e = 0;
    }

    nzb a(int i) {
        int e = e(i);
        if (e < 0 || this.d[e] == a) {
            return null;
        }
        return this.d[e];
    }

    void b(int i) {
        int e = e(i);
        if (e >= 0 && this.d[e] != a) {
            this.d[e] = a;
            this.b = true;
        }
    }

    private void d() {
        int i = this.e;
        int[] iArr = this.c;
        nzb[] nzbArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            nzb nzb = nzbArr[i3];
            if (nzb != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    nzbArr[i2] = nzb;
                    nzbArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    void a(int i, nzb nzb) {
        int e = e(i);
        if (e >= 0) {
            this.d[e] = nzb;
            return;
        }
        e ^= -1;
        if (e >= this.e || this.d[e] != a) {
            if (this.b && this.e >= this.c.length) {
                d();
                e = e(i) ^ -1;
            }
            if (this.e >= this.c.length) {
                int d = d(this.e + 1);
                Object obj = new int[d];
                Object obj2 = new nzb[d];
                System.arraycopy(this.c, 0, obj, 0, this.c.length);
                System.arraycopy(this.d, 0, obj2, 0, this.d.length);
                this.c = obj;
                this.d = obj2;
            }
            if (this.e - e != 0) {
                System.arraycopy(this.c, e, this.c, e + 1, this.e - e);
                System.arraycopy(this.d, e, this.d, e + 1, this.e - e);
            }
            this.c[e] = i;
            this.d[e] = nzb;
            this.e++;
            return;
        }
        this.c[e] = i;
        this.d[e] = nzb;
    }

    int a() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public boolean b() {
        return a() == 0;
    }

    nzb c(int i) {
        if (this.b) {
            d();
        }
        return this.d[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nza)) {
            return false;
        }
        nza nza = (nza) obj;
        if (a() != nza.a()) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.c;
        int[] iArr2 = nza.c;
        int i2 = this.e;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            nzb[] nzbArr = this.d;
            nzb[] nzbArr2 = nza.d;
            i2 = this.e;
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
        if (this.b) {
            d();
        }
        int i = 17;
        for (int i2 = 0; i2 < this.e; i2++) {
            i = (((i * 31) + this.c[i2]) * 31) + this.d[i2].hashCode();
        }
        return i;
    }

    private int d(int i) {
        int i2 = i << 2;
        for (int i3 = 4; i3 < 32; i3++) {
            if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            }
        }
        return i2 / 4;
    }

    private int e(int i) {
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

    public final nza c() {
        int i = 0;
        int a = a();
        nza nza = new nza(a);
        System.arraycopy(this.c, 0, nza.c, 0, a);
        while (i < a) {
            if (this.d[i] != null) {
                nza.d[i] = this.d[i].b();
            }
            i++;
        }
        nza.e = a;
        return nza;
    }
}
