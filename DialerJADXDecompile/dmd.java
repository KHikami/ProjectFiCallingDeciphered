import java.io.EOFException;

/* compiled from: PG */
final class dmd implements dlw {
    private dlu a;
    private dmh b;
    private boolean c;

    private dmd(dmh dmh, dlu dlu) {
        if (dmh == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.a = dlu;
        this.b = dmh;
    }

    public dmd(dmh dmh) {
        this(dmh, new dlu());
    }

    public final dlu a() {
        return this.a;
    }

    public final long a(dlu dlu, long j) {
        if (dlu == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.c) {
            throw new IllegalStateException("closed");
        } else if (this.a.b == 0 && this.b.a(this.a, 2048) == -1) {
            return -1;
        } else {
            return this.a.a(dlu, Math.min(j, this.a.b));
        }
    }

    public final boolean b() {
        if (!this.c) {
            return this.a.b() && this.b.a(this.a, 2048) == -1;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final byte c() {
        a(1);
        return this.a.c();
    }

    public final dlx b(long j) {
        a(j);
        return this.a.b(j);
    }

    public final byte[] c(long j) {
        a(j);
        return this.a.c(j);
    }

    public final short d() {
        a(2);
        return this.a.d();
    }

    public final int e() {
        a(4);
        return this.a.e();
    }

    public final void d(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.a.b == 0 && this.b.a(this.a, 2048) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.a.b);
            this.a.d(min);
            j -= min;
        }
    }

    public final void close() {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.a.g();
        }
    }

    public final String toString() {
        return "buffer(" + this.b + ")";
    }

    public final void a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            Object obj;
            while (this.a.b < j) {
                if (this.b.a(this.a, 2048) == -1) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
            if (obj == null) {
                throw new EOFException();
            }
        }
    }
}
