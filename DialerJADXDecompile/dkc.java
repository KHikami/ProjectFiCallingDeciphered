import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
final class dkc implements djt {
    private final dlv a;
    private final boolean b;
    private final dlu c;
    private final djy d;
    private int e;
    private boolean f;

    dkc(dlv dlv, boolean z) {
        this.a = dlv;
        this.b = z;
        this.c = new dlu();
        this.d = new djy(this.c);
        this.e = 16384;
    }

    public final synchronized void b() {
        if (this.f) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    public final synchronized void a(dkf dkf) {
        if (this.f) {
            throw new IOException("closed");
        }
        int i = this.e;
        if ((dkf.a & 32) != 0) {
            i = dkf.d[5];
        }
        this.e = i;
        a(0, 0, (byte) 4, (byte) 1);
        this.a.flush();
    }

    public final synchronized void a() {
        if (this.f) {
            throw new IOException("closed");
        } else if (this.b) {
            if (djz.a.isLoggable(Level.FINE)) {
                djz.a.fine(String.format(">> CONNECTION %s", new Object[]{djz.b.b()}));
            }
            this.a.b(djz.b.d());
            this.a.flush();
        }
    }

    public final synchronized void a(boolean z, boolean z2, int i, int i2, List list) {
        if (z2) {
            throw new UnsupportedOperationException();
        } else if (this.f) {
            throw new IOException("closed");
        } else if (this.f) {
            throw new IOException("closed");
        } else {
            this.d.a(list);
            long j = this.c.b;
            int min = (int) Math.min((long) this.e, j);
            byte b = j == ((long) min) ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            a(i, min, (byte) 1, b);
            this.a.a_(this.c, (long) min);
            if (j > ((long) min)) {
                b(i, j - ((long) min));
            }
        }
    }

    private final void b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.e, j);
            j -= (long) min;
            a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.a.a_(this.c, (long) min);
        }
    }

    public final synchronized void a(int i, djq djq) {
        if (this.f) {
            throw new IOException("closed");
        } else if (djq.n == -1) {
            throw new IllegalArgumentException();
        } else {
            a(i, 4, (byte) 3, (byte) 0);
            this.a.e(djq.n);
            this.a.flush();
        }
    }

    public final int c() {
        return this.e;
    }

    public final synchronized void a(boolean z, int i, dlu dlu, int i2) {
        byte b = (byte) 0;
        synchronized (this) {
            if (this.f) {
                throw new IOException("closed");
            }
            if (z) {
                b = (byte) 1;
            }
            a(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.a.a_(dlu, (long) i2);
            }
        }
    }

    public final synchronized void b(dkf dkf) {
        synchronized (this) {
            if (this.f) {
                throw new IOException("closed");
            }
            a(0, Integer.bitCount(dkf.a) * 6, (byte) 4, (byte) 0);
            for (int i = 0; i < 10; i++) {
                if (dkf.a(i)) {
                    int i2;
                    if (i == 4) {
                        i2 = 3;
                    } else if (i == 7) {
                        i2 = 4;
                    } else {
                        i2 = i;
                    }
                    this.a.f(i2);
                    this.a.e(dkf.d[i]);
                }
            }
            this.a.flush();
        }
    }

    public final synchronized void a(boolean z, int i, int i2) {
        byte b = (byte) 0;
        synchronized (this) {
            if (this.f) {
                throw new IOException("closed");
            }
            if (z) {
                b = (byte) 1;
            }
            a(0, 8, (byte) 6, b);
            this.a.e(i);
            this.a.e(i2);
            this.a.flush();
        }
    }

    public final synchronized void a(int i, djq djq, byte[] bArr) {
        if (this.f) {
            throw new IOException("closed");
        } else if (djq.n == -1) {
            throw djz.a("errorCode.httpCode == -1", new Object[0]);
        } else {
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.a.e(i);
            this.a.e(djq.n);
            if (bArr.length > 0) {
                this.a.b(bArr);
            }
            this.a.flush();
        }
    }

    public final synchronized void a(int i, long j) {
        if (this.f) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw djz.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            a(i, 4, (byte) 8, (byte) 0);
            this.a.e((int) j);
            this.a.flush();
        }
    }

    public final synchronized void close() {
        this.f = true;
        this.a.close();
    }

    private void a(int i, int i2, byte b, byte b2) {
        if (djz.a.isLoggable(Level.FINE)) {
            djz.a.fine(dkb.a(false, i, i2, b, b2));
        }
        if (i2 > this.e) {
            throw djz.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.e), Integer.valueOf(i2));
        } else if ((oe.INVALID_ID & i) != 0) {
            throw djz.a("reserved bit set: %s", Integer.valueOf(i));
        } else {
            djz.a(this.a, i2);
            this.a.g(b & 255);
            this.a.g(b2 & 255);
            this.a.e(Integer.MAX_VALUE & i);
        }
    }
}
