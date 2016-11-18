package defpackage;

import java.util.concurrent.ScheduledFuture;

public final class okb extends ojz {
    private boolean c;
    private Throwable d;
    private final ojz e;
    private ScheduledFuture<?> f;

    public ojz b() {
        return this.e.b();
    }

    public void a(ojz ojz) {
        this.e.a(ojz);
    }

    public boolean a(Throwable th) {
        boolean z = true;
        synchronized (this) {
            if (this.c) {
                z = false;
            } else {
                this.c = true;
                if (this.f != null) {
                    this.f.cancel(false);
                    this.f = null;
                }
                this.d = th;
            }
        }
        if (z) {
            f();
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
        r2 = this;
        r0 = 1;
        monitor-enter(r2);
        r1 = r2.c;	 Catch:{ all -> 0x0017 }
        if (r1 == 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
    L_0x0007:
        return r0;
    L_0x0008:
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        r1 = super.c();
        if (r1 == 0) goto L_0x001a;
    L_0x000f:
        r1 = super.d();
        r2.a(r1);
        goto L_0x0007;
    L_0x0017:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        throw r0;
    L_0x001a:
        r0 = 0;
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: okb.c():boolean");
    }

    public Throwable d() {
        if (c()) {
            return this.d;
        }
        return null;
    }
}
