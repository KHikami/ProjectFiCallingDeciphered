package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

public final class owv implements Runnable {
    public ByteBuffer a;
    public boolean b;
    final /* synthetic */ CronetBidirectionalStream c;

    public owv(CronetBidirectionalStream cronetBidirectionalStream) {
        this.c = cronetBidirectionalStream;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.a;	 Catch:{ Exception -> 0x003a }
        r2 = 0;
        r5.a = r2;	 Catch:{ Exception -> 0x003a }
        r2 = r5.c;	 Catch:{ Exception -> 0x003a }
        r2 = r2.c;	 Catch:{ Exception -> 0x003a }
        monitor-enter(r2);	 Catch:{ Exception -> 0x003a }
        r3 = r5.c;	 Catch:{ all -> 0x0048 }
        r3 = r3.d();	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0015;
    L_0x0013:
        monitor-exit(r2);	 Catch:{ all -> 0x0048 }
    L_0x0014:
        return;
    L_0x0015:
        r3 = r5.b;	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0041;
    L_0x0019:
        r3 = r5.c;	 Catch:{ all -> 0x0048 }
        r4 = defpackage.owx.e;	 Catch:{ all -> 0x0048 }
        r3.e = r4;	 Catch:{ all -> 0x0048 }
        r3 = r5.c;	 Catch:{ all -> 0x0048 }
        r3 = r3.f;	 Catch:{ all -> 0x0048 }
        r4 = defpackage.owx.k;	 Catch:{ all -> 0x0048 }
        if (r3 != r4) goto L_0x0028;
    L_0x0027:
        r0 = 1;
    L_0x0028:
        monitor-exit(r2);	 Catch:{ all -> 0x0048 }
        r2 = r5.c;	 Catch:{ Exception -> 0x003a }
        r2 = r2.a;	 Catch:{ Exception -> 0x003a }
        r3 = r5.b;	 Catch:{ Exception -> 0x003a }
        r2.a(r1, r3);	 Catch:{ Exception -> 0x003a }
        if (r0 == 0) goto L_0x0014;
    L_0x0034:
        r0 = r5.c;	 Catch:{ Exception -> 0x003a }
        r0.e();	 Catch:{ Exception -> 0x003a }
        goto L_0x0014;
    L_0x003a:
        r0 = move-exception;
        r1 = r5.c;
        r1.a(r0);
        goto L_0x0014;
    L_0x0041:
        r3 = r5.c;	 Catch:{ all -> 0x0048 }
        r4 = defpackage.owx.c;	 Catch:{ all -> 0x0048 }
        r3.e = r4;	 Catch:{ all -> 0x0048 }
        goto L_0x0028;
    L_0x0048:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0048 }
        throw r0;	 Catch:{ Exception -> 0x003a }
        */
        throw new UnsupportedOperationException("Method not decompiled: owv.run():void");
    }
}
