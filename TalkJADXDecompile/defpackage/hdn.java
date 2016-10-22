package defpackage;

/* renamed from: hdn */
public final class hdn {
    private int a;

    hdn() {
        this.a = 0;
    }

    public synchronized void a() {
        this.a++;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(long r8, java.util.concurrent.TimeUnit r10) {
        /*
        r7 = this;
        r2 = java.lang.System.currentTimeMillis();
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r0 = r0.convert(r8, r10);
        monitor-enter(r7);
    L_0x000b:
        r4 = r7.a;	 Catch:{ all -> 0x001b }
        if (r4 != 0) goto L_0x0012;
    L_0x000f:
        r0 = 1;
        monitor-exit(r7);	 Catch:{ all -> 0x001b }
    L_0x0011:
        return r0;
    L_0x0012:
        r4 = 0;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 > 0) goto L_0x001e;
    L_0x0018:
        r0 = 0;
        monitor-exit(r7);	 Catch:{ all -> 0x001b }
        goto L_0x0011;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x001b }
        throw r0;
    L_0x001e:
        r7.wait(r0);	 Catch:{ all -> 0x001b }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x001b }
        r4 = r4 - r2;
        r0 = r0 - r4;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: hdn.a(long, java.util.concurrent.TimeUnit):boolean");
    }

    public synchronized void b() {
        if (this.a == 0) {
            throw new RuntimeException("too many decrements");
        }
        this.a--;
        if (this.a == 0) {
            notifyAll();
        }
    }

    public synchronized boolean c() {
        return this.a == 0;
    }
}
