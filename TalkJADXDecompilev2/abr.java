package defpackage;

final class abr {
    long a = 0;
    abr b;

    abr() {
    }

    void a(int i) {
        if (i >= 64) {
            b();
            this.b.a(i - 64);
            return;
        }
        this.a |= 1 << i;
    }

    private void b() {
        if (this.b == null) {
            this.b = new abr();
        }
    }

    void b(int i) {
        if (i < 64) {
            this.a &= (1 << i) ^ -1;
        } else if (this.b != null) {
            this.b.b(i - 64);
        }
    }

    boolean c(int i) {
        if (i < 64) {
            return (this.a & (1 << i)) != 0;
        } else {
            b();
            return this.b.c(i - 64);
        }
    }

    void a() {
        this.a = 0;
        if (this.b != null) {
            this.b.a();
        }
    }

    void a(int i, boolean z) {
        if (i >= 64) {
            b();
            this.b.a(i - 64, z);
            return;
        }
        boolean z2 = (this.a & Long.MIN_VALUE) != 0;
        long j = (1 << i) - 1;
        this.a = (((j ^ -1) & this.a) << 1) | (this.a & j);
        if (z) {
            a(i);
        } else {
            b(i);
        }
        if (z2 || this.b != null) {
            b();
            this.b.a(0, z2);
        }
    }

    boolean d(int i) {
        if (i >= 64) {
            b();
            return this.b.d(i - 64);
        }
        long j = 1 << i;
        boolean z = (this.a & j) != 0;
        this.a &= j ^ -1;
        j--;
        this.a = Long.rotateRight((j ^ -1) & this.a, 1) | (this.a & j);
        if (this.b == null) {
            return z;
        }
        if (this.b.c(0)) {
            a(63);
        }
        this.b.d(0);
        return z;
    }

    int e(int i) {
        if (this.b == null) {
            if (i >= 64) {
                return Long.bitCount(this.a);
            }
            return Long.bitCount(this.a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.a & ((1 << i) - 1));
        } else {
            return this.b.e(i - 64) + Long.bitCount(this.a);
        }
    }

    public String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
