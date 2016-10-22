package defpackage;

/* compiled from: PG */
/* renamed from: dmc */
final class dmc implements dlv {
    private dlu a;
    private dmg b;
    private boolean c;

    private dmc(dmg dmg, dlu dlu) {
        if (dmg == null) {
            throw new IllegalArgumentException("sink == null");
        }
        this.a = dlu;
        this.b = dmg;
    }

    public dmc(dmg dmg) {
        this(dmg, new dlu());
    }

    public final void a_(dlu dlu, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a_(dlu, j);
        a();
    }

    public final dlv b(byte[] bArr) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a(bArr);
        return a();
    }

    public final dlv g(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a(i);
        return a();
    }

    public final dlv f(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(i);
        return a();
    }

    public final dlv e(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.c(i);
        return a();
    }

    private dlv a() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        dlu dlu = this.a;
        long j = dlu.b;
        if (j == 0) {
            j = 0;
        } else {
            dme dme = dlu.a.g;
            if (dme.c < 2048 && dme.e) {
                j -= (long) (dme.c - dme.b);
            }
        }
        if (j > 0) {
            this.b.a_(this.a, j);
        }
        return this;
    }

    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.a.b > 0) {
            this.b.a_(this.a, this.a.b);
        }
        this.b.flush();
    }

    public final void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                if (this.a.b > 0) {
                    this.b.a_(this.a, this.a.b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                dmk.a(th);
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.b + ")";
    }
}
