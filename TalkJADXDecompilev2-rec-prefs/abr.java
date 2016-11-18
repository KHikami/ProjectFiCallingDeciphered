package p000;

final class abr {
    long f172a = 0;
    abr f173b;

    abr() {
    }

    void m249a(int i) {
        if (i >= 64) {
            m247b();
            this.f173b.m249a(i - 64);
            return;
        }
        this.f172a |= 1 << i;
    }

    private void m247b() {
        if (this.f173b == null) {
            this.f173b = new abr();
        }
    }

    void m251b(int i) {
        if (i < 64) {
            this.f172a &= (1 << i) ^ -1;
        } else if (this.f173b != null) {
            this.f173b.m251b(i - 64);
        }
    }

    boolean m252c(int i) {
        if (i < 64) {
            return (this.f172a & (1 << i)) != 0;
        } else {
            m247b();
            return this.f173b.m252c(i - 64);
        }
    }

    void m248a() {
        this.f172a = 0;
        if (this.f173b != null) {
            this.f173b.m248a();
        }
    }

    void m250a(int i, boolean z) {
        if (i >= 64) {
            m247b();
            this.f173b.m250a(i - 64, z);
            return;
        }
        boolean z2 = (this.f172a & Long.MIN_VALUE) != 0;
        long j = (1 << i) - 1;
        this.f172a = (((j ^ -1) & this.f172a) << 1) | (this.f172a & j);
        if (z) {
            m249a(i);
        } else {
            m251b(i);
        }
        if (z2 || this.f173b != null) {
            m247b();
            this.f173b.m250a(0, z2);
        }
    }

    boolean m253d(int i) {
        if (i >= 64) {
            m247b();
            return this.f173b.m253d(i - 64);
        }
        long j = 1 << i;
        boolean z = (this.f172a & j) != 0;
        this.f172a &= j ^ -1;
        j--;
        this.f172a = Long.rotateRight((j ^ -1) & this.f172a, 1) | (this.f172a & j);
        if (this.f173b == null) {
            return z;
        }
        if (this.f173b.m252c(0)) {
            m249a(63);
        }
        this.f173b.m253d(0);
        return z;
    }

    int m254e(int i) {
        if (this.f173b == null) {
            if (i >= 64) {
                return Long.bitCount(this.f172a);
            }
            return Long.bitCount(this.f172a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.f172a & ((1 << i) - 1));
        } else {
            return this.f173b.m254e(i - 64) + Long.bitCount(this.f172a);
        }
    }

    public String toString() {
        if (this.f173b == null) {
            return Long.toBinaryString(this.f172a);
        }
        return this.f173b.toString() + "xx" + Long.toBinaryString(this.f172a);
    }
}
