package defpackage;

import android.os.Handler;

/* renamed from: bpf */
abstract class bpf {
    private static volatile Handler d;
    final bnp a;
    final Runnable b;
    volatile long c;

    bpf(bnp bnp) {
        buf.A((Object) bnp);
        this.a = bnp;
        this.b = new bpg(this);
    }

    public abstract void a();

    public final void a(long j) {
        c();
        if (j >= 0) {
            this.c = this.a.c.a();
            if (!d().postDelayed(this.b, j)) {
                this.a.a().e("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean b() {
        return this.c != 0;
    }

    public final void c() {
        this.c = 0;
        d().removeCallbacks(this.b);
    }

    final Handler d() {
        if (d != null) {
            return d;
        }
        Handler handler;
        synchronized (bpf.class) {
            if (d == null) {
                d = new Handler(this.a.a.getMainLooper());
            }
            handler = d;
        }
        return handler;
    }
}
