package defpackage;

final class olr<T> extends okr<T> {
    private static final olv b = olv.q.b("PickFirstBalancer has shut down");
    final omb<T> a;
    private final Object c = new Object();
    private okm d;
    private omc<T> e;
    private olv f;
    private boolean g;

    olr(omb<T> omb_T) {
        this.a = omb_T;
    }

    public T a() {
        synchronized (this.c) {
            if (this.g) {
                T a = this.a.a(b);
                return a;
            }
            okm okm = this.d;
            if (okm != null) {
                return this.a.a(okm);
            } else if (this.f != null) {
                a = this.a.a(this.f);
                return a;
            } else {
                if (this.e == null) {
                    this.e = this.a.a();
                }
                a = this.e.a();
                return a;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.List r6) {
        /*
        r5 = this;
        r1 = r5.c;
        monitor-enter(r1);
        r0 = r5.g;	 Catch:{ all -> 0x0036 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
    L_0x0008:
        return;
    L_0x0009:
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0036 }
        r2.<init>();	 Catch:{ all -> 0x0036 }
        r3 = r6.iterator();	 Catch:{ all -> 0x0036 }
    L_0x0012:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0036 }
        if (r0 == 0) goto L_0x0039;
    L_0x0018:
        r0 = r3.next();	 Catch:{ all -> 0x0036 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0036 }
        r4 = r0.iterator();	 Catch:{ all -> 0x0036 }
    L_0x0022:
        r0 = r4.hasNext();	 Catch:{ all -> 0x0036 }
        if (r0 == 0) goto L_0x0012;
    L_0x0028:
        r0 = r4.next();	 Catch:{ all -> 0x0036 }
        r0 = (defpackage.olt) r0;	 Catch:{ all -> 0x0036 }
        r0 = r0.a();	 Catch:{ all -> 0x0036 }
        r2.add(r0);	 Catch:{ all -> 0x0036 }
        goto L_0x0022;
    L_0x0036:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
        throw r0;
    L_0x0039:
        r0 = new okm;	 Catch:{ all -> 0x0036 }
        r0.<init>(r2);	 Catch:{ all -> 0x0036 }
        r2 = r5.d;	 Catch:{ all -> 0x0036 }
        r2 = r0.equals(r2);	 Catch:{ all -> 0x0036 }
        if (r2 == 0) goto L_0x0048;
    L_0x0046:
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
        goto L_0x0008;
    L_0x0048:
        r5.d = r0;	 Catch:{ all -> 0x0036 }
        r2 = 0;
        r5.f = r2;	 Catch:{ all -> 0x0036 }
        r2 = r5.e;	 Catch:{ all -> 0x0036 }
        r3 = 0;
        r5.e = r3;	 Catch:{ all -> 0x0036 }
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
        if (r2 == 0) goto L_0x0008;
    L_0x0055:
        r1 = new ols;
        r1.<init>(r5, r0);
        r2.a(r1);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: olr.a(java.util.List):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(olv r5) {
        /*
        r4 = this;
        r1 = r4.c;
        monitor-enter(r1);
        r0 = r4.g;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0008:
        return;
    L_0x0009:
        r0 = "Name resolution failed";
        r0 = r5.b(r0);	 Catch:{ all -> 0x001d }
        r2 = r4.e;	 Catch:{ all -> 0x001d }
        r3 = 0;
        r4.e = r3;	 Catch:{ all -> 0x001d }
        r4.f = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        if (r2 == 0) goto L_0x0008;
    L_0x0019:
        r2.a(r0);
        goto L_0x0008;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: olr.a(olv):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
        r3 = this;
        r1 = r3.c;
        monitor-enter(r1);
        r0 = r3.g;	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r3.g = r0;	 Catch:{ all -> 0x001a }
        r0 = r3.e;	 Catch:{ all -> 0x001a }
        r2 = 0;
        r3.e = r2;	 Catch:{ all -> 0x001a }
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x0008;
    L_0x0014:
        r1 = b;
        r0.a(r1);
        goto L_0x0008;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: olr.b():void");
    }
}
