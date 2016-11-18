package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

public final class owq implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ CronetBidirectionalStream b;

    public owq(CronetBidirectionalStream cronetBidirectionalStream, boolean z) {
        this.b = cronetBidirectionalStream;
        this.a = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r3 = this;
        r0 = r3.b;
        r1 = r0.c;
        monitor-enter(r1);
        r0 = r3.b;	 Catch:{ all -> 0x0048 }
        r0 = r0.d();	 Catch:{ all -> 0x0048 }
        if (r0 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0048 }
    L_0x000e:
        return;
    L_0x000f:
        r0 = r3.b;	 Catch:{ all -> 0x0048 }
        r2 = r3.a;	 Catch:{ all -> 0x0048 }
        r0.d = r2;	 Catch:{ all -> 0x0048 }
        r0 = r3.b;	 Catch:{ all -> 0x0048 }
        r2 = defpackage.owx.c;	 Catch:{ all -> 0x0048 }
        r0.e = r2;	 Catch:{ all -> 0x0048 }
        r0 = r3.b;	 Catch:{ all -> 0x0048 }
        r0 = r0.b;	 Catch:{ all -> 0x0048 }
        r0 = org.chromium.net.impl.CronetBidirectionalStream.a(r0);	 Catch:{ all -> 0x0048 }
        if (r0 != 0) goto L_0x0041;
    L_0x0025:
        r0 = r3.b;	 Catch:{ all -> 0x0048 }
        r0 = r0.d;	 Catch:{ all -> 0x0048 }
        if (r0 == 0) goto L_0x0041;
    L_0x002b:
        r0 = r3.b;	 Catch:{ all -> 0x0048 }
        r2 = defpackage.owx.k;	 Catch:{ all -> 0x0048 }
        r0.f = r2;	 Catch:{ all -> 0x0048 }
    L_0x0031:
        monitor-exit(r1);	 Catch:{ all -> 0x0048 }
        r0 = r3.b;	 Catch:{ Exception -> 0x003a }
        r0 = r0.a;	 Catch:{ Exception -> 0x003a }
        r0.a();	 Catch:{ Exception -> 0x003a }
        goto L_0x000e;
    L_0x003a:
        r0 = move-exception;
        r1 = r3.b;
        r1.a(r0);
        goto L_0x000e;
    L_0x0041:
        r0 = r3.b;	 Catch:{ all -> 0x0048 }
        r2 = defpackage.owx.i;	 Catch:{ all -> 0x0048 }
        r0.f = r2;	 Catch:{ all -> 0x0048 }
        goto L_0x0031;
    L_0x0048:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0048 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: owq.run():void");
    }
}
