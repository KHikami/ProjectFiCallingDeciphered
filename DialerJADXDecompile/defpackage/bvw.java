package defpackage;

/* renamed from: bvw */
public final class bvw {
    private final long a;
    private final int b;
    private final ij c;

    public bvw() {
        this.a = 60000;
        this.b = 10;
        this.c = new ij(10);
    }

    public bvw(int i, long j) {
        this.a = j;
        this.b = 1024;
        this.c = new ij();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long a(java.lang.String r9) {
        /*
        r8 = this;
        r4 = android.os.SystemClock.elapsedRealtime();
        r0 = r8.a;
        monitor-enter(r8);
        r2 = r0;
    L_0x0008:
        r0 = r8.c;	 Catch:{ all -> 0x006c }
        r0 = r0.size();	 Catch:{ all -> 0x006c }
        r1 = r8.b;	 Catch:{ all -> 0x006c }
        if (r0 < r1) goto L_0x005e;
    L_0x0012:
        r0 = r8.c;	 Catch:{ all -> 0x006c }
        r0 = r0.size();	 Catch:{ all -> 0x006c }
        r0 = r0 + -1;
        r1 = r0;
    L_0x001b:
        if (r1 < 0) goto L_0x0038;
    L_0x001d:
        r0 = r8.c;	 Catch:{ all -> 0x006c }
        r0 = r0.c(r1);	 Catch:{ all -> 0x006c }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x006c }
        r6 = r0.longValue();	 Catch:{ all -> 0x006c }
        r6 = r4 - r6;
        r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0034;
    L_0x002f:
        r0 = r8.c;	 Catch:{ all -> 0x006c }
        r0.d(r1);	 Catch:{ all -> 0x006c }
    L_0x0034:
        r0 = r1 + -1;
        r1 = r0;
        goto L_0x001b;
    L_0x0038:
        r0 = 2;
        r0 = r2 / r0;
        r2 = "ConnectionTracker";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x006c }
        r6 = "The max capacity ";
        r3.<init>(r6);	 Catch:{ all -> 0x006c }
        r6 = r8.b;	 Catch:{ all -> 0x006c }
        r3 = r3.append(r6);	 Catch:{ all -> 0x006c }
        r6 = " is not enough. Current durationThreshold is: ";
        r3 = r3.append(r6);	 Catch:{ all -> 0x006c }
        r3 = r3.append(r0);	 Catch:{ all -> 0x006c }
        r3 = r3.toString();	 Catch:{ all -> 0x006c }
        android.util.Log.w(r2, r3);	 Catch:{ all -> 0x006c }
        r2 = r0;
        goto L_0x0008;
    L_0x005e:
        r0 = r8.c;	 Catch:{ all -> 0x006c }
        r1 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x006c }
        r0 = r0.put(r9, r1);	 Catch:{ all -> 0x006c }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x006c }
        monitor-exit(r8);	 Catch:{ all -> 0x006c }
        return r0;
    L_0x006c:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x006c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bvw.a(java.lang.String):java.lang.Long");
    }

    public final boolean b(String str) {
        boolean z;
        synchronized (this) {
            z = this.c.remove(str) != null;
        }
        return z;
    }
}
