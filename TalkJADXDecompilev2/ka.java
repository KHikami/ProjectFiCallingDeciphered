package defpackage;

import android.os.Build.VERSION;

public final class ka {
    private boolean a;
    private Object b;
    private boolean c;

    private boolean d() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public void a() {
        if (d()) {
            throw new kb();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.a;	 Catch:{ all -> 0x0021 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
    L_0x0006:
        return;
    L_0x0007:
        r0 = 1;
        r2.a = r0;	 Catch:{ all -> 0x0021 }
        r0 = 1;
        r2.c = r0;	 Catch:{ all -> 0x0021 }
        r0 = r2.b;	 Catch:{ all -> 0x0021 }
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        if (r0 == 0) goto L_0x0015;
    L_0x0012:
        defpackage.gwb.c(r0);	 Catch:{ all -> 0x0024 }
    L_0x0015:
        monitor-enter(r2);
        r0 = 0;
        r2.c = r0;	 Catch:{ all -> 0x001e }
        r2.notifyAll();	 Catch:{ all -> 0x001e }
        monitor-exit(r2);	 Catch:{ all -> 0x001e }
        goto L_0x0006;
    L_0x001e:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001e }
        throw r0;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        throw r0;
    L_0x0024:
        r0 = move-exception;
        monitor-enter(r2);
        r1 = 0;
        r2.c = r1;	 Catch:{ all -> 0x002e }
        r2.notifyAll();	 Catch:{ all -> 0x002e }
        monitor-exit(r2);	 Catch:{ all -> 0x002e }
        throw r0;
    L_0x002e:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x002e }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.b():void");
    }

    public Object c() {
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        Object obj;
        synchronized (this) {
            if (this.b == null) {
                this.b = gwb.d();
                if (this.a) {
                    gwb.c(this.b);
                }
            }
            obj = this.b;
        }
        return obj;
    }
}
