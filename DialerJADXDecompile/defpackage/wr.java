package defpackage;

/* compiled from: PG */
/* renamed from: wr */
public final class wr {
    private long a;
    private wr b;

    wr() {
        this.a = 0;
    }

    public final void a(int i) {
        if (i >= 64) {
            b();
            this.b.a(i - 64);
            return;
        }
        this.a |= 1 << i;
    }

    private final void b() {
        if (this.b == null) {
            this.b = new wr();
        }
    }

    final void b(int i) {
        if (i < 64) {
            this.a &= (1 << i) ^ -1;
        } else if (this.b != null) {
            this.b.b(i - 64);
        }
    }

    final boolean c(int i) {
        while (i >= 64) {
            b();
            this = this.b;
            i -= 64;
        }
        return (this.a & (1 << i)) != 0;
    }

    public final void a() {
        while (true) {
            this.a = 0;
            if (this.b != null) {
                this = this.b;
            } else {
                return;
            }
        }
    }

    final void a(int i, boolean z) {
        while (i < 64) {
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
                this = this.b;
                i = 0;
                z = z2;
            } else {
                return;
            }
        }
        b();
        this.b.a(i - 64, z);
    }

    final boolean d(int i) {
        while (i >= 64) {
            b();
            this = this.b;
            i -= 64;
        }
        long j = 1 << i;
        boolean z = (this.a & j) != 0;
        this.a &= j ^ -1;
        j--;
        this.a = Long.rotateRight((j ^ -1) & this.a, 1) | (this.a & j);
        if (this.b != null) {
            if (this.b.c(0)) {
                a(63);
            }
            this.b.d(0);
        }
        return z;
    }

    final int e(int i) {
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

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
